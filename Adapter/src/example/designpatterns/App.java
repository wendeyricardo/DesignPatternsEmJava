package example.designpatterns;

public class App {
	
	public static void main(String[] args) {
		
//		TemperatureClassAdapter adapter = new TemperatureClassAdapter();
//		adapter.setValue(30);
//		
//		System.out.println(adapter.getValue());
//		System.out.println(adapter.getValueInFaherenheit());
		
		Temperature temperature = new Temperature();
		
		TemperatureObjetcAdapter adapter = new TemperatureObjetcAdapter(temperature);
		adapter.setValue(30);
		
		
		System.out.println(adapter.getValue());
		System.out.println(temperature.getValue());
	}
}
