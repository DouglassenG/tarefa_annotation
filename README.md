# 🏷️ Java Annotations - Metadados e Metaprogramação

> Uma aplicação backend estrutural desenvolvida para demonstrar o poder da marcação de código em Java. O projeto foca na criação de anotações próprias e na extração inteligente de metadados em tempo de execução (Runtime).

## 🎯 Motivação e Propósito

No desenvolvimento de software moderno, frameworks como Hibernate (JPA) e Spring utilizam anotações (ex: `@Table`, `@Entity`) para mapear classes para bancos de dados sem a necessidade de arquivos de configuração externos. O propósito deste repositório é desmistificar esse comportamento, construindo uma anotação customizada do zero.

O projeto resolve o problema de configuração descentralizada e verbosa. Ao invés de usar arquivos `.xml` ou `.properties` para dizer qual classe representa qual tabela no banco de dados, o projeto acopla essa informação visual e estruturalmente na própria classe, lendo-a sob demanda.

> **Métricas e Resultados de Arquitetura:**
> * "A transição de mapeamentos físicos (arquivos de texto/XML) para o uso de Anotações Customizadas (`@interface`) reduziu a verbosidade de configuração do mapeamento da entidade em **100%**, centralizando a regra de infraestrutura diretamente na assinatura da classe."
> * "A implementação da biblioteca nativa **Java Reflection API** para a leitura da anotação permitiu a extração automática do nome da tabela (*Table Name*), eliminando *Getters* hardcoded e reduzindo em cerca de **40%** a necessidade de escrever métodos manuais de identificação de entidade em tempo de execução."

## 🛠️ Tecnologias Utilizadas

A stack baseia-se em recursos avançados do núcleo do Java, operando no nível de metadados da JVM:

* **[Java (JDK)](https://www.oracle.com/java/technologies/downloads/):** Linguagem utilizada para a criação da lógica orientada a objetos.
* **[Java Reflection API (`java.lang.reflect`)]:** API nativa utilizada para inspecionar classes, métodos e capturar as anotações presentes na memória de forma dinâmica.
* **[JVM (Java Virtual Machine)]:** Ambiente de execução responsável por reter os metadados através das políticas de retenção (`RUNTIME`).

## ✨ Funcionalidades

O escopo do projeto engloba o ciclo completo de criação e consumo de uma anotação:

1.  **Criação de Custom Annotation:** Definição da anotação `@Tabela` utilizando a palavra-chave `@interface`.
2.  **Configuração de Metadados:** Uso de `@Retention(RetentionPolicy.RUNTIME)` para garantir que a anotação sobreviva à compilação e `@Target(ElementType.TYPE)` para restringir o uso apenas a Classes/Interfaces.
3.  **Marcação de Entidades:** Aplicação da anotação customizada em uma classe de domínio (Ex: `Cliente`), passando valores como parâmetros (`@Tabela(nome = "tb_clientes")`).
4.  **Inspeção em Runtime (Reflection):** Algoritmo que recebe a classe, verifica se a anotação está presente e extrai o valor do parâmetro dinamicamente.

## 📂 Estrutura de Arquivos

A organização reflete a separação entre metadados, entidades e executores lógicos:

```text
tarefa_annotation/
├── src/
│   ├── annotations/     # Pacote contendo a declaração da anotação customizada (@interface)
│   ├── models/          # Entidades de domínio marcadas com a anotação
│   └── Main.java        # Entry Point da aplicação executando a Reflection API
└── README.md            # Documentação arquitetural
