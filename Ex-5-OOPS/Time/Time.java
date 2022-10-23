package Time;
import Time.Timeconverter.Timeconvertor;
import java.util.*;
public class Time {

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int i=0,c;
        Timeconvertor cs = new Timeconvertor();
        while(i==0)
        {
            System.out.print("\n1-From Hours\n2-From Seconds\n3-From Minutes\nEnter your choice : ");
            c = o.nextInt();
            switch(c)
            {
                case 1:
                    System.out.print("\nEnter Hours : ");
                    float h = o.nextFloat();
                    cs.hr(h);
                    break;
                case 2:
                    System.out.print("\nEnter Seconds : ");
                    int s= o.nextInt();
                    cs.sc(s);
                    break;
                case 3:
                    System.out.print("\nEnter Minutes : ");
                    float m = o.nextFloat();
                    cs.mi(m);
                    break;
                default:
                    i = i+1;
                    break;
            }           
        }
    }    
}