import javax.swing.*;
import java.awt.*;


public class devolverLivro extends JFrame {

    public devolverLivro() {
        setTitle("Devolução de Livro");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());


        JLabel lblUsuario = new JLabel("Usuário:");

        JComboBox<Usuario> cbUsuarios = new JComboBox<>(cadastrarUsuario.listaUsuario.toArray(new Usuario[0]));

        JLabel lblLivro = new JLabel("Livro:");

        JComboBox<Livro> cbLivros = new JComboBox<>(cadastrarLivro.listaDeLivros.toArray(new Livro[0]));

        JButton btnDevolver = new JButton("Devolver");
        btnDevolver.addActionListener(e -> {

            Usuario usuarioSelecionado = (Usuario) cbUsuarios.getSelectedItem();
            Livro livroSelecionado = (Livro) cbLivros.getSelectedItem();


            if (usuarioSelecionado != null && livroSelecionado != null) {
                JOptionPane.showMessageDialog(null,
                        "Devolução realizada com sucesso!\n" +
                                "Usuário: " + usuarioSelecionado.getNome() + "\n" +
                                "Livro: " + livroSelecionado.getTitulo()
                );
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um usuário e um livro para devolver!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> dispose());

        // --- ADICIONANDO NA TELA ---
        add(lblUsuario);
        add(cbUsuarios);
        add(lblLivro);
        add(cbLivros);

        add(btnDevolver);
        add(btnVoltar);

        setVisible(true);
    }
}