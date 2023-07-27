package Dice.Game.Dice.Game.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DuplicatePlayerNameException extends RuntimeException {

	public DuplicatePlayerNameException(String message) {
		super(message);
	}
}
