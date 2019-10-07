package simacoders.com.android.mvvmdatabindingproject.utils;

public class StringUtils {

    public static String getStringRatingNumber(int rate){
        return " [ "+String.valueOf(rate) + " ] ";
    }

    public static String getStringPriceNumber(int price){
        return String.valueOf(price)+ " هزار تومان ";
    }
}
