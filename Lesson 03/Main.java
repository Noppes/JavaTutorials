import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Firstname:");
		String firstname = scanner.nextLine();

		System.out.println("Lastname:");
		String lastname = scanner.nextLine();

		System.out.println("Adress:");
		String adress = scanner.nextLine();

		System.out.println("City:");
		String city = scanner.nextLine();

		System.out.println("Phonenumber:");
		String phonenumber = scanner.nextLine();

		scanner.close();
		
		int error = 0;

		if(firstname.length() < 3){
			error++;
			System.err.println("Firstname was less than 3 characters");
		}
		
		if(lastname.length() < 3){
			error++;
			System.err.println("Lastname was less than 3 characters");
		}
		//first name and last name can be as long as they want. Feel free to google longest name in the world

		if(adress.length() < 3){
			error++;
			System.err.println("Adress was less than 3 characters");
		}
		else if(adress.length() > 80){ //longest adress is 72 characters long, just to be safe added 8 more
			error++;
			System.err.println("Adress was more than 80 characters");
		}
		
		if(city.length() < 3){
			error++;
			System.err.println("City was less than 3 characters");
		}
		else if(city.length() > 70){ //longest city name is 58 characters long, just to be safe added 12 more
			error++;
			System.err.println("City was more than 70 characters");
		}
		
		if(phonenumber.length() < 6){ // In the netherlands phonenumbers are not shorter than 6, might be different for yours
			error++;
			System.err.println("Phonenumber was less than 6 characters");
		}
		else if(phonenumber.length() > 13){ //In the netherlands phonenumbers are never longer than 13 numbers
			error++;
			System.err.println("Phonenumber was more than 13 characters");
		}
		 
		if(error == 0){
			System.out.println("Everything was filled out correctly");
		}

	}

}
