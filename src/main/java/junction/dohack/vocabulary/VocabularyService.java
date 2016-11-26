package junction.dohack.vocabulary;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

/**
 * Created by Johannes Teklote on 25.11.2016.
 */
@ManagedBean
public class VocabularyService {

    private ArrayList<VocabularyItem> vocabularies;
    private VocabularyItem currentItem;
    private int chosen;

    @PostConstruct
    public void init() {
        vocabularies = new ArrayList<VocabularyItem>();
        Locale sourceLanguage = Locale.ENGLISH;
        Locale targetLanguage = Locale.GERMAN;
        String word = "bus";
        String[] translationSuggestions = {"Bus", "Günther", "Auto", "dumm"};
        int correctAnswer = 1;
        vocabularies.add(new VocabularyItem(word, translationSuggestions, correctAnswer, sourceLanguage, targetLanguage));
    }

    public ArrayList<VocabularyItem> getVocabularies() {
        return vocabularies;
    }

    public void setCurrentItem() {
        Random rng = new Random();
        int rnd = rng.nextInt(vocabularies.size());
        currentItem = vocabularies.get(rnd);
    }

    public VocabularyItem getCurrentItem() {
        return currentItem;
    }

    public boolean checkAnswer(VocabularyItem item) {
        return chosen == item.getCorrectAnswer();
    }

    public int getChosen() {
        return chosen;
    }

    public void setChosen(int chosen) {
        this.chosen = chosen;
    }
}
