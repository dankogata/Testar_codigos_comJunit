package com.teste;
import org.junit.*;
import org.junit.rules.TemporaryFolder;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuleTest {
    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    @Test
    public void shouldCreateNewFileInTemporaryFolder() throws IOException{
        File created = tmpFolder.newFile("file.txt");
        //confere se o arquivo foi criado
        assertTrue(created.isFile());
        //confere se local do arquivo é o mesmo da pasta temporária
        assertEquals(tmpFolder.getRoot(), created.getParentFile());
    }
}
