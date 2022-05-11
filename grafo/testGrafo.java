package grafo;

public class testGrafo {

    public static void main(String[] args) {
        Grafo grafo=new Grafo();
        System.out.println("Comienzo asserts");
        assert grafo.aMethod(true, true, true)==1:"Error camino 1, el grafo ha devuelto 1";
        assert grafo.aMethod(true, false, true)==2:"Error camino 2, el grafo ha devuelto 2";
        assert grafo.aMethod(false, true, true)==2:"Error camino 3, el grafo ha devuelto 2";
        assert grafo.aMethod(true, true, false)==1:"Error camino 4, el grafo ha devuelto 1";
        assert grafo.aMethod(false, true, false)==0:"Error camino 5, el grafo ha devuelto 0";
        assert grafo.aMethod(false, false, false)==0:"Error camino 6, el grafo ha devuelto 0";
        System.out.println("Fin asserts");
        
    }
    
}
