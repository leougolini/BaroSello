package it.barosello.step1;

import it.barosello.utils.BaroSelloInteface;

public class BaroSello implements BaroSelloInteface {

	protected final static String BARO = "Baro";
	protected final static String SELLO = "Sello";
	protected final static String NARDO = "Nardo";
	protected final static String BAROSELLO = "BaroSello";
	
	@Override
	public String generateOutput(int input) {

		if (input < 0 || input > 100) {
			throw new IllegalArgumentException("Input number must be between 0 and 100.");
		} else if (input == 0) {
			return "0";
		}
		
		String output = "";
		
		if ((input % 3) == 0) {
			output += BARO;
		}
		if ((input % 5) == 0) {
			output += SELLO;
		}
		if (output.isEmpty()) {
			output = String.valueOf(input);
		}
		
		return output;
	}

	public static void main(String[] args) {
		final BaroSelloInteface baroSelloTest = new BaroSello();
		for (int i = 0; i <= 100; i++) {
			System.out.print(baroSelloTest.generateOutput(i));
			if (i < 100) {
				System.out.print(",");
			}
		}
	}

}
