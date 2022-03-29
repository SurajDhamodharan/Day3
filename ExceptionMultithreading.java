
public class ExceptionMultithreading {

	public static void main(String[] args) {
		Citizen citObj1=new Citizen("Abc", 12);
		System.out.println("Citizen details : "+ citObj1);
		try {
			citObj1.doVote(citObj1);
		}catch (AgeException e) {
			System.out.println("Sorry . .. "+e);
		}
	}

}

class Citizen
{
	String name;
	int age;
	Citizen(String name, int age)
	{
		this.age =  age;
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "Name=" + name + ", Age=" + age ;
	}
	void doVote(Citizen citObj1) throws AgeException
	{
		if(this.age<18)
		{
			throw new AgeException();
		}
		else
		{
			System.out.println("Please vote");
		}
	}
}
class AgeException extends Exception
{
	AgeException(){
		//super();
	}
}
