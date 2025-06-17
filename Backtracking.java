public class Backtracking{
public static void main(String[] args){
    generatecombinations("abc",0," ");
}
public static void generatecombinations(String str,int index,String result){
    if(index==str.length()){
        System.out.println(result.length()!=0?result:"empty set");
        return;
    }
    generatecombinations(str,index+1,result+str.charAt(index));
    generatecombinations(str,index+1,result);
}
}
