## Aprendendo Java

Nesse repositório eu vou começar a desenvolver meu primeiro projéto em Java e aprender um pouco mais sobre POO

## Aprendizados

- Variaveis com <code>final</code> não pode ser alterada

~~~java
public class MinhaClasse {
	public static void main(String[] args) {
		// final declarando uma variável constante (que não pode ser alterada)
        final int numero = 10;
        System.out.println("O número é: " + numero);
        // numero = 20; // Isso causará um erro de compilação, pois 'numero' é final
	}
}
~~~