import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int num, r, abs;
        double c;

        System.out.println("Digite um valor: ");
        num = entrada.nextInt();

        //Calculando o resto da divisão
        r = num % 2;
        System.out.println("O resto da divisao e: " + r);

        //Calculando a potencia cúbica
        c = Math.pow(num, 3);
        System.out.println("A potencia cubica e: " + c);

        //Calculando a raiz quadrada
        double rq = Math.sqrt(num);
        System.out.format("A raiz quadrada e: %.2f \n", rq);

        //Calculando a raiz cúbica
        double rc = Math.cbrt(num);
        System.out.format("A raiz cubica e: %.2f \n", rc);

        //Calculando o valor absoluto
        abs = Math.abs(num);
        System.out.println("O valor absoluto e: " + abs);
    }
}
