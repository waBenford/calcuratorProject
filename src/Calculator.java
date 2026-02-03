import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		Display display = new Display();
		
		Ui UiDisplay = new Ui();
		UiDisplay.display();
		
		Process process = new Process();
		int num;
		String sing = "";
		while( !sing.equals( "=" ) ) {
			if( getValue.hasNextInt() ) {
				num = getValue.nextInt();
				process.input( num );
				display.operate();
			}else {
				sing = getValue.next();
				
				if( !sing.equals( "=" ) ) {
					process.input( sing );
					display.operate();
				}
			}
		}
		
		display.total();
	}

}