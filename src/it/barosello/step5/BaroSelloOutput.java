package it.barosello.step5;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import it.barosello.step2.BaroSelloNardo;
import it.barosello.utils.BaroSelloPrintInterface;

public class BaroSelloOutput extends BaroSelloNardo implements BaroSelloPrintInterface{

	private final PrintStream stdOut;
	private final PrintStream fileOut;

	public BaroSelloOutput() throws FileNotFoundException {
		stdOut = new PrintStream(new FileOutputStream(FileDescriptor.out));
		fileOut = new PrintStream(new FileOutputStream("out.log"));
	}

	@Override
	public void generateAndPrintOutput(int input) {
		String output = generateOutput(input);

		switch (output) {
		case BARO:
			setAndPrintOut(fileOut, output);
			break;
		case SELLO:
			setAndPrintOut(fileOut, output);
			setAndPrintOut(stdOut, output);
			break;
		case BAROSELLO:
			setAndPrintOut(stdOut, output);
			break;

		default:
			break;
		}
	}

	void setAndPrintOut(PrintStream ps, String s) {
		System.setOut(ps);
		System.out.println(s);

	}

	public static void main(String[] args) {
		BaroSelloOutput baroSelloTest = null;
		try {
			baroSelloTest = new BaroSelloOutput();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for (int i = 0; i <= 100; i++) {
			baroSelloTest.generateAndPrintOutput(i);
		}
	}
}
