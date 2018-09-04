package sort;

public class ShellSort {
//ϣ��������ֱ�Ӳ��������һ�����壬��ȱ��(ʱ�临�Ӷ�Ϊn*logn)
	public static void shellSort(int []array){
		
		int j = 0,gap = array.length;
		while(gap>0){
			gap = gap/2;
			for(int i=gap;i<array.length;i++){
				if(array[i-gap]>array[i]){
					int temp = array[i];
					for( j=i-gap;j>=0 && array[j]>temp;j-=gap){
						array[j+gap] = array[j];
					}
						array[j+gap] = temp;
						
				}
			}
		}
	}
	public static void main(String[] args) {
		int []array = {3,4,6,1,7,0,3,2,8,0};
		shellSort(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
		
	}
}
