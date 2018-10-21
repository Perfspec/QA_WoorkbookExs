package com.qa.CountLettersInWordNums;

public class CountWordNumsIn {
	private int start;
	private int stop;
	private CountWordNumbers cwn;
	
	public CountWordNumsIn(int start, int stop) {
		if(start < stop) {
			setStart(start);
			setStop(stop);
		} else {
			setStart(1);
			setStop(2);
			System.out.println("Warning: start >= stop");
			System.out.println("Only counting \"one two \"");
		}
	}
	
	public void setStart(int start) {
		this.start = start;
	}

	public void setStop(int stop) {
		this.stop = stop;
	}

	public void setCwn(int x) {
		this.cwn = new CountWordNumbers(x);
	}

	public int total() {
		int output = 0;
		
		for(int i = start; i < stop; i++) {
			setCwn(i);
			output = cwn.countWordNum(output);
		}
		setCwn(stop);
		output = cwn.countWordNum(output);
		return output;
	}

}
