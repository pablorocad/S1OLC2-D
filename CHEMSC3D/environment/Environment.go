package environment

import (
	"OLC2/interfaces"
	"fmt"
)

type Environment struct {
	father   interface{}
	variable map[string]interfaces.Symbol
	size     int
}

func NewEnvironment(father interface{}) Environment {
	env := Environment{father, make(map[string]interfaces.Symbol), 0}
	return env
}

func (env Environment) SaveVariable(id string, value interfaces.Symbol, tipo interfaces.TipoExpresion) {
	if variable, ok := env.variable[id]; ok {
		fmt.Println("La variable " + variable.Id + " ya existe")
		return
	}
	env.variable[id] = interfaces.Symbol{Id: id, Tipo: tipo, Posicion: env.size}
	env.size = env.size + 1
}

func (env Environment) GetVariable(id string) interfaces.Symbol {

	var tmpEnv Environment
	tmpEnv = env

	for {
		if variable, ok := tmpEnv.variable[id]; ok {
			return variable
		}

		if tmpEnv.father == nil {
			break
		} else {
			tmpEnv = tmpEnv.father.(Environment)
		}
	}

	fmt.Println("La variable no existe")
	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Posicion: 0}
}
