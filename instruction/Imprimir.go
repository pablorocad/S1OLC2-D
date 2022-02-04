package instruction

import (
	"OLC2/interfaces"
	"fmt"
)

type Imprimir struct {
	Expresion interfaces.Expresion
}

func NewImprimir(val interfaces.Expresion) Imprimir {
	exp := Imprimir{val}
	return exp
}

func (p Imprimir) Ejecutar() interface{} {

	var result interfaces.Symbol

	result = p.Expresion.Ejecutar()

	fmt.Println(result.Valor)

	return result.Valor
}
