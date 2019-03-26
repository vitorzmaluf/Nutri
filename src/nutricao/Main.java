
package nutricao;
import java.util.Scanner;
/**
 *
 * @author unifdaoliveira
 */
public class Main {

    public static void main(String[] args){
        Usuario usuario = null;
        Scanner input = null;
        
        
        int opc = 0;
        do{
            System.out.println("-------------------------------------------");
            System.out.println("Digite 1 para criar seu perfl");
            System.out.println("Digite 2 para visualizar seus dados");
            System.out.println("Digite 3 para alterar seus dados");
            System.out.println("Digite 4 para deletar seu perfil");
            System.out.println("Digite 5 para encerrar o programa");
            System.out.println("-------------------------------------------");
            
            input = new Scanner(System.in);
            if (input.hasNext()) opc = input.nextInt();
            else opc = 5;
            input.close();
            
            if (opc == 1) /*Usuario.cadastrar()*/;
            else if (usuario == null || opc != 5) System.out.println("Seu perfil ainda não foi criado!");
            else{
                if (opc == 2) /*usuario.visualizar()*/;
                if (opc == 3) /*usuario.alterar()*/;
                if (opc == 4) /*usuario.deletar()*/;
            }
            
        }while(opc != 5);
        
        
        
//        u.dieta = Calculo.fazDieta();
    }
    
}
