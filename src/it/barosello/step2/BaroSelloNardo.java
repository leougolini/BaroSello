package it.barosello.step2;

import it.barosello.step1.BaroSello;
import it.barosello.utils.BaroSelloInteface;

public class BaroSelloNardo extends BaroSello {

	@Override
	public String generateOutput(int input) {

		if (input != 0 && input % 7 == 0) {
			return NARDO;
		}
		return super.generateOutput(input);
	}

	public static void main(String[] args) {
		final BaroSelloInteface baroSelloTest = new BaroSelloNardo();

		for (int i = 0; i <= 100; i++) {
			System.out.print(baroSelloTest.generateOutput(i));
			if (i < 100) {
				System.out.print(",");
			}
		}
	}
}
