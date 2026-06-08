public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3500.00);
        Produto p2 = new Produto("Mouse", 120.00);
        Produto p3 = new Produto("Caneta", 2.50);
        Produto p4= new Produto("Caderno", 12.90);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println("Item: " + p1);

        /* exercico 1
          O que aparece?
         - O nome da classe (Produto)
         - O código hash do objeto em hexadecimal

         É legível?
         Não. A saída não mostra os valores dos atributos
         nome e preco, apenas uma representação padrão do objeto.
         Isso acontece porque a classe Produto não possui
         o método toString() sobrescrito.
        */

   /* exercico 2
        Antes era exibido algo como:
        Produto@5acf9800

        Agora são exibidos os valores dos atributos do objeto,
        tornando a saída muito mais legível.

        O toString() é chamado automaticamente?
         Sim. Tanto no System.out.println(produto) quanto na
         concatenação com String ("Item: " + produto), o Java
         chama automaticamente o método toString() do objeto
 */

    }
}