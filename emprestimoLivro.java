import javax.swing.*;
import java.awt.*;


public class emprestimoLivro extends JFrame {
    public static java.util.List<emprestimo> listaEmprestimos = new java.util.ArrayList<>();

    public emprestimoLivro() {
        setTitle("Empréstimo de Livro");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());


        JLabel lblUsuario = new JLabel("Usuário:");

        JComboBox<Usuario> cbUsuarios = new JComboBox<>(cadastrarUsuario.listaUsuario.toArray(new Usuario[0]));

        JLabel lblLivro = new JLabel("Livro:");

        JComboBox<Livro> cbLivros = new JComboBox<>(cadastrarLivro.listaDeLivros.toArray(new Livro[0]));

        JButton btnEmprestar = new JButton("Emprestar");
        btnEmprestar.addActionListener(e -> {

            Usuario usuarioSelecionado = (Usuario) cbUsuarios.getSelectedItem();
            Livro livroSelecionado = (Livro) cbLivros.getSelectedItem();


            if (usuarioSelecionado != null && livroSelecionado != null) {
                emprestimo novoEmprestimo = new emprestimo(livroSelecionado, usuarioSelecionado);
                listaEmprestimos.add(novoEmprestimo);

                JOptionPane.showMessageDialog(null,
                        "Empréstimo realizado com sucesso!\n" +
                                "Usuário: " + usuarioSelecionado.getNome() + "\n" +
                                "Livro: " + livroSelecionado.getTitulo()
                );
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um usuário e um livro antes de emprestar!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> dispose());


        add(lblUsuario);
        add(cbUsuarios);
        add(lblLivro);
        add(cbLivros);

        add(btnEmprestar);
        add(btnVoltar);

        setVisible(true);
    }
}