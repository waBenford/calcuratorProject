public class Process {
	private double totalResult = 0;
	private double currentNum = 0;
	private String currentOp = "+";
	
	public String getCurrentOp() { return currentOp; }

	//Override
	public void input(int num) {
		this.currentNum = num;
	}

	//Override
	public void input(String sign) {
		this.currentOp = sign;
	}

	public void operate() {
		switch(currentOp) {
			case "+" : totalResult += currentNum; break;
	
			case "-" : totalResult -= currentNum; break;

			case "*" : totalResult *= currentNum; break;
	
			case "%" : totalResult %= currentNum; break;

			
		}
		
		currentNum = 0;
	}

	public double getFinalResult() {
		return totalResult;
	}
}
