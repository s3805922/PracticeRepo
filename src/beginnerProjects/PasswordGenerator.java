package beginnerProjects;

public class PasswordGenerator {

	public static void main(String[] args) {
		System.out.println("Creating password...");		 

		int max = 90;
		int min = 65;
		String pass = "";

		for (int i = 0; i<10; i++) {
			double numbDoub = Math.random()* (max - min + 1) + min;
			int numb = (int) numbDoub;
			System.out.println("Number: " + numb );
			char a = (char)numb;
			pass = pass + a;
			//bon
		}
	 

		System.out.println(pass);

	}

}
