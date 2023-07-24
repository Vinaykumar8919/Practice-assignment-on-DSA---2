class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> lst= new ArrayList<List<String>>();
        int n=strs.length;
        int count[][]=new int[n][26];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<strs[i].length();j++)
            {
                count[i][strs[i].charAt(j)-'a']++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(count[i][0]==-1)
              continue;
              
            List<String> tmp = new ArrayList<String>();
             tmp.add(strs[i]);
            for(int j=i+1;j<n;j++)
            {
                if(count[j][0]==-1)
                  continue;
                  
                int k=0;
                while(k<26)
                {
                    if(count[i][k]!=count[j][k])
                    {
                        break;
                    }
                    k++;
                }
                if(k==26)
                {
                  tmp.add(strs[j]);
                  count[j][0]=-1;
                }
            }

            lst.add(tmp);

        }

        return lst;
    }
}