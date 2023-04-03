package Logic;

public class conversor extends datos{
	
    private double tasaConversion = 0.0;
    private double cantidadConvertida= 0.0;
    
    
	  public static double convertirDivisas(double cantidad, String divisaOrigen, String divisaDestino) {
	     
	   
	        
	        
	      if (divisaOrigen.equals("JPY") && divisaDestino.equals("USD")) {
	            tasaConversion = 0.0091;
	        } else if (divisaOrigen.equals("EUR") && divisaDestino.equals("JPY")) {
	            tasaConversion = 131.74;
	        } else if (divisaOrigen.equals("JPY") && divisaDestino.equals("EUR")) {
	            tasaConversion = 0.0076;
	        } else {
	         
	            return -1;
	        }
	        
	         cantidadConvertida = cantidad * tasaConversion;
	        
	        
	        return cantidadConvertida;
	  }
	  
	  
	  public double Monedas(double DivisaDestin) {
		  
		  if (divisaOrigen.equals("USD") && divisaDestino.equals("EUR")) {
	            tasaConversion = 0.83;
	        } else if (divisaOrigen.equals("USD") && divisaDestino.equals("USD")) {
	            tasaConversion = 1;
	        } else if(divisaOrigen.equals("EUR") && divisaDestino.equals("USD")) {
	            tasaConversion = 1.21;
	        } else if (divisaOrigen.equals("USD") && divisaDestino.equals("JPY")) {
	            tasaConversion = 109.52;
	            }
		  
		  return 0;
	  }
}
