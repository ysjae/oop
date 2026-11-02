import java.util.Scanner;
public class Homework5
{
    static class PersonalComputer
    {
        Monitor m=new Monitor();
        Computer c=new Computer();
        void turnOn()
        {
            c.turnOn();
            m.turnOn();
        }
        void printInfo()
        {
            c.printInfo();
            m.printInfo();
        }

    }
    static class Monitor
    {
        private String size="24 inch",color="black",power="45w";
        public void turnOn()
        {
            System.out.println("Turning on the monitor.");
        }
        public void printInfo()
        {
            System.out.printf("The spec of the monitor.\nSize:%s\nColor:%s\nPower:%s\n",
                    size,color,power);
        }
    }
    static class Computer
    {
        private String cpu="core i7",memory="16gb",hdd="2TB",color="white",power="500w";
        public void turnOn()
        {
            System.out.println("Turning on the computer.");
        }
        public void printInfo()
        {
            System.out.printf("The spec of the computer\nCpu:%s\nMemory:%s\nHDD:%s\nColor:%s\nPower:%s\n",
                    cpu,memory,hdd,color,power);
        }

    }
    public static void main(String[] args)
    {
        PersonalComputer pc=new PersonalComputer();
        pc.turnOn();
        pc.printInfo();
    }
}
