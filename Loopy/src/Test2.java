
import java.util.*;
public class Test2 
{
	public static void main(String[] args)
	{
		String[] a={"��","Ҽ","��","��","��","��","½","��","��","��","ʰ","��"};
		Scanner input = new Scanner(System.in);
		System.out.println("��������:");
		String n1 = input.next();
		if(n1.indexOf('.')==-1)//�ж������Ƿ�����
		{
			int x = Integer.parseInt(n1);
			if(x/100!=0)//�����Ƿ��ǰ�λ��
			{
				int q = x/100;
				int p = (x%100)/10;
				int w = (x%100)%10;
				if(p!=0)
				{
					if(x/10==0)//ʮλ������0
					{
						String sn1 = a[q];
						String sn2 = a[p];
						
						
						
					}
				}
			}
			
		}
		
	}

}
