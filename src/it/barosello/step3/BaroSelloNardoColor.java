package it.barosello.step3;

import it.barosello.step2.BaroSelloNardo;
import it.barosello.utils.BaroSelloColors;
import it.barosello.utils.BaroSelloPrintInterface;

public class BaroSelloNardoColor extends BaroSelloNardo implements BaroSelloPrintInterface {

	@Override
	public void generateAndPrintOutput(int input) {
		String colorlessOutput = generateOutput(input);
		System.out.print(getColoredText(colorlessOutput));
	}

	String getColoredText(String colorlessOutput) {
		String color = "";
		switch (colorlessOutput.toUpperCase()) {
		case "BARO":
			color = BaroSelloColors.GREEN.getValue();
			break;
		case "SELLO":
			color = BaroSelloColors.RED.getValue();
			break;
		case "NARDO":
			color = BaroSelloColors.YELLOW.getValue();
			break;
		case "BAROSELLO":
			color = BaroSelloColors.BLUE.getValue();
			break;
		default:
			return colorlessOutput;
		}
		return new StringBuilder().append(color).append(colorlessOutput).append(BaroSelloColors.COLOR_RESET.getValue())
				.toString();
	}

	public static void main(String[] args) {
		final BaroSelloPrintInterface baroSelloTest = new BaroSelloNardoColor();

		for (int i = 0; i <= 100; i++) {
			baroSelloTest.generateAndPrintOutput(i);
			if (i < 100) {
				System.out.print(",");
			}
		}
	}
}
