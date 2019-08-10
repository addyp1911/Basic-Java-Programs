package practice;

public class Prime {

	
	
	public static void main(String[] args) {

		int[][] nums2d = {{0,1,2},{3,4,5},{6,7,8}};
	    int[] nums1d = new int[9];

	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            int index = i * 3 + j;
	            nums1d[index] = nums2d[i][j];
	        }
	    }
	    for(int i=0;i<nums1d.length;i++) {
	    	System.out.println(nums1d[i]);
	    }

	}
	
	
	
	
}
