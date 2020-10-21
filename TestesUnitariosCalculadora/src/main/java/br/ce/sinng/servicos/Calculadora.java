package br.ce.sinng.servicos;

import br.ce.sinng.exceptions.NaoPodeDividirPorZeroException;

public class Calculadora {


    public int soma(int a, int b) {
        return a +b;
    }

    public int subtrai(int a, int b) {
        return a - b;
    }

    public int multiplica(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) throws NaoPodeDividirPorZeroException {
        if (b == 0) {
           throw new NaoPodeDividirPorZeroException();
        }
        return a/b;
    }
}
