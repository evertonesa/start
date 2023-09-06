import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSoma {
    private JPanel panelMain;
    private JTextField txtN1;
    private JTextField txtN2;
    private JButton btnSoma;

    public TelaSoma() {
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                int s = n1 + n2;
                btnSoma.setText(Integer.toString(s));
            }
        });
    }
}
