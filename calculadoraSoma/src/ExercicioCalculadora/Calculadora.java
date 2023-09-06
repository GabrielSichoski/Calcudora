package ExercicioCalculadora;

public class Calculadora {

    public static void main(String[] args) {
         //# Neste teste é feito com dois numeros inteiro positivos. Resultado = 11 ocorreu como esperado
        Soma sum = new Soma();
       int soma =  sum.somar(1, 10);
        System.out.println(soma);
        //# Neste teste é feito a soma com dois numeros inteiro um negativo e um positivo. Resultado = 9 ocorreu como esperado
        soma =  sum.somar(-1, 10);
        System.out.println(soma);
        
        //# Teste de Subtração dois numeros inteiros positivos. Resultado = 9 ocorreu como esperado
        Subtracao sub = new Subtracao();
        int subtrai = sub.subtrair(10, 1);
        System.out.println(subtrai);
        
        //# Teste de subtração dois numeros inteiros negativos: Resultado 11 (Menos com menos da mais o -1 vira +1) ocorreu como esperado
        subtrai = sub.subtrair(10, -1);
        System.out.println(subtrai);
        //# Teste de subtração dois numeros negativos: Resultado -9 (menos com menos da mais) ocorreu como esperado
        subtrai = sub.subtrair(-10, -1);
        System.out.println(subtrai);
        
        //#Teste de Divisão, dois numeros inteiros positivos: resultado 5 ocorreu como esperado
        
        Dividir div = new Dividir();
        int divs = div.divisao(10, 2);
        System.out.println(divs);
        
        //#Teste de divisão, Um numero inteiro e positivo e um negativo. Resultado -5 ocorreu como esperado
        
        divs = div.divisao(10,- 2);
        System.out.println(divs);
        //# Teste de divisão, dois numeros inteiros negativos. Resultado 5 ocorreu como esperado
        divs = div.divisao(-10,- 2);
        System.out.println(divs);
        //# Teste de multiplicacao dois numeros positivos. Resultado 20 ocorreu como esperado
        Multiplicar mult = new Multiplicar();
        int multi = mult.multiplicacao(10, 2);
        System.out.println(multi);
        //#Teste de multiplicação numero positivo multiplicado numero negativo. Resultado menos -20 ocorreu como esperado
        multi = mult.multiplicacao(10, -2);
        System.out.println(multi);
        
        //# Teste de multiplicação numeros negativos. Resultado 20 ocorreu como esperado
        multi = mult.multiplicacao(-10, -2);
        System.out.println(multi);
        //#Teste de multiplicação numero positivo com 0. Resultado erro
        multi = mult.multiplicacao(10, 0);
        System.out.println(multi);
        //#Teste de divisão, Um numero inteiro positivo dividido por 0, Resultado Erro
        
        divs = div.divisao(10, 0);
        System.out.println(divs);
        
    }
    
}
