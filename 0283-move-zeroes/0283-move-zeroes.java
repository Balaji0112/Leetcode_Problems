class Solution {
    public void moveZeroes(int[] arr) {
        int ptr1 = 0;
    	int ptr2 = 1;
    	
    	while(ptr2 < arr.length) {
    		if((arr[ptr1]!= 0 && arr[ptr2]!= 0) || (arr[ptr1] != 0 && arr[ptr2] == 0)) {
    			++ptr1;
    			++ptr2;
    			
    		}
    		else if(arr[ptr1]== 0 && arr[ptr2]!=0) {
    			arr[ptr1++] = arr[ptr2];
    			arr[ptr2++] = 0;
    			
    		}
    		else if(arr[ptr1] == 0 && arr[ptr2] == 0) {
    			++ptr2;
    		}
    	
    	}
    }
}