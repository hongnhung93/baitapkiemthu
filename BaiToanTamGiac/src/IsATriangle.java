
package triagle;

public class triagle {
		public int  (int a, int b, int c)
		{
			boolean isTriangle=false;
			if( a<b+c&&b<a+c&&c<a+b)
			{
					isTriagle=true;
			}
			else if(isTriagle){
				if(a==b&&b==c)
				{
					return 2;//tam giac deu
				}
			else if(( a!=b)&&(b!=c)||(a==c)&&(b!=c)) 
					return 0;//tam giac thuong
			else
			
					return 1;//tam giac can
			}
			return 1;//khong phai tam giac
		}
}
