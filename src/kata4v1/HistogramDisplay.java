package kata4v1;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

import javax.swing.*;
import java.awt.*;


public class HistogramDisplay extends ApplicationFrame {

    private Histogram<String> histogram = new Histogram<>();

    public HistogramDisplay() {
        super("Histogram");
        histogram = new HistogramReader().readFromFile("/Users/ignaciogarcia-canolavazza/Downloads/emailsfilev1.txt");
        setContentPane(createPanel());
        pack();
    }
    
    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(700,700));
        return chartPanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset){
        return ChartFactory.createBarChart("Histogram", "Domain", "Number of accounts", dataset);
    }

    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();
        for(String key : histogram.keySet()){
            defaultCategoryDataset.addValue(histogram.get(key), "", key);
        }
        return defaultCategoryDataset;
    }
}
