
public class BinarySearch {
	
	public int binarysearch(int [] data,int target) {
		int high,low,mid;
		low = 0;
		high = 79;
		System.out.println("Searching now...");
    	while (low<=high && target!=-1) {
    		mid = (low+high)/2;
    		if(target<data[mid]) {
    			System.out.println(target+" �����m "+(low+1)+"[\t"+data[low]+"] �Τ����� "+(mid+1)+"[\t"+data[mid]+"], �䥪�b�� ");
    			high = mid-1;
    		}else if(target>data[mid]) {
    			System.out.println(target+" ���󤤶��� "+(mid+1)+"[\t"+data[mid]+"] �Φ�m "+(high+1)+"[\t"+data[high]+"], ��k�b�� ");
    			low = mid+1;
    		}else {
    			return mid;
    		}
    	}
    	return -1;
     }
}
