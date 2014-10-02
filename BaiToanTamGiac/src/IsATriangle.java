
public class IsATriangle {
	// dau vao la 3 canh tam giac
	// dau ra la Equilateral,  Isosceles, Scalene,  NotATriangle
	String isATriangle(int a, int b, int c){
		String result = new String();
		int triangle = 1;
		
		// Is a triangle?
		if((a < b+ c) && (b < a + c) && (c < a+ b)){
			triangle = 1;
		}else{
			triangle = 0;
			result = "NotATriangle";
		}
		
		//Determine triangle type
		if(triangle == 1){
			if((a == b) && (b==c)){
				result= "Triangle is Equilateral";
			}else if((a != b) && (a != c) && (b != c)){
				result ="Triangle is Scalene";
			}else{
				result = "Triangle is Isosceles";
			}
		}
		return result;
	}

}
