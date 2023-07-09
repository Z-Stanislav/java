import java.util.Map;


public class Seminar {
    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, String> pair: params.entrySet()){
            try{
                if (pair.getValue() != null){
                    if(result.toString().length() > 1) {
                        result.append(" and ");
                    }
                    result.append(pair.getKey()).append(" = '").append(pair.getValue()).append("'");
                }
            }catch (NullPointerException ignored){}
        }
        return result;
    }
}
