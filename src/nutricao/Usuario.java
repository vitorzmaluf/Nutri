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
public class Usuario {    
    public enum Biotipo {
        Ectomorfo,
        Mesomorfo,
        Endomorfo
    }
    
    public enum Objetivo {
        Emagrecimento,
        Hipertrofia,
        Definicao
    }
    
    private String nome;
    private int idade;
    private double peso;
    private int altura;
    private Biotipo biotipo;
    private double imc;
    
    // implementar classes
//    private FichaMedica fichaMedica;
    private Objetivo objetivo;
    private Dieta dietaAtual;
    private Treino treinoAtual;
    
    // plano nutricional
    private Dieta dietaSugerida;
    private Treino treinoSugerida;
    
    public double getPeso() {
        return this.peso;
    }
}
