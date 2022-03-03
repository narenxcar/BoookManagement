import java.util.*;

public class Search {
	Search(ArrayList<Books> bookList,int bookId){
		boolean isBookAvilable=false;
		for(Books book:bookList) {
			//System.out.println("ID "+book.id);
			if(book.id==bookId) {
				book.display();
				isBookAvilable=true;
				break;
			}
		}
		if(!isBookAvilable)System.out.println("Book not foun");
	}
}
