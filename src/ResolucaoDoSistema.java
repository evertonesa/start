import java.awt.*;

public class ResolucaoDoSistema {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolucao da maquina e: " + d.width + "x" + d.height);
    }
}
