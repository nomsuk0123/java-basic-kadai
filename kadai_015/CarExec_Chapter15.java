package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[]args) {
		
		//車のインスタンス
		Car_Chapter15 car=new Car_Chapter15();
		
		int beforeGear=1;
		car.changeGear(3);
		
		System.out.println("ギアが"+beforeGear+"から3に切り替わりました");
		car.run();
	}
}
