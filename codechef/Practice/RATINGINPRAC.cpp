// Problem: PROBLEM LINK:
// Platform: codechef
// Language: #include <bits/stdc++.h>    
using namespace std;
int main()
{
    int tc;
    cin>>tc;
    while(tc--)
    {
      int n;
      cin>>n; 
      vector<int> a(n);
      for(auto &x : a)
        cin>>x;
      vector<int> b(a);
      sort(a.begin() , a.end());
      bool sorted = true;
      for(int i = 0; i < n; i++)
      {
        if(a[i]!=b[i])
          sorted = false;
      }

      cout<<(sorted ? "Yes" : "No")<<endl;
    }
    return 0;
}
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/arrays-new/ARRAYSP01/problems/RATINGINPRAC?tab=solution
// Solved on: 2026-11-01T17:05:23.482Z

4
3
1 2 3
3
1 1 2
5
100 200 300 400 350
5
1000 2000 5000 3000 1000
