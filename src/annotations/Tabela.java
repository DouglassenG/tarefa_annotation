package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @interface é a forma de criar uma annotation personalizada em Java.
// Funciona como um "rótulo" que você pode colar em classes, métodos, etc.

// @Target define ONDE essa annotation pode ser usada.
// ElementType.TYPE significa que ela só pode ser usada em classes (ou interfaces/enums).
@Target(ElementType.TYPE)

// @Retention define ATÉ QUANDO a annotation fica disponível.
// RetentionPolicy.RUNTIME significa que ela estará disponível enquanto o programa estiver rodando.
// Isso é necessário para lermos a annotation via Reflection.
@Retention(RetentionPolicy.RUNTIME)

public @interface Tabela {

    // Atributo da annotation: o nome da tabela no banco de dados.
    // Quem usar @Tabela precisa informar um valor para "nome".
    String nome();
}
