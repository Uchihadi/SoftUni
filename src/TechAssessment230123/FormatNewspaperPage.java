package TechAssessment230123;

import java.util.ArrayList;
import java.util.List;

// You are formatting the Text on a Newspaper Page. You must align the text on Page properly
// Texts are provided to you in following formats:
// 1) Paragraphs (An array of paragraphs where each paragraph is represented as an array containing portions of text)
// 2) Widths (Representing the maximum number of characters on each line of the newspaper page can include)
// Your task is to produce a Newspaper Page according to following specifications:
// i) Start a new line for each paragraph, paragraphs[i][j] in order. When words are together on a line, they should be separated by 1 space
// (Every Paragraph word Paragraphs[i][j] is guaranteed to contain only lowercase and uppercase English letters)
// Return the resulting Newspaper Page as an Array of Strings. It is possible to format Paragraphs as described

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
