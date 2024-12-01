
//Create a class person with properties Age and Name
public class Person {


    int age=18;
    String name;
    Person(String name)
    {
        this.name=name;
    }

    Person(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    //method use to display the person Name and Age,
    // if only name parameter is given then default age will be 18
    public void displayDetails()
    {
        System.out.println("Age of the person "+this.age );
        System.out.println("Name of the person "+this.name);
    }

}
