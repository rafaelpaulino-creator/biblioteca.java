import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class pesquisarLivro extends JFrame {
    pesquisarLivro(){
        setTitle("Buscar Livro");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        JLabel lblCodigo = new JLabel("Digite o Codigo do Livro:");
        JTextField txtBusca = new JTextField(10);
        JButton btnBuscar = new JButton("Buscar");

        btnBuscar.addActionListener(e -> {
            try {
                int codigoBusca = Integer.parseInt(txtBusca.getText());
                boolean encontrou = false;


                for (Livro a : cadastrarLivro.listaDeLivros) {
                    if (a.getCodigo() == codigoBusca) {
                        JOptionPane.showMessageDialog(this,
                                "Livro Encontrado!\n" +
                                        "Titulo: " + a.getTitulo() +
                                        "\nAutor: " + a.getAutor() +
                                        "\nAno: " + a.getAno());
                        encontrou = true;
                        break;
                    }
                }

                if (!encontrou) {
                    JOptionPane.showMessageDialog(this, "Livro não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        add(lblCodigo);
        add(txtBusca);
        add(btnBuscar);

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> dispose());
        add(btnVoltar);

        setVisible(true);
    }
}


