public class Count7 {
    public static int count7(int n){
    if(n==0){
        return 0;
    }
    int count = 0;
    int LD = n%10;
    int rem = n/10;//ispe recursion laga denge
    if(LD==7){
        count++;
    }
    int tot = count+count7(rem);
    return tot;

    }
    public static void main(String[] args) {
    System.out.println(count7(174));
    }
}
