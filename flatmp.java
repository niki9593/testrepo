import java.util.*;
import java.util.stream.Collectors;
class flatmp{
	
public static void main(String[] args){
		List<List<Integer>> list = Arrays.asList(Arrays.asList(2,1,4), Arrays.asList(4,2,3),Arrays.asList(1,2,3));

		List<Integer> result = list.stream().flatMap(List::stream).collect(Collectors.toList());

		System.out.println(result);
}
}