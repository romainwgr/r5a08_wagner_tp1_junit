package r5a08.tp1;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.util.regex.Pattern;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

public class UserGreatingTest {

    private UserGreating user;

    @BeforeAll
    public void initialiser(){
        user = new UserGreating();
    }
    public void testformatGreating(){




        assertEquals("Bonjour, Romain", this.user.formatGreating("Romain"));
        assertThatExceptionOfType(RuntimeException.class).isThrownBy(() -> {
            // ...
        });

    }
    @AfterAll
    public void nettoyer_memoire(){
        user = null;
    }
}
