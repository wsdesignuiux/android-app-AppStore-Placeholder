package Adapter;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.siyamed.shapeimageview.mask.PorterShapeImageView;

import java.util.List;

import ModelClass.HomeListModelClass;
import design.ws.com.appstore.R;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapter_ListHome extends RecyclerView.Adapter<RecycleAdapter_ListHome.MyViewHolder> {
    Context context;


    private List<HomeListModelClass> moviesList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        PorterShapeImageView image;
        TextView title, view1, install;
        LinearLayout linearLayout, addlayout;


        public MyViewHolder(View view) {
            super(view);

            image = (PorterShapeImageView) view.findViewById(R.id.image);
            title = (TextView) view.findViewById(R.id.title);
            view1 = (TextView) view.findViewById(R.id.view);
            install = (TextView) view.findViewById(R.id.intall);
            linearLayout = (LinearLayout) view.findViewById(R.id.linear);
            addlayout = view.findViewById(R.id.addlayout);


        }

    }


    public RecycleAdapter_ListHome(Context mainActivityContacts, List<HomeListModelClass> moviesList) {
        this.moviesList = moviesList;
        this.context = mainActivityContacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_home_list, parent, false);


        return new MyViewHolder(itemView);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        holder.addlayout.setVisibility(View.GONE);
        holder.linearLayout.setVisibility(View.VISIBLE);
        HomeListModelClass movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.view1.setText(movie.getView());
        holder.install.setText(movie.getInstall());
        holder.image.setImageResource(movie.getImage());


        if (position == 2) {
            holder.addlayout.setVisibility(View.VISIBLE);
            holder.linearLayout.setVisibility(View.GONE);
            View view = LayoutInflater.from(context).inflate(R.layout.topapp_layout, holder.addlayout, false);
            holder.addlayout.addView(view);

        }


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }


}


