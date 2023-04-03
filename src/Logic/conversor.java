package Logic;

import java.text.DecimalFormat;

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
	        }else if(divisaOrigen.equals("JPY") && divisaDestino.equals("Colon Salvadoreño")) {
	        	tasaConversion = 0.066;
	        }else if(divisaOrigen.equals("Colon Salvadoreño") && divisaDestino.equals("JPY")) {
	        	tasaConversion = 15.19;
	        }else if(divisaOrigen.equals("EUR") && divisaDestino.equals("Colon Salvadoreño")) {
	        	tasaConversion = 0.11;
	        }else if(divisaOrigen.equals("Colon Salvadoreño") && divisaDestino.equals("EUR")) {
	        	tasaConversion = 9.52;
	        }else if(divisaOrigen.equals("EUR") && divisaDestino.equals("Peso Mexicano")) {
	        	tasaConversion = 19.55;
	        }else if(divisaOrigen.equals("Peso Mexicano") && divisaDestino.equals("EUR")) {
	        	tasaConversion = 0.051;
	        }else if(divisaOrigen.equals("USD") && divisaDestino.equals("Peso Mexicano")) {
	        	tasaConversion = 0.056;
	        }else if(divisaOrigen.equals("Peso Mexicano") && divisaDestino.equals("USD")) {
	        	tasaConversion = 17.98;
	        }else if(divisaOrigen.equals("JPY") && divisaDestino.equals("Peso Mexicano")) {
	        	tasaConversion = 0.14;
	        }else if(divisaOrigen.equals("Peso Mexicano") && divisaDestino.equals("JPY")) {
	        	tasaConversion = 7.40;
	        }else if(divisaOrigen.equals("Colon Salvadoreño") && divisaDestino.equals("Peso Mexicano")) {
	        	tasaConversion = 0.14;
	        }else if(divisaOrigen.equals("Peso Mexicano") && divisaDestino.equals("Colon Salvadoreño")) {
	        	tasaConversion = 2.06;
	        }else if(divisaOrigen.equals("Colon Salvadoreño") && divisaDestino.equals("Colón costarricense")) {
	        	tasaConversion = 61.73;
	        }else if(divisaOrigen.equals("Colón costarricense") && divisaDestino.equals("Colon Salvadoreño")) {
	        	tasaConversion = 0.016;
	        }else if(divisaOrigen.equals("USD") && divisaDestino.equals("Colón costarricense")) {
	        	tasaConversion = 540.06;
	        }else if(divisaOrigen.equals("Colón costarricense") && divisaDestino.equals("USD")) {
	        	tasaConversion = 0.0019;
	        }else if(divisaOrigen.equals("Peso Mexicano") && divisaDestino.equals("Colón costarricense")) {
	        	tasaConversion = 30.02;
	        }else if(divisaOrigen.equals("Colón costarricense") && divisaDestino.equals("Peso Mexicano")) {
	        	tasaConversion = 0.033;
	        }else if(divisaOrigen.equals("EUR") && divisaDestino.equals("Colón costarricense")) {
	        	tasaConversion = 587.06;
	        }else if(divisaOrigen.equals("Colón costarricense") && divisaDestino.equals("EUR")) {
	        	tasaConversion = 0.0017;
	        }else if(divisaOrigen.equals("Peso Argentino") && divisaDestino.equals("Colón costarricense")) {
	        	tasaConversion = 2.59;
	        }else if(divisaOrigen.equals("Colón costarricense") && divisaDestino.equals("Peso Argentino")) {
	        	tasaConversion = 0.39;
	        }else if(divisaOrigen.equals("Peso Argentino") && divisaDestino.equals("Colon Salvadoreño")) {
	        	tasaConversion = 0.042;
	        }else if(divisaOrigen.equals("Colon Salvadoreño") && divisaDestino.equals("Peso Argentino")) {
	        	tasaConversion = 23.88;
	        } else if(divisaOrigen.equals("USD") && divisaDestino.equals("Peso Argentino")) {
	        	tasaConversion = 208.91;
	        }else if(divisaOrigen.equals("Peso Argentino") && divisaDestino.equals("USD")) {
	        	tasaConversion = 0.0048;
	        }else if(divisaOrigen.equals("Peso Argentino") && divisaDestino.equals("Peso Mexicano")) {
	        	tasaConversion = 0.086;
	        }else if(divisaOrigen.equals("Peso Mexicano") && divisaDestino.equals("Peso Argentino")) {
	        	tasaConversion = 11.61;
	        }else if(divisaOrigen.equals("Peso Argentino") && divisaDestino.equals("EUR")) {
	        	tasaConversion = 227.06;
	        }else if(divisaOrigen.equals("EUR") && divisaDestino.equals("Peso Argentino")) {
	        	tasaConversion = 0.0044;
	        }else if(divisaOrigen.equals("Peso Argentino") && divisaDestino.equals("EUR")) {
	        	tasaConversion = 0.64;
	        }else if(divisaOrigen.equals("EUR") && divisaDestino.equals("Peso Argentino")) {
	        	tasaConversion = 1.57;
	        }
	        
	        
	        
	        else {
	         
	            return -1;
	        }
		      DecimalFormat df = new DecimalFormat("###.#");
			double cantidadConvertida = (cantidad * tasaConversion);
			df.format(cantidadConvertida);
	        return cantidadConvertida;
	  }
}
