package arrays;

public class oneDArrays {
    public static void main(String[] args) {
        
        //  Single value Containers
        int state1PopulationCount = 502;
        int state2PopulationCount = 442;
        int state3PopulationCount = 992;
        int state4PopulationCount = 441;
        int state5PopulationCount = 222;

        // Multi Value Container
        int[] countryPopulation = new int[5];
        System.out.println("statePopulation is: " +countryPopulation);

        // Read the Element in array
        // 1. Read Single Element
        
        System.out.println("countryPopulation[0] is : "+countryPopulation[0]);
        System.out.println("countryPopulation[1] is : "+countryPopulation[1]);

        //  Read all
        for(int i=0; i<countryPopulation.length; i++)
        {
            System.out.println("countryPopulation["+i+"] is:" + countryPopulation[i]);
        }

        // Write Update opeation
        countryPopulation[0] = 502;
        countryPopulation[1] = 442;
        countryPopulation[2] = 992;
        countryPopulation[3] = 441;
        countryPopulation[4] = 222;

        System.out.println();
        System.out.println("==Re Reading After Write Operation==");

        for(int i=0; i<countryPopulation.length; i++)
        {
            System.out.println("countryPopulation["+i+"] is:" + countryPopulation[i]);
        }

    }
}
