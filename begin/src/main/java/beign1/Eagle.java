package beign1;

import org.springframework.stereotype.Component;

@Component
public class Eagle implements Bird
{

	public void flying() 
	{
		System.out.println("flying at higher altitude");
	}
	
}
