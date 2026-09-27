import java.util.Scanner;

class Student
{
    private int num;
    private long phone;
    private String name;
    private String maj;

    public void setNum(int num)
    {
        this.num = num;
    }
    public void setPhone(long phone)
    {
        this.phone = phone;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setMaj(String maj)
    {
        this.maj = maj;
    }

    public int getNum()
    {
        return num;
    }
    public long getPhone()
    {
        return phone;
    }
    public String getName()
    {
        return name;
    }
    public String getMaj()
    {
        return maj;
    }

    public String getFormattedPhone()
    {
        String phoneStr = Long.toString(phone);
        if (phoneStr.length() == 9)
        {
            phoneStr = "0" + phoneStr;
        }
        if (phoneStr.length() == 10)
        {
            return "010-" + phoneStr.substring(2, 6) + "-" + phoneStr.substring(6, 10);
        } else if (phoneStr.length() == 11)
        {
            return phoneStr.substring(0, 3) + "-" + phoneStr.substring(3, 7) + "-" + phoneStr.substring(7, 11);
        }
        return phoneStr;
    }
}

public class Homework2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++)
        {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int num = Integer.parseInt(sc.next());
            String name = sc.next();
            String maj = sc.next();
            long phone = Long.parseLong(sc.next());

            students[i] = new Student();
            students[i].setNum(num);
            students[i].setName(name);
            students[i].setMaj(maj);
            students[i].setPhone(phone);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < 3; i++)
        {
            System.out.println((i + 1) + "번째 학생: " +
                    students[i].getNum() + " " +
                    students[i].getName() + " " +
                    students[i].getMaj() + " " +
                    students[i].getFormattedPhone());
        }


    }
}