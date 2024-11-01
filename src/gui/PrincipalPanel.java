package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalPanel extends TelaPanel{
    private JButton botaoPrincipal;

    public PrincipalPanel(JPanel telas, JFrame janela){
        super(telas, janela);
        JLabel mensagem = new JLabel("conteudo principal");

        botaoPrincipal = new JButton("Tela principal");
        botaoPrincipal.addActionListener(this);

        this.add(mensagem);
        this.add(botaoPrincipal);
    }
    public void executarBotao(ActionEvent e){
        trocarTela("Fazer Login");
        System.out.println("Login");
    }
}



