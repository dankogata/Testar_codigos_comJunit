package com.teste;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTeste {
    @Test
    public void testSomar(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar("1+1+3");
        //verificar se bate o resultado (Validação)
        assertEquals(5,soma);
    }
}
