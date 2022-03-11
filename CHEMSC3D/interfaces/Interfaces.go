package interfaces

import "OLC2/generator"

type Symbol struct {
	Id       string
	Tipo     TipoExpresion
	Posicion int
}

type Value struct {
	Value      string
	IsTemp     bool
	Type       TipoExpresion
	TrueLabel  string
	FalseLabel string
}

type Expresion interface {
	Ejecutar(env interface{}, gen *generator.Generator) Value
}

type Instruction interface {
	Ejecutar(env interface{}, gen *generator.Generator) interface{}
}
