grammar grammar;

@header {
package pl.rr;
import pl.rr.Compiler;
}

program returns [Compiler.Program ret] :
    { $ret = new Compiler.Program(); }
    (s = statement { $ret.add($s.ret); } ';')*
    ;

statement returns [Compiler.Statement ret] :
    c = var_dec { $ret = $c.val; } |
    a = ID '=' e = expression { $ret = new Compiler.Assignment($a.text, $e.ret); } |
    'ret' e = expression { $ret = new Compiler.Return($e.ret); } |
    r = readFunction { $ret = $r.ret; } |
    p = writeFunction { $ret = $p.ret; } |
    invocation { $ret = $invocation.ret; }
    ;

readFunction returns [ Compiler.ReadFunction ret ] :
    'read('
        n = ID { $ret = new Compiler.ReadFunction($n.text); }
    ')'
    ;

writeFunction returns [ Compiler.WriteFunction ret ] :
    'write('
        n = ID { $ret = new Compiler.WriteFunction($n.text); }
    ')'|
    'write('
            n = INT { $ret = new Compiler.WriteFunction($n.text); }
    ')'|
    'write('
            n = DOUBLE { $ret = new Compiler.WriteFunction($n.text); }
    ')'
    ;

invocation returns [Compiler.Invocation ret] :
    ID { $ret = new Compiler.Invocation($ID.text); }
    '('
        (a = expression { $ret.add($a.ret); }
            (',' a = expression { $ret.add($a.ret); } )*
        )?
    ')'
    ;

expression returns [Compiler.Expression ret] :
    INT { $ret = new Compiler.IntExpression($INT.text); } |
    DOUBLE { $ret = new Compiler.DoubleExpression($DOUBLE.text); } |
    b = artmExp { $ret = $b.val; } |
    ID { $ret = new Compiler.RefExpression($ID.text); }
    ;

artmExp returns [Compiler.ArExpressionAll val] :
    a = mulExp { $val = new Compiler.ArExpressionAll($a.val); }
    (m = add_operator b = mulExp { $val.add($b.val, $m.ret); })*
;

mulExp returns [Compiler.ArExpression val] :
    a = expOp { $val = new Compiler.ArExpression($a.val); }
    (m = mull_operator b = expOp { $val.add($b.val, $m.ret); })*
;

expOp returns [Compiler.Expression val] :
    a = INT { $val = new Compiler.IntExpression($a.text); } |
    c = DOUBLE { $val = new Compiler.DoubleExpression($c.text); } |
    b = ID { $val = new Compiler.RefExpression($b.text); }
;

var_dec returns [Compiler.VariableDeclaration val] :
    type ID { $val = new Compiler.VariableDeclaration($ID.text, $type.ret.getName()); }
    ;

type returns [Compiler.Type ret] :
    'double' { $ret = new Compiler.Type("double"); } |
    'int'   { $ret = new Compiler.Type("int"); }
    ;

mull_operator returns [String ret] :
    '*' { $ret = "*"; } |
    '/' { $ret = "/"; }
    ;

add_operator returns [String ret] :
    '+' { $ret = "+"; } |
    '-' { $ret = "-"; }
    ;


COMMENT
    :   ( '//' ~[\r\n]* '\r'? '\n'
        | '/*' .*? '*/'
        ) -> skip
    ;

INT : '0'..'9'+ ;
DOUBLE : ('-'|'+')?('0'..'9')+('.'('0'..'9')+)?;
ID  : 'a'..'z'+ ;
WS : (' '|'\r'|'\n') -> skip;


