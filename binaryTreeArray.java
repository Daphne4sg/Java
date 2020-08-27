
public class binaryTreeArray {
	class Tree{
		public int data;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,level;
		int data[]= {0,6,3,5,9,7,8,4,2};
		int btree[] =new int[16];
		
		System.out.println("Original data: ");
		for(i = 1;i<9;i++){
			System.out.print("["+data[i]+"] ");
			
		}	
		System.out.println();
		for (i = 1;i<9;i++){
			for(level = 1;btree[level]!=0;){
				System.out.print(btree[level]);
				if(data[i]>btree[level]){
					level =level*2+1;
				}else{
					level = level*2;
				}
			}//if 子樹節點的值 !=0 則在與陣列內的值比較一次 
			btree[level] = data[i]; //陣列值放入binary tree 
			System.out.println();
		}
		System.out.println("Binary tree content: ");
		for(i = 1;i<16;i++){
			System.out.print("["+btree[i]+"] ");
		}
		System.out.println();
	}

}
