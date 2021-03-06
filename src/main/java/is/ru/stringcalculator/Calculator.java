package is.ru.stringcalculator;

import java.util.ArrayList;
public class Calculator {
		
	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",") || text.contains("\n")){
			return sum(splitNumbers(text));
		}
		else
			return 1;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String number){
		
        	String Deli = null;
        	if (number.contains("//")) {
            		number = number.substring(2, number.length());
            		String[] Delim = number.split("\n");
            		Deli = Delim[0];
            		String newString = number;
            		newString = newString.replaceAll(Deli, ",");
            		newString = newString.replaceAll("\n", ",");
            		newString = newString.replaceAll(",,", ",");
            		newString = newString.substring(1, newString.length());
            		String[] Numbers = newString.split(",");

            	return Numbers;
        	}
        	else {
           		 String newString = number.replaceAll("\n", ",");
            		 String[] Numbers = newString.split(",");
            		 return Numbers;

        }
    }
      
    private static int sum(String[] numbers){
 	   	int total = 0;
		ArrayList<Integer> neg = new ArrayList<Integer>();
        	for(String number : numbers){
		    if (toInt(number) < 0){
		        neg.add(toInt(number));
		    }
		    if (toInt(number) > 1000){
			// do nothing	
		}
		    else
			total += toInt(number);
		}
		if (!neg.isEmpty()){
			String Message = "Negatives not allowed: ";
			for (int n : neg){
				Message += Message + n + ",";	
			}
			Message = Message.substring(0,Message.length()-1);
			throw new IllegalArgumentException(Message);	
		}
		return total;
    }



}
