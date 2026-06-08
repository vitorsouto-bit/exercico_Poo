import java.util.HashSet;

public class BibliotecaTeste {

    public static void main(String[] args) {

        HashSet<Livro> biblioteca = new HashSet<>();

        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");

        biblioteca.add(l1);
        biblioteca.add(l2);

        System.out.println("Tamanho do Set: " + biblioteca.size());

        /*
         Rodada A (equals + hashCode implementados):

         Saída:
         Tamanho do Set: 1

         Como os dois livros possuem o mesmo ISBN,
         equals() retorna true e hashCode() retorna
         o mesmo valor.

         O HashSet identifica que o segundo objeto
         já existe e não o adiciona novamente.
        */
    }
}