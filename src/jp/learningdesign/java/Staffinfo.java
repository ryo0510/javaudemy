package jp.learningdesign.java;

class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.println("Hello " + this.name);
	}

	public Staff(String name, int staffid, String email) {
		super();
		this.name = name;
		this.staffid = staffid;
		this.email = email;
	}
	
}

public class Staffinfo {

	public static void main(String[] args) {
		Staff yamada = new Staff("Taro Yamada",12345,"yamada@gmail.com");
		// yamada.name = "Taro Yamada";
		
		yamada.sayhello();
		
		// System.out.println(yamada.name);

	}

}
