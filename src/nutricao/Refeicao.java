
package nutricao;

import java.util.ArrayList;

/**
 *
 * @author unifvmaluf
 */
public class Refeicao {
    public enum Periodo{
        Manha,
        Tarde,
        Noite
    }
    
    private ArrayList<Alimento> alimentos;
    
    private Periodo periodo;
    
    public Refeicao(ArrayList<Alimento> alimentos, Periodo periodo){
        this.alimentos = alimentos;
        this.periodo = periodo;
    }
    
//    public Refeicao(int calorias) {
//        
//    }
}
