import java.util.HashMap;

public class subarray {

static void SubArrSum(int arr[],int sum ) {
	int start =0;
	int end=-1;
	int currSum=0;
	HashMap<Integer,Integer> map=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		currSum+=arr[i];
		if(currSum==sum) {
			start=0;
			end=i;
			break;
		}
		if(map.containsKey(currSum-sum)) {
			start=map.get(currSum-sum)+1;
			end=i;
		}
		map.put(currSum, i);
	}
	if(end==-1) {
		System.out.println("Not Found");
	}
	else {
		start+=1;
		end+=1;
		System.out.println(start+" "+ end);
	}
}
public static void main (String [] args) {
	int arr[]= {5,3,4};
	int sum=2;
	SubArrSum(arr,sum);
}

	//2nd approch

	/*
	class Solution {
    public int[]  twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
             return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
    return new int[] {};
    }
}
*/
