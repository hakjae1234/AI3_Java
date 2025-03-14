package Ex06_접근지정자;

public class Manager {

	public static void main(String[] args) {
		Student student = new Student();
		student.defaultSetting();
		System.out.println("name : " + student.name);
		// * 접근지정자는 선언한 클래스를 기준으로 적용된다.
		// 같은 패키지인 Manager 클래스에서 Student 클래스의
		// age(protected), height(default) 를 접근할 수 없는 이유?
		// - 실질적으로 선언은 Person 클래스로, 다른 패키지 이기 때문에 접근 불가
		
		Person person = new Person();
		System.out.println("name : " + person.name);
		System.out.println("age : " + student.getage);
		System.out.println("height : " + student.getWeight());
		System.out.println("weight : " + student.getWeight());

	}

}
