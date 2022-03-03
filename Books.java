
public class Books {
	int id ;
	String name ;
	Author authors1 ;
	Author authors2 ;
	Publisher publisher ;
	int amountOfPages ;
	double price ;
	Books(int id,String name,Author author1,Author author2,String publisherName,int year,int pages,double price){
		this.id=id;
		this.amountOfPages=pages;
		this.price=price;
		this.name=name;
		publisher=new Publisher(publisherName,year);
		authors1=author1;
		authors2=author2;
	}
	public void display() {
		System.out.println("Book ID : "+id);
		System.out.println("Book Name : "+name);
		publisher.display();
		authors1.display();
		authors2.display();
		System.out.println("Number of pages in book : "+amountOfPages);
		System.out.println("Cost of book : "+price);
	}
}
