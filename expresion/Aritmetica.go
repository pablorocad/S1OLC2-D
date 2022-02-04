package expresion

import (
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

func (p Aritmetica) Ejecutar() interfaces.Symbol {
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

	var retornoIzq interfaces.Symbol
	var retornoDer interfaces.Symbol

	if p.Unario == true {
		retornoIzq = p.Op1.Ejecutar()
	} else {
		retornoIzq = p.Op1.Ejecutar()
		retornoDer = p.Op2.Ejecutar()
	}

	var resultado interface{}

	var dominante interfaces.TipoExpresion

	switch p.Operador {
	case "+":
		{

			dominante = suma_resta_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Tipo: dominante, Valor: retornoIzq.Valor.(int) + retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				return interfaces.Symbol{Tipo: dominante, Valor: retornoIzq.Valor.(float64) + retornoDer.Valor.(float64)}

			} else if dominante == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)

				return interfaces.Symbol{Tipo: dominante, Valor: r1 + r2}
			} else {
				fmt.Print("ERROR: No es posible sumar")
			}

		}

	case "-":
		{
			dominante = suma_resta_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Tipo: dominante, Valor: retornoIzq.Valor.(int) - retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				return interfaces.Symbol{Tipo: dominante, Valor: retornoIzq.Valor.(float64) - retornoDer.Valor.(float64)}

			} else {
				fmt.Print("ERROR: No es posible restar")
			}
		}

	case "*":
		{
			dominante = multi_division_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {
				return interfaces.Symbol{Tipo: dominante, Valor: retornoIzq.Valor.(int) * retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				return interfaces.Symbol{Tipo: dominante, Valor: retornoIzq.Valor.(float64) * retornoDer.Valor.(float64)}

			} else {
				fmt.Print("ERROR: No es posible Multiplicar")
			}

		}

	case "/":
		{
			dominante = multi_division_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {
				return interfaces.Symbol{Tipo: dominante, Valor: retornoIzq.Valor.(int) / retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				return interfaces.Symbol{Tipo: dominante, Valor: retornoIzq.Valor.(float64) / retornoDer.Valor.(float64)}

			} else {
				fmt.Print("ERROR: No es posible Dividir")
			}

		}
	}

	return interfaces.Symbol{Tipo: interfaces.INTEGER, Valor: resultado}
}
