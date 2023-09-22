package exception_handling;
 class TooOldException extends RuntimeException {
	TooOldException(String msg)
	{
		super(msg);
	}
}
