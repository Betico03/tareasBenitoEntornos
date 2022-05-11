package test;

public class test {
    public static void main(String[] args) {
        double a=1.0;
        double b=3.0;
        double resultado=0.0;

        Calculadora pruebaCalculadora=new Calculadora(666.666);

        System.out.println("Comienzo asserts");
        assert pruebaCalculadora.sumar(a,b) ==4.0:"Error suma";
        assert pruebaCalculadora.restar(a,b) ==-2.0:"Error resta";
        assert pruebaCalculadora.multiplicar(a,b) ==3.0:"Error multiplicacion";
        assert pruebaCalculadora.dividir(a,b) ==1.0/3.0:"Error division";
        System.out.println("Fin asserts");

        System.out.println(pruebaCalculadora.getResultadoAnterior());

        resultado=pruebaCalculadora.sumar(a,b);

        System.out.println(resultado);
        

    }
    
}
