import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'countOptions' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER people
     *  2. INTEGER groups
     */

    public static long countOptions(int people, int groups) {
    // Write your code here
    if(people<groups){
        return 0;
        
    }
        long[][] dp = new long[people+1][groups+1];
        for(int i=1; i<=people; i++){
            dp[i][1]=1;
        }
        dp[0][0]=1;
        for(int i=1; i<=people; i++){
            for(int j=2; j<=groups; j++){
                if(i>=j)
                dp[i][j]=dp[i-j][j]+dp[i-1][j-1];
                else
                dp[i][j]=dp[i-1][j-1];
            }
            }
            return dp[people][groups];
}
}

public class Group {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int people = Integer.parseInt(bufferedReader.readLine().trim());

        int groups = Integer.parseInt(bufferedReader.readLine().trim());

        long result = Result.countOptions(people, groups);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}