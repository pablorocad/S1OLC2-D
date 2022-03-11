package expresion

import (
	"OLC2/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Array struct {
	ListExp *arrayList.List
}

func NewArray(list *arrayList.List) Array {
	exp := Array{list}
	return exp
}

func (p Array) Ejecutar(env interface{}) interfaces.Symbol {

	var tempExp *arrayList.List
	tempExp = arrayList.New()

	for _, s := range p.ListExp.ToArray() {
		tempExp.Add(s.(interfaces.Expresion).Ejecutar(env))
	}

	return interfaces.Symbol{
		Id:    "",
		Tipo:  interfaces.ARRAY,
		Valor: tempExp,
	}
}
