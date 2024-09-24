package r5a08.tp1;

import org.junit.jupiter.api.Test;
import r5a08.UserGreating;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserGreatingTest {

    @Test
    public void testformatGreating() throws UserGreating.UserGreatingFailureException {

        //Arrange
        UserGreating user = new UserGreating();

        //Act
        String nom = "Romain";

        //Assert
        assertEquals("Bonjour, Romain", user.formatGreating(nom));

    }

    @Test
    public void testformatGreatingFailureException() throws UserGreating.UserGreatingFailureException {

        //Arrange
        UserGreating user = new UserGreating();

        //Act
        String nom_incorrect = "UJFOy'_çy=hEZKHè_y";

        //Assert
        assertThatExceptionOfType(UserGreating.UserGreatingFailureException.class).isThrownBy(
                ()->UserGreating.formatGreating(nom_incorrect)
        );
    }
}
