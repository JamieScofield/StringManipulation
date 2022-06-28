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
    @DisplayName("Large number of characters")
    void largeChar(){
        Lexical lexical = new Lexical();
        Assertions.assertEquals(300,lexical.numOfChar("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec."));
    }
    @Test
    @DisplayName("no character check")
    void zeroChar(){
        Lexical lexical = new Lexical();
        Assertions.assertEquals(0,lexical.numOfChar(""));
    }
    @Test
    @DisplayName("Number of words")
    void testNumberOfWords(){
        Lexical lexical = new Lexical();
        Assertions.assertEquals(3,lexical.numOfWords("how are you"));
    }


}
