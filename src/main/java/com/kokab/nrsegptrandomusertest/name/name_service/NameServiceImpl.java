package com.kokab.nrsegptrandomusertest.name.name_service;

import com.kokab.nrsegptrandomusertest.name.name_object.name_model.NameDetails;
import com.kokab.nrsegptrandomusertest.name.name_object.name_model.NameModel;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameServiceImpl {

    public NameDetails fetchCurrentOrder() {
        String url = "https://jsonplaceholder.typicode.com/todos/" + orderId;
        HttpResponse<String> response = Unirest.get(url).asString();
        JSONObject jsonObject = new JSONObject(response.getBody());

        NameModel item = new NameModel(
                jsonObject.getString("title"),
                jsonObject.getString("first"),
                jsonObject.getString("last")
        );

        // Assuming OrderDetails is adjusted to contain a List<Item> or a single Item
        // For simplicity, let's say it's just a single Item for now
        return new NameDetails(List.of(item)); // Adjust this line according to your OrderDetails constructor
    }

}
