package com.itonemm.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        MovieModel movieModel1=new MovieModel("https://upload.wikimedia.org/wikipedia/en/thumb/b/b5/Supernatural_Season_9.jpg/220px-Supernatural_Season_9.jpg","Super Natural","Rating 9.5");
        MovieModel movieModel2=new MovieModel("https://image.tmdb.org/t/p/w185/mo0FP1GxOFZT4UDde7RFDz5APXF.jpg","Arrow ", "Rating 9.8");
        ArrayList<MovieModel> movieModels=new ArrayList<MovieModel>();
        movieModels.add(movieModel1);
        movieModels.add(movieModel2);



        ListView listView=findViewById(R.id.lstview);
        MovieAdapter adapter1=new MovieAdapter(movieModels);
        listView.setAdapter(adapter1);
    }


    private class MovieAdapter extends BaseAdapter
    {

        ArrayList<MovieModel> movieModels=new ArrayList<MovieModel>();

        public MovieAdapter(ArrayList<MovieModel> movieModels) {
            this.movieModels = movieModels;
        }

        @Override
        public int getCount() {
            return movieModels.size();
        }

        @Override
        public Object getItem(int position) {
            return movieModels.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater=getLayoutInflater();
            View myview=layoutInflater.inflate(R.layout.itemimagelistview,null);
            ImageView imageView=myview.findViewById(R.id.movieimage);
            TextView  moviename=myview.findViewById(R.id.moviename);
            TextView movierating=myview.findViewById(R.id.rating);
            final MovieModel temp=movieModels.get(position);
            Glide.with(getApplicationContext())
                    .load(temp.imagelink)
                    .override(100,100)
                    .into(imageView);
            moviename.setText(temp.moviename);
            movierating.setText(temp.movierating);
            return myview;
        }
    }



}
