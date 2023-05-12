package ie.atu.productv1;
import java.text.NumberFormat;
import java.util.Locale;
public class Book {

    private String author;
    private String code;
    private String description;
    private double price;
    protected static int count = 0;

    public Book() {
        description = "";
        code = "";
        author = "";
        price = 0.0;
        count++;
    }

    public String getAuthor() {
        return author;
    }




    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }
    public String getPriceFormatted() {
        Locale cLocale = new Locale.Builder().setLanguage("en").setRegion("GR").build();
        NumberFormat currency = NumberFormat.getCurrencyInstance(cLocale);
        return currency.format(price);
    }

    public String toString() {
        return description + " by " + author;
    }
    public static void setCount(int count) {
        Book.count = count;
    }
}
