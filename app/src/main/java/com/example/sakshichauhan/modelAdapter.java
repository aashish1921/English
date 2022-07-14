package com.example.sakshichauhan;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class modelAdapter extends RecyclerView.Adapter<modelAdapter.modelViewHolder> implements Filterable {

    Context mContext;
    List<ModelClass> itemlist,filterlist;
    CustomFilter filter;
    private  int lastPosition =-1;

    public modelAdapter(Context mContext, List<ModelClass> itemlist) {
        this.mContext = mContext;
        this.itemlist = itemlist;
        this.filterlist=itemlist;

    }

    @NonNull
    @Override
    public modelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclercardview,parent,false);
        return  new modelViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull modelViewHolder holder, int position) {
        holder.title.setText(itemlist.get(position).getTitle());
        holder.description.setText(itemlist.get(position).getDescription());
        setAnimation(holder.itemView, position);

      holder.copy.setOnClickListener(v ->{

                  ClipboardManager clipboardManager =(ClipboardManager) mContext.getSystemService(Context.CLIPBOARD_SERVICE);
                  ClipData data =(ClipData) ClipData.newPlainText("text",itemlist.get(position).getTitle());
                  clipboardManager.setPrimaryClip(data);
                  Toast.makeText(mContext,"Copy ",Toast.LENGTH_SHORT).show();

              });
              holder.whatsapps.setOnClickListener(v -> {
                  try {
                      Intent msg =new Intent(Intent.ACTION_SEND);
                      msg.setType("text/plane");
                      msg.setPackage("com.whatsapp");
                      msg.putExtra(Intent.EXTRA_TEXT,itemlist.get(position).getTitle());
                      mContext.startActivity(msg);
                  } catch (Exception e) {
                      e.printStackTrace();
                  }

              });

            holder.share.setOnClickListener(v -> {
                Intent share =new Intent(Intent.ACTION_SEND);
                share.setType("text/plane");
                share.putExtra(Intent.EXTRA_TEXT,itemlist.get(position).getTitle());
                mContext.startActivity(share);


                    } );



    }

    private void setAnimation(View ViewToAnimate, int position) {
        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(mContext, R.anim.from_left);
            ViewToAnimate.startAnimation(animation);
//            lastPosition = position;


        }
    }
    @Override
    public int getItemCount() {

        return itemlist.size();
    }
    public int getLastPosition() {
        return lastPosition;
    }
    public void setLastPosition(int lastPosition) {
        this.lastPosition = lastPosition;
    }

    @Override
    public Filter getFilter() {
        if (filter==null){
            filter = new CustomFilter(filterlist,this);

        }

        return filter;
    }


    public  class modelViewHolder extends  RecyclerView.ViewHolder{
        TextView title,description;
        private ImageView copy,share,whatsapps;

        public modelViewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            description =(TextView) itemView.findViewById(R.id.description);
            copy =(ImageView)itemView.findViewById(R.id.copy);
            share =(ImageView)itemView.findViewById(R.id.share);
            whatsapps=(ImageView)itemView.findViewById(R.id.whatsapps);
        }
    }

}
