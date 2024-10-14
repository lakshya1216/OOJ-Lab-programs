import java.util.Scanner;
class Books
{
String name;
String author;
int price;
int numPages;

Books(String name,String author,int price,int numPages)
{
this.name=name;
this.author=author;
this.price=price;
this.numPages=numPages;
}
public String toString()
{
String name,author,price,numPages;
name="Book name:"+this.name+"\n";
author="Author name:"+this.author+"\n";
price="Book price:"+this.price+"\n";
numPages="No. of pages:"+this.numPages+"\n";
return name+author+price+numPages;
}
}
public class bookDetails
{
public static void main(String[] args)
{
int n;
String name;
String author;
int price;
int numPages;
System.out.println("Enter number of books\n");
Scanner s=new Scanner(System.in);
n=s.nextInt();

Books b[];
b=new Books[n];

for(int i=0;i<n;i++){
System.out.print("Enter Books"+(i+1)+" name: ");
name=s.next();
System.out.print("\nEnter Books"+(i+1)+" author: ");
author=s.next();
System.out.print("\nEnter Books"+(i+1)+" price: ");
price=s.nextInt();
System.out.print("\nEnter Books"+(i+1)+" no. of pages: ");
numPages=s.nextInt();
b[i]=new Books(name,author,price,numPages);
}

for(int i=0;i<n;i++)
{
System.out.println(b[i].toString());
}
System.out.println("Lakshya Khandelwal");
System.out.println("1BM23CS166");
}
}
