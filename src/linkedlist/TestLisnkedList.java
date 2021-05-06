
package linkedlist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestLisnkedList {

	public static void main(String[] args) {
		ArrayList<List<Integer>> listo = new ArrayList<>();

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		listo.add(list);

		List<Integer> list_1 = new ArrayList<Integer>();
		list_1.add(2);
		list_1.add(6);
		list_1.add(3);
		listo.add(list_1);

		List<Integer> list_2 = new ArrayList<Integer>();
		list_2.add(1);
		list_2.add(8);
		list_2.add(0);
		listo.add(list_2);
		
		Predicate<Integer> pl = i -> i%2==0;

		listo.stream().flatMap(st->st.stream().filter(pl)).forEach(System.out::println);
		// listo.stream().forEach(p -> System.out.println(p));
		// listo.stream().map(p -> p.subList(0, 5)).collect(Collectors.toMap(List::get,
		// List::get));
//		System.out.println(listo);

		List<Hosting> list_h = new ArrayList<>();
		list_h.add(new Hosting(2, "linode.com", 90000));
		list_h.add(new Hosting(3, "digitalocean.com", 120000));
		list_h.add(new Hosting(4, "aws.amazon.com", 200000));
		list_h.add(new Hosting(5, "mkyong.com", 1));
		list_h.add(new Hosting(1, "liquidweb.com", 80000));

		Comparator<Hosting> compareById = new Comparator<Hosting>() {

			@Override
			public int compare(Hosting o1, Hosting o2) {
				return o1.getI().compareTo(o2.getI());
			}

		};

		list_h.stream().sorted(compareById).forEach(p -> System.out.println(p.getI()));

	}

}
