package Adapter;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ModelClass.GeneralModelClass;
import design.ws.com.appstore.R;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapter_General extends RecyclerView.Adapter<RecycleAdapter_General.MyViewHolder> {
    Context context;


    private List<GeneralModelClass> moviesList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView image;
        TextView title,view1,install,update;


        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);
            title = (TextView) view.findViewById(R.id.title);
            update = (TextView) view.findViewById(R.id.update);



        }

    }


    public RecycleAdapter_General(Context mainActivityContacts, List<GeneralModelClass> moviesList) {
        this.moviesList = moviesList;
        this.context = mainActivityContacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_general_list, parent, false);


        return new MyViewHolder(itemView);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        GeneralModelClass movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.image.setImageResource(movie.getImage());

        if(position==0){
            holder.update.setVisibility(View.VISIBLE);


        }else {
            holder.update.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }


}


