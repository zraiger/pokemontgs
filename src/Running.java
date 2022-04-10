import java.util.Scanner;

public class Running {
	battle listData = new battle();
	
	public void proses(int pilihan) {
		switch (pilihan) {
		case 1: inputData();
		break;
		case 2: showData();
		break;
		case 3: deleteData();
		}
	}
	
	public void inputData() {
		data name = new data();
		Scanner sc = new Scanner (System.in);
		sc.nextLine();
		while (name.name.length() > 20 && name.name.length() < 5) {
			System.out.println("Gandam name [5-20 Characters]:");
			name.name = sc.nextLine();
		}
		while (!name.grade.equals("SD") && !name.grade.equals("HG") && !name.grade.equals("MG") && !name.grade.equals("PG")) {
			System.out.println("Gandam Grade [SD | HG | MG | PG]:");
			name.grade = sc.nextLine();
		}
		
		while (!name.equip.equals("Weapon") && !name.equip.equals("Armor") && !name.equip.equals("Vehicle")) {
			System.out.println("Equipment Type [Weapon | Armor | Vehicle]:");
			name.equip = sc.nextLine();
		}
		listData.addData(name);
		
	}
	
	public void showData(){
		listData.showData();
	}
	
	public void deleteData() {
		Scanner sc = new Scanner(System.in);
		int pilihan = 0;
		System.out.println("Input Data number to be deleted:");
		pilihan = sc.nextInt();
		listData.deleteData(pilihan);
	}
}
