package test;
public class Calculadora {
    private static double resultadoAnterior=0.0;
    private double resultado =0.0;

    public double getResultadoAnterior() {return resultadoAnterior;}

    
    public Calculadora(double setResultadoAnterior) {
        super();
        this.resultadoAnterior = setResultadoAnterior;
    }


    public double sumar (double a, double b) {
            resultado=a+b;
            resultadoAnterior=resultado;
            return resultado;}

    public double restar (double a, double b)
    {
        resultado=a-b;
        resultadoAnterior=resultado;
        return resultado;}

    public double multiplicar (double a, double b)
    {
        resultado=a*b;
        resultadoAnterior=resultado;
        return resultado;}


    public double dividir (double a, double b) 
    {
        resultado=a/b;
        resultadoAnterior=resultado;
        return resultado;}

}
