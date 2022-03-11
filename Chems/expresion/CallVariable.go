package expresion

import (
	"OLC2/environment"
	"OLC2/interfaces"
)

type CallVariable struct {
	Id string
}

func (p CallVariable) Ejecutar(env interface{}) interfaces.Symbol {

	result := env.(environment.Environment).GetVariable(p.Id)

	return result.Valor.(interfaces.Symbol)
}

func NewCallVariable(id string) CallVariable {
	exp := CallVariable{Id: id}
	return exp
}
