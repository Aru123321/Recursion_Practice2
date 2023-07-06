public class BunnyEars2 {
    public static int BE2(int n){
        if(n==0){
            return 0;
        }
        //odd
        if(n%2!=0){
            int fn = BE2(n-1) + 2;
            return fn;
        }
        //even
        else{
            int fn = BE2(n-1) + 3;
            return fn;
        }
        
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(BE2(n));
    }
}
