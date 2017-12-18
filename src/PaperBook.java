public class PaperBook extends Book
{
  public  String PublishingHouse;
    String CoverType;
    int YearOfPrint;
    double cost;
    public  PaperBook(int YearOfPrinting)
    {   super();
        PublishingHouse="Mif";
        CoverType="hard";
        this.YearOfPrint=YearOfPrinting;
        cost=0.99d;

    }
    public  PaperBook(String Title,String Author,String PublishingHouse,String CoverType,int YearOfPrinting)
    {   super(Title,Author );
        super.title=Title;
        super.Author=Author;
        this.PublishingHouse=PublishingHouse;
        this.CoverType=CoverType;
        this.YearOfPrint=YearOfPrinting;
        cost=0.99d;
    }
    public void republish()
    {
        YearOfPrint=2017;
        cost=4.9d;
        CoverType="hard";
        PublishingHouse="Mif";
        super.Pages+=20;
    }
    public void RaiseThePrice()
    {
        cost*=2;
    }
    public void ShowFullInfo()
    {
        ShowInfo();
        System.out.println("PublishingHouse: "+PublishingHouse+" CoverType: "+CoverType + " YearOfPrint "+ YearOfPrint
        + "cost: "+cost);
    }



}
