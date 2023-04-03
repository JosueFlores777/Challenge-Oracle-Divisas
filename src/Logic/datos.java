package Logic;

import javax.swing.JComboBox;

public class datos {
		
	private double  dato1;
	private String[] OptionsDivisas= {"Elija opcion","USD", "EUR", "JPY","Colon Salvadoreño","Peso Mexicano","Peso Argentino","Colon Costarricense"};
	private String[] OptionsTemp= {"Elija opcion","Celsius", "Fahrenheit", "Kelvin","Rankine"};
	
	public String[] getOptionsDivisas() {
		return OptionsDivisas;
	}
	public void setOptionsDivisas(String[] OptionsDivisas) {
		this.OptionsDivisas = OptionsDivisas;
	}
	public double getDato1() {
		return dato1;
	}
	public void setDato1(double dato1) {
		this.dato1 = dato1;
	}
	public String[] getOptionsTemp() {
		return OptionsTemp;
	}
	public void setOptionsTemp(String[] optionsTemp) {
		OptionsTemp = optionsTemp;
	}


}
