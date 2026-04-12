public class CoreJavaBrushUp1 {
    

    public static void main(String[] args) {
        
        
        int myNum = 5;
        String website = "Rahul Shetty Academy";
        char letter = 'r';
        double dec = 5.99;
        boolean myCard = true;

        System.out.println(myNum + " is the value stored in the myNum variable");
        System.out.println(website);
        System.out.println(letter);
        System.out.println(dec);
        System.out.println(myCard);


        // 2. ARRAYS
        // Method 1: Allocate memory first, then assign values
        int[] arr = new int[5]; 
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        // Method 2: Assign values directly upon creation
        int[] arr2 = {1, 2, 4, 5, 6};

        System.out.println("First element of arr2 array: " + arr2[0]);


        // 3. LOOPS
        System.out.println("--- Elements of arr Array ---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("--- Elements of arr2 Array ---");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        // Creating an Array of Strings
        String[] name = {"rahul", "shetty", "selenium"};

        // Enhanced For Loop
        System.out.println("--- Name Array (Enhanced For Loop) ---");
        for (String s : name) {
            System.out.println(s);
        }
    }
}