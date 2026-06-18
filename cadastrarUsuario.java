import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class cadastrarUsuario extends JFrame {
    public static int qtdUsuario = 0;
    public static List<Usuario> listaUsuario = new ArrayList<>();

    public cadastrarUsuario() {
        setTitle("Cadastro de Usuario");
        setLayout(new FlowLayout());
        setSize(260, 380);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel lblNome = new JLabel("Nome: ");
        JTextField txtNome = new JTextField(20);

        JLabel lblTelefone = new JLabel("Telefone: ");
        JTextField txtTelefone = new JTextField(20);

        JLabel lblEmail = new JLabel("Email: ");
        JTextField txtEmail = new JTextField(20);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(e -> {
            String nome = txtNome.getText();
            String telefone = txtTelefone.getText();
            String email = txtEmail.getText();

            qtdUsuario++;
            int codigo = qtdUsuario;


            Usuario novoUsuario = new Usuario(codigo, nome, telefone, email);
            listaUsuario.add(novoUsuario);

            JOptionPane.showMessageDialog(null, "Codigo: " + codigo +
                    "\nUsuario Cadastrado: " + nome +
                    "\nTelefone: " + telefone +
                    "\nEmail: " + email
            );
        });

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e3 -> dispose());

        add(lblNome);
        add(txtNome);
        add(lblTelefone);
        add(txtTelefone);
        add(lblEmail);
        add(txtEmail);

        add(btnSalvar);
        add(btnVoltar);
        setVisible(true);
    }
}