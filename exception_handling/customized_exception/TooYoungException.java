package exception_handling;

public class TooYoungException extends RuntimeException {
	TooYoungException(String msg)
	{
		super(msg);
	}
}
