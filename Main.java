import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		ArrayList<Books> books=new ArrayList<Books>();
		Scanner in=new Scanner(System.in);
		while(true) {
		System.out.println("******************************************************");
		System.out.println("press 1 to search book :");
		System.out.println("press 2 to add new book :");
		System.out.println("press 3  to exit :");
		System.out.println("Press 4 to print all books :");
		System.out.println("Enter your choice :");
		System.out.println("******************************************************");
		int n=in.nextInt();
		switch(n) {
		case 1:
			System.out.println("Searching book and deails of the book");
			System.out.println("Enter the Book name :");
			System.out.println("Enter Publisher name :");
			int s=in.nextInt();
			Search ser=new Search(books,s);
			break;
		case 2:
			int id,pages,year;
			String first1,last1,first2,last2,publishername,name;
			double price;
			System.out.print("Enter the book id : ");
			id=in.nextInt();
			System.out.print("Enter the book name : ");
			name=in.next();
			System.out.println("Enter the first author details ");
			System.out.println("Enter the Author Firstname : ");
			first1=in.next();
			System.out.println("Enter the Author Lastname : ");
			last1=in.next();
			Author a1=new Author(first1,last1);
			System.out.println("Enter the second author details");
			System.out.println("Enter the Author Firstname : ");
			first2=in.next();
			System.out.println("Enter the Author Lastname : ");
			last2=in.next();
			Author a2=new Author(first2,last2);
			System.out.print("Enter the book Publisher name: ");
			publishername=in.next();
			System.out.print("Enter the publishing year of book : ");
			year=in.nextInt();
			System.out.print("Enter the number of pages in the book : ");
			pages=in.nextInt();
			System.out.print("Enter the price of the book : ");
			price=in.nextDouble();
			Books b=new Books(id,name,a1,a2,publishername,year,pages,price);
			books.add(b);
			break;
		case 3:
			System.exit(0);
			break;
		case 4:
			for(Books bo:books)bo.display();
			default:
				System.out.println("Invalide input");
		}
		}
	}
}
