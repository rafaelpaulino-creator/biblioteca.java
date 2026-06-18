import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class listarLivro extends JFrame {
    public listarLivro(){

        setTitle("LISTA DE LIVROS");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] colunas = {"CODIGO", "TITULO", "AUTOR", "ANO"};

        DefaultTableModel model = new DefaultTableModel(colunas, 0);

        for (Livro a : cadastrarLivro.listaDeLivros) {
            model.addRow(new Object[]{a.getCodigo(), a.getTitulo(), a.getAutor(), a.getAno()});
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



