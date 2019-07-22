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
    public void Decoding_InstantiatesCorrectly_True(){
        Decoding testDecoding= new Decoding("Kaburu",1);
        assertTrue(testDecoding instanceof  Decoding);

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
    @Test
    public void encode_String(){
        Decoding testDecode = new Decoding("bc",1);
        testDecode.getInput();
        testDecode.getKey();

        assertEquals("ab",testDecode.decode());
    }

    @Test
    public void Encoding_LetterShiftsToTheLeft_String(){
        Decoding testDecoding= new Decoding("bc",1);
        testDecoding.getInput();
        testDecoding.getKey();
        assertEquals("ab",testDecoding.decode());
    }
}