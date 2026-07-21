class Solution {
public:
    vector<string> commonChars(vector<string>& words) {
        int n=words.size();
        
        vector<int>minfreq(26,INT_MAX);
        for(int i=0;i<n;i++)
        {
            vector<int>temp(26,0);
            for(char ch:words[i])
            {
                temp[ch-'a']++;
            }
            for(int i=0;i<26;i++)
            {
                minfreq[i]=min(minfreq[i],temp[i]);
            }
        }
        vector<string>ans;
        for(int i=0;i<26;i++)
        {
            while(minfreq[i]>0)
            {
                ans.emplace_back(string(1,(char)(i+'a')));
                minfreq[i]--;
            }
        }

        return ans;
    }
};