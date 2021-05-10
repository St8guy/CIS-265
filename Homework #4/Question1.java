
public class Question1 
{
	public static void main(String[] args) 
	{
		//Create list of 10,000 ints
		int[] list = new int[10000]; 
		//Randomly fill each space in the list
		for(int i = 0; i <list.length; i++)
		{
			list[i] = (int)(Math.random() * 1000000000);
		}
		RadixSort(list, 3);
		for(int i = 0; i < list.length; i++)
		{
			System.out.println(list[i] + " ");
		}
	}
	public static void RadixSort(int[] list, int number)
	{
		java.util.ArrayList<Integer>[] buckets = new java.util.ArrayList[10];
		for(int i = 0; i < buckets.length; i++)
		{
			buckets[i] = new java.util.ArrayList<Integer>();
		}
		for(int position = 0; position <= number; position++)
		{
			for(int i = 0; i <buckets.length; i++)
			{
				buckets[i].clear();
			}
			for(int i = 0; i < list.length; i++)
			{
				int key = getKey(list[i], position);
				buckets[key].add(list[i]);
			}
			int k = 0;
			for(int i = 0; i < buckets.length; i++)
			{
				if(buckets[i] != null)
				{
					for(int j = 0; j < buckets[i].size(); j++)
					{
						list[k++] = buckets[i].get(j);
					}
				}
			}
		}
	}
	public static int getKey(int number, int position)
	{
		int result = 1;
		for(int i = 0; i < position; i++)
		{
			result *= 10;
		}
		return(number/result) % 10;
	}
}
