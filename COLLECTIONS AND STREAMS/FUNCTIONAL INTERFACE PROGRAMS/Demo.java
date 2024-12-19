import java.util.Scanner;

class Source {
    public static int[] mergeBothInDescendingOrder ( int s1[] , int s2[])
    {
        int s3[] = new int[s1.length + s2.length];
        int i,j,k;
        i=s1.length-1;
        j=s2.length-1;
        k=0;
        while ( i>=0 && j>=0)
        {
            if ( s1[i]>s2[j])
            {
                s3[k++] = s1[i--];
            }
            else 
            s3[k++] = s2[j--];
        }
        while ( i>=0)
                s3[k++] = s1[i--];
        while ( j>=0)
                s3[k++] = s2[j--];
                
        return s3;
        
    }
    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of First Array");
        int sizeArray1 = scanner.nextInt();
        System.out.println("Enter  First Array");
        int sortedArray1[] = getArrayInput(sizeArray1, scanner);
        System.out.println("Enter Size of Second Array");
        int sizeArray2 = scanner.nextInt();
        System.out.println("Enter Second Array");
        int sortedArray2[] = getArrayInput(sizeArray2, scanner);
        
        int descendingMerge[]=mergeBothInDescendingOrder(sortedArray1, sortedArray2);
        
       for ( int x : descendingMerge)
       System.out.println(x);
        
    }
    
    public static int[] getArrayInput(int sizeArray, Scanner scanner){
        
    int[] array = new int[sizeArray];
        
        for(int i = 0; i < sizeArray; i++)  
        {  
            array[i]=scanner.nextInt();  
        }
        
        return array;
    }
}
