package exception_handling;

public class TooYoungException extends RuntimeException {
	TooYoungException(String msg)
	{
		super(msg);
	}
}

 class TooOldException extends RuntimeException {
	TooOldException(String msg)
	{
		super(msg);
	}
}
