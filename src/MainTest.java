import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {
        Interpreter interpreter = new Interpreter();
        while(true){
            String line = "(2+2)";
            if(line == null)
                break;
            interpreter.parse(line);
        }
        interpreter.run();

        //Assert.assertEquals();
    }
}