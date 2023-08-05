import java.util.*;
class saturday22
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] books = new int[n];
        for(int i=0;i<n;i++)
		{
            books[i] = sc.nextInt();
        }
        int total_cost = 0;
        int num_books = 0;
        for(int i=0;i<n;i++)
		{
            if (total_cost + books[i]<=m)
			{
                total_cost += books[i];
                num_books += 1;
            }
			else
			{
                break;
            }
        }
        List<Integer>book_list=new ArrayList<>();
        for(int i=0;i<num_books;i++)
		{
            if (total_cost+books[i]<=m)
			{
                total_cost += books[i];
                book_list.add(books[i]);
            }
			else
			{
                break;
            }
        }
        System.out.println(num_books);
        for(int i=0;i<num_books;i++)
		{
            System.out.println(book_list.get(i));
        }
    }
}
