package instruction

import (
	"OLC2/generator"
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

func (p Imprimir) Ejecutar(env interface{}, gen *generator.Generator) interface{} {

	var result interfaces.Value

	result = p.Expresion.Ejecutar(env, gen)

	gen.AddPrintf("d", "(int)"+fmt.Sprintf("%v", result.Value))

	return result.Value
}
