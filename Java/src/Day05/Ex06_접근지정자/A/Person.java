package Day05.Ex06_접근지정자.A;

public class Person {

	// 변수 : 이름, 나이, 키, 체중
		public String name;
		protected int age;
		int height;
		private int weight;
		
		public Person(String name, int age, int height, int weight) {
			this.name = name;
			this.age = age;
			this.height = height;
			this.weight = weight;
		}
		
		
		public Person() {
		}
		
	
		
		// - 기본 생성자
		// - 모든 매개변수 생성자
		
		// getter, setter
		// toString
	}

