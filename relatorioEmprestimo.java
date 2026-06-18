import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class relatorioEmprestimo extends JFrame {

    public relatorioEmprestimo() {
        setTitle("Relatório de Livros Emprestados");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Colunas mesclando dados do Livro e do Usuário
        String[] colunas = {"LIVRO", "AUTOR", "USUÁRIO", "TELEFONE"};

        DefaultTableModel model = new DefaultTableModel(colunas, 0);

        // Puxa a lista lá da classe EmprestimoLivro
        for (emprestimo emp : emprestimoLivro.listaEmprestimos) {
            model.addRow(new Object[]{
                    emp.getLivro().getTitulo(),
                    emp.getLivro().getAutor(),
                    emp.getUsuario().getNome(),
                    emp.getUsuario().getTelefone()
            });
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