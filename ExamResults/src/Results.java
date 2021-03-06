
public class Results {
	
	double physics;
	double chemistry;
	double biology;
	double total;
	double percentage;
	
	
	public void displayMarks() {
		System.out.println("Biology  : " + biology + "/150");
		System.out.println("Chemistry: " + chemistry + "/150");
		System.out.println("Physics  : " + physics + "/150");
		
		total = physics + chemistry + biology;
		System.out.println("Total    : " + total + "/450");
		
	}

	public void percentageOverall() {
		boolean canPass = true;
		int passedSubjects = 0;
		
		percentage = total/4.5;
		System.out.println("% Overall: " + percentage);
		if (percentage < 60) {
			canPass = false;
		} else { 
			if (physics < 90) {
				canPass = false;
			} else {
				passedSubjects++;
			}
			if (chemistry < 90) {
				canPass = false;
			} else {
				passedSubjects++;
			}
			if (biology < 90) {
				canPass = false;
			} else {
				passedSubjects++;
			}
		}
		if (canPass) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		System.out.println("Passed   : " + passedSubjects + "/3");
	}
}
