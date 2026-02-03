/* 
* Main.java 
* shows object creation, default values,
* constructors, toString(), and encapsulation. 
*/

Public class Main {
    public static void main(String[] args){

        // Step 1-2: Create and Print Dog with no toString override
        Dog dog1 = new Dog();
        System.out.println("Prinitng dog1 directly:");
        System.out.println(dog1);

        // Step 4-5: Default field values
        Dog d1 = new Dog();
        System.out.println("")
        System.out.println("name = " +d1.getName());
        System.out.println("age = " d1.getAge());
        System.out.println("breed = " d1.getBreed());

        // step 6: constructors 
        Dog d2 = new Dog();
        System.out.println("\nd2 affter default constructor:");
        System.out.println(d2);

        Dog d3 = new Dog("Rex", 4, "Collie");
        System.out.println("\nd3 after parameterized constructor:");
        System.out.println(d3);

        // Step 8: toString demonstration
        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        // Step 10: Mutating via setters
        System.out.println("\nMutating via setters after making fields private:")
        d3.setAge(6);
        d3.setName("Maxwell")
        d3.setBreed("Border Collie")
        System.out.println("d3 age via getter = " + d3.getAge())
        System.out.println("d3 now = " + d3)

        // ===== Student-defined class demo =====
        Book b1 = new Book();
        Book b2 = new Book("Dune", "Frank Herbert", 9.99);

        System.out.println("\nBooks:"); 
        System.out.println(b1);
        System.out.println(b2);

        b2.setPrice(12.50);
        System.out.println("Updated book price: $" + b2.getPrice());



    
    }
}

