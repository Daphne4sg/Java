
public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int data[]= {6,5,9,7,2,8};
       System.out.print("Bubble sort:\n");
       System.out.print("Origin data:");
       for (int k =0;k<6;k++) {
    	   System.out.print("\t"+data[k]);
       }
       System.out.println();
       //Bubble sort
       for (int i =5;i>0;i--) {
    	   for (int j=0;j<i;j++) {
    		   if (data[j]>data[j+1]) {
    			   int temp = data[j+1];
    			   data[j+1]=data[j];
    			   data[j] = temp;
    		   }
    	   }
    	   System.out.print("第"+(6-i)+"次排序後的結果:");
    	   for (int k=0;k<6;k++) {
    		   System.out.print("\t"+data[k]);
    	   }
    	   System.out.println();
    	   
       }
       System.out.print("After sorting:");
       for (int a=0;a<6;a++) {
    	   System.out.print("\t"+data[a]);
       }
	}

}
