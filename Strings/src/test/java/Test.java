import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Testing {

    @BeforeEach
    void setUp(){
    }
    @Test
    @DisplayName("Number of Characters")
    void testNumberOfCharacters(){
        Lexical lexical =  new Lexical();
        Assertions.assertEquals(5,lexical.numOfChar("hello"));
    }
    @Test
    @DisplayName("Number of words")
    void testNumberOfWords(){
        Lexical lexical = new Lexical();
        Assertions.assertEquals(3,lexical.numOfWords("how are you"));
    }

}
