public class Produto {

    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
     /*
         Saída:

         Produto@5acf9800
         Produto@4617c264

         O que aparece?
         - O nome da classe (Produto)
         - O código hash do objeto em hexadecimal

         É legível?
         Não. A saída não mostra os valores dos atributos
         nome e preco, apenas uma representação padrão do objeto.
         Isso acontece porque a classe Produto não possui
         o método toString() sobrescrito.
        */
}