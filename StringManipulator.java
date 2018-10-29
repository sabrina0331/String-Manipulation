public class StringManipulator {
    public String trimAndConcat(String s1, String s2){
        String result = s1.trim() + s2.trim();
        return result;
    }    
    public Integer getIndexOrNull(String s3, char letter){
        Integer output = s3.indexOf(letter);
        if(s3.indexOf(letter)<0){
            return null;
        }
        return output;
    }
    public Integer getIndexOrNullString(String s4, String s5){
        Integer outputs = s4.indexOf(s5);
        if(s4.indexOf(s5)<0){
            return null;
        }
        return outputs;
    }

    public String concatSubstring(String s6, int a, int b, String s7){
        String results = s6.substring(a,b).concat(s7);
        return results;
    }
}