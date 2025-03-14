package Day05.Ex04_상속;

public class Jiwoo {

	public static void main(String[] args) {
		Day05.Ex04_상속.pikachu pikachu = new Pikachu();
		pikachu.energy = 100;
		pikachu.type = "전기";
		
		System.out.println("::::피카츄::::");
		System.out.println("에너지 : " + pikachu.energy);
		System.out.println("타입 : " + pikachu.type);
		System.out.println("공격A : "pikachu.aAttack()));
		System.out.println("공격B : ");
		
		Raichu raichu20 = new Pikachu(150, "진화")
				
				System.out.println("::::라이츄 (Lv.20) ::::");
		System.out.println("에너지 : " + raichu.energy);
		System.out.println("타입 : " + raichu.type);
		System.out.println("공격A : " + raichu.aAttack());
		System.out.println("공격B : " + raichu.bAttack);
		

	}

}
