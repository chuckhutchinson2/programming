package org.programming.algorithms.graph;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class SocialNetworkTest {

	@Test
	public void test() {
		
		SocialNetwork socialNetwork = new SocialNetwork();
		socialNetwork.add(createNetwork("a", Arrays.asList("b", "c", "d")));
		socialNetwork.add(createNetwork("b", Arrays.asList("a", "d", "e", "f")));
		socialNetwork.add(createNetwork("c", Arrays.asList("a", "i", "j")));
		socialNetwork.add(createNetwork("d", Arrays.asList("a")));
		socialNetwork.add(createNetwork("e", Arrays.asList("b", "i")));	
		socialNetwork.add(createNetwork("f", Arrays.asList("i")));
		socialNetwork.add(createNetwork("i", Arrays.asList("c", "e", "f")));
		socialNetwork.add(createNetwork("j", Arrays.asList("c")));

		socialNetwork.walkGraph();	
	}


	public PersonalNetwork createNetwork(String person, List<String> friends) {
		PersonalNetwork network = new PersonalNetwork();
		
		network.setPerson(person);
		network.setFriends(new TreeSet<String>(friends));
	
		return network;
	}

}
