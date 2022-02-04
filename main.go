package main

import (
	"OLC2/interfaces"
	"OLC2/parser"

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

	for _, s := range result.ToArray() {
		s.(interfaces.Instruction).Ejecutar()
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
