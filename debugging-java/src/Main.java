/*  UTILIZAÇÃO DO THREAD.DUMPSTACK();
    Imprime a STACK TRACE que está acontecendo.
        OUTPUT (TERMINAL):
            java.lang.Exception: Stack trace
            at java.base/java.lang.Thread.dumpStack(Thread.java:1380)
                at Main.c(Main.java:23)
                at Main.b(Main.java:17)
                at Main.a(Main.java:10)
                at Main.main(Main.java:4)
*/

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciou o programa no método Main!");
        a();
        System.out.println("Finalizou o programa no método Main!");
    }

    public static void a(){
        System.out.println("Entrou no método A.");
        b();
        System.out.println("Finalizou o método A.");
    }

    public static void b(){
        System.out.println("Entrou no método B.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método B.");
    }

    public static void c(){
        System.out.println("Entrou no método C.");
        Thread.dumpStack();
        System.out.println("Finalizou o método C.");
    }

}
