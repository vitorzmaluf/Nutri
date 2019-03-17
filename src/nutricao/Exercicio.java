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
public class Exercicio {
    public static enum Tipo {
        Aerobico,
        Anaerobico        
    }
    
   
    private Tipo tipo;
    
    private double kcalMin;
    
    private int duracaoRecomendada;
    
}
