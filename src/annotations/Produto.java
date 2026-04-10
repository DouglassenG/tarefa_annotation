package annotations;

// Usamos a annotation @Tabela para indicar que
// esta classe representa a tabela "produtos" no banco de dados.
@Tabela(nome = "produtos")
public class Produto {

    private String descricao;
    private double preco;

    // Construtor: recebe os dados para criar um produto.
    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    // Getters: métodos para acessar os atributos privados.
    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}
