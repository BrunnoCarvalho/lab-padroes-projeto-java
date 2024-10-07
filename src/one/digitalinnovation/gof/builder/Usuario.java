package one.digitalinnovation.gof.builder;

/**
 * Padrão de projeto que facilita a construção de objetos complexos
 */

public final class Usuario {

    private final String nome;
    private final String email;
    private final String cep;
    private final int idade;
    private final String telefone;
    private final String nomeUsuario;

    private Usuario(Builder builder){
        this.nome = builder.nome;
        this.email = builder.email;
        this.cep = builder.cep;
        this.idade = builder.idade;
        this.telefone = builder.telefone;
        this.nomeUsuario = builder.nomeUsuario;
    }

    public static class Builder{
        private final String nome;
        private final String cep;
        private String email;
        private int idade;
        private String telefone;
        private String nomeUsuario;

        public Builder(String nome, String cep) {
            this.nome = nome;
            this.cep = cep;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setIdade(int idade) {
            this.idade = idade;
            return this;
        }

        public Builder setTelefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Builder setNomeUsuario(String nomeUsuario) {
            this.nomeUsuario = nomeUsuario;
            return this;
        }
        
        public Usuario build(){
            return new Usuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", email=" + email + ", cep=" + cep + ", idade=" + idade + ", telefone="
                + telefone + ", nomeUsuario=" + nomeUsuario + "]";
    }
    
}
