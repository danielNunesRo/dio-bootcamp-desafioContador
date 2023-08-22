package handlerExceptions;

public class ParametrosInvalidosException extends Exception {
	public ParametrosInvalidosException() {
		super("O primeiro número digitado é maior que o segundo, impossibilitando mostrar o intervalo.");
	}
}
