package tech.strategio;

import java.util.*;

public class E01 {
    public int getNthFib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        int prev1 = 0;
        int prev2 = 1;
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }
}

