package n1exercici1.java;

public class PercussionInstrument extends Instrument {
	
	public PercussionInstrument (String name, double price) {
		super(name, price);
	}
	
	public void play () {
		super.play("percussion");
	}
}
