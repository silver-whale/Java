package DataStructure;
import java.util.Scanner;
import java.util.Vector;

public class moist {
    // 앞에 있는지 뒤에 있는지만 확인하면 됨
    public int calculate(){
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

    
        Vector<Integer> answer = new Vector<Integer>();


        for(int i=0; i<testCase; i++){
            int n = sc.nextInt();
            int count = 0;
            String[] cards = new String[100];
            
            sc.nextLine();
            for(int j=0; j<n; j++){
                String c = sc.nextLine();
                cards[j] = c;
            }
            String last = cards[0];
            for(int j=1; j<n; j++){
                if (last.compareTo(cards[j]) > 0){
                    count++;
                }
                else{
                    last = cards[j];
                }
            }
            answer.add(count);
        }

        for(int i=0; i<testCase; i++){
            System.out.println("Case #" + (i+1) + ": " + answer.get(i));
        }

        sc.close();
        
    }
}
