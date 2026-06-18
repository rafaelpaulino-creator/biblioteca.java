import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }


        JFrame janelaPrincipal = new JFrame("Sistema de Biblioteca");
        janelaPrincipal.setSize(350, 400);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setLocationRelativeTo(null);
        janelaPrincipal.setLayout(new BorderLayout());


        JLabel lblTitulo = new JLabel("Sistema de Biblioteca", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 22));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(30, 0, 30, 0));



        JPanel painelBotoes = new JPanel(new GridLayout(4, 1, 10, 15));

        painelBotoes.setBorder(BorderFactory.createEmptyBorder(0, 40, 40, 40));


        JButton btnBiblioteca = new JButton("Biblioteca");

        btnBiblioteca.addActionListener(e -> new menuBiblioteca().setVisible(true));


        JButton btnUsuario = new JButton("Usuários");
        btnUsuario.addActionListener(e -> new menuUsuario().setVisible(true));


        JButton btnEmprestimo = new JButton("Empréstimos");
        btnEmprestimo.addActionListener(e -> new menuEmprestimo().setVisible(true));


        JButton btnSair = new JButton("Sair do Sistema");
        btnSair.addActionListener(e -> System.exit(0));


        painelBotoes.add(btnBiblioteca);
        painelBotoes.add(btnUsuario);
        painelBotoes.add(btnEmprestimo);
        painelBotoes.add(btnSair);


        janelaPrincipal.add(lblTitulo, BorderLayout.NORTH);
        janelaPrincipal.add(painelBotoes, BorderLayout.CENTER);


        janelaPrincipal.setVisible(true);
    }
}