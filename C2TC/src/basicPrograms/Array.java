package basicPrograms;

public class Array {

	public static void main(String[] args) {
		   int[] A = {14, 12, 23, 4, 10, 7, 10, 12, 9, 14,  2, 14}; 
	        int[] B = new int[A.length]; 
	        
	        for (int i = 0; i < A.length - 1; i++) {
	            int sum = A[i] + A[i + 1];
	            if (isPrime(sum)) {
	                B[i] = A[i + 1];
	                B[i + 1] = A[i];
	            } else {
	                B[i] = A[i];
	                B[i + 1] = A[i + 1];
	            }
	        }
	        
	        for (int i = 0; i < B.length; i++) 
	            System.out.print(B[i] + " "); 
	    }
	    
	    static boolean isPrime(int n) {
	        for (int i = 2; i <= Math.sqrt(n); i++)
	            if (n % i == 0)
	                return false;
	        return true;
	}

}
