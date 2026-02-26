package com.learning.assignments.gameselling;
import java.util.*;
public class DigitalcomProcess {
	static void displayMenu() {
		System.out.println("====================");
		System.out.println("Main Menu Choices: ");
		System.out.println("1.Register User");
		System.out.println("2.View Games");
		System.out.println("3. Search By Name");
		System.out.println("4. Exit");
		System.out.println("====================");
	}
	static boolean Authenticate(User user) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String userid = sc.nextLine();
		System.out.println("Enter your password:");
		String password = sc.nextLine();
		if(user.IsAuthenticated(User.addUser(userid, password))) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Boolean cont = true;
		Scanner sc = new Scanner(System.in);
		User user = User.addUser("", "");
		while(cont) {
			displayMenu();
			int ch = sc.nextInt();
			sc.nextLine();
			switch(ch) {
				case 1: System.out.println("Enter Details:");
					System.out.println("Name:");
					String userId = sc.nextLine();
					System.out.println("Password:");
					String pass = sc.nextLine();
					
					System.out.println("Creating User");
					user = User.addUser(userId, pass);
					System.out.println("done");
						
					break;
				case 2: if(Authenticate(user)) {
						for(Game g : new GameService().viewAll()) {
							System.out.println(g);
						}
					}else {
						System.out.println("Not Authenticated");
					}
					break;
				case 3: if(Authenticate(user)) {
						System.out.println("Enter Author Name:");
						String auth = sc.nextLine();
						System.out.println(new GameService().authorSearch(auth));
					}else {
						System.out.println("Not Authenticated");
					}
					break;
				case 4:
					System.out.println("Terminate");
					cont = false;
					break;
				default: System.out.println("Wrong input...enter something between 1-4");
					break;
			}
		}
	}
}
