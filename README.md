# antlr_llvm_compiler

Projekt zaliczający przedmiot Języki Formalne i Kompilatory. 
Kompilator własnego języka powstały przy wykorzystaniu narzędzi:
- [ANTLR V4][1]
- [LLVM][2]

Język wspiera:
- typ int i double
- obsługa standardowego wejścia i wyjścia (funkcje read(), write())
- obsługę podstawowych operacji arytmetycznych (+ - * /);

Na bazie dopuszczalnej gramatyki własnego języka programowania, przy pomocy narzędzia ANTLR, generowany jest lekser (służący do analizy leksykalnej) oraz parser (do analizy składniowej). Następnie tworzony jest plik zawierający reprezentację pośrednią (llvm bitcode) właściwego kodu źródłowego zgodny ze specyfikacją LLVM.

Przykładowy kod źródowy:
```java
double a;
double b;
a = 3.11;
b = 5.34;
int c;
c = 7;
double d;
d = 2 * a + 4 * 5 * 5.21 - a + b * c + 3.21 * a - 4.32 * c + a + b / 4 / a * c - 43;
write(d);
ret 0;
```

Reprezentacja pośrednia:
[klik][3]

[1]: http://www.antlr.org/
[2]: http://llvm.org/
[3]: ./test.ll
