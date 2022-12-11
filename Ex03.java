package Lista05ex03;
import java.util.Scanner;
public class Ex03 {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int n1=sc.nextInt();
        System.out.print("Insira o segundo número: ");
        int n2=sc.nextInt();
        System.out.print("Insira o terceiro número: ");
        int n3=sc.nextInt();
        sc.close();
        int resultadoSoma=calculo(n1, n2, n3);
        System.out.println("A soma dos números é: "+resultadoSoma);
    }   

    static int calculo(int n1, int n2, int n3){
        int soma=n1+n2+n3;
        return soma;
    }
}
