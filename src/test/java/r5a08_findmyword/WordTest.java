package r5a08_findmyword;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class WordTest {

    @Test
    public void should_check_one_incorrect_letter()
    {
        // Arrange
        Word word = new Word("E");

        // Act
        List<Letter>list = word.guess("A");
        Letter actual = list.get(0);
        Letter expected = Letter.INCORRECT;

        // Arrange
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void should_check_one_correct_letter()
    {
        // Arrange
        Word word = new Word("E");

        // Act
        List<Letter> list = word.guess("E");
        Letter actual = list.get(0);
        Letter expected = Letter.CORRECT;

        // Arrange
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void should_check_one_correct_word(){

        // Arrange
        Word word = new Word("SALUT");

        // Act
        List<Letter> actual = word.guess("SALUT");
        List<Letter> expected = Arrays.asList(Letter.CORRECT,Letter.CORRECT,Letter.CORRECT,Letter.CORRECT,Letter.CORRECT);

        // Arrange
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void should_check_one_incorrect_word(){

        // Arrange
        Word word = new Word("SALUT");

        // Act
        List<Letter> actual = word.guess("DONNE");
        List<Letter> expected = Arrays.asList(Letter.INCORRECT,Letter.INCORRECT,Letter.INCORRECT,Letter.INCORRECT,Letter.INCORRECT);

        // Arrange
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void should_check_one_part_correct_word(){

        // Arrange
        Word word = new Word("SALUT");

        // Act
        List<Letter> actual = word.guess("TUSAS");
        List<Letter> expected = Arrays.asList(Letter.PART_CORRECT,Letter.PART_CORRECT,Letter.PART_CORRECT,Letter.PART_CORRECT,Letter.PART_CORRECT);

        // Arrange
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void should_check_one_part_correct_and_incorrect_word(){

        // Arrange
        Word word = new Word("SALUT");

        // Act
        List<Letter> actual = word.guess("TULZB");
        List<Letter> expected = Arrays.asList(Letter.PART_CORRECT,Letter.PART_CORRECT,Letter.CORRECT,Letter.INCORRECT,Letter.INCORRECT);

        // Arrange
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void should_check_one_part_correct_and_correct_word(){

        // Arrange
        Word word = new Word("SALUT");

        // Act
        List<Letter> actual = word.guess("SALTU");
        List<Letter> expected = Arrays.asList(Letter.CORRECT,Letter.CORRECT,Letter.CORRECT,Letter.PART_CORRECT,Letter.PART_CORRECT);

        // Arrange
        Assertions.assertEquals(expected,actual);

    }
}
