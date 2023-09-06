package EY2408;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> shoppingList = new ArrayList<>();
		shoppingList.add("coffee powder");
		shoppingList.add("nuvvulu");
		shoppingList.add("chai powder");
		shoppingList.add("Paalu");
		shoppingList.add("Pista");
		shoppingList.add("Pallilu");
		shoppingList.add("kaaram");
		
		Stream<String> shoppingListStream = shoppingList.stream();
		shoppingListStream.sorted().map(item -> item.toUpperCase()).
		filter(item-> item.startsWith("N")). 
		forEach(item -> System.out.println(item));
		
		shoppingListStream.forEach(item -> System.out.println(item));
		
	}

}
