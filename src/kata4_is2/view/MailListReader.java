package kata4_is2.view;

import kata4_is2.model.Mail;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {

    public static List<Mail> read(String fileName) throws FileNotFoundException, IOException {
        List<Mail> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
        while(true){
            String line = reader.readLine();
            if(line == null) break;
            if(Mail.isMail(line)) 
                list.add(new Mail(line));
        }

        return list;
    }
    
}
