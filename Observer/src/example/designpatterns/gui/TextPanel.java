package example.designpatterns.gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

import example.designpatterns.TextObserver;
import example.designpatterns.WeatherForecast;

public class TextPanel  extends JPanel {
	
	public TextPanel() {
		JTextField txtTemperature = new JTextField(20);
		txtTemperature.setEnabled(false);
		add(txtTemperature);
		
		TextObserver observer = new TextObserver(txtTemperature);
		WeatherForecast.getInstance().registerObserver(observer);
	}

}
