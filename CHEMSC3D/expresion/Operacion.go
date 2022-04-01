package expresion

import (
	"OLC2/generator"
	"OLC2/interfaces"
	"fmt"
)

type Aritmetica struct {
	Op1      interfaces.Expresion
	Operador string
	Op2      interfaces.Expresion
	Unario   bool
}

func NewOperacion(Op1 interfaces.Expresion, Operador string, Op2 interfaces.Expresion, unario bool) Aritmetica {

	exp := Aritmetica{Op1, Operador, Op2, unario}
	return exp
}

func (p Aritmetica) Ejecutar(env interface{}, gen *generator.Generator) interfaces.Value {
	suma_resta_dominante := [5][5]interfaces.TipoExpresion{
		//INTEGER			//FLOAT			   //STRING			  //BOOLEAN		   //NULL
		//INTEGER
		{interfaces.INTEGER, interfaces.FLOAT, interfaces.STRING, interfaces.NULL, interfaces.NULL},
		//FLOAT
		{interfaces.FLOAT, interfaces.FLOAT, interfaces.STRING, interfaces.NULL, interfaces.NULL},
		//STRING
		{interfaces.STRING, interfaces.STRING, interfaces.STRING, interfaces.STRING, interfaces.NULL},
		//BOOLEAN
		{interfaces.NULL, interfaces.NULL, interfaces.STRING, interfaces.NULL, interfaces.NULL},
		//NULL
		{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	}

	multi_division_dominante := [5][5]interfaces.TipoExpresion{
		{interfaces.INTEGER, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL},
		{interfaces.FLOAT, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL},
		{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
		{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
		{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	}

	relacional_dominante := [5][5]interfaces.TipoExpresion{
		{interfaces.INTEGER, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL},
		{interfaces.FLOAT, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL},
		{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
		{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
		{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	}

	var retornoIzq interfaces.Value
	var retornoDer interfaces.Value

	if p.Unario == true {
		retornoIzq = p.Op1.Ejecutar(env, gen)
	} else {
		retornoIzq = p.Op1.Ejecutar(env, gen)
		retornoDer = p.Op2.Ejecutar(env, gen)
	}

	var dominante interfaces.TipoExpresion

	newTemp := gen.NewTemp()

	switch p.Operador {
	case "+":
		{

			dominante = suma_resta_dominante[retornoIzq.Type][retornoDer.Type]

			if dominante == interfaces.INTEGER {

				gen.AddExpression(newTemp, retornoIzq.Value, retornoDer.Value, "+")
				return interfaces.Value{Value: newTemp, IsTemp: true, Type: dominante, TrueLabel: "", FalseLabel: ""}

			} else if dominante == interfaces.FLOAT {

				gen.AddExpression(newTemp, retornoIzq.Value, retornoDer.Value, "+")
				return interfaces.Value{Value: newTemp, IsTemp: true, Type: dominante, TrueLabel: "", FalseLabel: ""}

			} else {
				fmt.Print("ERROR: No es posible sumar")
			}

		}

	case "-":
		{
			dominante = suma_resta_dominante[retornoIzq.Type][retornoDer.Type]

			if dominante == interfaces.INTEGER {

				gen.AddExpression(newTemp, retornoIzq.Value, retornoDer.Value, "-")
				return interfaces.Value{Value: newTemp, IsTemp: true, Type: dominante, TrueLabel: "", FalseLabel: ""}

			} else if dominante == interfaces.FLOAT {
				gen.AddExpression(newTemp, retornoIzq.Value, retornoDer.Value, "-")
				return interfaces.Value{Value: newTemp, IsTemp: true, Type: dominante, TrueLabel: "", FalseLabel: ""}

			} else {
				fmt.Print("ERROR: No es posible restar")
			}
		}

	case "*":
		{
			dominante = multi_division_dominante[retornoIzq.Type][retornoDer.Type]

			if dominante == interfaces.INTEGER {
				gen.AddExpression(newTemp, retornoIzq.Value, retornoDer.Value, "*")
				return interfaces.Value{Value: newTemp, IsTemp: true, Type: dominante, TrueLabel: "", FalseLabel: ""}

			} else if dominante == interfaces.FLOAT {
				gen.AddExpression(newTemp, retornoIzq.Value, retornoDer.Value, "*")
				return interfaces.Value{Value: newTemp, IsTemp: true, Type: dominante, TrueLabel: "", FalseLabel: ""}

			} else {
				fmt.Print("ERROR: No es posible Multiplicar")
			}

		}

	case "/":
		{
			dominante = multi_division_dominante[retornoIzq.Type][retornoDer.Type]

			if dominante == interfaces.INTEGER {
				gen.AddExpression(newTemp, retornoIzq.Value, retornoDer.Value, "/")
				return interfaces.Value{Value: newTemp, IsTemp: true, Type: dominante, TrueLabel: "", FalseLabel: ""}

			} else if dominante == interfaces.FLOAT {
				gen.AddExpression(newTemp, retornoIzq.Value, retornoDer.Value, "/")
				return interfaces.Value{Value: newTemp, IsTemp: true, Type: dominante, TrueLabel: "", FalseLabel: ""}

			} else {
				fmt.Print("ERROR: No es posible Dividir")
			}

		}

	case "<":
		{
			dominante = relacional_dominante[retornoIzq.Type][retornoDer.Type]

			if dominante == interfaces.INTEGER {

				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(retornoIzq.Value, retornoDer.Value, "<", trueLabel)
				gen.AddGoto(falseLabel)

				return interfaces.Value{Value: "", IsTemp: false, Type: interfaces.BOOLEAN, TrueLabel: trueLabel, FalseLabel: falseLabel}

			} else if dominante == interfaces.FLOAT {
				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(retornoIzq.Value, retornoDer.Value, "<", trueLabel)
				gen.AddGoto(falseLabel)

				return interfaces.Value{Value: "", IsTemp: false, Type: interfaces.BOOLEAN, TrueLabel: trueLabel, FalseLabel: falseLabel}

			} else {
				fmt.Print("ERROR: No es posible Dividir")
			}

		}

	case ">":
		{
			dominante = relacional_dominante[retornoIzq.Type][retornoDer.Type]

			if dominante == interfaces.INTEGER {

				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(retornoIzq.Value, retornoDer.Value, ">", trueLabel)
				gen.AddGoto(falseLabel)

				return interfaces.Value{Value: "", IsTemp: false, Type: interfaces.BOOLEAN, TrueLabel: trueLabel, FalseLabel: falseLabel}

			} else if dominante == interfaces.FLOAT {
				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(retornoIzq.Value, retornoDer.Value, ">", trueLabel)
				gen.AddGoto(falseLabel)

				return interfaces.Value{Value: "", IsTemp: false, Type: interfaces.BOOLEAN, TrueLabel: trueLabel, FalseLabel: falseLabel}

			} else {
				fmt.Print("ERROR: No es posible Dividir")
			}

		}
	case ">=":
		{
			dominante = relacional_dominante[retornoIzq.Type][retornoDer.Type]

			if dominante == interfaces.INTEGER {

				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(retornoIzq.Value, retornoDer.Value, ">=", trueLabel)
				gen.AddGoto(falseLabel)

				return interfaces.Value{Value: "", IsTemp: false, Type: interfaces.BOOLEAN, TrueLabel: trueLabel, FalseLabel: falseLabel}

			} else if dominante == interfaces.FLOAT {
				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(retornoIzq.Value, retornoDer.Value, ">=", trueLabel)
				gen.AddGoto(falseLabel)

				return interfaces.Value{Value: "", IsTemp: false, Type: interfaces.BOOLEAN, TrueLabel: trueLabel, FalseLabel: falseLabel}

			} else {
				fmt.Print("ERROR: No es posible Dividir")
			}

		}

	case "<=":
		{
			dominante = relacional_dominante[retornoIzq.Type][retornoDer.Type]

			if dominante == interfaces.INTEGER {

				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(retornoIzq.Value, retornoDer.Value, "<=", trueLabel)
				gen.AddGoto(falseLabel)

				return interfaces.Value{Value: "", IsTemp: false, Type: interfaces.BOOLEAN, TrueLabel: trueLabel, FalseLabel: falseLabel}

			} else if dominante == interfaces.FLOAT {
				trueLabel := gen.NewLabel()
				falseLabel := gen.NewLabel()

				gen.AddIf(retornoIzq.Value, retornoDer.Value, "<=", trueLabel)
				gen.AddGoto(falseLabel)

				return interfaces.Value{Value: "", IsTemp: false, Type: interfaces.BOOLEAN, TrueLabel: trueLabel, FalseLabel: falseLabel}

			} else {
				fmt.Print("ERROR: No es posible Dividir")
			}

		}
	}

	return interfaces.Value{Value: "0", Type: interfaces.INTEGER, IsTemp: false, TrueLabel: "", FalseLabel: ""}
}
