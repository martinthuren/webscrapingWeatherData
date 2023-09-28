import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Webscrapper {

    public static void main(String [] args){

        String url = "https://www.vejreti.com/europe/denmark?page=today";
        String url2 = "https://www.imdb.com/chart/top/?ref_=nv_mv_250";

        Document doc = null;

        try{
            doc = Jsoup.connect(url).get();

//            //Gets first row
//            String focusPoint = "#line1";
//            Element row = doc.select(focusPoint).first();
//            System.out.println(row.text());

            String secondFocusPoint = ".weather_table.day_table";
//
//
            Element table = doc.select(secondFocusPoint).first();
            Elements rows = table.select("tr");
            for (Element row : rows) {
                Elements columns = row.select("td"); // Select all columns in each row
                if (!columns.isEmpty()) {
                    Element column = columns.get(2); // Get the first column (change the index to select a different column)
                    System.out.println(column.text()); // Print the text content of the column
                }
            }
//
//


//            //Det område, vi ønsker data fra
//            String cssSelect = ".weather_table.day_table";
//            //Det er den liste vi ønsker at få frem / værdier vi ønsker at få frem
//            Element table = doc.select(cssSelect).first();
//
//            //Søger vi specifikt efter årtal
//            table.select(".sc-e3e7b191-0.iKUUVe.sc-4dcdad14-2.bYaHFC.cli-ratings-container").forEach(info -> {
//                System.out.println(info.select(".ipc-rating-star.ipc-rating-star--base.ipc-rating-star--imdb.ratingGroup--imdb-rating").stream().skip(0).toList().get(0).text());
//            });




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
