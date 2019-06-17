package ca.bnc.nbfg.devops.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UnknownEventException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnknownEventException(Long id) {
		super("Unknown Event with ID=" + id);
	}
	
}
