import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OddEvenMedian {
    public static void main(String[] args){
        // INPUT [uncomment & modify if required]

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A [] = new int[N];

        for(int i=0; i<N; i++) A[i] = sc.nextInt();
        // OUTPUT [uncomment & modify if required]

        System.out.print(OddEven(N,A));

        sc.close();

    }

    public static int OddEven(int N, int A[]){
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        Arrays.sort(A);
        for(int num: A){
           if (num%2==0) even.add(num);
           else odd.add(num);
        }
        return getMedian(odd) + getMedian(even);

    }

    public static int getMedian(ArrayList<Integer> input){
        if (input.isEmpty()) return 0;
        //this looks cool, but readable code is best practice
        return input.size()%2 == 0 ? (input.get(input.size()/2)+input.get((input.size()/2)-1))/2 : input.get(input.size()/2);
    }


}
