public class Main {

	public abstract class Figure{
		public int[] Points;
		public Figure(int[] pts)
		{
			Points = pts;
		}
		abstract int Square();
	}
	public class Triangle extends Figure{

		public Triangle(int[] pts) {
			super(pts);
			// TODO Auto-generated constructor stub
		}

		@Override
		public int Square() {
			// TODO Auto-generated method stub
			return 0;
		}}
	public static void main(String[] args) {
		class T {
			public void print() {
				System.out.println("first appearence");
			}
		}
		T t = new T() {
			public void print() {
				
				System.out.println(getNeededString("updated method"));
			}
			public String getNeededString(String s)
			{
				return s;
			}
			
		};
		t.print();

	}
}
