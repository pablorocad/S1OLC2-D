package expresion

import (
	"OLC2/generator"
	"OLC2/interfaces"
	"fmt"
)

type Primitivo struct {
	Valor interface{}
	Tipo  interfaces.TipoExpresion
}

func (p Primitivo) Ejecutar(env interface{}, gen *generator.Generator) interfaces.Value {

	return interfaces.Value{
		Value:      fmt.Sprintf("%v", p.Valor),
		IsTemp:     false,
		Type:       p.Tipo,
		TrueLabel:  "",
		FalseLabel: "",
	}
}

func NewPrimitivo(val interface{}, tipo interfaces.TipoExpresion) Primitivo {
	exp := Primitivo{val, tipo}
	return exp
}
