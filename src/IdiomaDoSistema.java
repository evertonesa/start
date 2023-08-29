import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale linguagem = new Locale("Portugues", "Brasil");
        System.out.println("O Idioma do sistema e: ");
        System.out.println(linguagem);
    }
}


/*
 Idioma utilizado no SO
Locale idioma = Locale.getDefault();
System.out.print("O idioma do seu sistema está configurado para: ");
System.out.println(idioma.getDisplayLanguage());
*/
