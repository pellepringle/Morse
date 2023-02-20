import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class MorseTest {
    @Test
    public void checkStop() {
        Logic logic = new Logic();
        //Act
        logic.checkStop("*");
        //Assert
        assertEquals(true, logic.getStop());
    }

    @Test
    public void checkTranslate() {
        Logic logic = new Logic();
        //Act
        String actual = logic.translate("a");
        String expected = (".-");
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkHashmap() {
        Logic logic = new Logic();
        //Act
        String actual = logic.translate("ö");
        String expected = ("null");
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkNull() {
        Logic logic = new Logic();
        //Act
        String actual = logic.translate("ä");
        String expected = ("null");
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testSwedishLetters() {
        Logic logic = new Logic();
        //Act
        String actual = logic.translate("ä");
        String expected = ("null");
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void TestTranslate() {
        Logic logic = new Logic();
        //Act
        String actual = logic.translate(".... . .---/.--- .- --./.... . - . .-./.--. . .-.. .-.. .");
        String expected = ("hej jag heter pelle");
        //Assert
        assertEquals(expected, actual);
    }
}
