import javax.swing.*;
import java.awt.*;

public class menuEmprestimo extends JFrame {

    public menuEmprestimo() {

        setTitle("Menu de Empréstimos");
        setSize(320, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);


        setLayout(new BorderLayout());


        JLabel lblTitulo = new JLabel("Menu de Empréstimos", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 20)); // Fonte moderna
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0)); // Respiro em cima e embaixo


        JPanel painelBotoes = new JPanel(new GridLayout(4, 1, 10, 15));

        painelBotoes.setBorder(BorderFactory.createEmptyBorder(0, 40, 30, 40));


        JButton btnEmprestar = new JButton("Empréstimo de Livros");
        btnEmprestar.addActionListener(e -> new emprestimoLivro().setVisible(true));


        JButton btnDevolver = new JButton("Devolução de Livro");
        btnDevolver.addActionListener(e -> new devolverLivro().setVisible(true));


        JButton btnRelatorio = new JButton("Relatório de Emprestados");
        btnRelatorio.addActionListener(e -> new relatorioEmprestimo().setVisible(true));


        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> dispose());


        painelBotoes.add(btnEmprestar);
        painelBotoes.add(btnDevolver);
        painelBotoes.add(btnRelatorio);
        painelBotoes.add(btnVoltar);


        add(lblTitulo, BorderLayout.NORTH);
        add(painelBotoes, BorderLayout.CENTER);


        setVisible(true);
    }
}