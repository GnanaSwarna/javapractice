package xyz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FriendGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<String, List<String>> graph=new HashMap<>();
     graph.put("alice",Arrays.asList("Bob"));
     graph.put("bob",Arrays.asList("alice","charlie"));
     graph.put("charlie",Arrays.asList("Bob"));
     for(String person:graph.keySet()) {
    	 System.out.println(person+" is friend with "+graph.get(person));
     }
	}

}
