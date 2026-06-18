import javax.swing.*;
import java.awt.*;

public class removerUsuario extends JFrame {
    public removerUsuario(){
        setTitle("Remover Usuario");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel lblCodigo = new JLabel("Digite o codigo do Usuario:");
        JTextField txtBusca = new JTextField(10);
        JButton btnRemover = new JButton("Remover");
        JButton btnVoltar = new JButton("Voltar");


        btnRemover.addActionListener(e -> {
            try {
                int codigoBuscado = Integer.parseInt(txtBusca.getText());
                Usuario usuarioRemover = null;


                for (Usuario a : cadastrarUsuario.listaUsuario) {
                    if (a.getCodigo() == codigoBuscado) {
                        usuarioRemover = a;
                        break;
                    }
                }


                if (usuarioRemover != null) {


                    int resposta = JOptionPane.showConfirmDialog(this,
                            "Tem certeza que deseja remover o Usuario: " + usuarioRemover.getNome() + "?",
                            "Confirmar Remoção",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.WARNING_MESSAGE);


                    if (resposta == JOptionPane.YES_OPTION) {


                        cadastrarUsuario.listaUsuario.remove(usuarioRemover);
                        cadastrarUsuario.qtdUsuario--;

                        JOptionPane.showMessageDialog(this, "Usuario removido com sucesso!");
                        txtBusca.setText("");
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Usuario não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
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
