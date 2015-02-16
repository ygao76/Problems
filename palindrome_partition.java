public class Solution {
    public List<List<String>> partition(String s) {
        //recurrsively solved the problem
        //scan the string from beginning, if substring is a palindrom
        //call the partiotion on the rest of string,
        //add this palindrom to the result
        //repeat until reach the end of string
        List<List<String>> allPalidromPartition = new ArrayList<List<String>>();
        if(s==null || s.length()==0){
            return allPalidromPartition;
        }else if(s.length()==1){
            List<String> onePartition = new ArrayList<String>();
            onePartition.add(s);
            allPalidromPartition.add(onePartition);
            return allPalidromPartition;
        }else{
            for(int i=0; i<s.length();i++){
                String substring = s.substring(0,i+1);
                if(isPalindrome(substring)){
                    if(i==s.length()-1){
                        List<String> onePartition = new ArrayList<String>();
                        onePartition.add(s);
                        allPalidromPartition.add(onePartition);
                    }else{
                        for(List<String> onePartition: partition(s.substring(i+1))){
                            onePartition.add(0, substring);
                            allPalidromPartition.add(onePartition);
                        }
                    }
                }
            }
            return allPalidromPartition;
        }
        
    }
    
    public boolean isPalindrome(String s) {
        if(s==null || s.length()==0){
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] charArray = s.toCharArray();
        for(int i=0; i<Math.ceil(charArray.length/2);i++){
            if(charArray[i] != charArray[charArray.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
