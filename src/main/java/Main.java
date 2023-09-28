import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String [] args){

        String url = "https://www.vejreti.com/europe/denmark?page=today";

        Document doc = null;

        try{
//            //Gets first row
            doc = Jsoup.connect(url).get();
            String focusPoint = "#line1";
            Element row = doc.select(focusPoint).first();
            System.out.println(row.text());

//            String secondFocusPoint = ".weather_table.day_table";
//
//
//            Element table = doc.select(secondFocusPoint).first();
//            Elements rows = table.select("tr");
//
//            for(Element allRows : rows){
//                System.out.println(allRows.text());
//            }

            //Gets entire table info:
            //String focusPoint = ".weather_table.day_table";
            //Element table = doc.select(focusPoint).first();
            //System.out.println(table.text());


        }catch (Exception e){
            e.printStackTrace();
        }


    }



}
