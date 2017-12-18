public class Book
{private static int CountOfBooks;
 String title;
 String Author;
 String Genre;
 int Pages;
 int YearOfPublishing;//million usd
 public Book()
 {
     CountOfBooks++;
  title="War and Peace";
  Author = "Leo Tolstoy";
  Genre="Novel";
  Pages=1225;
  YearOfPublishing=1869;
 }
    public Book(String title,String Author )
    {
        CountOfBooks++;
        this.title=title;
        this.Author = Author;
    }
 public Book(String title,String Author ,int YearOfPublishing)
 {
  CountOfBooks++;
  this.title=title;
  this.Author = Author;
  this.YearOfPublishing=YearOfPublishing;
 }
 public Book(String title,String Author ,String Genre,int pages,int YearOfPublishing)
 {
     CountOfBooks++;
     this.title=title;
     this.Author = Author;
     this.Genre=Genre;
     this.Pages=pages;
     this.YearOfPublishing=YearOfPublishing;
 }
 public void ShowNameAndAuthor()
 {
  System.out.println("Book title "+title+" book author: "+Author);
 }
 public void ShowInfo()
 {
  System.out.println("Book title "+title+" book author: "+Author+ " genre: "+Genre +" count of pages: "+Pages +
          " year of publishing: "+YearOfPublishing);
 }
 public void ShowNAmeandPAgesCount()
 {
  System.out.println("Book title "+title+" count of pages: " + Pages);
 }
 public void ShowNameAndYear()
 {
  System.out.println("Book title "+title+ " year of publishing: "+YearOfPublishing);
 }

 public void ShowCount()
 {
  System.out.println("Count of books" + CountOfBooks);
 }



}

