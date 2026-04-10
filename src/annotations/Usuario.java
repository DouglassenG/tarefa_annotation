package annotations;

// Usamos a annotation @Tabela que criamos para indicar que
// esta classe representa a tabela "usuarios" no banco de dados.
@Tabela(nome = "usuarios")
public class Usuario {

    private String nome;
    private String email;

    // Construtor: recebe os dados para criar um usuário.
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Getters: métodos para acessar os atributos privados.
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
