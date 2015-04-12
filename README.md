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

Przykładowy kod źródowy własnego języka:
[klik][3]

Reprezentacja pośrednia:
[klik][4]

[1]: http://www.antlr.org/
[2]: http://llvm.org/
[3]: ./test
[4]: ./test.ll
