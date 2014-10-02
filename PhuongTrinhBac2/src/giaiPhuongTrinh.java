
//phuong trinh bac 2: ax^2 + bx + c =0;
public class giaiPhuongTrinh {

 	//a,b,c la cac he so cua phuong trinh
	double[] giai(double a, double b, double c){
		double[] ketqua = new double[2];
		
		if(a == 0 && b== 0 && c==0){
			System.out.println("Phuong trinh co vo so nghiem");
			ketqua[0] = 1111111111;
			ketqua[1] = 1111111111;
		}
		else if(a == 0 && b!= 0){
			System.out.println("Phuong trinh co mot nghiem");
			ketqua[0] = -c/b;
			ketqua[1] = -1111111111;
		}
			
		// a!= 0
		else {
			double delta = (b*b - 4*a*c)/2;
			if(delta <0){
				System.out.println("Phuong trinh vo nghiem");
				ketqua[0] = -1111111111;
				ketqua[1] = ketqua[0];
			}
			else if(delta == 0) {
				System.out.println("Phuong trinh co nghiem kep");
				ketqua[0] = -b/(2*a);
				ketqua[1] = -1111111111;
			}
			// delta > 0
			else{
				System.out.println("Phuong trinh co hai nghiem phan biet");
				double s = Math.sqrt(delta);
				ketqua[0] = (-b + s)/(2*a);
				ketqua[1] = (-b - s)/(2*a);
			}
		}
		
		return ketqua;
	}
}
