package Logic;

public class conversor extends datos{
	
	
	
	  public static double convertirDivisas(double cantidad, String divisaOrigen, String divisaDestino) {
	     
	        double tasaConversion = 0.0;
	        
			if (divisaOrigen.equals("USD") && divisaDestino.equals("EUR")) {
	            tasaConversion = 0.83;
	        } else if (divisaOrigen.equals("USD") && divisaDestino.equals("USD")) {
	            tasaConversion = 1;
	        } else if(divisaOrigen.equals("EUR") && divisaDestino.equals("USD")) {
	            tasaConversion = 1.21;
	        } else if (divisaOrigen.equals("USD") && divisaDestino.equals("JPY")) {
	            tasaConversion = 109.52;
	        } else if (divisaOrigen.equals("JPY") && divisaDestino.equals("USD")) {
	            tasaConversion = 0.0091;
	        } else if (divisaOrigen.equals("EUR") && divisaDestino.equals("JPY")) {
	            tasaConversion = 131.74;
	        } else if (divisaOrigen.equals("JPY") && divisaDestino.equals("EUR")) {
	            tasaConversion = 0.0076;
	        }else if (divisaOrigen.equals("JPY") && divisaDestino.equals("JPY")) {
	            tasaConversion = 1;
	        }else if (divisaOrigen.equals("EUR") && divisaDestino.equals("EUR")) {
	            tasaConversion = 1;
	        }else if(divisaOrigen.equals("Colon Salvadoreño") && divisaDestino.equals("USD")) {
	        	tasaConversion = 0.11;
	        }else if(divisaOrigen.equals("USD") && divisaDestino.equals("Colon Salvadoreño")) {
	        	tasaConversion = 8.75;
	        }else {
	         
	            return -1;
	        }
	        
	        double cantidadConvertida = cantidad * tasaConversion;
	        
	        
	        return cantidadConvertida;
	  }
}
