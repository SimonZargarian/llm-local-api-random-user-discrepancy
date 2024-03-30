package com.kokab.nrsegptrandomusertest.service;

public class ParsingServiceWithMainForDev {

    public static void main(String[] args) {


       /* try {
            // Replace "your_api_url_here" with the actual URL of the API you're calling
            HttpResponse<JsonNode> response = Unirest.get("your_api_url_here")
                    .header("accept", "application/json")
                    .asJson();

            JSONObject responseBody = response.getBody().getObject();
            JSONArray resultsJson = responseBody.getJSONArray("results");
            JSONObject infoJson = responseBody.getJSONObject("info");

            // Map the JSON objects to your models
            ApiResponse apiResponse = new ApiResponse();
            List<Result> resultsList = new ArrayList<>();
            for (int i = 0; i < resultsJson.length(); i++) {
                JSONObject resultJson = resultsJson.getJSONObject(i);
                Result result = new Result();
                // Assuming "name" is a field in your Result model
                result.setName(resultJson.getString("name"));
                resultsList.add(result);
            }
            apiResponse.setResults(resultsList);

            Info info = new Info();
            // Assuming "count" and "pages" are fields in your Info model
            info.setCount(infoJson.getInt("count"));
            info.setPages(infoJson.getInt("pages"));
            apiResponse.setInfo(info);

            return apiResponse;

        } catch (UnirestException e) {
            e.printStackTrace();
            return null;
        }*/



    }

}
