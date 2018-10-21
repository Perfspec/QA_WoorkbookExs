package com.qa.PrintNums;

public class PrintNumsInRange {
	private int start;
	private int stop;
	private PrintNumbers pn;
	
	public PrintNumsInRange(int start, int stop) {
		setStart(start);
		setStop(stop);
	}
	
	public void setStart(int start) {
		this.start = start;
	}

	public void setStop(int stop) {
		this.stop = stop;
	}

	public void setPn(int x) {
		this.pn = new PrintNumbers(x);
	}

	public String printWordInts() {
		String output = new String();
		
		for(int i = start; i < stop; i++) {
			setPn(i);
			output += pn.printWordInt() + " ";
		}
		setPn(stop);
		output += pn.printWordInt();
		return output;
	}


}
