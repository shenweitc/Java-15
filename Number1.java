package Demo03;

public class Number1 {
    public static void main(String[] args) {
        int a,b,c=0;
        for(int i=100;i<1000;i++){
            a=i/100;
            b=i%100/10;
            c=i%10;
            if(i==a*a*a+b*b*b+c*c*c){
                System.out.println(i);
            }
        }
    }
}
