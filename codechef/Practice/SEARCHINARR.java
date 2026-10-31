// Problem: SEARCHINARR
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/arrays-new/ARRAYSP01/problems/SEARCHINARR
// Solved on: 2026-10-31T18:46:27.581Z

public static String solve(int N, int X, int[] A) {
        for (int i = 0 ; i < N ; i++)
        {
            if ( A[i]==X )
            return "YES";
        }
        return "NO";
}