package Analysis;

import DataFetcher.DataFetcherFacade;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

//Sample Analysis
public class Mortality extends AnalysisStrategy{
    public Mortality (){
        dataKey="SP.POP.TOTL";
    }
    @Override
    public JsonObject[] runAnalysis(){
        System.out.println("mortality");
        JsonObject[] data = DataFetcherFacade.getInstance().fetchData(dataKey);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        for (JsonObject jsonObject: data) { // AG.LND.AGRI.ZS
            System.out.println(gson.toJson(jsonObject));
        }
        return null;
    }
}
