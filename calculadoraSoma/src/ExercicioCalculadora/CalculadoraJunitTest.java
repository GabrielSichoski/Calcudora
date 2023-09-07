package ExercicioCalculadora;

import org.junit.jupiter.api.Test;
import junit.framework.Assert;
@SuppressWarnings("deprecation")
public class CalculadoraJunitTest {
		@SupressWarning("deprecation")
		@Test
	public void  SomarDoisNumerosPositivos() {
		
		//1. teste de soma, quando é feito o teste 3 mais 7 o resultado de 10 não apresenta problemas, ocorreu como esperado
		//Quando o mesmo teste é feito com o resultado 12 o teste apresenta problemas, ocorreu como esperado, a soma dos numeros não é 12 
		
			Soma calc = new Soma();
			int soma = calc.somar(3,7);
			
			Assert.assertEquals(10,soma);
			//Assert.assertEquals(12,soma);
			
	}
	public void  SomarNumerosNegativosPositivos(){
		
			//2. teste de soma, somar numeros positivos com negativos, Ocorreu como esperado
			// caso o  numero seja o correto não aponta erros, caso o numero indicado seja incorreto apresenta erros
			// Metodo: 3 +-7| resultado = -4 correto | Quando o resultado é dito como 14 ocorrre o erro
		
			Soma calc = new Soma();
			int soma = calc.somar(3,-7);
			
			Assert.assertEquals(-4,soma);
			//Assert.assertEquals(14,soma);
			
	}
		public void  SomarNumerosNegativos(){
		
			//3. teste de soma, somar numeros negativos com negativos, Ocorreu como esperado
			// caso o  numero seja o correto não aponta erros, caso o numero indicado seja incorreto apresenta erros
			// Metodo: -3 +-7| resultado = -4 correto | Quando o resultado é dito como 10 ocorrre o erro.
		
				Soma calc = new Soma();
				int soma = calc.somar(-3,-7);
				
				Assert.assertEquals(-10,soma);
				//Assert.assertEquals(10,soma);
}
			public void SubtrairNumerosPositivos() {
		
			//4. teste de subtração, subtrair numeros Positivos, Ocorreu como esperado
			// caso o  numero seja o correto não aponta erros, caso o numero indicado seja incorreto apresenta erros
			// Metodo: 10 -5| resultado = -5 correto | Quando o resultado é dito como 15 ocorrre o erro.
			
				Subtracao calc = new Subtracao();
				int sub = calc.subtrair(10, 5);
				
				Assert.assertEquals(5,sub);
				//Assert.assertEquals(15,sub);
}
	public void SubtrairNumerosPositivosComNegativos() {
		
			//5. teste de subtração, subtrair numeros Positivos com negativos, Ocorreu como esperado
			// caso o  numero seja o correto não aponta erros, caso o numero indicado seja incorreto apresenta erros
			// Metodo: 10 -(-5)| resultado = 15 correto | Quando o resultado é dito como 5 ocorrre o erro.
		
			Subtracao calc = new Subtracao();
			int sub = calc.subtrair(10, -5);
			
			Assert.assertEquals(15,sub);
			//Assert.assertEquals(5,sub);
		
}
		public void SubtrairNumerosNegativosComNegativos() {
		
		//6. teste de subtração, subtrair numeros Negativos, Ocorreu como esperado
				// caso o  numero seja o correto não aponta erros, caso o numero indicado seja incorreto apresenta erros
				// Metodo: -10 -5| resultado = -5 correto | Quando o resultado é dito como 15 ocorrre o erro.
		
			Subtracao calc = new Subtracao();
			int sub = calc.subtrair(-10, -5);
			
			Assert.assertEquals(-5,sub);
			//Assert.assertEquals(15,sub);
}
		
		public void DivisãoNumerosPositivos() {
			
			//7. teste de divisão, dividir numeros positivos, ocorreu como esperado
			//Metodo: 10/2. Resultado 5| Caso o usuario diga o valor é por exemplo 10 indica erro
			
			Dividir calc = new Dividir();
			//int div = calc.divisao(10, 2);
			
			Assert.assertEquals(5,div);
			//Assert.assertEquals(10,div);
		}
		public void DivisãoNumerosPositivosComNegativos() {
			
			//8. teste de divisão, dividir numeros positivos com negativos, ocorreu como esperado
			//Metodo: 10/(-2). Resultado -5| Caso o usuario diga o valor é por exemplo 10 indica erro
			
		Dividir calc = new Dividir();
		int div = calc.divisao(10, -2);
		
		Assert.assertEquals(-5,div);
		//Assert.assertEquals(10,div);
}
		public void DivisãoNumerosNegativoComNegativo() {
			
			//9. teste de divisão, dividir numeros positivos, ocorreu como esperado
			//Metodo: -10/(-2). Resultado 5| Caso o usuario diga o valor é por exemplo 10 indica erro
			
			Dividir calc = new Dividir();
			int div = calc.divisao(-10, -2);
			
			Assert.assertEquals(5,div);
			//Assert.assertEquals(10,div);
	}
		public void MultiplicarNumerosPositivos() {
			
			//10. Teste de Multiplicação, Multiplicar numeros positivos, ocorreu como esperado
			//Metodo: 10*2. Resultado 20| Caso o usuario diga um valor errado por exemplo 2 indica erro
			
			Multiplicar calc = new Multiplicar();
			int multi = calc.multiplicacao(10,2);
			
			Assert.assertEquals(20,multi);
			//Assert.assertEquals(2,multi);
		}
		public void MultiplicarNumerosPositivosComNegativos() {
			
			//11. Teste de Multiplicação, Multiplicar numeros positivos com Negativos, ocorreu como esperado
			//Metodo: 10*2. Resultado -20| Caso o usuario diga um valor errado por exemplo 2 indica erro
			
			Multiplicar calc = new Multiplicar();
			int multi = calc.multiplicacao(10,-2);
			
			Assert.assertEquals(-20,multi);
			//Assert.assertEquals(2,multi);
}
		public void MultiplicarNumerosNegativoComNegativos() {
			
			//10. Teste de Multiplicação, Multiplicar numeros Negativos, ocorreu como esperado
			//Metodo: 10*2. Resultado 20| Caso o usuario diga um valor errado por exemplo 2 indica erro
			
			Multiplicar calc = new Multiplicar();
			int multi = calc.multiplicacao(-10,-2);
			
			Assert.assertEquals(20,multi);
			//Assert.assertEquals(2,multi);
}
}