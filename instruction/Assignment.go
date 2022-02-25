package instruction

import (
	"OLC2/environment"
	"OLC2/interfaces"
)

type Assignment struct {
	Id        string
	Expresion interfaces.Expresion
}

func NewAssignment(id string, val interfaces.Expresion) Assignment {
	instr := Assignment{id, val}
	return instr
}

func (p Assignment) Ejecutar(env interface{}) interface{} {

	var result interfaces.Symbol

	result = p.Expresion.Ejecutar(env)

	env.(environment.Environment).AlterVariable(p.Id, result)

	return result.Valor
}
