package ui;

import exception.OperatorException;
import model.Activity;

public class Source {
	public static void main(String[] args) {
		Activity activity=new Activity("name1","name2","-");
		Source source=new Source();
		try{
		 	if(!source.validate(activity)){
				throw new OperatorException("Invalid parameters");
		 	}
		 	
			String result=source.doOperation(activity);
			System.out.println(result);
			
		}catch(OperatorException e){
			e.printStackTrace();
		}	
	}
	public boolean validate(Activity activity)  {
		if (activity.getString1() == null || activity.getString2() == null || activity.getOperator() == null) {
            throw new NullPointerException("String values or operator cannot be null");
        }

        if (!activity.getOperator().equals("+") && !activity.getOperator().equals("-")) {
            return false; 
        }
        
        return true; 
	    
	  }



	 public String doOperation(Activity activity){
		 String string1 = activity.getString1();
	        String string2 = activity.getString2();
	        String operator = activity.getOperator();
	        if (operator.equals("+")) {
	            return string1 + string2;
	        }
	        if (operator.equals("-")) {
	            return string1.replaceAll("[" + string2 + "]", "");
	        }
	        return "";
		
	 }
}
