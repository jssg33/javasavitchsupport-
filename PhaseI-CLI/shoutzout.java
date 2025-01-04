//import javafx.scene.paint.Color;
import java.util.HashMap;
import java.util.Map;

// Helper class to manage kids' ages using arrays
class KidsAges {
    private String[] names;
    private int[] ages;
    private int count;

    // Constructor
    public KidsAges(int size) {
        names = new String[size];
        ages = new int[size];
        count = 0;
    }

    // Method to add a kid and their age
    public void addKid(String name, int age) {
        if (count < names.length) {
            names[count] = name;
            ages[count] = age;
            count++;
        } else {
            System.out.println("Array is full. Cannot add more kids.");
        }
    }

    // Method to get the age of a specific kid
    public int getAge(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
                return ages[i];
            }
        }
        return -1; // Return -1 if the kid is not found
    }

    // Method to display all kids and their ages
    public void displayKids() {
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + " is " + ages[i] + " years old.");
        }
    }
}



class shoutzout
{    
	public static void main(String []args)    
	{        

	//FIRST USE A HASH
	HashMap<String, Integer> kidsAges = new HashMap<>();
	kidsAges.put("Hannah", 24);

	//NOW USE A SEPERATE DATASTRUCTURE
  	KidsAges somekids = new KidsAges(10);

        // Add some kids and their ages
        somekids.addKid("Alice", 10);
        somekids.addKid("Bob", 8);
        somekids.addKid("Charlie", 12);

        // Display all kids and their ages
        



	//interiorclass i1;
	//DEMONSTRATE CHAPTER1 & 2(Strings) - INSTALL COMPILER AND GET IT TO PRINT SOME LINES 
	
	System.out.println("ShoutzOut To You.");
	System.out.println("John S. Stritzinger III You Are the King.");
	String billgatestring = "Bill Gates is in Trouble.... Larry is gonna win by his 100th birthday.";
	System.out.println(billgatestring);
	System.out.println("But Bill has a big lead... and Might get Windows Running on IBM Mainftrames...like Blue Gene");    

	String kidName = "Hannah";
        if (kidsAges.containsKey(kidName)) {
            System.out.println(kidName + " is " + kidsAges.get(kidName) + " years old.");
        } else {
            System.out.println(kidName + " is not in the list.");
        }


	//DEMONSTRATE CHAPTER 4 -> FOR BLOCKS
	int countDown;


	for (countDown = 3; countDown >= 1; countDown --)
	{
	System.out.print("CountDown:");    
	System.out.println(countDown);
	
	}

	//DEMONSTRATE CHAPTER 3 -> IF BLOCKS
	
	if (countDown == 0)
	{
	System.out.println("IfBlock Match!");    
	System.out.println("Blast off!");    
	System.out.println("By the way....Kids are:");
	somekids.displayKids();
	}
	else
	{
	System.out.println("Didnt Match!");    
	System.out.println(countDown);
	}
	} 
}

