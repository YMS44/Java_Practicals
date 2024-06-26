package day2;

public class DemoArray {
	public static void main(String[] args) {
		Car[] cars = new Car[2];
		cars[0] = new Car();
		cars[1] = new Car("xyz","abc",100000,2020);
		System.out.println(cars[1].getPrice());
		
		for(Car c : cars) {
			System.out.println(c);
		}
		System.out.println("*****************************************");
		Car.swap(cars);
		System.out.println(cars[0]+"  "+cars[1]);
		
//		Wrapper Class
//		
//		String s = "30";
//		//Wrapper Class
//		Integer obj = Integer.valueOf(s);
//		System.out.println(obj);
//		int p = obj;
//		int i = Integer.parseInt(s);
//		System.out.println(i);
//		System.out.println(p);
//		int y = obj.intValue();
//		System.out.println(y);
//		
//		int a = 67;
//		Integer obje = Integer.valueOf(a);
//		Integer x = a;
//		System.out.println(x);
//		System.out.println(obje instanceof Object);
//		int z = obje;
//		System.out.println(z);
//		int z = obje.intValue();
//		System.out.println(z);
//		System.out.println(z instanceof intValue);
		
	}

}
