package instruction

import (
	"OLC2/environment"
	"OLC2/generator"
	"OLC2/interfaces"
	"strconv"
)

type Declaration struct {
	Id        string
	Tipo      interfaces.TipoExpresion
	Expresion interfaces.Expresion
}

func NewDeclaration(id string, tipo interfaces.TipoExpresion, val interfaces.Expresion) Declaration {
	exp := Declaration{Id: id, Tipo: tipo, Expresion: val}
	return exp
}

func (p Declaration) Ejecutar(env interface{}, gen *generator.Generator) interface{} {

	var result interfaces.Value

	result = p.Expresion.Ejecutar(env, gen)

	var newVariable interfaces.Symbol
	newVariable = env.(environment.Environment).SaveVariable(p.Id, p.Tipo)

	gen.AddSetStack(strconv.Itoa(newVariable.Posicion), result.Value)

	return result.Value
}
