package Assignment_6;

public class PercussionInstrument extends Sound implements MusicalInstrument {

	@Override
	public void play() {
		
		System.out.println("Play Percussion Instrument");		
	}

	@Override
	public void listenSound() {

		System.out.println(" Listen Percussion Instruments");
	}

}
 class StringedInstrument extends Sound implements MusicalInstrument{

	@Override
	public void play() {
		
		
		System.out.println(" Play Stringed Instrument ");
	}
	
	public void listenSound() {

		System.out.println(" Listen Stringed Instruments");
	}

	
				
	
 }