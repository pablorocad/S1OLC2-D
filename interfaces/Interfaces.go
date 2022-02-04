package interfaces

type Symbol struct {
	Tipo  TipoExpresion
	Valor interface{}
}

type Expresion interface {
	Ejecutar() Symbol
}

type Instruction interface {
	Ejecutar() interface{}
}
