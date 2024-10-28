import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        float n1,n2,n3,n4, calculo;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor de n1");
        n1 = leia.nextFloat();
        System.out.println("Digite o valor de n2");
        n2 = leia.nextFloat();
        System.out.println("Digite o valor de n3");
        n3 = leia.nextFloat();
        System.out.println("Digite o valor de n4");
        n4 = leia.nextFloat();
        calculo = (n1*n2) - (n3*n4);
        System.out.println("O resultado da diferença do produto entre o n1 e o n2 pelo produto entre o n3 e o n4 é: " + calculo);
    }
}
