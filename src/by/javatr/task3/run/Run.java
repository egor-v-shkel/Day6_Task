package by.javatr.task3.run;

import by.javatr.task3.utill.TextUtil;

import static by.javatr.task3.utill.TextUtil.Engine.REGEX;
import static by.javatr.task3.utill.TextUtil.Engine.STRING_BUILDER;

public class Run {

    /*To scan text from console or file use by.javatr.scanner.DataScanner.enterLineFromConsole() or
    * by.javatr.scanner.DataScanner.readFile() methods accordingly*/
    public static void main(String[] args) {
        String s1 = "String to, split.";

        TextUtil.switchTo(REGEX);
        String regexS1 = TextUtil.replace(s1, 3, 'A');
        System.out.println(regexS1);
        TextUtil.switchTo(STRING_BUILDER);
        String sbS1 = TextUtil.replace(s1, 3, 'A');
        System.out.println(sbS1);

        String s2 = "Pass  PAss POst";

        TextUtil.switchTo(REGEX);
        String regexS2 = TextUtil.correctChar(s2);
        System.out.println(regexS2);
        TextUtil.switchTo(STRING_BUILDER);
        String sbS2 = TextUtil.correctChar(s2);
        System.out.println(sbS2);

        String s3 = "One, 2, three";

        TextUtil.switchTo(REGEX);
        String regexS3 = TextUtil.stringReplace(s3, 3, "four");
        System.out.println(regexS3);
        TextUtil.switchTo(STRING_BUILDER);
        String sbS3 = TextUtil.stringReplace(s3, 3, "four");
        System.out.println(sbS3);

        String s4 = "tx.a.asd,asd,v:; ;asd-";


        TextUtil.switchTo(REGEX);
        String regexS4 = TextUtil.symbolDelete(s4);
        System.out.println(regexS4);
        TextUtil.switchTo(STRING_BUILDER);
        String sbS4 = TextUtil.symbolDelete(s4);
        System.out.println(sbS4);

        String s5 = "Me Delete me,  please!";


        TextUtil.switchTo(REGEX);
        String regexS5 = TextUtil.deleteFirstConsonant(s5, 2);
        System.out.println(regexS5);
        TextUtil.switchTo(STRING_BUILDER);
        String sbS5 = TextUtil.deleteFirstConsonant(s5, 2);
        System.out.println(sbS5);
    }
}