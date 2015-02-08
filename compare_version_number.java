public class Solution {
    public int compareVersion(String version1, String version2) {
        Comparator<String> comp = new Comparator<String>(){
            public int compare(String s1, String s2){
                String[] split1 = s1.split("\\.");
                String[] split2 = s2.split("\\.");
                int len = Math.min(split1.length, split2.length);
                int i;
                for(i=0; i<len; i++){
                    if(Integer.valueOf(split1[i])!=Integer.valueOf(split2[i])){
                        break;
                    }
                }
                if(i==len){
                    Integer len1 = new Integer(split1.length);
                    Integer len2 = new Integer(split2.length);
                    if(len1!=len2){
                        String[] longer = split1;
                        if(len1<len2){
                            longer = split2;
                        }
                        while(i<longer.length){
                            if(Integer.valueOf(longer[i]) != 0){
                                return len1.compareTo(len2);
                            }
                            i++;
                        }
                    }
                    return 0;

                }else{
                    Integer val1 = new Integer(split1[i]);
                    Integer val2 = new Integer(split2[i]);
                    return val1.compareTo(val2);
                }
            }
        };
        return comp.compare(version1, version2);
    }
}
