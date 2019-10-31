package demo.junit_class_demo.grades;
import java.io.File;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Assert.*;
import org.jfree.chart.JFreeChart;

public class ChartIOTest {
	
	ChartIO io = new ChartIO();
	@Test
	public void test_readFile_happyPath() {
	//String path = "src/test/resources";
    File file = new File (getClass().getClassLoader().getResource("grades.txt").getFile());

    String absolutePath = file.getAbsolutePath();
    io.readFile(absolutePath);}

	
	@Test (expected = IllegalArgumentException.class)
	public void test_readFile_SadPath() {
		io.readFile("asdasfdzad");
	}

	@Test
    	public void test_writeFile_happyPath() {

    	}

}
