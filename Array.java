//1D Array example, 2D Array example, Staggered
public class Array extends Structure{
	public String[][] thisArray = new String[10][10];
	String animal;
	int i;
	int j;
	void run() {
		for(i=0; i<10; i++) {
			for (j=0; j<10; j++){
				thisArray[i][j] = animal;
			}
		}
		System.out.print(thisArray[i][j]);
	}
}
