public class HelloWorld{

	public static void main(String[] args){

		System.out.println("Hello World");
		// This is a comment
		// There are several primative data types in java and these are the only things
		// That are keeping java from being entirley class oriented

		// How do we declare variable in java?
		// datatype varname = value

		int number = 1000;
		byte smaller = 50;
		boolean value = true;
		System.out.println(number);
		System.out.println(smaller);
		System.out.println(value);

		byte tiny = 8;
		short small = 10000;
		int normal = 1000000;
		long bigger = 10000000000000L;

		// Let's try printing this out and we'll see if it works as 
		System.out.println(tiny);
		System.out.println(small);
		System.out.println(normal);
		System.out.println(bigger);

		// Let's try float and double
		//These are good for decimal number
		
		float decimal = 10.9f;
		System.out.println(decimal);
		
		char letter = 'A';

		System.out.println(letter);

		// If I want to declare a string, which is not a primitive typle
		// I'll use the String keyword

		String greeting = "Hello World";
		System.out.println(greeting);

		// Control Flow statements lets us control the flow of our code

		// Let's look at an if statement

		if (5 > 7) {
			System.out.println("This statement was true");
		} else {
			System.out.println("This statement was false");
		}	
		// else if statment

		// Let's check if a number is positive, negative, or zero

		int num = 9;

		if (num > 0){

			System.out.println("This is Positive");
		} else if (num == 0) {
			System.out.println("Zero");
		} else {
			System.out.println("Negative");
		}

		// Operators

		// < Less than
		// <= Less than or equal
		// > Greater than
		// >= Greater than or equal
		// == equal
		// != not-equal

		// While loop

		int  counter = 0;

		while (counter < 10) {
			System.out.println(counter);

			// Let's reassign this variable that's already defined
			// counter = counter + 1;
			// counter += 1;
			counter++;

			//counter+= 2;
		}

		boolean onOff = true;

		while (onOff) {
			System.out.println("Checking other while loop");
			onOff = false;
		}

		// For loop
		for (int i = 0; i < 5; i++){
			System.out.println(i);
		}
		int a = 4;
		int b = 3;

		System.out.println(add(a,b));
		int c = add(a,b);

		System.out.println(c);

		// When I talked about strings I said they were an Object not a primitive
		// What is inherently different about them?
		
		String name = "Mario Gatchair";

		System.out.println(name.length());

		System.out.println(name.charAt(3));

		// Jave like most programming languages, starts it's indices at 0
		// Mario
		// 01234
	}

	// Outside here I'm going to define a new method
	// There are a couple pieces to each method that we'll talk about
	// First is access modifiers (we'll leave public for right now)
	// After this, we have non-access modifiers (static)
	// After this is the return type, which is the data type that will come out of the method
	// Then we have the method name
	// After that is the final piece in the parantheses
	// This is all of the datatypes and arguments that go into the method

	// Let's take a look at defining a simple method

	public static int add(int a, int b){
		return a + b;	
	}
}