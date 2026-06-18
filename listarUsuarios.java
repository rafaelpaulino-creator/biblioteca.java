import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class listarUsuarios extends JFrame {
    public listarUsuarios(){
        setTitle("LISTA DE USUARIOS");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] colunas = {"CODIGO","NOME", "TELEFONE", "EMAIL"};

        DefaultTableModel model = new DefaultTableModel(colunas, 0);

        for (Usuario a : cadastrarUsuario.listaUsuario) {
            model.addRow(new Object[]{a.getCodigo(), a.getNome(), a.getTelefone(), a.getEmail()});
        }



        JTable tabela = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tabela);
        add(scrollPane, BorderLayout.CENTER);

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> dispose());
        add(btnVoltar, BorderLayout.SOUTH);

        setVisible(true);
    }


}



