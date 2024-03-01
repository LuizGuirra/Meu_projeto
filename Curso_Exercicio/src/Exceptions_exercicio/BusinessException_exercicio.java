package Exceptions_exercicio;

public class BusinessException_exercicio extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public BusinessException_exercicio(String msg) {
		super(msg);
	}
}
