package by.javatr.task3.run;

import by.javatr.task3.utill.TextUtil;

import static by.javatr.task3.utill.TextUtil.Engine.REGEX;
import static by.javatr.task3.utill.TextUtil.Engine.STRING_BUILDER;

public class Run {

    /*To scan text from console or file use by.javatr.scanner.DataScanner.enterLineFromConsole() or
    * by.javatr.scanner.DataScanner.readFile() methods*/
    public static void main(String[] args) {
        String s1 = "String to, split.";

        String regexS1 = TextUtil.replace(s1, 2, 'A', REGEX);
        System.out.println(regexS1);
        String sbS1 = TextUtil.replace(s1, 2, 'A', STRING_BUILDER);
        System.out.println(regexS1);

        String s2 = "Pass  PAss POst";

        String regexS2 = TextUtil.correctChar(s2);
        System.out.println(regexS2);
        String sbS2 = TextUtil.correctChar(s2);
        System.out.println(regexS2);

        String s3 = "One, 2, three";

        String regexS3 = TextUtil.stringReplace(s3, 3, "four");
        System.out.println(regexS3);
        String sbS3 = TextUtil.stringReplace(s3, 3, "four");
        System.out.println(regexS3);

        String s4 = "tx.a.asd,asd,v:; ;asd-";

        String regexS4 = TextUtil.symbolDelete(s4);
        System.out.println(regexS4);
        String sbS4 = TextUtil.symbolDelete(s4);
        System.out.println(regexS4);

        String s5 = "Delete me,  please!";

        String regexS5 = TextUtil.deleteFirstConsonant(s5, 2);
        System.out.println(regexS5);
        String sbS5 = TextUtil.symbolDelete(s5);
        System.out.println(regexS5);
    }
}
