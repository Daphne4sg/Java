
public class collisionLinear {
	final int INDEXBOX = 10;
	final int MAXNUM = 7;	
	
	public void printData(int []data, int max) {
		System.out.print("\t");
		for(int t =0;t<max;t++) {
			System.out.print("[  "+data[t]+" ] ");
		}
		System.out.println();
	}
	public void createTable(int num, int []index) {
		int temp;
		temp = num % INDEXBOX;
		while(true) {
			if(index[temp] == -1) {
				index[temp] = num;
				break;
			}else {
				temp = (temp+1) % INDEXBOX;
			}
		}
	}
	

};
