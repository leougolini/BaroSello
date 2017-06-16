package it.barosello.step4;

import it.barosello.step3.BaroSelloNardoColor;
import it.barosello.utils.BaroSelloInteface;

public class BaroSelloFilter extends BaroSelloNardoColor {

	@Override
	public String generateOutput(int input) {

		String output = super.generateOutput(input);

		return output.contains(BAROSELLO) ? output : "";
	}

	public static void main(String[] args) {
		final BaroSelloInteface baroSelloTest = new BaroSelloFilter();
		String output = "";
		for (int i = 0; i <= 100; i++) {
			output = baroSelloTest.generateOutput(i);
			System.out.print(output);
			if (i < 100 && !output.isEmpty()) {
				System.out.print(",");
			}
		}
	}
}
