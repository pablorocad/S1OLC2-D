package expresion

import (
	"OLC2/environment"
	"OLC2/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Struct struct {
	IdStruct string
	ListExp  *arrayList.List
}

func NewStruct(id string, list *arrayList.List) Struct {
	exp := Struct{id, list}
	return exp
}

func (p Struct) Ejecutar(env interface{}) interfaces.Symbol {

	var tempExp *arrayList.List
	tempExp = arrayList.New()

	for _, s := range p.ListExp.ToArray() {
		tempExp.Add(s.(interfaces.Expresion).Ejecutar(env))
	}

	resultStruct := env.(environment.Environment).GetStruct(p.IdStruct)

	//Validar tamaño y que cada tipo coincida con el struct existente
	if resultStruct.Valor.(*arrayList.List).Len() == p.ListExp.Len() {
		return interfaces.Symbol{
			Id:    "",
			Tipo:  interfaces.STRUCT,
			Valor: tempExp,
		}
	}

	return interfaces.Symbol{
		Id:    "",
		Tipo:  interfaces.NULL,
		Valor: 0,
	}
}
