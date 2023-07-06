public class count8 {
    public static int count8(int n){
        if(n==0){
            return 0;
        }
        int LD = n%10;
        int rem = n/10;//ispe recursion laga denge
        int b4LD = rem%10;
        int count=0;
        if(LD==8){
            if(b4LD==8){
                count = count+2;
            }
            else{
                count++;
            }
            
            
        }
        int tot = count + count8(rem);
        return tot;
    }
    public static void main(String[] args) {
        System.out.println(count8(8812));
    }
}
