package strings;

public class stringIntroduction {
    
    public static void main(String[] args) {

    String name = "Vishal Kumar Yadav";
    name = name + " Purnia";
    String anotherName = new String("Vishal Kumar Yadav");


    System.out.println(name);
    System.out.println(anotherName);

    System.out.println(name == anotherName);

    System.out.println(name.charAt(0));
    System.out.println(name.length());

    System.out.println(name.substring(7));  // it takes space as index too
    System.out.println(name.substring(7, 14));

    System.out.println(name.contains("Kumar"));
    System.out.println(name.contains("had"));

    System.out.println(name.equals(anotherName));

    System.out.println(name.isEmpty());

    System.out.println(name.concat(" Bihar"));

    System.out.println(name.replace("Vishal", "Puchu"));


    String cars = "Maruti,Hyundai,Suzuki,Alto,Breeza,Creta";
    String allCars[] = cars.split(",");

    for(String car: allCars){
        System.out.println(car);
    }


    System.out.println(cars.indexOf('H'));
    System.out.println(cars.indexOf('Q'));         // -1

    System.out.println(cars.toLowerCase());
    System.out.println(cars.toUpperCase());

    String name2 = "   Vishal     ";
    System.out.println(name2);
    System.out.println(name2.trim());

        
    }

}
