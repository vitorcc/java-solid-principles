package interface_segregation_principle;

public class Pinguim implements Aves {
	
	private int longitude;
	private int latitude;	

	@Override
	public void setLocalizacao(int longitude, int latitude) {
		this.longitude = longitude;
		this.latitude = latitude;
		
	}

	@Override
	public void renderizar() {
		System.out.println("Latitude do pinguim: " + latitude);
		System.out.println("Longitude do pinguim: " + longitude);
		System.out.println("Altitude do pinguim: Pinguins não voam");
		
	}

}
