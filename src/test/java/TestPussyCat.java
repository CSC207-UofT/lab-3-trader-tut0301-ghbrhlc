import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPussyCat {
    PussyCat p;
    @Before
    public void setUp() throws Exception {
        p = new PussyCat(false);
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Meow", p.sound());
    }

    @Test(timeout = 50)
    public void TestMakeCute(){
        p.makeCute();
        assertEquals((true), p.getIsCute());
    }
}
