import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		Ui UiDisplay = new Ui();
		UiDisplay.display();
		
		Process process = new Process();
		String inp = "";
		while( !inp.equals( "=" ) ) {
			inp = getValue.nextLine();
			process.opelate();
			
			if ( !inp.equals( "=" ) ) {
				process.input( inp );
			}
		}
		
		Display display = new Display();
		display.total();
	}

}