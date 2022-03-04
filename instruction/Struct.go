package instruction

import (
	"OLC2/environment"
	"OLC2/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Struct struct {
	Id            string
	ListAtributos *arrayList.List
}

func NewStruct(id string, list *arrayList.List) Struct {
	instr := Struct{id, list}
	return instr
}

func (p Struct) Ejecutar(env interface{}) interface{} {

	env.(environment.Environment).SaveStruct(p.Id, p.ListAtributos)

	return interfaces.Symbol{Id: "", Tipo: interfaces.STRUCT, Valor: 0}
}
