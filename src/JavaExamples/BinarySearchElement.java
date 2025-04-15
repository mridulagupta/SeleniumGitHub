package JavaExamples;

import java.util.Arrays;

public class BinarySearchElement {

	public static void main(String[] args) {
		
		int a[] = {11,20,3,4,53,6,17,8,9,10};
		Arrays.sort(a);
		System.out.println("after array sort "+Arrays.toString(a));
		
		//Approach1 = logic
		int lower =0;
		int higher = a.length-1;
		
		int key = 53;
		boolean flag = false;
		
		//case1: key==mid value
		//case2: key>mid, lower=mid+1
		//case3: key<mid, higher=mid-1
		//loop will end when lower value is greater than higher value
		
		/*while(lower<=higher)
		{
			int mid = (lower+higher)/2;
			if(a[mid]==key)
			{
				System.out.println("Element is found at index"+ " "+mid);
				flag = true;
				break;
			}
			
			if(key>a[mid])
			{
				lower = mid+1;
			}
			
			if(key<a[mid])
			{
				higher = mid-1;
				
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}
		*/
		
		//Approach2 - biuld-in function
		System.out.println(Arrays.binarySearch(a, 53));
		
	}

}
