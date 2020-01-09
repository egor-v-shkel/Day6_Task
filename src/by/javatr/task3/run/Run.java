package by.javatr.task3.run;

import by.javatr.task3.service.Logic;
import by.javatr.task3.service.LogicImpl;
import by.javatr.task3.service.TextService;

public class Run {

    /*To scan text from console or file use by.javatr.scanner.DataScanner.enterLineFromConsole() or
    * by.javatr.scanner.DataScanner.readFile() methods accordingly*/
    public static void main(String[] args) {
        Logic builderLogic = LogicImpl.StringBuilder;
        Logic regExLogic = LogicImpl.RegEx;

        String s1 = "String to, split.";

        TextService.switchTo(regExLogic);
        String regexS1 = TextService.replace(s1, 3, 'A');
        System.out.println(regexS1);
        TextService.switchTo(builderLogic);
        String sbS1 = TextService.replace(s1, 3, 'A');
        System.out.println(sbS1);

        String s2 = "Pass  PAss POst";

        TextService.switchTo(regExLogic);
        String regexS2 = TextService.correctChar(s2);
        System.out.println(regexS2);
        TextService.switchTo(builderLogic);
        String sbS2 = TextService.correctChar(s2);
        System.out.println(sbS2);

        String s3 = "One, 2, three";

        TextService.switchTo(regExLogic);
        String regexS3 = TextService.stringReplace(s3, 3, "four");
        System.out.println(regexS3);
        TextService.switchTo(builderLogic);
        String sbS3 = TextService.stringReplace(s3, 3, "four");
        System.out.println(sbS3);

        String s4 = "tx.a.asd,asd,v:; ;asd-";

        TextService.switchTo(regExLogic);
        String regexS4 = TextService.symbolDelete(s4);
        System.out.println(regexS4);
        TextService.switchTo(builderLogic);
        String sbS4 = TextService.symbolDelete(s4);
        System.out.println(sbS4);

        String s5 = "Me Delete me,  please!";

        TextService.switchTo(regExLogic);
        String regexS5 = TextService.deleteFirstConsonant(s5, 2);
        System.out.println(regexS5);
        TextService.switchTo(builderLogic);
        String sbS5 = TextService.deleteFirstConsonant(s5, 2);
        System.out.println(sbS5);
    }
}