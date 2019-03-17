/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricao;

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
    
    
    
    private Alimento[] alimentos;
    
    private Periodo periodo;
    
    public Refeicao(Alimento[] alimentos, Periodo periodo){
        this.alimentos = alimentos;
        this.periodo = periodo;
    }
    
//    public Refeicao(int calorias) {
//        
//    }
}
