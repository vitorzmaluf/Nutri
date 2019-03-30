
package nutricao;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author unifdaoliveira
 */
public class Alimento {    
    public static enum GrupoAlimentar {
        Carboidrato,
        Proteina,
        Lipidio
    }
    
    private GrupoAlimentar grupo;
    
    private int valorEnergetico;
    private double carboidratos;
    private double proteinas;
    private double sodio;
    private double porcao;
    private ArrayList<Alimento> alimentos;
//    private Object[] gorduras;
//...
    
    private static ArrayList<Alimento> alimentos(){
        
        
    }
    
    public Alimento(GrupoAlimentar grupo){
        this.grupo = grupo;
    }
    
//    Alimento teste = new Alimento();
        
}
