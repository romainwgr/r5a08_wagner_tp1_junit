package r5a08_findmyword;

import java.util.ArrayList;
import java.util.List;

public class Score {
    private final String word;
    public List<Letter> resultat= new ArrayList<Letter>();
    private int position=0;
    public Score(String mot){
        this.word = mot;
    }
    public Letter letter(int i){
        return  resultat.get(i);
    }
    /*
    public Letter assess(int i, String tentative) {
        if(isCorrectPositionAndLetter(i, tentative)){
            return Letter.CORRECT;
        }
        else if (isLetterInWordButWrongPosition(i ,tentative)) {
            return Letter.PART_CORRECT;
        }
        else {
            return Letter.INCORRECT;
        }
    }*/
    public void assess(String tentative){
        while (this.position < this.word.length()){
            resultat.add(scoreForLetter(tentative));
            position++;
        }
    }

    private Letter scoreForLetter(String current){
        if(isCorrectPositionAndLetter(current)){
            return Letter.CORRECT;
        } if (isLetterInWordButWrongPosition(current)) {
            return Letter.PART_CORRECT;
        }
        return Letter.INCORRECT;
    }
    private boolean isCorrectPositionAndLetter(String attempt){
        return attempt.charAt(position) == this.word.charAt(position);
    }
    private boolean isLetterInWordButWrongPosition(String attempt){
        return this.word.contains(String.valueOf(attempt.charAt(position)));
    }
}
