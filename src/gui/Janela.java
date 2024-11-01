package gui;

import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {
    public Janela(){
        this.setBounds(0 , 0, 1920, 1000 );

        CardLayout controleDeTela = new CardLayout();
        JPanel telas = new JPanel(controleDeTela);
        LoginPanel loginPanel = new LoginPanel(telas, this);
        PrincipalPanel principalPanel = new PrincipalPanel(telas, this);

        telas.add(loginPanel, "Fazer Login");
        telas.add(principalPanel, "Tela Principal");

        this.add(telas);
        this.setVisible(true);
    }
}
