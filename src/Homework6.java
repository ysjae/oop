public class Homework6
{
    static class Course
    {
        String name,code;
        Course(String n,String c)
        {
            name=n;
            code=c;
        }
        String getc(){return code;}
        String getn(){return name;}
    }
    static class OnlineCourse extends Course
    {
        OnlineCourse(String n,String c)
        {
            super(n,c);
        }
        @Override
        public String toString() {
            String msg="Code: " + code + ", Name: " + name + ", Type: Online";
            return msg;
        }
    }
    static class OfflineCourse extends Course
    {
        OfflineCourse(String n,String c)
        {
            super(n,c);
        }
        @Override
        public String toString() {
            String msg="Code: " + code + ", Name: " + name + ", Type: Offline";
            return msg;
        }
    }
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("Object Oriented Programming","HAEA9201" );
        OnlineCourse course2 = new OnlineCourse( "C Programming 1","HAFL0012");
        System.out.println (course1);
        System.out.println (course2);
    }

}
