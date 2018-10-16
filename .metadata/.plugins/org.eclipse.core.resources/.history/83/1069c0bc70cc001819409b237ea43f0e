import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.function.BiConsumer;
public class Runner {
		
	public static void main(String[] args) {
		
		Predicate<String> comp = s -> s.equals("Kawabunga");
		BiPredicate<String,String> comp2 = (s,t) -> s.equals(t);
		BiConsumer<String,String> comp3 = (s,t) -> System.out.println(s.equals(t));
	
	System.out.println(comp.test("hg"));
	System.out.println(comp2.test("Iuri", "Lyusien"));
	
	comp3.accept("Iuri","Iuri");
	
	}

}