
public class Light {

	private boolean status;

	public Light(boolean b) {
		// TODO Auto-generated constructor stub
		this.status=b;
	}
	void lighton()
	{
		if(this.status==true)
		{
			System.out.println("it is alrady on");
		}
		else{
			this.status=true;
			System.out.println("Light is on");
		}
		
	}
	void lightoff()
	{
		if(this.status==false)
		{
			System.out.println("it is alrady off");
		}
		else{
		this.status=false;
		System.out.println("light is off");
		}
		
		}
		
}
