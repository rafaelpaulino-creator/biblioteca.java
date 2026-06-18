import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class removerLivro extends JFrame {
    public  removerLivro(){
        setTitle("Remover Livro");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel lblCodigo = new JLabel("Digite o codigo do Livro:");
        JTextField txtBusca = new JTextField(10);
        JButton btnRemover = new JButton("Remover");
        JButton btnVoltar = new JButton("Voltar");


        btnRemover.addActionListener(e -> {
            try {
                int codigoBuscado = Integer.parseInt(txtBusca.getText());
                Livro livroRemover = null;


                for (Livro a : cadastrarLivro.listaDeLivros) {
                    if (a.getCodigo() == codigoBuscado) {
                        livroRemover = a;
                        break;
                    }
                }


                if (livroRemover != null) {


                    int resposta = JOptionPane.showConfirmDialog(this,
                            "Tem certeza que deseja remover o livro: " + livroRemover.getTitulo() + "?",
                            "Confirmar Remoção",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.WARNING_MESSAGE);


                    if (resposta == JOptionPane.YES_OPTION) {


                        cadastrarLivro.listaDeLivros.remove(livroRemover);

                        cadastrarLivro.qtdLivro--;

                        JOptionPane.showMessageDialog(this, "Livro removido com sucesso!");
                        txtBusca.setText("");
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Livro não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Digite um número de codigo válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });


        btnVoltar.addActionListener(e -> dispose());


        JPanel painelBusca = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painelBusca.add(lblCodigo);
        painelBusca.add(txtBusca);

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painelBotoes.add(btnRemover);
        painelBotoes.add(btnVoltar);


        add(painelBusca);
        add(painelBotoes);

        setVisible(true);
    }
}
