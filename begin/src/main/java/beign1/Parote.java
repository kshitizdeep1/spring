package beign1;

import org.springframework.stereotype.Component;

@Component
public class Parote implements Bird
{
	public void flying()
	{
		System.out.println("flying at low altitude");
	}
}
