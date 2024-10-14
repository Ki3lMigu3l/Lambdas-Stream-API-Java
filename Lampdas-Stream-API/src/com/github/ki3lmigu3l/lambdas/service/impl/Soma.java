package com.github.ki3lmigu3l.lambdas.service.impl;

import com.github.ki3lmigu3l.lambdas.service.Calculo;

public class Soma implements Calculo {
    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}
