public class TesteStringPool {

    public static void main(String[] args) {

        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        /* exercico 3
         Explicação:

         a == b retorna true porque as duas variáveis apontam
         para o mesmo objeto armazenado no String Pool.

         a == c retorna false porque "new String("Java")"
         cria um novo objeto na memória, diferente daquele
         armazenado no String Pool.

         a.equals(c) retorna true porque o método equals()
         compara o conteúdo das Strings, e ambas possuem
         o texto "Java".

         O que é o String Pool?

         O String Pool é uma área especial da memória onde
         o Java armazena Strings literais para reutilização.
         Quando duas Strings possuem o mesmo valor literal,
         elas compartilham o mesmo objeto, economizando memória.


        */
    }
}