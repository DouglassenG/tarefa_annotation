package annotations;

// Reflection é um recurso do Java que permite inspecionar classes,
// métodos e atributos em tempo de execução — sem precisar saber o nome
// deles na hora de escrever o código. É como "olhar para dentro" de uma classe.
public class Main {

    public static void main(String[] args) {

        // Criamos um array com as classes que queremos inspecionar.
        // "Usuario.class" e "Produto.class" são representações das classes em tempo de execução.
        Class<?>[] classes = { Usuario.class, Produto.class };

        for (Class<?> classe : classes) {

            // isAnnotationPresent verifica se a classe possui a annotation @Tabela.
            // Isso é Reflection: estamos perguntando à própria classe o que ela tem.
            if (classe.isAnnotationPresent(Tabela.class)) {

                // getAnnotation retorna o objeto da annotation, com seus atributos.
                // Assim conseguimos ler o valor de nome() que foi definido em cada classe.
                Tabela tabela = classe.getAnnotation(Tabela.class);

                System.out.println("A classe " + classe.getSimpleName()
                        + " representa a tabela: " + tabela.nome());
            }
        }
    }
}
