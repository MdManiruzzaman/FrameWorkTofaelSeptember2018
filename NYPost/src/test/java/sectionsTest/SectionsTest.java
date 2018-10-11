package sectionsTest;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sections.Sections;

public class SectionsTest extends Sections {
    @BeforeMethod
    public void HomePage(){
        Sections sections = new Sections(driver);
    }
    @Test
    public void TestNews(){
        clickNews();
    }
    @Test
    public  void TestMetro(){
        clickMetro();
    }
    @Test
    public void TestPageSix(){
        clickPageSix();
    }
}




