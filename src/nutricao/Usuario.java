
package nutricao;
<<<<<<< HEAD

import java.util.Scanner;

public class Usuario {
    public static enum Biotipo {
        Ectomorfo, 
        Mesomorfo, 
        Endomorfo
    }

    public static enum Objetivo {
        Emagrecimento, 
        Hipertrofia, 
        Definicao
    }

=======
import java.util.Scanner;

public class Usuario {    
    public static enum Biotipo {
        Ectomorfo,
        Mesomorfo,
        Endomorfo
    }
    
    public static enum Objetivo {
        Emagrecimento,
        Hipertrofia,
        Definicao
    }
    
>>>>>>> initial lab commit
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private Biotipo biotipo;
<<<<<<< HEAD
    // private double imc;

    // implementar classes
    // private FichaMedica fichaMedica;
    private Objetivo objetivo;
    private Dieta dietaAtual;
    private Treino treinoAtual;

    // plano nutricional
    private Dieta dietaSugerida;
    private Treino treinoSugerido;

    public Usuario() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = input.skip("\n").nextLine();
        setNome(nome);

        System.out.println("Digite sua idade");
        int idade = input.nextInt();
        setIdade(idade);

        System.out.println("Digite seu peso");
        double peso = input.nextDouble();
        setPeso(peso);

        System.out.println("Digite seu altura");
        double altura = input.nextDouble();
        setAltura(altura);

        System.out.println("Digite seu Objetivo (H: Hipertrofia, E: Emagrecimento ou D: Definicao)");
        char objetivo = input.next().charAt(0);
        setObjetivo(objetivo);

        System.out.println("Digite seu Biotipo (Ec: Ectomorfo, En: Endmorfo ou Me: Mesomorfo)");
        String biotipo = input.next();
        setBiotipo(biotipo);
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getImc() {
        return getPeso() / Math.pow(getAltura(), 2);
        // (getAltura()*getAltura());
    }

    protected void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

=======
//    private double imc;
    
    // implementar classes
//    private FichaMedica fichaMedica;
    private Objetivo objetivo;
    private Dieta dietaAtual;
    private Treino treinoAtual;
    
    // plano nutricional
    private Dieta dietaSugerida;
    private Treino treinoSugerido;
    
    public double getAltura() {
        return altura;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public double getImc() {
        return getPeso()/Math.pow(getAltura(), 2);
//        (getAltura()*getAltura());
    }
    
    protected void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo; 
    }
    
>>>>>>> initial lab commit
    public void setObjetivo(char digitado) {
        if (digitado == 'e' || digitado == 'E') {
            setObjetivo(Objetivo.Emagrecimento);
        }
        if (digitado == 'h' || digitado == 'H') {
            setObjetivo(Objetivo.Hipertrofia);
        }
        if (digitado == 'd' || digitado == 'D') {
            setObjetivo(Objetivo.Definicao);
        }
    }
<<<<<<< HEAD

    protected void setBiotipo(Biotipo bio) {
        biotipo = bio;
    }

    public void setBiotipo(String digitado) {
        String upper = digitado.toUpperCase();
        if (upper.equals("EC"))
            setBiotipo(Biotipo.Ectomorfo);
        if (upper.equals("EN"))
            setBiotipo(Biotipo.Endomorfo);
        if (upper.equals("ME"))
            setBiotipo(Biotipo.Mesomorfo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

=======
    
    protected void setBiotipo(Biotipo bio){
        biotipo = bio;
    }
    
    public void setBiotipo(String digitado){
        String upper = digitado.toUpperCase();
        if (upper.equals("EC")) setBiotipo(Biotipo.Ectomorfo);
        if (upper.equals("EN")) setBiotipo(Biotipo.Endomorfo);
        if (upper.equals("ME")) setBiotipo(Biotipo.Mesomorfo);
    }
    
    public static Usuario cadastrar(){
        Scanner input = new Scanner(System.in);
        Usuario usuario = new Usuario();
        
        System.out.println("Digite seu nome");
        String nome = input.skip("\n").nextLine();
        usuario.setNome(nome);
    
        System.out.println("Digite sua idade");
        int idade = input.nextInt();
        usuario.setIdade(idade);
        
        System.out.println("Digite seu peso");
        double peso = input.nextDouble();
        usuario.setPeso(peso);
        
        System.out.println("Digite seu altura");
        double altura = input.nextDouble();
        usuario.setAltura(altura);
                
        System.out.println("Digite seu Objetivo (H: Hipertrofia, E: Emagrecimento ou D: Definicao)");
        char objetivo = input.next().charAt(0);        
        usuario.setObjetivo(objetivo);
        
        System.out.println("Digite seu Biotipo (Ec: Ectomorfo, En: Endmorfo ou Me: Mesomorfo)");
        String biotipo = input.next();        
        usuario.setBiotipo(biotipo);
        
        return usuario;
    }
    
   public void setNome(String nome){
       this.nome = nome;
   }
    
   public void setIdade(int id){
       this.idade = id;
   }

   public void setPeso(double peso){
       this.peso = peso;
   }
   
   public void setAltura(double altura){
       this.altura = altura;
   }
    
    
>>>>>>> initial lab commit
}
