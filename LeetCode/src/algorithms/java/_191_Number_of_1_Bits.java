// https://leetcode.com/problems/number-of-1-bits

class _191_Number_of_1_Bits {
    public int hammingWeight(int n) {
        int ones = 0;

        while (n != 0) {
            ones = ones + (n & 1);
            n = n >>> 1;
        }

        return ones;
    }
}

// We need to use bit shifting unsigned operation >>>
// (while >> depends on sign extension)

/*
In Java we need to put attention on the fact that the maximum integer is
2147483647. Integer type in Java is signed and there is no unsigned int.
So the input 2147483648 is represented in Java as -2147483648
(in java int type has a cyclic representation,
that means Integer.MAX_VALUE + 1 == Integer.MIN_VALUE).

This force us to use

    n != 0

in the while condition and we cannot use

    n > 0

because the input 2147483648 would correspond to -2147483648 in java
and the code would not enter the while if the condition is n > 0 for n=2147483648.
*/

// O(1)