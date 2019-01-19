import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class CF432B_FootballKit extends PrintWriter {
    public void solve() throws IOException {
        int n = readInt();
        int[][] matrix = new int[n][2];

        for (int i = 0; i < n; i++) {
            matrix[i][0] = readInt();
            matrix[i][1] = readInt();
        }

        // TODO: Time limit exceeded for big inputs

        for (int i = 0; i < n; i++) {
            // Half of games are played at home
            int home = n - 1;
            int away = 0;

            // Match with others
            for (int j = 0; j < n; j++) {
                if (j == i)
                    continue;

                // Current team is away
                if (matrix[i][1] == matrix[j][0])
                    // Matches away t-shirt with other team (home), so use home t-shirt as well
                    home++;
                else
                    away++;
            }

            println(home + " " + away);
        }
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

    CF432B_FootballKit() {
        super(System.out);
        in = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) {
        try {
            Locale.setDefault(Locale.US);
        } catch (Exception ignored) {
        }
        new CF432B_FootballKit().run();
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