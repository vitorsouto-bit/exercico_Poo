import java.util.Objects;

public class Livro {

    private String titulo;
    private String isbn;

    public Livro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Livro))
            return false;

        Livro outro = (Livro) obj;

        return this.isbn.equals(outro.isbn);
    }

        @Override
        public int hashCode() {
            return Objects.hash(isbn);



          /* exercico 5

           l1 == l2 retorna false porque os dois objetos foram
    criados com new, portanto ocupam posições diferentes
    na memória.

            l1.equals(l2) também retorna false porque a classe
    Livro não sobrescreveu o método equals().

    Quando não fazemos override de equals(), o Java usa
    o método herdado da classe Object.

    O equals() da classe Object compara referências de
    memória, exatamente como o operador ==.

    Assim, mesmo que os livros possuam o mesmo título e
    o mesmo ISBN, eles são considerados objetos diferentes.
        */

/* exercico 6
 Dois livros com o mesmo ISBN são considerados iguais,
 mesmo que tenham títulos diferentes.

 O método não lança exceção ao comparar com null
 porque a verificação instanceof retorna false.
  Também não lança exceção ao comparar com uma String,
 pois String não é uma instância de Livro.

  O ISBN é um identificador único para cada livro.
 Títulos podem ser iguais para livros diferentes ou
 podem variar entre edições e idiomas.  */

 /* exercico 7
         Resultado esperado:

         Os hashCodes de l1 e l2 serão iguais,
         pois possuem o mesmo ISBN.

         Já o hashCode de l3 será diferente,
         pois o ISBN é diferente.
        */


    }

        }
