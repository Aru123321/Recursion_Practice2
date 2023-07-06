public class ChangeXY {
    public static String changeXY(String str){
    if(str.length()==0){
        return str;
    }
    if(str.charAt(0)=='x'){// if x is on index 0
        return "y"+ changeXY(str.substring(1));//change it to y and then recurse for the rest
    }
    return str.charAt(0) + changeXY(str.substring(1));//if x is not on the 0 index, return the character at the 0 index as it is and recursive for the rest

    }
    public static void main(String[] args) {
        String str = "yxx";
        System.out.println(changeXY(str));
    }
}
