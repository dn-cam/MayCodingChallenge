import java.util.*;

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