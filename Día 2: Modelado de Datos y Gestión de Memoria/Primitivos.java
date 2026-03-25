public class Primitivos {
    public static void main(String[] args) {
        byte by = 127; /*-128 a 127*/
        System.out.println(by);
        short sh = 32_766; /*-32.768 a 32.767*/
        System.out.println(sh);
        int in = 111; /*aproximadamente -2.147 millones a 2.147 millones*/
        System.out.println(in);
        long lo = 222L; /*valores numéricos muy grandes que superan el rango de int*/
        System.out.println(lo);

        float fl = 12.6F; /*Ofrece una precisión simple (aprox. 7 dígitos decimales)*/
        System.out.println(fl);
        double dou = 20.3; /*Proporciona doble precisión (aprox. 15 dígitos decimales)*/
        System.out.println(dou);

        char ch = 'A';
        System.out.println(ch);

        boolean boo = true;
        System.out.println(boo);

        by = (byte)(by + 3);
        System.out.println(by);

        String reporteFallo = """
        **************************************************
        *          REPORT: CORPORATE TALENT HUB          *
        *          ESTADO DEL SISTEMA: CRITICAL          *
        **************************************************
        
        TIPO DE ERROR: OutOfMemoryError (Heap Exhausted)
        CAUSA PROBABLE: Fuga de memoria (Memory Leak)
        
        DETALLE DE MEMORIA:
        --------------------------------------------------
        [ STACK ] : 1.2 MB (Estable)
           L Ultima referencia activa: listaEmpleados (0x7FF)
        
        [ HEAP  ] : 4096 MB (Lleno - 100%)
           L Objetos 'Empleado' huérfanos: 1.500.000
           L Estado del GC: Trabajando sin éxito...
        --------------------------------------------------
        
        DIAGNÓSTICO: 
        Se detectó una colección estática que nunca deja 
        de crecer. El Garbage Collector no puede borrar 
        los objetos porque el Stack aún los "ve".
        **************************************************
        """;

        System.out.println(reporteFallo);
    }
}



