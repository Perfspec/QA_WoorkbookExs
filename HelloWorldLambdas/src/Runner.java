import java.util.function.Consumer;
public class Runner {
	public static void main(String[] args) {
		Consumer<String> hi = s -> System.out.println(s+"!");
		
		hi.accept("Hello World");
		
		
	}

	
	
}
