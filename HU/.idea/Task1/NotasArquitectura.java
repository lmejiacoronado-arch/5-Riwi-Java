public class NotasArquitectura {
    public static void main(String[] args) {

        /*diferencia de enfoque entre Java 8 (Legacy) y las versiones Java 17/21 (LTS Actual).*/

        /*Este salto a versiones modernas (11/17) aumenta la productividad y rendimiento centrando en reducir codigo repititivo y optmimzar el uso de recursos */

        String diferenciasClaves = """
        1. Sintaxis y lenguaje:
        Inferencia en tipos: antes se declaraba todo | uso de var
        Clases de datos: getters, setters, equals, hashCode | records
        Text Block: + o \n | triples comillas dobles
        Switch (switch, breaks)| Switch Expressions(-->)
        Instanceof: requiere casting manual después del chequeo | pattern Matching
        
        -------------------------------------------------------
        2. Nuevas APIs y mejoras tecnicas
        Cliente: HttpURLConnection | HttpClient (soporta HTTP/2 y WebSockets)
        Api de colecciones: Ahora puedes crear listas o mapas inmutables de forma sencilla
        NullPointerExceptions útiles: si ocurre un NPE, el mensaje te dice exactamente qué variable era nula
        
        -------------------------------------------------------
        
        3. Rendimiento y JVM
        GC: Java 8 usaba Parallel GC por defecto. Java 11+ usa G1GC (más equilibrado) e introdujo ZGC (Java 15+), diseñado para manejar memorias gigantes con pausas de milisegundos.
        Modularizacion: permite dividir el JDK en módulos. pesan menos, mas seguras
        Soporte para docker, kubernetes: Java 8 a veces intentaba usar toda la RAM del servidor físico en lugar de respetar los límites del contenedor, causando cierres inesperados
        
        -------------------------------------------------------
        
        4. Cambios en el soporte(LTS)
        Java 8: no recibe mejoras, solo parches de seguridad críticos
                
        Java 11: Fue el primer gran salto estable (LTS) tras el cambio de ciclo de lanzamiento
                
        Java 17: Es la versión recomendada actualmente para nuevos proyectos. Tiene soporte a largo plazo y consolida todas las mejoras de lenguaje mencionadas arriba
        """;
        System.out.println(diferenciasClaves);


        /*cómo la JVM y el Garbage Collector gestionan los objetos creados para optimizar la memoria del sistema.????

        La memoria Heap (donde viven los objetos) se divide en tres áreas principales:
        Young Gen: eden, suvivor (S0 y S1).
        Old Gen:
        Metaspace: guarda los metadatos de las clases (no del objeto)


        CICLO:
        1. Asignacion a eden
        2. Minor GC: se activa cuando el eden se llena, los objetos usados o ref y los mueve a survivor space
        3. Envejecimiento: los objetos pasan de S0 a  S1 cada vez que el GC pasa y empieza un contador
        4. Promocion: si un objeto alcanza el contador de 15 pasa a Old Gen
        5. Major GC: cuando se llena el Old Gen se raliza una limpieza mas profunda


        ¿Cómo sabe el GC qué borrar? (Mark & Sweep) y Compactacion


        Estrategias Modernas (Java 11/17)
        G1 (Garbage First): Divide el Heap en cientos de regiones pequeñas, Prioriza limpiar las regiones que tienen más basura primero
        ZGC (Z Garbage Collector): diseñado para manejar Terabytes de memoria con pausas de menos de 1 milisegundo*/
    }
}

