package vn.smartdev.demo_bean_scopes;

public class HelloSpring {

	private String message;

	public void getMessage() {
		System.out.println("You message : "+message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
