public class Process {
	private double totalResult = 0;
	private double currentNum = 0;
	private String currentOp = "+";

	//Override
	public void input(int num) {
		this.currentNum = num;
		currentNum = num;
		if(totalResult == 0 && currentOp.equals("+")) {
			totalResult = currentNum;
		}
	}

	//Override
	public void input(String sing) {
		this.currentOp = sing;
	}

	public void operate() {
		switch(currentOp) {
			case "+" : totalResult += currentNum; break;

			case "-" : totalResult -= currentNum; break;

			case "*" : totalResult *= currentNum; break;

			case "/" : 
			    if(currentNum != 0) totalResult /= currentNum;
				else System.out.println("Error! : cannot divide by zero.");
				break;
		    case "%" : totalResult %= currentNum; break;
		}
		currentNum = 0;
	}

	public double getFinalResult() {
		return totalResult;
	}
}
