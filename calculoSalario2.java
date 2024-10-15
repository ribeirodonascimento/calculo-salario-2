import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        String nome = s.nextLine();
        double salarioFixo = s.nextDouble();
        double vendas = s.nextDouble();
        double comissao = vendas * 0.15;
        double salarioFinal = salarioFixo + comissao;
        System.out.printf("TOTAL = R$ %.2f%n",salarioFinal);

    }
}