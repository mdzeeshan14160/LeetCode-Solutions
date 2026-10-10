class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    void helper(int s,int n,int k,List<Integer>par){
        if(par.size()==k){
            List<Integer>temp=new ArrayList<>(par);
            ans.add(temp);
            return;
        }
        for(int i=s; i<=n ;i++){
            par.add(i);
            helper(i+1,n,k,par);
            par.remove(par.size()-1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> par = new ArrayList<>();
        helper(1, n, k, par);
        return ans;
    }
}