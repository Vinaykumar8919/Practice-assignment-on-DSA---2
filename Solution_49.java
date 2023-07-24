import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution{
    private List<List<Integer>> combinations;
    private List<Integer> currentCombination;
    private int[] candidates;

    public List<List<Integer>> combinationSum(int[] candidates, int target){
        this.combinations = new ArrayList<>();
        this.currentCombination = new ArrayList<>();
        Arrays.sort(candidates);
        this.candidates = candidates;
        
        this.search(target, 0);

        return this.combinations;
    }

    private void search(int target, int startIndex){
        if (target == 0){
            this.combinations.add(new ArrayList<>(this.currentCombination));
            return;
        }
 
        for (int i = startIndex; i < this.candidates.length; i++){
            if (this.candidates[i] > target) return;

            this.currentCombination.add(this.candidates[i]);
            this.search(target - this.candidates[i], i);
            this.currentCombination.remove(this.currentCombination.size() - 1);
        }
    }
}