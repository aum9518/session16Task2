import underCotegory.Computer.Lenovo;
import underCotegory.Computer.Mac;
import underCotegory.Phone.Iphone;
import underCotegory.Phone.Phone;
import underCotegory.Phone.Samsung;
import underCotegory.SmartWatch.AppleWstch;
import underCotegory.SmartWatch.Miband;
import underCotegory.UnderCotegory;

public class Main {
    public static void main(String[] args) {
        UnderCotegory mac = new Mac("Apple","Macbook","black","13.3 inch","m2");
        UnderCotegory lenovo = new Lenovo("Lenovo","lenovo","grey","16.3 inch","intel");

        UnderCotegory iphon = new Iphone("Apple","Iphon 14pro","Purplle","256gb",2022);
        UnderCotegory samsung = new Samsung("Samsung","Samsung ultra pro","Gold","256gb",2022);

        UnderCotegory appleWatch = new AppleWstch("Apple","Apple Watch","Black","456 mah",7);
        UnderCotegory miBand = new Miband("Xioami","Mi band","Black","456 mah",9);

        UnderCotegory[] all = {mac,lenovo,iphon,samsung,appleWatch,miBand};
        for (UnderCotegory a:all) {
            System.out.println("Brand: "+a.getBrand()+"\nModel: "+a.getModel()+"\nColor: "+a.getColor()+"\n");
        }

    }
}