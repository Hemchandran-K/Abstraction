package abstraction;

public class Automation extends MultipleLanguage {
	@Override
	public

			void Selenium() {
		System.out.println("new program");
	}

	@Override
	void ruby() {
		System.out.println("program");

	}

	@Override
	public void java() {
		System.out.println("java program");
	}

	public void python() {
		System.out.println("progarm1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation obj = new Automation();
		obj.Selenium();
		obj.java();
		obj.ruby();
		obj.python();

	}

}
