import javax.swing.*;
import java.awt.*;

public class menuBiblioteca extends JFrame {

    public menuBiblioteca() {

        setTitle("Menu Biblioteca");

        setSize(320, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);


        setLayout(new BorderLayout());


        JLabel lblTitulo = new JLabel("Menu de Livros", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));


        JPanel painelBotoes = new JPanel(new GridLayout(6, 1, 10, 15));

        painelBotoes.setBorder(BorderFactory.createEmptyBorder(0, 40, 30, 40));


        JButton btnCadastrar = new JButton("Cadastrar Livro");
        btnCadastrar.addActionListener(e -> new cadastrarLivro().setVisible(true));


        JButton btnListar = new JButton("Listar Livros");
        btnListar.addActionListener(e -> new listarLivro().setVisible(true));


        JButton btnPesquisar = new JButton("Pesquisar Livro");
        btnPesquisar.addActionListener(e -> new pesquisarLivro().setVisible(true));


        JButton btnRemover = new JButton("Remover Livro");
        btnRemover.addActionListener(e -> new removerLivro().setVisible(true));


        JButton btnQtd = new JButton("Contador de Livros");
        btnQtd.addActionListener(e -> new qtdLivro().setVisible(true));


        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> dispose());


        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnListar);
        painelBotoes.add(btnPesquisar);
        painelBotoes.add(btnRemover);
        painelBotoes.add(btnQtd);
        painelBotoes.add(btnVoltar);


        add(lblTitulo, BorderLayout.NORTH);
        add(painelBotoes, BorderLayout.CENTER);

        setVisible(true);
    }
}