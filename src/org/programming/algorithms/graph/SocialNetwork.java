package org.programming.algorithms.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SocialNetwork {
	private Set<PersonalNetwork> network = new TreeSet<>(PersonalNetwork.comparator() );

	public void add(PersonalNetwork personalNetwork) {
		network.add(personalNetwork);
	}
	
	public void walkGraph() {
		Set<PersonalNetwork> networks = buildGraph();
		
		List<PersonalNetwork> visited = new ArrayList();

		walk(network, visited, 1);
	}

	private void walk(Set<PersonalNetwork> net, List<PersonalNetwork> visited, int depth) {
		
			
		for (PersonalNetwork n : net) {
			if (visited.contains(n)) {
				continue;
			}
			
			visited.add(n);
			for (int i = 0; i < depth; i++) System.out.print("\t");
			
			System.out.println(depth + ": " + n.getPerson());
			
			walk(n.getAdjacentNetworks(), visited, depth+1);
			
			visited.remove(n);
		}
		
	}

	public Set<PersonalNetwork> buildGraph() {

		ArrayList<PersonalNetwork> networkList = new ArrayList<PersonalNetwork>(network);
		for (PersonalNetwork p : networkList) {
			for (PersonalNetwork q: networkList) {
				// we are not friends with ourselves!
				if (!p.equals(q)) {
					// assume it is bidirectional friendship
					if (p.isAdjacent(q)) {
						
						p.add(q);
						q.add(p);
						
						System.out.println (p.getPerson() + " is " + (p.isAdjacent(q) ? "" : "not") + " adjacent to " +q.getPerson());
						}
				}
			}
		}
		
		
		network = new TreeSet(PersonalNetwork.comparator());
		network.addAll(networkList);
		return network;
	}

}
