public class Program
{
    public static void main(String args[])
    {   int y=2007;
        Book a = new Book();
        a.ShowInfo();
        Book b = new Book("Red Mars","Kim Stanley Robinson",1993);
        b.ShowNameAndAuthor();
        a.ShowNAmeandPAgesCount();
        b.ShowNameAndYear();
        a.ShowCount();
        EBook c =new EBook("yes");
        c.ShowFullInfo();
        c.ComplaininRoskomnadzor();
        c.ShowFullInfo();
        c.DistributeTorrent();
        PaperBook d = new PaperBook(y);
        d.ShowFullInfo();
        d.RaiseThePrice();
        d.ShowFullInfo();
        d.republish();
        d.ShowFullInfo();
    }
}
