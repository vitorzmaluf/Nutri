/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricao;

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
    private double peso;
//    private Object[] gorduras;
//...
    
    public Alimento(GrupoAlimentar grupo){
        this.grupo = grupo;
    }
    
//    Alimento teste = new Alimento();
        
}
