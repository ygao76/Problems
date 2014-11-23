public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,ArrayList<Integer>> valuesToIndices = new HashMap<Integer,ArrayList<Integer>>();
        for(int i=0;i<numbers.length;i++){
            if(valuesToIndices.get(numbers[i])==null){
                ArrayList<Integer> array = new ArrayList<Integer>();
                array.add(i+1);
                valuesToIndices.put(numbers[i],array);
            }else{
                ArrayList<Integer> array = valuesToIndices.get(numbers[i]);
                array.add(i+1);
                valuesToIndices.put(numbers[i],array);
            }
        }
        for(Map.Entry<Integer,ArrayList<Integer>> entry: valuesToIndices.entrySet()){
            Integer value = entry.getKey();
            if(valuesToIndices.get(target-value) !=null){
                ArrayList<Integer> array = values.get(target-value);
                if(array.size()==1){
                    if(valuesToIndices.get(value).get(0)> array.get(0)){
                       return new int[]{array.get(0),valuesToIndices.get(value).get(0)} 
                    }
                    return new int[]{valuesToIndices.get(value).get(0),array.get(0)}
                }else{
                    return new int[]{array.get(0),array.get(1)};
                }
            }
        }
        return null;
    }
}
