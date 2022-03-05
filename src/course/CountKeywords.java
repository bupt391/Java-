package course;

import java.util.*;
import java.io.*;

public class CountKeywords {
    public static void main(String[] args) {

        String[] keywordString = {"abstract", "finally", "public",
                "boolean", "float", "return", "break", "for", "short", "byte",
                "goto", "static", "case", "if", "super", "catch", "implements",
                "switch", "char", "import", "synchronized", "class",
                "instanceof", "this", "const", "int", "throw", "continue",
                "interface", "throws", "default", "long", "transient", "do",
                "native", "try", "double", "new", "void", "else", "package",
                "volatile", "extends", "private", "while", "final",
                "protected", "true", "null"};

        Set<String> keywordSet =
                new HashSet<String>(Arrays.asList(keywordString));
        int count = 0;

        try {
            //Scanner input = new Scanner(new File(args[0]));
            Scanner input = new Scanner(new File("src/course/Ch21Q03_TestFile.java"));
            String text = "";
            while (input.hasNext()) {
                String line = input.nextLine();
                line = stripLineComments(line);
                line = stripLineStringLiterals(line);
                text += line + " ";
            }

            text = stripParagraghComments(text);

            //String[] tokens = text.split("[ \\[,()\\]]");
            String[] tokens = text.split("[\\s\\(\\)\\{\\}]");
            for (String token: tokens) {
                if (keywordSet.contains(token)){
                    count++;
                    System.out.print(token+" ");}
            }
            System.out.println();
            System.out.println("The number of keywords in the program is "
                    + count);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /* Strip line comments */
    private static String stripLineComments(String line) {
        int index = line.indexOf("//");

        if (index < 0)
            return line;
        else
            return line.substring(0, index);
    }

    /* Strip string literals */
    private static String stripLineStringLiterals(String line) {
        int start = line.indexOf("\"");
        int end = line.indexOf("\"", start + 1);

        while (start > 0 && end > 0) {
            line = line.substring(0, start) + line.substring(end + 1);
            start = line.indexOf("\"");
            end = line.indexOf("\"", start + 1);
        }

        return line;
    }

    /* Strip paragraph comments */
    private static String stripParagraghComments(String text) {
        int start = text.indexOf("/*");
        int end = text.indexOf("*/");

        while (start > 0 && end > 0) {
            text = text.substring(0, start) + text.substring(end + 2);
            start = text.indexOf("/*");
            end = text.indexOf("*/");
        }

        return text;
    }
}

