package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecodingTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getInput_String() {
        Decoding testDecoding= new Decoding("Kaburu",1);
        assertEquals("Kaburu",testDecoding.getInput());
    }

    @Test
    public void getKey_int() {
        Decoding testDecoding= new Decoding("Kaburu",1);
        assertEquals(1,testDecoding.getKey());
    }
}