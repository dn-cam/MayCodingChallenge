import java.util.*;
import java.util.Random;

/*
 * Author: Camellia Debnath
 * Date: 6/11/20
 */

public class Challenge365{

		
	/*
	 * Leetcode: 746. Min Cost Climbing Stairs
	 * Date: 6/11/20
	 */
	public int minCostClimbingStairs(int[] cost) {
        for(int i = 2; i <cost.length; i++)
            cost[i] += Math.min(cost[i-2], cost[i-1]);
        
        return Math.min(cost[cost.length-1], cost[cost.length-2]);
    }
}



/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
class RandomizedSet {
    Set<Integer> set;   

    /** Initialize your data structure here. */
    public RandomizedSet() {
        this.set = new HashSet<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(this.set.contains(val))
            return false;
        else{
            this.set.add(val);
            return true;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(this.set.contains(val)){
            this.set.remove(val);
            return true;
        }
        else return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random r = new Random();
	    int rand = r.nextInt((this.set.size()-1) + 1) + 0;
        List<Integer> asList = new ArrayList(this.set);
        return asList.get(rand);
    }
}
