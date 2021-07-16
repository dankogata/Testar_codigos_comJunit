package com.teste;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.util.*;
import java.lang.IndexOutOfBoundsException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ExceptionTest {

    //espera que o resultado seja fora do limite
    @Test (expected = IndexOutOfBoundsException.class)
    public void empty(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Daniel");
        lista.get(0);
    }


    //Teste de exceções com Rules
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
        List<Object> list = new ArrayList<>();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Index 0 out of bounds for length 0");
        list.get(0);
    }

    @Test
    public void testExceptionMessage() {
        try {
           new ArrayList<Object>().get(0);
           //msg de falha
           fail("Esperado que IndexOutOfBoundsException seja limpada");
        } catch (IndexOutOfBoundsException ex) {
            assertThat(ex.getMessage(), is("Index 0 out of bounds for length 0"));
        }
    }
}
