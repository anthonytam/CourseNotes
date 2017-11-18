package strategy2;

public class MoonwalkStrategy implements TravelStrategy {

	@Override
	public void travel(Person p, String location) {
		p.setLocation(location);
		System.out.println(p.getName() + " has traveled to " + p.getLocation() + " by moonwalking.");
	}

}
