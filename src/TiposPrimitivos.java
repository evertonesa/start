import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite o nome do Aluno: ");
            String nome = entrada.nextLine();
            System.out.print("Digite a nota do Aluno: ");
            float nota = entrada.nextFloat();
            System.out.println("A nota de " + nome + " e: " + nota);
            System.out.printf("A nota de %s e: %.2f \n", nome, nota);
            System.out.format("A nota de %s e: %.2f \n", nome, nota);
        }
    }

}
