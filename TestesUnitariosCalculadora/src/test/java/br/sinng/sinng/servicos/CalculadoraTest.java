package br.sinng.sinng.servicos;

import br.ce.sinng.exceptions.NaoPodeDividirPorZeroException;
import br.ce.sinng.servicos.Calculadora;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void deveSomarDoisValores() {

        //cenario
        int a = 5;
        int b = 3;
        //acao
        int resultado = calculadora.soma(a, b);
        //verificacao
        Assert.assertEquals(8, resultado);
    }

    @Test
    public void deveSubtrairDoisValores() {
        //cenario
        int a = 5;
        int b = 3;
        //acao
        int resultado = calculadora.subtrai(a, b);
        //verificacao
        Assert.assertEquals(2, resultado);
    }

    @Test
    public void deveMultiplicarDoisValores() {
        //cenario
        int a = 10;
        int b = 2;
        //acao
        int resultado = calculadora.multiplica(a, b);
        //verificacao
        Assert.assertEquals(20, resultado);

    }

    @Test
    public void deveDividirDoisValores() throws NaoPodeDividirPorZeroException {
        //cenario
        int a = 10;
        int b = 2;
        //açao
        int resultado = calculadora.divide(a, b);
        //verificacao
        Assert.assertEquals(5, resultado);
    }

    @Test(expected = NaoPodeDividirPorZeroException.class)
    public void deveLancarExceptionDividirPorZero() throws NaoPodeDividirPorZeroException {
        int a = 10;
        int b = 0;
        int resultado = calculadora.divide(a, b);

    }
}
