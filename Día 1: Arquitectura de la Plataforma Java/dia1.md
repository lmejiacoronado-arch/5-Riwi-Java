//comando que se uso para recuperar el archivo .java mediante el archivo .class//
java -cp /snap/intellij-idea-community/733/plugins/java-decompiler/lib/java-decompiler.jar org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler -dgs=1 "/home/cohorte6/IdeaProjects/Dia1Sem1/Arquitectura.class" "/home/cohorte6/IdeaProjects/Dia1Sem1/"
INFO:  Decompiling class Arquitectura
INFO:  ... done


1. El Ciclo de Desarrollo y Ejecución

Este es el camino que sigue tu código desde que nace hasta que el procesador lo ejecuta a máxima velocidad.

Código Fuente (.java): Lo escribes en VS Code. Aquí es donde aplicas la lógica de Backend.

Compilación con JDK (javac): El JDK transforma tu código en Bytecode (.class).

Herramienta extra: Aquí podrías usar JShell para probar fragmentos de código sin crear archivos, o javap para inspeccionar si el compilador hizo lo que esperabas.

Distribución Segura: Entregas el Bytecode. Al ser un formato intermedio, es más seguro que un binario nativo porque la JVM lo validará antes de tocar el hardware.

Carga en la JVM: La JVM recibe el archivo. Antes de nada, el Bytecode Verifier revisa que el código no sea malicioso o intente corromper la memoria.

Interpretación y JIT (El Turbo): * Al principio, la JVM interpreta el Bytecode (lo lee línea por línea).

El JIT Compiler detecta las partes que más se usan y las traduce a Código Máquina Nativo. A partir de ese momento, tu programa corre tan rápido como uno escrito en C++.


2. Tabla Comparativa de Herramientas del JDK

Como exploraste la carpeta /bin, estas son las herramientas que ahora sabes usar según la situación:

Situación-->Herramienta a usar-->Resultado

Pruebas rápidas-->jshell-->Feedback instantáneo sin compilar.
Construcción-->javac-->Genera el archivo .class.
Auditoría / Pentesting-->javap -c-->Desensambla el Bytecode para ver la lógica real.
Optimización-->JIT Compiler	(Automático)-->Convierte "puntos calientes" en binario.
Empaquetado-->jar-->Crea el archivo distribuible (el "paquete").


3. El Flujo de Seguridad y Portabilidad (WORA)

Gracias a que el Bytecode es el estándar, el flujo garantiza que tu seguridad se mantenga sin importar el sistema operativo:

En Linux (Tu PC): Compilas y pruebas con las herramientas de Debian.
En la Nube / Servidor: La JVM del servidor recibe el Bytecode, lo verifica (Sandboxing) y el JIT lo adapta específicamente para el procesador del servidor.
