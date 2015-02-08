public class Solution {
    public List<String> anagrams(String[] strs) {
        if(strs==null){
            return null;
        }
        List<String> anagram = new ArrayList<String>();
        Map<String, Integer> index = new HashMap<String, Integer>();
        for(int i=0; i<strs.length;i++){
            char[] array = strs[i].toCharArray();
	        Arrays.sort(array);
	        String sorted = String.valueOf(array);
	        if(index.get(sorted)==null){
	            index.put(sorted, i);
	        }else{
	            if(index.get(sorted)==-1){
	                anagram.add(strs[i]);
	            }else{
	                anagram.add(strs[i]);
	                anagram.add(strs[index.get(sorted)]);
	                index.put(sorted, -1);
	            }
	        }
        }
        return anagram;
    }
}
