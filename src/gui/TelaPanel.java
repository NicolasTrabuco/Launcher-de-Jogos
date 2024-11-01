package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class TelaPanel extends JPanel implements ActionListener {
    private JPanel telas;
    private CardLayout controleDeTela;
    private JFrame janela;

    public TelaPanel(JPanel telas, JFrame janela){
        this.telas = telas;
        this.controleDeTela = (CardLayout) telas.getLayout();
        this.janela = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        executarBotao(e);
    }

    protected void executarBotao(ActionEvent e){

    }

    protected void trocarTela(String identificador){
        controleDeTela.show(telas, identificador);
    }
}
