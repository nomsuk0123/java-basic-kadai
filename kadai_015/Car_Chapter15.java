package kadai_015;

public class Car_Chapter15 {
	private int gear=1;
    private int speed=10;
	
    public int changeGear(void afterGear) {
    	gear=afterGear;
    	
    	switch(gear){
    		case1 -> speed=10;
    		case2 -> speed=20;
    		case3 -> speed=30;
    		case4 -> speed=40;
    		case5 -> speed=50;
    		default-> speed10;
    		
    	}
    	return speed;	
    }
    public void run () {
    	System.out.println("速度は時速"+speed+"kmです");
    }
}

