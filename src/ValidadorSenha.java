public class ValidadorSenha {

    public static void main(String[] args) {

        String senhaCorreta = new String("1234");
        String tentativa = "1234";

        if (tentativa == senhaCorreta) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado");
        }

        /* exercico 4
         Acesso negad0

         O operador == compara se as duas variáveis apontam
         para o mesmo objeto na memória.

         A variável tentativa aponta para uma String do
         String Pool.

         Já senhaCorreta foi criada com new String(),
         gerando um novo objeto na memória.

         Embora o conteúdo seja igual ("1234"),
         os objetos são diferentes.
        */
    }
}