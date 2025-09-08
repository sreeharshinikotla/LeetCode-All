class Solution {
    public int[] getNoZeroIntegers(int n) {
        int l = 1;
        int r = n - l;

        while (containsZero(l) || containsZero(r)) {
            l++;
            r = n - l;
        }

        return new int[]{l, r};
    }

    private boolean containsZero(int num) {
        String str = Integer.toString(num);
        for (char c : str.toCharArray()) {
            if (c == '0') return true;
        }
        return false;
    }
}