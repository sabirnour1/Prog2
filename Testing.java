import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// 8. Part F, testing methods.
public class Testing {

    @Test
    public void testCountDigits_normalCase(){
        assertEquals(4, Lab.countDigits("Vanier2026"));
    }
    @Test
    public void testCountDigits_boundary(){
        assertEquals(0,Lab.countDigits("Vanier"));

    }
    @Test
    public void testCountDigits_zerofalse(){
        assertEquals(0, Lab.countDigits("hello"));

    }
    @Test
    public void ValidPassword_normalCase(){
        assertTrue(Lab.isValidPassword("Vanier2026"));
    }
    @Test
    public void validPassword_boundary(){
        assertFalse(Lab.isValidPassword("vanier2026"));
    }
    @Test
    public void validPassword_zerofalse(){
        assertFalse(Lab.isValidPassword("vanier"));
    }
    @Test
    public void testCountUppercase_normalCase(){
        assertEquals(3, Lab.countUppercase("HEY"));
    }
    @Test
    public void testCountUppercase_boundary(){
        assertEquals(1, Lab.countUppercase("Hello"));
    }
    @Test
    public void testCountUppercase_zerofalse(){
        assertEquals(0, Lab.countUppercase("hello"));
    }
    @Test
    public void testGenerateCode_normalCase(){
        String code = Lab.generateCode();
        assertEquals(4, code.length());
    }
    @Test
    public void testGenerateCode_zerofalse(){
        String code = Lab.generateCode();
        assertFalse(code.length() < 4);

    }
}
