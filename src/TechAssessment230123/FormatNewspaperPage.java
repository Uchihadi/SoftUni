package TechAssessment230123;

import java.util.ArrayList;
import java.util.List;

//

public class FormatNewspaperPage {
    public static String[] formatNewspaper(String[][] paragraphs, int width) {
        List<String> newspaper = new ArrayList<>();
        StringBuilder line = new StringBuilder();
        for (String[] paragraph : paragraphs) {
            for (String word : paragraph) {
                if (line.length() + word.length() + 1 <= width) {
                    line.append(word + " ");
                } else {
                    newspaper.add(line.toString().trim());
                    line = new StringBuilder();
                    line.append(word + " ");
                }
            }
            newspaper.add(line.toString().trim());
            line = new StringBuilder();
        }
        return newspaper.toArray(new String[newspaper.size()]);
    }
}
