package com.github.ki3lmigu3l.lambdas;


import com.github.ki3lmigu3l.lambdas.service.Calculo;
import com.github.ki3lmigu3l.lambdas.service.impl.Multiplicacao;
import com.github.ki3lmigu3l.lambdas.service.impl.Soma;

public class Calculadora {

    private static Calculo calculoService;

    public Calculadora (Calculo calculoService) {
        this.calculoService = calculoService;
    }

    public static void main(String[] args) {
        calculoService = new Soma();
        System.out.println(calculoService.executar(2, 3));

        calculoService = new Multiplicacao();
        System.out.println(calculoService.executar(2, 3));

        System.out.println("\nLambdas: ");
        /*
        * Utilizando os {} precisasse utilizar o return.
        * */
        Calculo calculo = (x, y) -> {return x + y; };
        System.out.println(calculo.executar(2, 3));

        // Sem o {} não é necessario adicionar um return.
        calculo = (x, y) -> x * y;
        System.out.println(calculo.executar(2, 3));
    }
}
