
import java.util.Observable;
import java.util.Scanner;

public class Students implements IObserver {
	 private String name;
	 private IObservable teacher;

	public Students(IObservable teacher, String name) {
		// TODO Auto-generateId constructor stub
		 this.teacher = teacher;
		 teacher.register(this);
		 this.name = name;
		 
	}

	@Override
	public void update(int size) {
		// TODO Auto-generated method stub
		 for(int i=0;i<size;i++) {
			 System.out.println("Question "+i+" " + teacher.getQuestionAndAnswers()[0].get(i));  
			 System.out.println("Answers " + teacher.getQuestionAndAnswers()[1].get(i));  
		 }
		
	}

	@Override
	public void askQuestion(String s) {
		// TODO Auto-generated method stub
		teacher.setQuestion(s + " by " + name);
		
	}

}
