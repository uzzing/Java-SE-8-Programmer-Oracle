import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Countrys {
	public enum Continent {ASIA, EUROPE}
	
	String name;
	Continent region;
	
	public Countrys(String na, Continent reg) {
		this.name = na;
		this.region = reg;
	}
	
	public String getName() {
		return name;
	}
	
	public Continent getRegion() {
		return region;
	}
}

public class CollectorsMapping1 {

	public static void main(String[] args) {
		
		List<Countrys> couList = Arrays.asList(
				
				new Countrys("Italy", Countrys.Continent.EUROPE),
				new Countrys("Germany", Countrys.Continent.EUROPE),
				new Countrys("Japan", Countrys.Continent.ASIA));
				
		Map<Countrys.Continent, List<String>> regionNames =
				couList.stream().collect(Collectors.groupingBy(Countrys::getRegion,
						Collectors.mapping(Countrys::getName, Collectors.toList())));
		
		System.out.print(regionNames);
				

	}

}
