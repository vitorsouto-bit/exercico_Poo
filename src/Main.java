public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3500.00);
        Produto p2 = new Produto("Mouse", 120.00);

        Produto p3 = new Produto("Caneta", 2.50);
        Produto p4= new Produto("Caderno", 12.90);

        Livro l1 = new Livro("hora de aventura", "978-0132350884");
        Livro l2 = new Livro("enrolados ", "978-0132350884");

        Livro l3 = new Livro("mar", "978-0132350884");
        Livro l4 = new Livro("furacão", "978-0132350884");

        Livro l5 = new Livro("oceano", "978-0132350884");
        Livro l6 = new Livro("rio verde", "978-0132350884");
        Livro l7 = new Livro("sapato", "978-0134685991");


        System.out.println("======================");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Item: " + p1);
        System.out.println("======================");

        System.out.println(p3);
        System.out.println(p4);
        System.out.println("======================");

        System.out.println(l1 == l4);
        System.out.println(l1.equals(l4));
        System.out.println("======================");

        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(null));
        System.out.println(l1.equals("Java"));
        System.out.println("======================");

        System.out.println("Hash l1: " + l1.hashCode());
        System.out.println("Hash l2: " + l2.hashCode());
        System.out.println("l1.equals(l2): " + l1.equals(l2));
        System.out.println();
        System.out.println("Hash l3: " + l3.hashCode());





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