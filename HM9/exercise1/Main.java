package domain.hcl.homeworks.HM9.exercise1;

interface returningX_Y{
	int returningXAndY(int x, int y);
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		returningX_Y r = (int x, int y) -> x*y;
		System.out.println(r.returningXAndY(3,5));

	}

}
