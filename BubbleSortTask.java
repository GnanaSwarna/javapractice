package xyz;

public class BubbleSortTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               int a[]= {1,6,8,3,5,2,4,9};
               for(int i=0;i< a.length-1;i++) {
            	   for(int j=0;j< a.length-i-1;j++) {
            		   if(a[j]>a[j+1]) {
            			  int temp=a[j];
            			  a[j]=a[j+1];
            			  a[j+1]=temp;
            		   }
            	   }
               }
               for(int student:a) {
            	   System.out.println(student);
               }
               
	}

}
