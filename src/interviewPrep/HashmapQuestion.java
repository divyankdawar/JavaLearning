package interviewPrep;



	import java.util.HashMap;
	import java.util.Map;
	import java.util.Date;
	import java.util.Calendar;

	public class HashmapQuestion  {
	    public static void main(String[] args) {
	        Passenger passenger1 = new Passenger("Smith","12345",getDate(1985,5,15));
	        Passenger passenger2 = new Passenger("Johnson","67890",getDate(1990,7,20));
	        Passenger passenger3 = new Passenger("Williams","54321",getDate(1982,3,10));
	        
	        
	   Map<Integer,Passenger> passengerMap = new HashMap<>();
	   passengerMap.put(1, passenger1);
	   passengerMap.put(2, passenger2);
	   passengerMap.put(3, passenger3);
	   
	   //Iterating and printing the values of the HashMap
	   for(Map.Entry<Integer, Passenger> entry : passengerMap.entrySet()) {
		   System.out.println("Key: " + entry.getKey() + ",Value:" + entry.getValue());
	   }
	    }
	    
	    // Utility method to create a Date object for DOB      
	        public static Date getDate(int year, int month, int day) {
	        	Calendar calendar = Calendar.getInstance();
	        	calendar.set(year, month-1,day);
	        	return calendar.getTime();
	        }

	    }
	
