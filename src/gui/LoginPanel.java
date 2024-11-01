package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends TelaPanel{
    private JButton botaoLogin;

    public LoginPanel(JPanel telas, JFrame janela){
        super(telas, janela);
        JLabel mensagem = new JLabel("Conteudo do login panel");

        botaoLogin = new JButton("Fazer login");
        botaoLogin.addActionListener(this);

        this.add(mensagem);
        this.add(botaoLogin);
    }

    public void executarBotao(ActionEvent e){
        trocarTela("Tela Principal");
        System.out.println("principal");
    }
}
