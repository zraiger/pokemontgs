import java.util.ArrayList;

public class battle {
	ArrayList<data> pokemon = new ArrayList <data> ();
	public void addData (data tambahData) {
		String temp;
		if (tambahData.equip.equals("Weapon"))
		{
			temp = "+ 20 Attack";
			tambahData.equipBonus = temp;
		}
		
		else if (tambahData.equip.equals("Armor")) {
			temp = "+ 15 Defense";
			tambahData.equipBonus = temp;
		}
		
		else if (tambahData.equip.equals("Vehicle")) {
			temp = "+ 30 Speed";
			tambahData.equipBonus = temp;
		}
		dataList.add(tambahData);
		System.out.println("Gandam has been built");
	}
	
}
