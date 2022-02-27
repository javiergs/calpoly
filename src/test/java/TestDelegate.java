import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestDelegate{

        @Test
        @DisplayName("Test the answer to everything")
        void testAnswerToAll(){
            Delegate superComputer = new Delegate();
            assertEquals( 42 , superComputer.answer());
        }

}
