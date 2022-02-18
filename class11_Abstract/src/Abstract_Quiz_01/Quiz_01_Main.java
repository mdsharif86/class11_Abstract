package Abstract_Quiz_01;

public class Quiz_01_Main {

	public static void main(String[] args) {
		Find_Max_Min_Equal obj1;
		obj1 = new Find_Max_Min_Equal();
		//obj1 = new Find_Max_Min_Equal(20, 30);
		obj1.a = 20;
		obj1.b = 30;
		obj1.max_Min_Equal_Value();
	}
}