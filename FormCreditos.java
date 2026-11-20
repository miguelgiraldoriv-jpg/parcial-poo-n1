import javax.swing.*;
import java.awt.*;

public class FormCreditos extends JFrame {
    private JPanel panelPrincipal;

    public FormCreditos() {
        setTitle("BookUsers - Créditos");
        panelPrincipal = new JPanel(new GridLayout(2, 1, 10, 10));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)
        panelPrincipal.add(new JLabel("<html><b>julieth rueda</b><br>Código:<br>julieth.ruedadia@unipaz.edu.co</html>"));
        panelPrincipal.add(new JLabel("<html><b>miguel giraldo</b><br>Código:<br>miguel.giraldoriv@unipaz.edu.co</html>"));
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(380, 260);
        setLocationRelativeTo(null);
    }
}
