
public class NextDay {
	//input : day, month, year
	//output: next day
	String nextday(int day, int month, int year){
		String result = new String();
		int nextday = day, nextmonth = month, nextyear = year;
			if(month <= 0 || month >= 13 || year <= 0)
				return result = "Not available";
			
			if(month == 2 && (year % 4 !=0)){
				if(day >= 1 && day <= 27){
					nextday = day +1;
					result = nextday + " - " + nextmonth + " - "+ nextyear;
				}else if(day == 28){
					nextday = 1;
					nextmonth = month + 1;
					result = nextday + " - " + nextmonth + " - "+ nextyear;
				}else{
					result = "Not available";
				}
			}else if(month == 2 && (year % 4 == 0)){
				if( day >= 1 && day <= 28){
					nextday = day +1;
					result = nextday + " - " + nextmonth + " - "+ nextyear;
				}else if(day == 29){
					nextday = 1;
					nextmonth = month + 1;
					result = nextday + " - " + nextmonth + " - "+ nextyear;
				}else{
					result = "Not available";
				}
				
			}else if(month == 1 || month == 3 || month == 5 || month == 7 || month ==8 || month == 10 || month == 12){
				if(day >= 1 && day <= 30){
					nextday = day + 1;
					result = nextday + " - " + nextmonth + " - "+ nextyear;
				}else if(day == 31 && month != 12){
					nextday = 1;
					nextmonth = month + 1;
					result = nextday + " - " + nextmonth + " - "+ nextyear;
				}else if(day == 31 && month == 12){
					nextday = 1;
					nextmonth =1;
					nextyear = year +1;
					result = nextday + " - " + nextmonth + " - "+ nextyear;
				}else{
					result = "Not available";
				}
				
			}else{
				if(day >= 1 && day <= 29){
					nextday = day + 1;
					result = nextday + " - " + nextmonth + " - "+ nextyear;
				}else if(day == 30){
					nextday = 1;
					nextmonth = month + 1;
					result = nextday + " - " + nextmonth + " - "+ nextyear;
				}else{
					result = "Not available";
				}
			}
			return result;
	}
}
