public class EBook extends Book
{
    String SiteForDownloading;
    double FlibustaRating;
    String CanGetFree;
    public  EBook(String CanGetFree)
    {   super();
        SiteForDownloading="http://fb2bookdownload.ru/classic/464-voyna-i-mir.html";
        this.CanGetFree=CanGetFree;
        FlibustaRating =4.5d;
    }
    public  EBook(String Title,String Author,String SiteForDownloading,String CanGetFree,double FlibustaRating)
    {   super.title=Title;
        super.Author=Author;
        this.SiteForDownloading=SiteForDownloading;
        this.CanGetFree=CanGetFree;
        this.FlibustaRating =FlibustaRating;
    }
    public void DistributeTorrent()
    {
        CanGetFree="Yes";
        FlibustaRating=FlibustaRating+0.1;
    }
    public void ComplaininRoskomnadzor()
    {
        SiteForDownloading="None";
        CanGetFree="No";
    }
    public void ShowFullInfo()
    {
        ShowInfo();
        System.out.println("Site For Downloading: " +SiteForDownloading);
        System.out.println("FlibustaRating: " +FlibustaRating+" CanGetFree? " + CanGetFree);

    }

}
