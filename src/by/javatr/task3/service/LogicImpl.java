package by.javatr.task3.service;

import by.javatr.task3.valid.TextValidator;

public enum LogicImpl implements Logic {
    RegEx{
        @Override
        public String charReplace(String word, int k, char c) {
            TextValidator.validateStringArg(word);

            StringBuilder sb = new StringBuilder(word);
            String pattern = String.format("[a-zA-Z]{%d,}", k);

            if (word.matches(pattern)) sb.setCharAt(k - 1, c);
            return sb.toString();
        }

        @Override
        public String correctChar(String word) {
            TextValidator.validateStringArg(word);

            return word.replaceAll("PA", "PO");
        }

        @Override
        public String stringReplace(String word, int length, String substring) {
            TextValidator.validateStringArg(word);

            StringBuilder sb = new StringBuilder(word);
            String pattern = String.format("[a-zA-Z]{%d}", length);

            if (word.matches(pattern)) sb = new StringBuilder(substring);
            return sb.toString();
        }

        @Override
        public String symbolsDelete(String text) {
            return text
                    .replaceAll("([^a-zA-Z]+)", " ")
                    .trim();
        }

        @Override
        public String deleteFirstConsonant(String word, int length) {
            String pattern = String.format("^[^aeiou][a-zA-Z]{%d}$", length - 1);

            return word.toLowerCase().matches(pattern) ?
                    "" :
                    word;
        }
    }, StringBuilder{
        @Override
        public String charReplace(String word, int k, char c) {
            TextValidator.validateStringArg(word);

            StringBuilder sb = new StringBuilder(word);
            int length = sb.length();

            if (k <= length) {
                sb.setCharAt(k-1, c);
            }
            return sb.toString();
        }

        @Override
        public String correctChar(String word) {
            TextValidator.validateStringArg(word);

            StringBuilder sb = new StringBuilder(word);

            for (int i = 0; i < word.length() - 2; i++) {
                if (word.charAt(i) == 'P' && word.charAt(i + 1) == 'A')
                    sb.setCharAt(i+1, 'O');
            }

            return sb.toString();
        }

        @Override
        public String stringReplace(String word, int length, String substring) {
            TextValidator.validateStringArg(word);

            StringBuilder sb = new StringBuilder(word);

            if (word.length() == length) sb = new StringBuilder(substring);
            return sb.toString();
        }

        @Override
        public String symbolsDelete(String text) {
            TextValidator.validateStringArg(text);

            StringBuilder sb = new StringBuilder(text);

            for (int i = 0; i < sb.length(); i++) {
                if (!Character.isLetter(sb.charAt(i))){
                    int intOffsetIndex = -1;
                    for (int j = i; j < sb.length(); j++) {
                        if (Character.isLetter(sb.charAt(j))) {
                            intOffsetIndex = j;
                            break;
                        }
                    }
                    if (intOffsetIndex > -1)sb.replace(i, intOffsetIndex, " ");
                    else sb.delete(i, sb.length());
                    i++;
                }
            }
            return sb.toString();
        }

        @Override
        public String deleteFirstConsonant(String word, int length) {
            TextValidator.validateStringArg(word);
            TextValidator.vaildateMagicString(word);

            StringBuilder sb = new StringBuilder(word);

            char firstChar = Character.toLowerCase(word.charAt(0));
            if (word.length() != length || isVowel(firstChar)) return sb.toString();
            return "";
        }

        private boolean isVowel(char c) {
            boolean stat;

            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    stat = true;
                    break;
                default:
                    stat = false;
            }

            return stat;
        }
    }
}
