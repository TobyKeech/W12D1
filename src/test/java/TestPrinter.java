import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {
    Printer printer;

    @Before
    public void before() { printer= new Printer(10, 100);}

    @Test
    public void testSheetsOfPaperLeft(){
        assertEquals(10, printer.getSheetsOfPaperLeft());

    }

    @Test
    public void testPrintMethod(){
        assertEquals(5, printer.print(20, 5));
    }

    @Test
    public void testPrinterVolume(){
        assertEquals(100, printer.getTonerVolume());
    }


}
