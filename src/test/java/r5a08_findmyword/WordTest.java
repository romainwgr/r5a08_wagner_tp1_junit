package r5a08_findmyword;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WordTest {

    @Test
    public void should_check_one_incorrect_letter() {
        // Arrange
        Word word = new Word("E"); // Le mot à deviner fait une lettre

        // Act
        Score score = word.guess("B");

        // Assert
        assertScoreForGuess(score, Letter.INCORRECT);
    }

    @Test
    public void should_check_one_correct_letter() {
        // Arrange
        Word word = new Word("E"); // Le mot à deviner fait une lettre

        // Act
        Score score = word.guess("E");

        // Assert
        assertScoreForGuess(score, Letter.CORRECT);
    }

    @Test
    public void should_check_second_letter_wrong_position() {
        // Arrange
        Word word = new Word("EM");

        // Act
        Score score = word.guess("GE");

        // Assert
        assertScoreForGuess(score, Letter.INCORRECT, Letter.PART_CORRECT);
    }

    @Test
    public void should_check_all_score_combinations_correct() {
        // Arrange
        Word word = new Word("EMT");

        // Act
        Score score = word.guess("GET");

        // Assert
        assertScoreForGuess(score, Letter.INCORRECT, Letter.PART_CORRECT, Letter.CORRECT);
    }

    private void assertScoreForGuess(Score score, Letter... expectedScores) {
        for (int position = 0; position < expectedScores.length; position++) {
            Letter expected = expectedScores[position];
            assertThat(score.letter(position)).isEqualTo(expected);
        }
    }


//    @Test
//    public void should_check_one_incorrect_letter()
//    {
//        // Arrange
//        Word word = new Word("E");
//
//        // Act
//        Letter actual = word.guess("A").get(0);
//        Letter expected = Letter.INCORRECT;
//
//        // Arrange
//        assertThat(actual).isEqualTo(expected);
//
//    }
//    @Test
//    public void should_check_one_correct_letter()
//    {
//        // Arrange
//        Word word = new Word("E");
//
//        // Act
//        Letter actual = word.guess("E").get(0);
//        Letter expected = Letter.CORRECT;
//
//        // Arrange
//        assertThat(actual).isEqualTo(expected);
//
//    }
//    @Test
//    public void should_check_one_correct_word(){
//
//        // Arrange
//        Word word = new Word("SALUT");
//
//        // Act
//        List<Letter> actual = word.guess("SALUT");
//        List<Letter> expected = Arrays.asList(Letter.CORRECT,Letter.CORRECT,Letter.CORRECT,Letter.CORRECT,Letter.CORRECT);
//
//        // Arrange
//        assertThat(actual).isEqualTo(expected);
//
//    }
//    @Test
//    public void should_check_one_incorrect_word(){
//
//        // Arrange
//        Word word = new Word("SALUT");
//
//        // Act
//        List<Letter> actual = word.guess("DONNE");
//        List<Letter> expected = Arrays.asList(Letter.INCORRECT,Letter.INCORRECT,Letter.INCORRECT,Letter.INCORRECT,Letter.INCORRECT);
//
//        // Arrange
//        assertThat(actual).isEqualTo(expected);
//
//    }
//    @Test
//    public void should_check_one_part_correct_word(){
//
//        // Arrange
//        Word word = new Word("SALUT");
//
//        // Act
//        List<Letter> actual = word.guess("TUSAS");
//        List<Letter> expected = Arrays.asList(Letter.PART_CORRECT,Letter.PART_CORRECT,Letter.PART_CORRECT,Letter.PART_CORRECT,Letter.PART_CORRECT);
//
//        // Arrange
//        assertThat(actual).isEqualTo(expected);
//
//    }
//    @Test
//    public void should_check_one_part_correct_and_incorrect_word(){
//
//        // Arrange
//        Word word = new Word("SALUT");
//
//        // Act
//        List<Letter> actual = word.guess("TULZB");
//        List<Letter> expected = Arrays.asList(Letter.PART_CORRECT,Letter.PART_CORRECT,Letter.CORRECT,Letter.INCORRECT,Letter.INCORRECT);
//
//        // Arrange
//        assertThat(actual).isEqualTo(expected);
//
//    }
//    @Test
//    public void should_check_one_part_correct_and_correct_word(){
//
//        // Arrange
//        Word word = new Word("SALUT");
//
//        // Act
//        List<Letter> actual = word.guess("SALTU");
//        List<Letter> expected = Arrays.asList(Letter.CORRECT,Letter.CORRECT,Letter.CORRECT,Letter.PART_CORRECT,Letter.PART_CORRECT);
//
//        // Arrange
//        assertThat(actual).isEqualTo(expected);
//
//    }
}
