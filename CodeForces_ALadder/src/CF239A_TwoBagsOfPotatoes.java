import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class CF239A_TwoBagsOfPotatoes extends PrintWriter {
    public void solve() throws IOException {
        int y = readInt();
        int k = readInt();
        int n = readInt();

        if (y >= n) {
            // x cannot be 0
            println(-1);
            return;
        }

        int ground = k;
        while (ground < y) {
            ground += k;
        }
        ground -= y;

        boolean valid = false;
        for (int x = ground; x + y <= n; x += k) {
            print(x + " ");
            valid = true;
        }

        if (!valid)
            println(-1);
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

    CF239A_TwoBagsOfPotatoes() throws IOException {
        super(System.out);
        in = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) throws IOException {
        try {
            Locale.setDefault(Locale.US);
        } catch (Exception ignored) {
        }
        new CF239A_TwoBagsOfPotatoes().run();
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
