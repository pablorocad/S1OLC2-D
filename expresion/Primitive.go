package expresion

import (
	"OLC2/interfaces"
)

type Primitivo struct {
	Valor interface{}
	Tipo  interfaces.TipoExpresion
}

func (p Primitivo) Ejecutar() interfaces.Symbol {

	return interfaces.Symbol{
		Tipo:  p.Tipo,
		Valor: p.Valor,
	}
}

func NewPrimitivo(val interface{}, tipo interfaces.TipoExpresion) Primitivo {
	exp := Primitivo{val, tipo}
	return exp
}
