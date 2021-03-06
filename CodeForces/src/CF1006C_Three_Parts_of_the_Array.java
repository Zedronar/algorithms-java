import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class CF1006C_Three_Parts_of_the_Array extends PrintWriter {
    public void solve() throws IOException {
        int n = readInt();
        int[] A = readIntArray(n);

        int l = 0, r = n - 1;
        long lSum = A[l], rSum = A[r];
        long sum = 0;
        while (l < r) {
            if (lSum == rSum) {
                sum = lSum;
                l++;
                lSum += A[l];
            } else if (lSum < rSum) {
                l++;
                lSum += A[l];
            } else { // lSum > rSum
                r--;
                rSum += A[r];
            }
        }

        println(sum);
    }

    BufferedReader in;
    StringTokenizer stok;

    public void run() {
        try {
            solve();
            close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(abs(-1));
        }
    }

    CF1006C_Three_Parts_of_the_Array() throws IOException {
        super(System.out);
        in = new BufferedReader(new InputStreamReader(System.in));
    }

    CF1006C_Three_Parts_of_the_Array(String s) throws IOException {
        super("".equals(s) ? "output.txt" : (s + ".out"));
        in = new BufferedReader(new FileReader("".equals(s) ? "input.txt" : (s + ".in")));
    }

    public static void main(String[] args) throws IOException {
        try {
            Locale.setDefault(Locale.US);
        } catch (Exception ignored) {
        }
        new CF1006C_Three_Parts_of_the_Array().run();
    }

    String read() throws IOException {
        while (stok == null || !stok.hasMoreTokens()) {
            String s = in.readLine();
            if (s == null) {
                return null;
            }
            stok = new StringTokenizer(s);
        }
        return stok.nextToken();
    }

    int readInt() throws IOException {
        return Integer.parseInt(read());
    }

    long readLong() throws IOException {
        return Long.parseLong(read());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(read());
    }

    int[] readIntArray(int len) throws IOException {
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = readInt();
        }
        return a;
    }

    <T> List<T>[] createAdjacencyList(int countVertex) {
        List<T>[] res = new List[countVertex];
        for (int i = 0; i < countVertex; i++) {
            res[i] = new ArrayList<T>();
        }
        return res;
    }
}