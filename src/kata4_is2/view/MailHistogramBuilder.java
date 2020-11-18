package kata4_is2.view;

import kata4_is2.model.Mail;
import kata4_is2.model.Histogram;
import java.util.List;

public class MailHistogramBuilder {

    public Histogram<String> build(List<Mail> mailList) {
        Histogram<String> histogram = new Histogram();
        for(Mail mail : mailList){
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }

}
