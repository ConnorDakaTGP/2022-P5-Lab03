public class Lab03
{
    public static void main(String[] args)
    {
    System.out.println("Lab 03, 80p version\n");

    int startsecs = 10000;
    int hours = startsecs / 3600;
    int mins = 2800 / 60;
    int secs = 2800 % 60;

    System.out.println("Starting seconds: "+startsecs);
    System.out.println("Hours:\t\t\t"+hours);
    System.out.println("Minutes:\t\t"+mins);
    System.out.println("Seconds:\t\t"+secs);
    }
}