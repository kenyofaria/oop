package lesson3.wrappertypes;

public class Validator {

	public String extractCPFDigits(String cpf) {
		return cpf.replace(".", "").replace("-", "");
	}
}
