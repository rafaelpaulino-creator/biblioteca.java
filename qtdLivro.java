import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class qtdLivro extends JFrame {
    public qtdLivro(){
        setTitle("Quantidade de Livros Cadastrados");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel lblQtdLivros = new JLabel("Quantidade de Livros: "+ cadastrarLivro.qtdLivro);
        add(lblQtdLivros);




        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> dispose());

        add(btnVoltar);
        setVisible(true);



    }
}
