public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        float salario = 2500.50f; // o 'f' é necessário para indicar que é um float
        double valorPi = 3.14159; // o double é o tipo padrão para números decimais

        //caso queira armazenar números de CPF por exemplo, é melhor usar String, pois o CPF pode começar com zero, e Java não permite que números inteiros comecem com zero, além disso, o CPF não é usado para cálculos matemáticos, então não faz sentido armazená-lo como um número.
        String cpf = "01234567890";

        //constantes são valores fixos
        final double TAXA_JUROS = 0.05; // o 'final' indica que essa variável é uma constante e não pode ser alterada

        //TAXA_JUROS = 0.10; // isso causaria um erro de compilação, pois estamos tentando alterar o valor de uma constante

        String nome = "João";
        nome = "Maria"; // isso é permitido, pois 'nome' é uma variável e pode ser alterada
    }
}
