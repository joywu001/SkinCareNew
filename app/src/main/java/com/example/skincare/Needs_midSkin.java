package com.example.skincare;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Needs_midSkin extends AppCompatActivity {
    private RecyclerView recyclerView;
    ArrayList<ProductModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.needs_midskin);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        arrayList = new ArrayList<ProductModel>();

        JsonFetchMid jsonFetchMid = new JsonFetchMid();
        jsonFetchMid.execute();
    }

    public class JsonFetchMid extends AsyncTask<String, String, String> {

        HttpURLConnection httpURLConnection = null;
        String mainfile;
        BufferedReader bufferedReader = null;

        @Override
        protected String doInBackground(String... strings) {
            try {
                URL url = new URL("http://140.136.151.160/midskin.php");
                httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.connect();

                InputStream inputStream = httpURLConnection.getInputStream();
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuffer stringBuffer = new StringBuffer();
                String line = "";

                while ((line = bufferedReader.readLine()) != null) {
                    JSONArray parent = new JSONArray(line);

                    int i = 0;

                    while (i <= parent.length()) {

                        JSONObject child = parent.getJSONObject(i);

                        String name = child.getString("name");
                        String price = child.getString("price");
                        String link = child.getString("link");

                        arrayList.add(new ProductModel(name, price, link));

                        i++;
                    }
                }
                inputStream.close();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            final Adapter adapter = new Adapter(arrayList);
            recyclerView.setAdapter(adapter);
        }
    }

}
