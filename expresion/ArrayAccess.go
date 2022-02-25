package expresion

import (
	"OLC2/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type ArrayAccess struct {
	Array interfaces.Expresion
	Index interfaces.Expresion
}

func NewArrayAccess(array interfaces.Expresion, index interfaces.Expresion) ArrayAccess {
	exp := ArrayAccess{Array: array, Index: index}
	return exp
}

func (p ArrayAccess) Ejecutar(env interface{}) interfaces.Symbol {

	var tempArray interfaces.Symbol
	tempArray = p.Array.Ejecutar(env)

	if tempArray.Tipo == interfaces.ARRAY {
		var tempIndex interfaces.Symbol
		tempIndex = p.Index.Ejecutar(env)

		var tempValue interface{}
		tempValue = tempArray.Valor

		return tempValue.(*arrayList.List).GetValue(tempIndex.Valor.(int)).(interfaces.Symbol)
	}

	return interfaces.Symbol{
		Id:    "",
		Tipo:  interfaces.NULL,
		Valor: "ERROR",
	}
}
