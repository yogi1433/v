interface Nike{
	void shoes();
}
interface Puma extends Nike{
	void bags();
}
public class Rajoutlet implements Puma  {
	public void shoes(){
		System.out.println("Super shoes");
		
	}
	public void bags(){
		System.out.println("Super bags");
	}
	public static void main(String[] args) {
		Rajoutlet r1=new Rajoutlet();
		r1.shoes();
		r1.bags();
	}

}
