package junction.dohack.vocabulary;

import java.util.Locale;

/**
 * Created by Johannes Teklote on 25.11.2016.
 */
public class VocabularyItem {

    private Locale sourceLanguage;
    private Locale targetLanguage;
    private String word;
    private String[] translationSuggestions;
    private int correctAnswer;

    public VocabularyItem(String word, String[] translationSuggestions, int correctAnswer, Locale sourceLanguage, Locale targetLanguage) {
        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
        this.word = word;
        this.translationSuggestions = translationSuggestions;
        this.correctAnswer = correctAnswer;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String[] getTranslationSuggestions() {
        return translationSuggestions;
    }

    public void setTranslationSuggestions(String[] translationSuggestions) {
        this.translationSuggestions = translationSuggestions;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Locale getSourceLanguage() {
        return sourceLanguage;
    }

    public void setSourceLanguage(Locale sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public Locale getTargetLanguage() {
        return targetLanguage;
    }

    public void setTargetLanguage(Locale targetLanguage) {
        this.targetLanguage = targetLanguage;
    }
}
