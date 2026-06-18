import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class cadastrarLivro extends JFrame {
    public static int qtdLivro = 0;
    public static List<Livro> listaDeLivros = new ArrayList<>();

    public cadastrarLivro() {
        setTitle("Cadastro de Livro");
        setLayout(new BorderLayout());
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // --- PAINEL DO FORMULÁRIO ---
        JPanel painelForm = new JPanel(new GridLayout(3, 2, 10, 10));
        painelForm.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblTitulo = new JLabel("Titulo: ");
        JTextField txtTitulo = new JTextField(20);

        JLabel lblAutor = new JLabel("Autor: ");
        JTextField txtAutor = new JTextField(20);

        JLabel lblAno = new JLabel("Ano: ");
        JTextField txtAno = new JTextField(20);


        painelForm.add(lblTitulo);
        painelForm.add(txtTitulo);
        painelForm.add(lblAutor);
        painelForm.add(txtAutor);
        painelForm.add(lblAno);
        painelForm.add(txtAno);


        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(e -> {
            String titulo = txtTitulo.getText();
            String autor = txtAutor.getText();
            String ano = txtAno.getText();

            qtdLivro++;
            int codigo = qtdLivro;

            Livro novoLivro = new Livro(codigo, titulo, autor, ano);
            listaDeLivros.add(novoLivro);

            JOptionPane.showMessageDialog(null, "Codigo: " + codigo +
                    "\nLivro Cadastrado: " + titulo +
                    "\nAutor: " + autor +
                    "\nAno: " + ano
            );

            txtTitulo.setText("");
            txtAutor.setText("");
            txtAno.setText("");
            txtTitulo.requestFocus();
        });

        JButton btnVoltar3 = new JButton("Voltar");
        btnVoltar3.addActionListener(e3 -> dispose());


        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnVoltar3);


        add(painelForm, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);

        setVisible(true);
    }
}