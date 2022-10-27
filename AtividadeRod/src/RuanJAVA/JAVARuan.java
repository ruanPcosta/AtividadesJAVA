package RuanJAVA;

import java.util.Scanner;
public class JAVARuan {

    
    public static void main(String[] args) {
        Scanner ruanpc = new Scanner (System.in);
        float bim1, bim2;
        
        System.out.println("Digite a nota do primeiro bimestre (Peso 2): ");
        bim1 = ruanpc.nextFloat();
        
        System.out.println("Digite a nota do segundo bimestre (Peso 3):");
        bim2 = ruanpc.nextFloat();
        
        System.out.println("Essa é a média do aluno: " + (bim1*2 + bim2*3)/5);
        

        
    }

}
