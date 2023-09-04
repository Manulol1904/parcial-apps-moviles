
 
public class recursividad{
     
    public static void main(String[] args) {
        //ingresar los datos a gusto //
        int Dato = 3;
        int exponente = 4;
        System.out.println("resultado= "+potencia(Dato, exponente));
    }
         
    private static int potencia(int Dato, int exponente){
        if(exponente==0){
            return 1;
        } else if (exponente<0) {
            return potencia(Dato, exponente+1) / Dato;
        } else {
            return Dato * potencia(Dato, exponente-1);
        }
    }
}
