package main

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
	"OLC2/parser"
	"fmt"
	"log"
	"os"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

type TreeShapeListener struct {
	*parser.BaseChemsListener
}

func NewTreeShapeListener() *TreeShapeListener {
	return new(TreeShapeListener)
}

func (this *TreeShapeListener) ExitStart(ctx *parser.StartContext) {
	result := ctx.GetLista()

	var globalEnv environment.Environment
	globalEnv = environment.NewEnvironment(nil)

	var gen *generator.Generator
	gen = generator.NewGenerator()
	var salida string
	salida = ""

	for _, s := range result.ToArray() {
		s.(interfaces.Instruction).Ejecutar(globalEnv, gen)
	}

	//Escribir salida

	f, err := os.Create("salida.txt")
	if err != nil {
		log.Fatal(err)
	}
	defer f.Close()

	salida += "#include <stdio.h>\n"
	salida += "#include <math.h>\n"
	salida += "double HEAP[82000];\n"
	salida += "double STACK[82000];\n"
	salida += "double P;\n"
	salida += "double H;\n"
	salida += "double "

	salida += fmt.Sprintf("%v", gen.GetTemps().GetValue(0))
	gen.GetTemps().RemoveAtIndex(0)

	for _, s := range gen.GetTemps().ToArray() {
		salida += ", "
		salida += fmt.Sprintf("%v", s)
	}

	salida += ";\n\n"
	salida += "\nvoid main(){\n"

	for _, s := range gen.GetCode().ToArray() {
		salida += fmt.Sprintf("%v", s)
		salida += "\n"
	}

	salida += "\nreturn;\n}\n"

	_, err2 := f.WriteString(salida)

	if err2 != nil {
		log.Fatal(err2)
	}

}

func main() {

	// Setup the input
	//is := antlr.NewInputStream("\"El resultado es: \" + (10+5+5+5+5+5)")

	is, _ := antlr.NewFileStream("entrada.txt")
	// Create the Lexer
	lexer := parser.NewChemsLexer(is)
	stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)

	// Create the Parser
	p := parser.NewChems(stream)

	p.BuildParseTrees = true
	tree := p.Start()

	antlr.ParseTreeWalkerDefault.Walk(NewTreeShapeListener(), tree)

}
