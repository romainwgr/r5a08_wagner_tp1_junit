package r5a08_findmyword;

import java.util.ArrayList;
import java.util.List;

public class Word {

    private String word;
    public Word(String motCorrect){
        this.word = motCorrect;
    }

    public List<Letter> guess(String tentative) {
        Score score = new Score(word);
        int i=0;
        List<Letter> liste = new ArrayList<>();
        while(i< tentative.length()){
            Letter resultat = score.assess(i, tentative);
            liste.add(resultat);
            i+=1;
        }
        return liste;
    }
}
