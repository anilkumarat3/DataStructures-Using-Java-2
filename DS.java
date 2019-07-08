
public class DS {
	public static void main(String args[]) {
      System.out.println("Inside Main");
      int[] arr=new int[]{1,2,3,5,6,7,8,10};
  /*    for(int i=0;i<arr.length-1;i++){
    	  int temp=arr[i]+1;
    	  if(arr[i+1]!=temp){
    		  System.out.println("Missing Element is--->"+temp);
    		  continue;
    	  }
      }*/
   /*   for(int rt=0;rt<1;rt++){
    	  int temp=arr[arr.length-1];
    	  for(int i=arr.length-1;i>0;i--){
    		  arr[i]=arr[i-1];
    	  }
    	  arr[0]=temp;
      }*/
      //Reverse An Array
    	  int start=0; int end=arr.length-1;
    	  while(start<end){
    		  int temp=arr[start];
    		  arr[start]=arr[end];
    		  arr[end]=temp;
    		  start++;
    		  end--;
    		  
    	  }
      
      System.out.println("rotated Array is:");
      for(int j=0;j<arr.length;j++){
    	  System.out.print(arr[j]+" ");
      }
	}

}
