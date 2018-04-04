import java.util.Arrays;

public class Main {
    private static void print(Object obj) {
        if (obj instanceof int[]) {
            print(Arrays.toString((int[]) obj));
            return;
        }
        if (obj instanceof String[]) {
            print(Arrays.toString((String[]) obj));
            return;
        }

        System.out.println(obj.toString());
    }

    public static void main(String[] args) {
        // Already interviewed:

        // Arr_IndexAndElement_Equal
        // Array_of_Array_Products
        // Quad_Combination
        // Flatten_Dictionary
        // Getting_Diff_Number
        // Merge_Packages
        // K_Messed_Array_Sort

        // Reviewed:

        // BST_Successor // TODO: Review
        // Budget_Cuts.main();
        // Busiest_Time bt = new Busiest_Time();
        // bt.main();
        // Deletion_Distance.main(); // TODO: Review! Cool solution / Review Optimized
        // Drone_Flight_Planner planner = new Drone_Flight_Planner();
        // planner.main();
        // H_Tree
        // Island_Count.main();
        // Isomorphic_Evaluator.main();

        // To review:
        // Sentence_Reverse
        // Meeting_Planner
        // Number_Of_Paths
        // Pairs_With_Difference
        // Shifted_Array_Search
        // Word_Count_Engine

        // Min_Sub_String // Smallest_Substring
        // BasicRegexParser.main(args);
        // Sudoku_Solver
    }
}