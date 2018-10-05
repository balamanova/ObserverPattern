import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class JavaElective1 implements IObservable {
	
	   private List<IObserver> students = new ArrayList<IObserver>();
	   public List<String> questions = new ArrayList<String>();
	   public List<String> answers = new ArrayList<String>();
	   public List<String>[] questionWithAnswers = new List[2];
	   private int n=0;
	
	@Override
	public void register(IObserver obs) {
		// TODO Auto-generated method stub
		if(students.size() <=5) {
			students.add(obs);
			System.out.println("New Student was added");
		}
			 
		else 
			System.out.println("Sorry, but the course students is full");
		
	}

	@Override
	public void delete(IObserver obs) {
		// TODO Auto-generated method stub
		students.remove(obs);
	}
	
	@Override
	public void setQuestion(String s) {
		// TODO Auto-generated method stub
		n++;
		questions.add(s );
		askQuestion(s);
	}
	
	private void askQuestion(String s){
		System.out.println(s);
		Scanner scan = new Scanner(System.in);
		answers.add(scan.nextLine());
		questionWithAnswers[0] = questions;
		questionWithAnswers[1] = answers;
		notifyStudents();
	}
	
	@Override
	public void notifyStudents() {
		// TODO Auto-generated method stub
		for(IObserver obs: students){
			obs.update(n);
		}
		
	}

	public List<String>[] getQuestionAndAnswers() {

		return questionWithAnswers;		
	}

}
