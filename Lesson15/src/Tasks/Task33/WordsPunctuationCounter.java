package Tasks.Task33;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsPunctuationCounter {

    public int WordsCounter() throws FileNotFoundException {

        int wordsCounter = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("Text.txt"))) {
            StringBuilder stringBuilder = new StringBuilder();
            Pattern findWords = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS);

            String lineBR;
            while ((lineBR = br.readLine()) != null) {
                stringBuilder.append(lineBR);
            }

            Matcher matcher = findWords.matcher(stringBuilder);
            while (matcher.find()) {
                wordsCounter++;
            }

        } catch (IOException e) {
            System.err.println("File not found.");
        }
        return wordsCounter;
    }

    public int PunctuationCounter () throws FileNotFoundException{

        int punctuationCounter = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("Text.txt"))) {
            Pattern findPunctuation = Pattern.compile("[,|.|—]", Pattern.UNICODE_CHARACTER_CLASS);
            String linePC;

            while ((linePC =br.readLine()) !=null){
                Matcher matcher = findPunctuation.matcher(linePC);
                while (matcher.find()) {
                    punctuationCounter++;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return punctuationCounter;
    }
}
