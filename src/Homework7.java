public class Homework7
{
    public static abstract class Printer
    {
        String model;
        int pCount,aCount;
        abstract boolean print();
        Printer(String m,int a)
        {
            model=m;
            aCount=a;
        }
    }
    public static class InkjetPrinter extends Printer
    {
        InkjetPrinter(String m,int a)
        {
            super(m,a);
        }
        @Override
        boolean print()
        {

            if(aCount==0)
            {
                System.out.println(model+": "+pCount+"매째 인쇄 실패 - 잉크 부족.");
                return false;
            }
            pCount+=1;
            aCount-=1;
            return true;
        }
    }
    public static class LaserPrinter extends Printer
    {
        LaserPrinter(String m, int a)
        {
            super(m,a);
        }
        @Override
        boolean print()
        {
            if(aCount==0)
            {
                System.out.println(model+": "+pCount+"매째 인쇄 실패 - 잉크 부족.");
                return false;
            }
            pCount+=1;
            aCount-=1;
            return true;
        }
    }
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}
