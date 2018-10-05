import java.util.List;

public interface IObservable {
	public void register(IObserver obs);
	public void delete(IObserver obs);
	public List<String>[]  getQuestionAndAnswers();
	public void setQuestion(String s);
	public void notifyStudents();
	
}
