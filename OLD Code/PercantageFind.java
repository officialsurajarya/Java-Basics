/**
 * PercantageFind
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PercantageFind {
    public static void main(String[] args) throws IOException{
        InputStreamReader io = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(io);
        System.out.print("Enter Number Of Subject: ");
        int noOfSub = Integer.parseInt(br.readLine());
        double totalMarks = 0;
        for (int i=1; i<=noOfSub; i++) {
            System.out.print("Enter Marks for Subject " + i +" : ");
            int sub = Integer.parseInt(br.readLine());
            totalMarks = totalMarks+sub;
        }

        double percantage = (totalMarks/(noOfSub*100)*100);

        System.out.println();
        System.out.println("Total Marks : "+totalMarks);
        System.out.println("Percantage : "+percantage);

    }
}