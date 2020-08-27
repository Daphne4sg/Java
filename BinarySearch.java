
public class BinarySearch {
	
	public int binarysearch(int [] data,int target) {
		int high,low,mid;
		low = 0;
		high = 79;
		System.out.println("Searching now...");
    	while (low<=high && target!=-1) {
    		mid = (low+high)/2;
    		if(target<data[mid]) {
    			System.out.println(target+" 介於位置 "+(low+1)+"[\t"+data[low]+"] 及中間值 "+(mid+1)+"[\t"+data[mid]+"], 找左半邊 ");
    			high = mid-1;
    		}else if(target>data[mid]) {
    			System.out.println(target+" 介於中間值 "+(mid+1)+"[\t"+data[mid]+"] 及位置 "+(high+1)+"[\t"+data[high]+"], 找右半邊 ");
    			low = mid+1;
    		}else {
    			return mid;
    		}
    	}
    	return -1;
     }
}
