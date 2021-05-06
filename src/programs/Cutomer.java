package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

final class Cutomer {
	final private int id;
	final private String name;
	final private List<String> addresses;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cutomer other = (Cutomer) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Cutomer(int id, String name, List<String> addresses) {
		super();
		this.id = id;
		this.name = name;
		List<String> newAdd = new ArrayList<>();
		newAdd.addAll(addresses);
		this.addresses = newAdd;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<String> getAddresses() {
		return addresses;
	}

	@Override
	public String toString() {
		return "Cutomer [id=" + id + ", name=" + name + ", addresses=" + addresses + "]";
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("shweta");

		Cutomer customer = new Cutomer(2, "Shweta", list);
		Cutomer customer1 = new Cutomer(2, "Shweta", list);
		System.out.println(customer.hashCode());
		System.out.println(customer1.hashCode());
		list.add("shweta");

		List<Cutomer> customers = new ArrayList<>();
		customers.add(new Cutomer(1, "Sac", list));
		customers.add(new Cutomer(3, "Rac_1", list));
		customers.add(new Cutomer(4, "Rac_2", list));
		customers.add(new Cutomer(5, "Rac_3", list));
		customers.add(new Cutomer(6, null, list));

		List<String> list_1 = customers.stream().filter(p -> {
			if (!(p.getName() == null)) {
				if (p.getName().startsWith("S")) {
					return true;
				} else
					return false;
			}
			return false;

		}).map(m -> m.getName()).collect(Collectors.toList());
		System.out.println(list_1);

		// list_1.stream().sorted(compareByAge);

		compareLists();

	}

	private static void compareLists() {
		List<String> list = new ArrayList<>();
		list.add("shweta");
		List<Cutomer> csv1 = new ArrayList<>();
		csv1.add(new Cutomer(4, "Rac_2", list));
		csv1.add(new Cutomer(5, "Rac_2", list));

		List<Cutomer> csv2 = new ArrayList<>();
		csv2.add(new Cutomer(4, "Rac_2", list));

		// csv1.contains(o)

		/*
		 * map1 map2
		 * 
		 * for(Entery.Map<Integer,c> val :map2.entrySet()){
		 * map1.contains(val.getKey()); }
		 */

		/*
		 * for(Cutomer c: csv1){ for(Cutomer c2: csv2){
		 * if(c.getId()==c2.getId()){
		 * 
		 * } } }
		 */

	}

}
