package interface_segregation_principle;

public class Urubu implements AvesQueVoam{
	
	private int longitude;
	private int latitude;
	private int altitude;

	@Override
	public void setLocalizacao(int longitude, int latitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
	public void setAltitude(int altitude) {
		this.altitude = altitude;		
	}
	
	@Override
	public void renderizar() {
		System.out.println("A latitude do Urubu é: " + latitude);
		System.out.println("A longitude do Urubu é: " + longitude);		
		System.out.println("A altitude do Urubu é: " + altitude);	
	}

}
