Un Text Block (bloque de texto) es una función que Java añadió recientemente (en la versión 15) para que escribir textos largos o reportes sea mucho más fácil.

Stack almacena datos primitivos, tanto su variable como su valor.
Los datos no primitivos (arrays, objetos, Strings) su variable se almacena en el stack y su valor (el objeto, array o string) se almacena en el heap, estas se relacionan mediante un codigo hexadecimal(direccion de memoria o referencia).

Caso de String: viven en una zona especial llamada String Pool para ahorro de memoria.

Relaciones entre stack y heap:

*Dos referencias, un objeto.
*Objetos dentro de objetos.
*Referencia sin destino.
*Paso por valor (en metodos)
*Objetos huerfanos
*Objetos que se apuntan entre si (pero si borras las variables se marcan como inalcanzables)