package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

	private Game game;

	@BeforeEach
	void setUp() {
		game = new Game();
	}

	@Test
	void createGame() {
		game = new Game();
		assertNotNull(game);
	}

	@Test
	void throwIllegalArgumentExceptionInvalidInput() {
		assertIllegalArgument(null);
		assertIllegalArgument("12");
		assertIllegalArgument("1234");
		assertIllegalArgument("12s");
		assertIllegalArgument("121");
	}

	private void assertIllegalArgument(String guessNumber) {
		try {
			game.guess(guessNumber);
			fail();
		} catch (IllegalArgumentException e) {

		}
	}
}
