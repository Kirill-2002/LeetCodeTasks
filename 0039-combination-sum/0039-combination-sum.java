class Solution {

    private void backtrack(int[] candidates, int remaining, int start,
                           List<Integer> current,
                           List<List<Integer>> result) {
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            int val = candidates[i];
            if (remaining - val >= 0) {
                current.add(val);
                backtrack(candidates, remaining - val, i, current, result);
                current.remove(current.size() - 1); 
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(candidates, target, 0, current, result);
        return result;
    }
}