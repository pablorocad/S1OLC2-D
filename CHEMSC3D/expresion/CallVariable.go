package expresion

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
	"strconv"
)

type CallVariable struct {
	Id string
}

func NewCallVariable(id string) CallVariable {
	exp := CallVariable{id}
	return exp
}

func (p CallVariable) Ejecutar(env interface{}, gen *generator.Generator) interfaces.Value {

	returnSymbol := env.(environment.Environment).GetVariable(p.Id)
	newTemp := gen.NewTemp()

	gen.AddGetStack(newTemp, strconv.Itoa(returnSymbol.Posicion))

	return interfaces.Value{
		Value:      newTemp,
		IsTemp:     true,
		Type:       returnSymbol.Tipo,
		TrueLabel:  "",
		FalseLabel: "",
	}
}
