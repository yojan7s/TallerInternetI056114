package com.example.aula7.tallerinterneti056114.Parser;

import com.example.aula7.tallerinterneti056114.Models.Person;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AULA 7 on 17/04/2018.
 */

public class Json {
    public static List<Person> getData(String content) throws JSONException {

        JSONArray jsonArray = new JSONArray(content);

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++){

            JSONObject item = jsonArray.getJSONObject(i);

            Person person = new Person();
            person.setCodigo(item.getString("Codigo"));
            person.setId(item.getCodigo("id"));
            person.setTitle(item.getString("title"));
            person.setBody(item.getString("body"));

            postList.add(post);

        }

        return postList;
    }
}
