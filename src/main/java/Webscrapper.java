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
            doc = Jsoup.connect(url2).get();

//            //Gets first row
//            String focusPoint = "#line1";
//            Element row = doc.select(focusPoint).first();
//            System.out.println(row.text());

//            String secondFocusPoint = ".weather_table.day_table";
//
//
//            Element table = doc.select(secondFocusPoint).first();
//            System.out.println(table.text());
//            //Elements rows = table.select("tr");
//
//            String temperature = table.select("asdasd").forEach();
//            String forecast = "";


            //Det område, vi ønsker data fra
            String cssSelect = ".ipc-metadata-list.ipc-metadata-list--dividers-between.sc-3f13560f-0.sTTRj.compact-list-view.ipc-metadata-list--base";
            //Det er den liste vi ønsker at få frem / værdier vi ønsker at få frem
            Element table = doc.select(cssSelect).first();

            //Søger vi specifikt efter årtal
            table.select(".sc-e3e7b191-0.iKUUVe.sc-4dcdad14-2.bYaHFC.cli-ratings-container").forEach(info -> {
                System.out.println(info.select(".ipc-rating-star.ipc-rating-star--base.ipc-rating-star--imdb.ratingGroup--imdb-rating").stream().skip(0).toList().get(0).text());
            });




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
