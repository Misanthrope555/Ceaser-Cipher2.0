package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.xml.stream.events.EndDocument;

import static org.junit.Assert.*;

public class EncodingTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getInput_String() {
        Encoding testEncoding= new Encoding("Edwin",2);
        assertEquals("Edwin",testEncoding.getInput());
    }

    @Test
    public void getKey_int() {
        Encoding testEncording= new Encoding("Edwin", 2);
        assertEquals(2,testEncording.getKey());
    }
    @Test
    public void encrypt_String(){
        Encoding testEncording= new Encoding("ab", 1);
        testEncording.getInput();
        testEncording.getKey();
        assertEquals("bc",testEncording.encode());

    }
}