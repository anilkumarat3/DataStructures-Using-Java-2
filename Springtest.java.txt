package testSpring;

public class Springtest {
	private String Name;
	private String Message;

	public void getName() {
		System.out.println("Entered Name is-->" + Name);
	}

	public void setName(String name) {
		Name = name;
	}

	public void getMessage() {
		System.out.println("Your Messages are-->" + Message);
	}

	public void setMessage(String message) {
		Message = message;
	}

}
