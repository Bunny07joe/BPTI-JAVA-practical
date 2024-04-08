class privateCons {
    private static int count = 0;

    private privateCons() {
        count++;
    }

    public static privateCons create() {
        return new privateCons();
    }

    static int Getcount() {
        return count;
    }
}

public class Count {
    public static void main(String args[]) {
        int instance;
        privateCons one = privateCons.create(); // Create instance using create() method
        instance = privateCons.Getcount(); // Get count using Getcount() method
        System.out.println("Instance = " + instance);

	privateCons two = privateCons.create(); // Create instance using create() method
        instance += privateCons.Getcount(); // Get count using Getcount() method
        System.out.println("Instance = " + instance);
    }
}
