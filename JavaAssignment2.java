
public class JavaAssignment2 
{
	public static void main(String[] args) 
	{
		Person p1 =  new Person("XYZ");
		HolidayHome holidayhomeObj = new HolidayHome();
		holidayhomeObj.setNameHolidayHome("Leh");
		String nameHolidayHome = holidayhomeObj.getNameHolidayHome();
		p1.rideTwoWheeler(nameHolidayHome);
		Food foodObj1 = new Food("Idli");
		p1.eat(foodObj1);
		Laptop laptopObj = new Laptop("DELL");
		//p1.watchingMovie(laptopObj);
		System.out.println(p1.name +" is watching the movie "+p1.watchingMovie(laptopObj).movieName+" using "+ laptopObj.brandOfLaptop+" laptop");
		p1.trading();
	}
}
class Person
{
	String name;
	TwoWheeler twoWheelerObj = new TwoWheeler("Pulsar");
	Person(String name)
	{
		this.name = name;
		System.out.println("The name of the person is " + name);
	}
	void rideTwoWheeler(String hh)
	{
		System.out.println(name+ " is Riding the "+twoWheelerObj.nameOfTwoWheeler+" and going to " + hh);
	}
	void eat(Food f)
	{
		System.out.println(name +" is eating "+ f.foodItem);
	}
	Movie watchingMovie(Laptop laptop)
	{
		Movie movieObj = new Movie("Pushpa");
		return movieObj;
	}
	void trading()
	{
		System.out.println(name +" is doing share trading");
	}
	void fillFeedbackForm()
	{
		System.out.println(name+ " filled the feedback form");
	}
}
class Vehicle
{	
}
class TwoWheeler extends Vehicle
{
	String nameOfTwoWheeler;
	TwoWheeler(String nameOfTwoWheeler)
	{
		this.nameOfTwoWheeler = nameOfTwoWheeler;
	}
}
class Hotel
{
}
class HolidayHome extends Hotel
{
	String nameHolidayHome;
	Restaurant restaurantObj = new Restaurant();
	Library libraryObj = new Library();
	Aquarium aquariumObj1 = new Aquarium();
	AirConditioner airConditionerObj = new AirConditioner();
	FeedbackForm feedbackformObj = new FeedbackForm();
	public String getNameHolidayHome() {
		return nameHolidayHome;
	}
	public void setNameHolidayHome(String nameHolidayHome) {
		this.nameHolidayHome = nameHolidayHome;
	}
	
}
class Restaurant
{
	Food foodObj1 = new Food();
}
class Food
{
	String foodItem;
	Food(String food)
	{
		foodItem = food;
	}
	Food()
	{
	}

}
class Library
{
	Books bookObj = new Books();
}
class Books
{
	
}
class Aquarium
{
	
}
class AirConditioner
{
	
}
class Laptop
{
	String brandOfLaptop;
	Laptop (String brandOfLaptop)
	{
		this.brandOfLaptop = brandOfLaptop;
	}
}
class Movie
{
	String movieName;
	Movie(String movieName)
	{
		this.movieName=movieName;
	}
}
class FeedbackForm
{
	
}
