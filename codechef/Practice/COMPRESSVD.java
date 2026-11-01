// Problem: PROBLEM LINK:
// Platform: codechef
// Language: import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] frames = new int[n];
            for (int i = 0; i < n; i++) {
                frames[i] = scanner.nextInt();
            }

            int minFrames = n;
            for (int i = 0; i < n - 1; i++) {
                if (frames[i] == frames[i + 1]) {
                    minFrames--;
                }
            }

            System.out.println(minFrames);
        }
        scanner.close();
    }
}
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/arrays-new/ARRAYSP01/problems/COMPRESSVD?tab=solution
// Solved on: 2026-11-01T17:13:07.525Z

4
1
5
2
1 1
3
1 2 3
4
2 1 2 2
