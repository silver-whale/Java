package DataStructure;
import java.util.Scanner;
import java.util.Vector;

public class captainHammer {
    public static void main(String[] args){
        Vector<Double> answer = new Vector<Double>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            int v = sc.nextInt();
            int d = sc.nextInt();

            double ans = 90* Math.asin(9.8* d / Math.pow(v, 2)) / Math.PI;

            answer.add(ans);          
        }

        for(int i=0; i<answer.size(); i++)
            System.out.printf("Case #"+(i+1)+": "+"%.7f\n",answer.get(i));

        sc.close();
    }
}

// WA
