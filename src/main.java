import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pilihan = 0;
		System.out.println("POKEMON BATTLE");
		System.out.println("Professor Oak:");
		System.out.println("Hello Traveler! Welcome to the world of POKEMON! oh no, it looks like you don't have a pokemon yet. Let me hook you up.");
		System.out.println("Please choose between these three starter pokemons.");
		System.out.println("1. Charmander");
		System.out.println("2. Squirtle");
		System.out.println("3. Bulbasaur");
		Scanner sc = new Scanner(System.in);
		pilihan = sc.nextInt();
		switch (pilihan) {
		case 1:
			int pilihan2 = 0;
			System.out.println("Are you sure you're going with Charmander?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			pilihan2 = sc.nextInt();
			if (pilihan2 == 2) {
				break;
			}
			else {
				System.out.println("Professor Oak:");
				System.out.println("Congratulations on your first pokemon! Please take care of him and may you have a great adventure ahead!");
			}
			break;
			
		case 2:
			int pilihan3 = 0;
			System.out.println("Are you sure you're going with Squirtle?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			pilihan3 = sc.nextInt();
			if (pilihan3 == 2) break;
			else {
				System.out.println("Professor Oak:");
				System.out.println("Congratulations on your first pokemon! Please take care of him and may you have a great adventure ahead!");
			}
			break;
			
		case 3:
			int pilihan4 = 0;
			System.out.println("Are you sure you're going with Bulbasaur?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			pilihan4 = sc.nextInt();
			if (pilihan4 == 2) break;
			else {
				System.out.println("Professor Oak:");
				System.out.println("Congratulations on your first pokemon! Please take care of him and may you have a great adventure ahead!");
			}
			
		}
		
		
	}

}
