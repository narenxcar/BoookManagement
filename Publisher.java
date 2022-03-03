
public class Publisher {
String namePublisher;
int yearPublish;
Publisher(String name,int year){
	namePublisher=name;
	yearPublish=year;
}
public void display() {
	System.out.println("Name of publisher : "+namePublisher);
	System.out.println("Year of book published : "+yearPublish);
}
}
