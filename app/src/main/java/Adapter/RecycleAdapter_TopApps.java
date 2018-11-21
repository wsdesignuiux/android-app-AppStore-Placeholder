package Adapter;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.github.siyamed.shapeimageview.mask.PorterShapeImageView;

import java.util.List;

import ModelClass.HomeTopAppsModelClass;
import design.ws.com.appstore.R;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapter_TopApps extends RecyclerView.Adapter<RecycleAdapter_TopApps.MyViewHolder> {
    Context context;


    private List<HomeTopAppsModelClass> moviesList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        PorterShapeImageView image;
        TextView number, title, view1, install;


        public MyViewHolder(View view) {
            super(view);

            image = (PorterShapeImageView) view.findViewById(R.id.image);
            title = (TextView) view.findViewById(R.id.title);
            view1 = (TextView) view.findViewById(R.id.view);
            install = (TextView) view.findViewById(R.id.intall);
            number = (TextView) view.findViewById(R.id.number);


        }

    }


    public RecycleAdapter_TopApps(Context mainActivityContacts, List<HomeTopAppsModelClass> moviesList) {
        this.moviesList = moviesList;
        this.context = mainActivityContacts;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_topapp_list, parent, false);


        return new MyViewHolder(itemView);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        HomeTopAppsModelClass movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.view1.setText(movie.getView());
        holder.install.setText(movie.getInstall());
        holder.number.setText(movie.getNumber());
        holder.image.setImageResource(movie.getImage());


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }


}


