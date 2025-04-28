class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> doubl= new HashSet<>();
        HashSet<Integer> half= new HashSet<>();
        for(int i=0; i< arr.length; i++){
            if(doubl.contains(arr[i]) || half.contains(arr[i])) return true;
            else{
                doubl.add(arr[i]*2);
               if(arr[i]%2==0) half.add(arr[i]/2);
            }
        }
        return false;
    }
}