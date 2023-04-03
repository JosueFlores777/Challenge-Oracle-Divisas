package Logic;

public class Temperat extends datos{
	
	public static double ConverTempe(double number, String tempeOringe, String tempeDestuno) {
		double temperatura = 0.00;
		if(tempeOringe.equals("Celsius") && tempeDestuno.equals("Fahrenheit")) {
			temperatura = (number * 9/5) + 32;
		}else if(tempeOringe.equals("Celsius") && tempeDestuno.equals("Kelvin")) {
			temperatura =number+ 273.15;;
		}else if (tempeOringe.equals("Celsius") && tempeDestuno.equals("Rankine")){ // Celsius to Rankine
			temperatura =(number + 273.15) * 9 / 5;
        }else if(tempeOringe.equals("Fahrenheit") && tempeDestuno.equals("Celsius")) {
			temperatura = (number - 32) * 5 / 9;
		}else if(tempeOringe.equals("Fahrenheit") && tempeDestuno.equals("Kelvin")) {
			temperatura =(number + 459.67) * 5 / 9;
		}else if (tempeOringe.equals("Fahrenheit") && tempeDestuno.equals("Rankine")){ // Celsius to Rankine
			temperatura =number + 459.67;
        }else if(tempeOringe.equals("Kelvin") && tempeDestuno.equals("Celsius")) {
			temperatura = number - 273.15;
		}else if(tempeOringe.equals("Kelvin") && tempeDestuno.equals("Fahrenheit")) {
			temperatura =(number * 9 / 5) - 459.67;
		}else if (tempeOringe.equals("Kelvin") && tempeDestuno.equals("Rankine")){ // Celsius to Rankine
			temperatura =number * 1.8;
        }else if(tempeOringe.equals("Rankine") && tempeDestuno.equals("Celsius")) {
			temperatura = (number - 491.67) * 5 / 9;
		}else if(tempeOringe.equals("Rankine") && tempeDestuno.equals("Fahrenheit")) {
			temperatura =number - 459.67;
		}else if (tempeOringe.equals("Rankine") && tempeDestuno.equals("Kelvin")){ // Celsius to Rankine
			temperatura =number * 5 / 9;
        }else {
        	temperatura= -1;
        }
		
		
		return temperatura;
	}
	
	
}
