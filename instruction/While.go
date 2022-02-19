package instruction

import (
	"OLC2/environment"
	"OLC2/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type While struct {
	Expresion interfaces.Expresion
	Bloque    *arrayList.List
}

func NewWhile(condition interfaces.Expresion, bloque *arrayList.List) While {
	whileInstr := While{condition, bloque}
	return whileInstr
}

func (p While) Ejecutar(env interface{}) interface{} {

	var result interfaces.Symbol

	for {
		result = p.Expresion.Ejecutar(env)

		if result.Valor == true {

			var tmpEnv environment.Environment
			tmpEnv = environment.NewEnvironment(env.(environment.Environment))

			for _, s := range p.Bloque.ToArray() {
				s.(interfaces.Instruction).Ejecutar(tmpEnv)
			}

		} else {
			break
		}

	}

	return result.Valor
}
