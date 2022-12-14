package com.example.skincare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class price_cheap extends AppCompatActivity implements ListView.OnItemClickListener{

    private RequestQueue objqueue;
    private final static String strurl = "";
    private ListView list;
    ArrayList<Product> arrayskin;
    private StringRequest getRequest;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.price_cheap);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        //物件名稱跟Layout上的物件，產生連結。
        list = (ListView) findViewById(R.id.list);
        list.setOnItemClickListener(this);

        arrayskin=new ArrayList<>();
        list.setAdapter(adapter);

        //設定Volley物件。

        objqueue = Volley.newRequestQueue(this);

        //實做Volley物件，在StringRequest的函式，預設值就是Request.Method.GET，可以省略。
        //而strurl，就是要GET的API網址。
        //最後，還要Override二個監聽的事件。
        getRequest = new StringRequest(strurl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //response，表示是回傳值，就是API要回傳的字串，也可以是JSON字串。

                //宣告JSONArray時，要用try...catch包起來，不然會出現錯誤。
                try{
                    //將JSON字串，放到JSONArray中。
                    JSONArray array = new JSONArray(response);

                    //解出JSON的資料，將所要的資料，再寫入陣列中。
                    for (int i = 0; i < array.length(); i++) {

                        JSONObject jsonObject = array.getJSONObject(i);
                        String prodName = jsonObject.getString("name");
                        String prodBrand= jsonObject.getString("price");
                        String link =  jsonObject.getString("link");


                    }
                }
                catch(JSONException e) {
                    e.printStackTrace();
                }

                //將陣列跟Spinner物件連結在一起。
                list.setAdapter(new ArrayAdapter<Product>( price_cheap.this, android.R.layout.simple_spinner_dropdown_item, arrayskin));

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //如果發生錯誤，就是回傳VolleyError，可以顯示是什麼錯誤。
            }
        });

        //將getRequest物件加入Volley物件的queue中，執行跟API的溝通。
        objqueue.add(getRequest);

    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        //取得按下ListView的那個Item的值。
        String strbookname = adapterView.getItemAtPosition(i).toString();

        //按下Item時，要呼叫編輯的Activity，利用Intent物件帶參數過去。
        Intent it = new Intent();
        it= new Intent(this,price_cheap.class);

        it.putExtra("pname",strbookname);

        startActivity(it);

        //關閉本身的Activity。
        this.finish();

    }
    //顯示訊息
    public void textview(String strmessage)
    {
        Toast objtoast = Toast.makeText(this,strmessage, Toast.LENGTH_SHORT);
        objtoast.show();
    }
}