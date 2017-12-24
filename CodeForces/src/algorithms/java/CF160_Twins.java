import java.io.*;
import java.util.*;

public class CF160_Twins {
    private void solve() {
        int n = readInt();
        int sum = 0;
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            int cur = readInt();
            A[i] = cur;
            sum += cur;
        }

        Arrays.sort(A);

        int half = sum / 2;
        int coinsTaken = 0;
        int mySum = 0;
        for (int i = 0; i < n; i++) {
            coinsTaken++;
            mySum += A[i];

            if (mySum > half)
                break;
        }

        out.println(coinsTaken);
    }

    public static void main(String[] args) {
        new CF160_Twins().run();
    }

    private void run() {
        try {
            init();
            solve();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    private void init() throws IOException {
        String filename = "";
        if (filename.isEmpty()) {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        } else {
            in = new BufferedReader(new FileReader(filename + ".in"));
            out = new PrintWriter(new FileWriter(filename + ".out"));
        }
    }

    private String readString() {
        while (!tok.hasMoreTokens()) {
            try {
                tok = new StringTokenizer(in.readLine());
            } catch (Exception e) {
                return null;
            }
        }

        return tok.nextToken();
    }

    private int readInt() {
        return Integer.parseInt(readString());
    }

    private long readLong() {
        return Long.parseLong(readString());
    }

    private double readDouble() {
        return Double.parseDouble(readString());
    }
}