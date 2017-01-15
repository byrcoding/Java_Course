package ch11;

import java.util.ArrayList;

public class TestArrayList {
  public static void main(String[] args) {
    // Create a list to store cities
    ArrayList<String> cityList = new ArrayList<String>();
	ArrayList<String> cities = new ArrayList<>(); //Since jdk 1.7 is ok
      
    // Add some cities in the list
    cityList.add("London");
    // cityList now contains [London]
    cityList.add("Denver");
    // cityList now contains [London, Denver]
    cityList.add("Paris");
    // cityList now contains [London, Denver, Paris]
    cityList.add("Miami");
    // cityList now contains [London, Denver, Paris, Miami]
    cityList.add("Miami");
    
    cityList.add("Seoul");
    // contains [London, Denver, Paris, Miami, Seoul]
    cityList.add("Tokyo");
    // contains [London, Denver, Paris, Miami, Seoul, Tokyo]

    System.out.println("List size? " + cityList.size()); 
    System.out.println("Is Miami in the list? " +
      cityList.contains("Miami")); 
    System.out.println("The location of Denver in the list? "
      + cityList.indexOf("Denver")); 
    System.out.println("Is the list empty? " +
      cityList.isEmpty()); // Print false

    // Insert a new city at index 2
    cityList.add(2, "Xian");
    // contains [London, Denver, Xian, Paris, Miami, Seoul, Tokyo]

    // Remove a city from the list
    cityList.remove("Miami");
    // contains [London, Denver, Xian, Paris, Seoul, Tokyo]

    // Remove a city at index 1
    cityList.remove(1);
    // contains [London, Xian, Paris, Seoul, Tokyo]
    
    // insert/add Beijing at index 1
    cityList.add(1,"Beijing");
    // contains [London, Beijing, Xian, Paris, Seoul, Tokyo]
    
    // set Nanjing as the element at index 1
    cityList.set(1, "Nanjing");
    //  contains [London, Nanjing, Xian, Paris, Seoul, Tokyo]
    
    // Display the contents in the list
    System.out.println(cityList.toString());

    // Display the contents in the list in reverse order
    for (int i = cityList.size() - 1; i >= 0; i--)
      System.out.print(cityList.get(i) + " ");
    System.out.println();
    
    // Create a list to store two circles
    ArrayList<CircleFromSimpleGeometricObject> list 
      = new ArrayList<CircleFromSimpleGeometricObject>();
    
    // Add two circles
    list.add(new CircleFromSimpleGeometricObject(2));
    list.add(new CircleFromSimpleGeometricObject(3));
    
    // Display the area of the first circle in the list
    System.out.println("The area of the circle? " +
      list.get(0).getArea());
    
    //list.get(0).display();
  }
}