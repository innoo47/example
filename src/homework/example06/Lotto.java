package homework.example06;

public class Lotto {

	int[] arr = new int[5];

	for(
	int i = 1;i<=arr.length;++i)
	{
		arr[i] = (int) (Math.random() * 45) - 1;

	}

}
