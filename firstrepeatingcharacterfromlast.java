import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String str=new StringBuffer(s).reverse().toString();
    char[] ch=str.toCharArray();
    HashMap<Character,Integer> h=new HashMap<Character,Integer>();
    for(char i:c)
    {
        if(h.containsKey(i))
        h.put(i,h.get(i)+1);
        else
        h.put(i,1);
    }
    for(char i:c)
    {
        if(h.get(i)>1)
        {
            System.out.print(i);
            break;
        }
    }
	}
}