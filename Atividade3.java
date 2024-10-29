import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        float salarioBruto,adcNoturno, horasExtras , descontos, salarioLiquido;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu salário bruto");
        salarioBruto= leia.nextFloat();

        System.out.println("Digite seu adicional noturno");
        adcNoturno= leia.nextFloat();

        System.out.println("Digite suas horas extras");
        horasExtras= leia.nextFloat();

        System.out.println("Digite seus descontos");
        descontos= leia.nextFloat();

        salarioLiquido = salarioBruto + adcNoturno + (horasExtras*5) - descontos;
        System.out.println("Seu salário liquido é: " + salarioLiquido);

        leia.close();
    }
}
