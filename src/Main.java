import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,y,z;
        System.out.print("輸入國文=");
        x=in.nextInt();
        System.out.print("輸入英文=");
        y=in.nextInt();
        System.out.print("輸入數學=");
        z=in.nextInt();
        System.out.printf("總成績=%d\n",x+y+z);
        System.out.printf("平均=%d\n",(x+y+z)/3);
    }
}
