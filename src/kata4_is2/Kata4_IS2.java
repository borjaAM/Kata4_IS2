package kata4_is2;

import kata4_is2.view.MailListReader;
import kata4_is2.view.MailHistogramBuilder;
import kata4_is2.view.HistogramDisplay;
import kata4_is2.model.Mail;
import kata4_is2.model.Histogram;
import java.io.IOException;
import java.util.List;

public class Kata4_IS2 {

    public static void main(String[] args) throws IOException {
        String fileName = "email.txt";
        List<Mail> mailList = MailListReader.read(fileName);
        
        Histogram<String> histogram = new MailHistogramBuilder().build(mailList);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram, "Histogram Display");
        histogramDisplay.execute();
    }
}
