public class Usuario {

        private int codigo;
        private String Nome;
        private String Telefone;
        private String email;

        public Usuario(int codigo, String Nome, String Telefone, String email) {
            this.codigo = codigo;
            this.Nome = Nome;
            this.Telefone = Telefone;
            this.email = email;
        }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo1) {
        this.codigo = codigo1;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
        public String toString() {
            return codigo + " - " + Nome +
                    " | " + Telefone +
                    " | " + email;
        }
    }


