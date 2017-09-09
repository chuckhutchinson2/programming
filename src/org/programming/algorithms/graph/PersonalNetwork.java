package org.programming.algorithms.graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PersonalNetwork  {
	public Set<PersonalNetwork> getAdjacentNetworks() {
		return adjacentNetworks;
	}
	public void setAdjacentNetworks(Set<PersonalNetwork> adjacentNetworks) {
		this.adjacentNetworks = adjacentNetworks;
	}
	private String person;
	private Set<String> friends;
	private Set<PersonalNetwork> adjacentNetworks = new TreeSet<>(comparator());
	
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public Set<String> getFriends() {
		return friends;
	}
	public void setFriends(Set<String> friends) {
		this.friends = friends;
	}
	
	public void add(PersonalNetwork adjacent) {
		adjacentNetworks.add(adjacent);
	}
	
	public boolean isAdjacent(PersonalNetwork network) {
		return friends.contains(network.getPerson()) || network.getFriends().contains(getPerson());
	}

	public static Comparator comparator() {
		return new Comparator<PersonalNetwork>() {

			@Override
			public int compare(PersonalNetwork o1, PersonalNetwork o2) {
				return o1.getPerson().compareTo(o2.getPerson());
			}
		};
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((friends == null) ? 0 : friends.hashCode());
		result = prime * result + ((person == null) ? 0 : person.hashCode());
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
		PersonalNetwork other = (PersonalNetwork) obj;
		if (friends == null) {
			if (other.friends != null)
				return false;
		} else if (!friends.equals(other.friends))
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}
	
	
}
