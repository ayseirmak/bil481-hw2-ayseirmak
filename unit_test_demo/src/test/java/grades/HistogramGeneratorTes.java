package demo.junit_class_demo.grades;
import java.io.File;
import org.junit.Test;
import static org.mockito.Mockito.*;
import java.io.IOException;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.jfree.chart.JFreeChart;

public class HistogramGeneratorTes {


	@Test
    	public void test_generate_normal() {
    	HistogramMain obj = new HistogramMain();
        obj.main(new String[]{"Testing Histogram Generator Main"});
    	}
}
