package bossss;

public class BosClass {
	
	private String erisilemez;
    int serbest;
	
	public BosClass()
	{
		this.erisilemez = "null";
		serbest=0;
	}
	
	public BosClass(String erisilemez1, int serbest1)
	{
		setErisilemez(erisilemez1);
		serbest = serbest1;
	}
	
	
	public String getErisilemez() {
		return erisilemez;
	}
	public void setErisilemez(String erisilemez) {
		this.erisilemez = erisilemez;
	}
	
	

}
