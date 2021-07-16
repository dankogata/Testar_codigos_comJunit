package com.teste;
import org.junit.Test;
import static org.junit.Assert.*;

public class AssertTest {
    @Test
    //verificar se os arrays são iguais
    public void testArrayEquals(){
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        //Básico de assert
        assertArrayEquals(esperado,atual);
    }

    @Test
    //verificar se as str são iguais
    public void testAssertEquals(){
        assertEquals("text","text");
    }

    @Test
    //verificar se é falso
    public void testAssertFalse(){
        assertFalse(false);
    }

    @Test
    //verificar se não está vazio
    public void testAssertNotNull(){
        assertNotNull(new Object());
    }

    @Test
    //verificar se !=
    public void testAssertNotSame(){
        assertNotSame(new Object(), new Object());
    }

    @Test
    //verificar se é nulo
    public void testAssertNull(){
        assertNull(null);
    }

    @Test
    //verificar se são iguais
    public void testAssertSame(){
        Integer aNumber = Integer.valueOf(768);
        assertSame(aNumber, aNumber);
    }

}
