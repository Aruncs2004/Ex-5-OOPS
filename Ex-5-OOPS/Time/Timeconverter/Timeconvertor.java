package Time.Timeconverter;
public class Timeconvertor
{
    public void hr(float h)
    {
        float min,sec;
        min = h*60;
        sec = h*3600;
        System.out.print("\nHours : "+h+"\nin Minutes : "+min+"      in Seconds : "+sec);
    }
    public void sc(int s)
    {
        float hrs,min;
        min = s/60;
        hrs = s/3600;
        System.out.print("\nSeconds : "+s+"\nin Hours : "+hrs+"      in Minutes : "+min);
    }
    public void mi(float m)
    {
        float hrs,sec;
        sec = m*60;
        hrs = m/60;
        System.out.print("\nMinutes : "+m+"\nin Hours : "+hrs+"      in Seconds : "+sec);
    }
}
