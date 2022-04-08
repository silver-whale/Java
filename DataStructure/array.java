package DataStructure;
public class array {
    int gcd(int a, int b){
        if (b==0) return a;
        else return gcd(b, a%b);
    }

    void leftRotate(int arr[], int d, int n){
        d = d%n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);

        for(i=0;i<g_c_d;i++){
            temp = arr[i];
            j=i;
            while(true){
                k = j+d;
                if(k>=n) k=k-n;
                if(k==i) break;
                arr[j] = arr[k];
                j=k;
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args){
        // int[] arr1;
        // arr1 = new int[5];
        // or
        // int[] arr2 = new int[]{1,2,3,4,5};

        int[] arr3 = m1();
        // for(int i=0; i<arr3.length; i++)
        //     System.out.println(arr3[i]);

        // Deepcopy
        int[] copyarr = arr3.clone();

        arr3[0] = 10;
        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);
            System.out.println(copyarr[i]);
        }

    }

    public static int[] m1(){
        return new int[]{1,2,3};
    }
}