// Code generated from ChemsLexer.g4 by ANTLR 4.7.2. DO NOT EDIT.

package parser

import (
	"fmt"
	"unicode"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

// Suppress unused import error
var _ = fmt.Printf
var _ = unicode.IsLetter

var serializedLexerAtn = []uint16{
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 2, 22, 113,
	8, 1, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7,
	9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12,
	4, 13, 9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 4, 17, 9, 17, 4,
	18, 9, 18, 4, 19, 9, 19, 4, 20, 9, 20, 4, 21, 9, 21, 4, 22, 9, 22, 3, 2,
	3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4,
	6, 4, 59, 10, 4, 13, 4, 14, 4, 60, 3, 5, 3, 5, 7, 5, 65, 10, 5, 12, 5,
	14, 5, 68, 11, 5, 3, 5, 3, 5, 3, 6, 3, 6, 3, 7, 3, 7, 3, 8, 3, 8, 3, 9,
	3, 9, 3, 9, 3, 10, 3, 10, 3, 10, 3, 11, 3, 11, 3, 12, 3, 12, 3, 13, 3,
	13, 3, 14, 3, 14, 3, 15, 3, 15, 3, 16, 3, 16, 3, 17, 3, 17, 3, 18, 3, 18,
	3, 19, 3, 19, 3, 20, 3, 20, 3, 21, 6, 21, 105, 10, 21, 13, 21, 14, 21,
	106, 3, 21, 3, 21, 3, 22, 3, 22, 3, 22, 2, 2, 23, 3, 3, 5, 4, 7, 5, 9,
	6, 11, 7, 13, 8, 15, 9, 17, 10, 19, 11, 21, 12, 23, 13, 25, 14, 27, 15,
	29, 16, 31, 17, 33, 18, 35, 19, 37, 20, 39, 21, 41, 22, 43, 2, 3, 2, 6,
	3, 2, 50, 59, 3, 2, 36, 36, 6, 2, 11, 12, 15, 15, 34, 34, 94, 94, 9, 2,
	34, 35, 37, 37, 45, 45, 47, 48, 60, 60, 66, 66, 93, 95, 2, 114, 2, 3, 3,
	2, 2, 2, 2, 5, 3, 2, 2, 2, 2, 7, 3, 2, 2, 2, 2, 9, 3, 2, 2, 2, 2, 11, 3,
	2, 2, 2, 2, 13, 3, 2, 2, 2, 2, 15, 3, 2, 2, 2, 2, 17, 3, 2, 2, 2, 2, 19,
	3, 2, 2, 2, 2, 21, 3, 2, 2, 2, 2, 23, 3, 2, 2, 2, 2, 25, 3, 2, 2, 2, 2,
	27, 3, 2, 2, 2, 2, 29, 3, 2, 2, 2, 2, 31, 3, 2, 2, 2, 2, 33, 3, 2, 2, 2,
	2, 35, 3, 2, 2, 2, 2, 37, 3, 2, 2, 2, 2, 39, 3, 2, 2, 2, 2, 41, 3, 2, 2,
	2, 3, 45, 3, 2, 2, 2, 5, 53, 3, 2, 2, 2, 7, 58, 3, 2, 2, 2, 9, 62, 3, 2,
	2, 2, 11, 71, 3, 2, 2, 2, 13, 73, 3, 2, 2, 2, 15, 75, 3, 2, 2, 2, 17, 77,
	3, 2, 2, 2, 19, 80, 3, 2, 2, 2, 21, 83, 3, 2, 2, 2, 23, 85, 3, 2, 2, 2,
	25, 87, 3, 2, 2, 2, 27, 89, 3, 2, 2, 2, 29, 91, 3, 2, 2, 2, 31, 93, 3,
	2, 2, 2, 33, 95, 3, 2, 2, 2, 35, 97, 3, 2, 2, 2, 37, 99, 3, 2, 2, 2, 39,
	101, 3, 2, 2, 2, 41, 104, 3, 2, 2, 2, 43, 110, 3, 2, 2, 2, 45, 46, 7, 101,
	2, 2, 46, 47, 7, 113, 2, 2, 47, 48, 7, 112, 2, 2, 48, 49, 7, 117, 2, 2,
	49, 50, 7, 113, 2, 2, 50, 51, 7, 110, 2, 2, 51, 52, 7, 103, 2, 2, 52, 4,
	3, 2, 2, 2, 53, 54, 7, 110, 2, 2, 54, 55, 7, 113, 2, 2, 55, 56, 7, 105,
	2, 2, 56, 6, 3, 2, 2, 2, 57, 59, 9, 2, 2, 2, 58, 57, 3, 2, 2, 2, 59, 60,
	3, 2, 2, 2, 60, 58, 3, 2, 2, 2, 60, 61, 3, 2, 2, 2, 61, 8, 3, 2, 2, 2,
	62, 66, 7, 36, 2, 2, 63, 65, 10, 3, 2, 2, 64, 63, 3, 2, 2, 2, 65, 68, 3,
	2, 2, 2, 66, 64, 3, 2, 2, 2, 66, 67, 3, 2, 2, 2, 67, 69, 3, 2, 2, 2, 68,
	66, 3, 2, 2, 2, 69, 70, 7, 36, 2, 2, 70, 10, 3, 2, 2, 2, 71, 72, 7, 48,
	2, 2, 72, 12, 3, 2, 2, 2, 73, 74, 7, 61, 2, 2, 74, 14, 3, 2, 2, 2, 75,
	76, 7, 35, 2, 2, 76, 16, 3, 2, 2, 2, 77, 78, 7, 64, 2, 2, 78, 79, 7, 63,
	2, 2, 79, 18, 3, 2, 2, 2, 80, 81, 7, 62, 2, 2, 81, 82, 7, 63, 2, 2, 82,
	20, 3, 2, 2, 2, 83, 84, 7, 64, 2, 2, 84, 22, 3, 2, 2, 2, 85, 86, 7, 62,
	2, 2, 86, 24, 3, 2, 2, 2, 87, 88, 7, 44, 2, 2, 88, 26, 3, 2, 2, 2, 89,
	90, 7, 49, 2, 2, 90, 28, 3, 2, 2, 2, 91, 92, 7, 45, 2, 2, 92, 30, 3, 2,
	2, 2, 93, 94, 7, 47, 2, 2, 94, 32, 3, 2, 2, 2, 95, 96, 7, 42, 2, 2, 96,
	34, 3, 2, 2, 2, 97, 98, 7, 43, 2, 2, 98, 36, 3, 2, 2, 2, 99, 100, 7, 125,
	2, 2, 100, 38, 3, 2, 2, 2, 101, 102, 7, 127, 2, 2, 102, 40, 3, 2, 2, 2,
	103, 105, 9, 4, 2, 2, 104, 103, 3, 2, 2, 2, 105, 106, 3, 2, 2, 2, 106,
	104, 3, 2, 2, 2, 106, 107, 3, 2, 2, 2, 107, 108, 3, 2, 2, 2, 108, 109,
	8, 21, 2, 2, 109, 42, 3, 2, 2, 2, 110, 111, 7, 94, 2, 2, 111, 112, 9, 5,
	2, 2, 112, 44, 3, 2, 2, 2, 6, 2, 60, 66, 106, 3, 8, 2, 2,
}

var lexerDeserializer = antlr.NewATNDeserializer(nil)
var lexerAtn = lexerDeserializer.DeserializeFromUInt16(serializedLexerAtn)

var lexerChannelNames = []string{
	"DEFAULT_TOKEN_CHANNEL", "HIDDEN",
}

var lexerModeNames = []string{
	"DEFAULT_MODE",
}

var lexerLiteralNames = []string{
	"", "'console'", "'log'", "", "", "'.'", "';'", "'!'", "'>='", "'<='",
	"'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'{'", "'}'",
}

var lexerSymbolicNames = []string{
	"", "CONSOLE", "LOG", "NUMBER", "STRING", "PUNTO", "PTCOMA", "DIFERENTE",
	"MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB",
	"PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE",
}

var lexerRuleNames = []string{
	"CONSOLE", "LOG", "NUMBER", "STRING", "PUNTO", "PTCOMA", "DIFERENTE", "MAYORIGUAL",
	"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "PARIZQ", "PARDER",
	"LLAVEIZQ", "LLAVEDER", "WHITESPACE", "ESC_SEQ",
}

type ChemsLexer struct {
	*antlr.BaseLexer
	channelNames []string
	modeNames    []string
	// TODO: EOF string
}

var lexerDecisionToDFA = make([]*antlr.DFA, len(lexerAtn.DecisionToState))

func init() {
	for index, ds := range lexerAtn.DecisionToState {
		lexerDecisionToDFA[index] = antlr.NewDFA(ds, index)
	}
}

func NewChemsLexer(input antlr.CharStream) *ChemsLexer {

	l := new(ChemsLexer)

	l.BaseLexer = antlr.NewBaseLexer(input)
	l.Interpreter = antlr.NewLexerATNSimulator(l, lexerAtn, lexerDecisionToDFA, antlr.NewPredictionContextCache())

	l.channelNames = lexerChannelNames
	l.modeNames = lexerModeNames
	l.RuleNames = lexerRuleNames
	l.LiteralNames = lexerLiteralNames
	l.SymbolicNames = lexerSymbolicNames
	l.GrammarFileName = "ChemsLexer.g4"
	// TODO: l.EOF = antlr.TokenEOF

	return l
}

// ChemsLexer tokens.
const (
	ChemsLexerCONSOLE    = 1
	ChemsLexerLOG        = 2
	ChemsLexerNUMBER     = 3
	ChemsLexerSTRING     = 4
	ChemsLexerPUNTO      = 5
	ChemsLexerPTCOMA     = 6
	ChemsLexerDIFERENTE  = 7
	ChemsLexerMAYORIGUAL = 8
	ChemsLexerMENORIGUAL = 9
	ChemsLexerMAYOR      = 10
	ChemsLexerMENOR      = 11
	ChemsLexerMUL        = 12
	ChemsLexerDIV        = 13
	ChemsLexerADD        = 14
	ChemsLexerSUB        = 15
	ChemsLexerPARIZQ     = 16
	ChemsLexerPARDER     = 17
	ChemsLexerLLAVEIZQ   = 18
	ChemsLexerLLAVEDER   = 19
	ChemsLexerWHITESPACE = 20
)
