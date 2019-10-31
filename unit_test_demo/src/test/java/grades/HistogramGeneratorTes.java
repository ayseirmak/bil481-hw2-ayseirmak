package demo.junit_class_demo.grades;
import java.io.File;
import org.junit.Test;
import static org.mockito.Mockito.*;
import java.io.IOException;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.jfree.chart.JFreeChart;

public class HistogramGeneratorTes {


  HistogramGenerator hg = new  HistogramGenerator((new ChartIO()));

    @Rule
     public TemporaryFolder testFolder = new TemporaryFolder();


	@Test
	public void test_generate_normal() {
         hg.generateHistogram("grades.txt", "histogram.jpeg");

	}
	
}
