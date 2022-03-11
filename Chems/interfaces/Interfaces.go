package interfaces

type Symbol struct {
	Id    string
	Tipo  TipoExpresion
	Valor interface{}
}

type Expresion interface {
	Ejecutar(env interface{}) Symbol
}

type Instruction interface {
	Ejecutar(env interface{}) interface{}
}
