import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class Homework8
{
    public static void main(String[] args)
    {
        String id,pw;
        Scanner sc=new Scanner(System.in);
        Map<String, String> ip = new HashMap<>();
        ip.put("myId","myPass");
        ip.put("myId2","myPass2");
        ip.put("myId3","myPass3");
        while(true)
        {
            System.out.println("id 와 password 를 입력해주세요.\n");
            System.out.println("id: ");
            id=sc.next();
            id=id.trim();
            if(ip.containsKey(id))
            {
                System.out.println("pw: ");
                pw=sc.next();
                pw=id.trim();
                if(ip.get(id).equals(pw))
                {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }
                else
                {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                }
            }
            else
            {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
            }
        }
    }
}
