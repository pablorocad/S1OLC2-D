// Code generated from Chems.g4 by ANTLR 4.7.2. DO NOT EDIT.

package parser // Chems

import "github.com/antlr/antlr4/runtime/Go/antlr"

// ChemsListener is a complete listener for a parse tree produced by Chems.
type ChemsListener interface {
	antlr.ParseTreeListener

	// EnterStart is called when entering the start production.
	EnterStart(c *StartContext)

	// EnterInstrucciones is called when entering the instrucciones production.
	EnterInstrucciones(c *InstruccionesContext)

	// EnterInstruccion is called when entering the instruccion production.
	EnterInstruccion(c *InstruccionContext)

	// EnterLista_att is called when entering the lista_att production.
	EnterLista_att(c *Lista_attContext)

	// EnterArray_st is called when entering the array_st production.
	EnterArray_st(c *Array_stContext)

	// EnterStruct_st is called when entering the struct_st production.
	EnterStruct_st(c *Struct_stContext)

	// EnterExpression is called when entering the expression production.
	EnterExpression(c *ExpressionContext)

	// EnterExpr_arit is called when entering the expr_arit production.
	EnterExpr_arit(c *Expr_aritContext)

	// EnterListValues is called when entering the listValues production.
	EnterListValues(c *ListValuesContext)

	// EnterPrimitivo is called when entering the primitivo production.
	EnterPrimitivo(c *PrimitivoContext)

	// EnterListArray is called when entering the listArray production.
	EnterListArray(c *ListArrayContext)

	// ExitStart is called when exiting the start production.
	ExitStart(c *StartContext)

	// ExitInstrucciones is called when exiting the instrucciones production.
	ExitInstrucciones(c *InstruccionesContext)

	// ExitInstruccion is called when exiting the instruccion production.
	ExitInstruccion(c *InstruccionContext)

	// ExitLista_att is called when exiting the lista_att production.
	ExitLista_att(c *Lista_attContext)

	// ExitArray_st is called when exiting the array_st production.
	ExitArray_st(c *Array_stContext)

	// ExitStruct_st is called when exiting the struct_st production.
	ExitStruct_st(c *Struct_stContext)

	// ExitExpression is called when exiting the expression production.
	ExitExpression(c *ExpressionContext)

	// ExitExpr_arit is called when exiting the expr_arit production.
	ExitExpr_arit(c *Expr_aritContext)

	// ExitListValues is called when exiting the listValues production.
	ExitListValues(c *ListValuesContext)

	// ExitPrimitivo is called when exiting the primitivo production.
	ExitPrimitivo(c *PrimitivoContext)

	// ExitListArray is called when exiting the listArray production.
	ExitListArray(c *ListArrayContext)
}
