package r5a08_findmyword;

public class Score {
    private  String word;
    public Score(String mot){
        this.word = mot;
    }
    public Letter assess(int i, String tentative) {
        if(tentative.charAt(i) == this.word.charAt(i)){
            return Letter.CORRECT;
        }
        else if (word.contains(String.valueOf(tentative.charAt(i)))) {
            return Letter.PART_CORRECT;
        }
        else {
            return Letter.INCORRECT;
        }
    }
}
