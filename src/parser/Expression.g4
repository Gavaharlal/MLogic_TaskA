grammar Expression;


@parser::header {
  import expression.*;
}


options {
    language = Java;
}

file returns [Expression fileResult] : exp = expression {$fileResult = $exp.expressionResult;};

expression returns [Expression expressionResult] : dis = disjunction {$expressionResult = $dis.disjunctionResult;}
            | dis = disjunction IMPLICATION exp = expression {$expressionResult = new Implication($dis.disjunctionResult, $exp.expressionResult);};

disjunction returns [Expression disjunctionResult] : conj = conjunction {$disjunctionResult = $conj.conjunctionResult;}
            | disj = disjunction OR conj = conjunction {$disjunctionResult = new Disjunction($disj.disjunctionResult, $conj.conjunctionResult);};

conjunction returns [Expression conjunctionResult] : neg = negation {$conjunctionResult = $neg.negationResult;}
            | conj = conjunction AND neg = negation{$conjunctionResult = new Conjunction($conj.conjunctionResult, $neg.negationResult);};

negation returns [Expression negationResult] : NOT neg = negation {$negationResult = new Negation($neg.negationResult);}
                                                | var = variable {$negationResult = $var.variableValue;}
                                                | LEFTBRACKET exp = expression RIGHTBRACKET {$negationResult = $exp.expressionResult;};

variable returns [Expression variableValue] : VAR {$variableValue = new Variable($VAR.text);};

AND : '&';
OR : '|';
NOT : '!';
IMPLICATION : '->';
LEFTBRACKET : '(';
RIGHTBRACKET : ')';
VAR : [A-Z]([A-Z0-9'])*;
