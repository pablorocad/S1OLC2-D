package instruction

import (
	"OLC2/environment"
	"OLC2/interfaces"
	"fmt"
)

type Declaration struct {
	Id        string
	Tipo      interfaces.TipoExpresion
	Expresion interfaces.Expresion
	IsArray   bool
	IsStruct  bool
}

func NewDeclaration(id string, tipo interfaces.TipoExpresion, val interfaces.Expresion, isArray bool, isStruct bool) Declaration {
	instr := Declaration{id, tipo, val, isArray, isStruct}
	return instr
}

func (p Declaration) Ejecutar(env interface{}) interface{} {

	var result interfaces.Symbol

	result = p.Expresion.Ejecutar(env)

	if result.Tipo == p.Tipo {
		env.(environment.Environment).SaveVariable(p.Id, result, p.Tipo)
	} else if p.IsArray {
		env.(environment.Environment).SaveVariable(p.Id, result, interfaces.ARRAY)
	} else if p.IsStruct {
		env.(environment.Environment).SaveVariable(p.Id, result, interfaces.STRUCT)
	} else {
		fmt.Println("Los tipos no coinciden")
	}

	return result.Valor
}
