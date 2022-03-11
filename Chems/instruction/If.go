package instruction

import (
	"OLC2/environment"
	"OLC2/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type If struct {
	Expresion interfaces.Expresion
	Bloque    *arrayList.List
}

func NewIf(condition interfaces.Expresion, bloque *arrayList.List) If {
	ifInstr := If{condition, bloque}
	return ifInstr
}

func (p If) Ejecutar(env interface{}) interface{} {

	var result interfaces.Symbol

	result = p.Expresion.Ejecutar(env)

	if result.Valor == true {

		var tmpEnv environment.Environment
		tmpEnv = environment.NewEnvironment(env.(environment.Environment))

		for _, s := range p.Bloque.ToArray() {
			s.(interfaces.Instruction).Ejecutar(tmpEnv)
		}

	}

	return result.Valor
}
