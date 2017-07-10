package com.artmurka.artmurkaapp.Presenter.Adapters;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.artmurka.artmurkaapp.Model.Pojo.ItemList.ItemBasket.Item;

import com.artmurka.artmurkaapp.R;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RVbasketAdapter extends RecyclerView.Adapter<RVbasketAdapter.ViewHolder> {
    private Context ctx;
    List<Item> basketItemList;
    public RVbasketAdapter(Context context) {
        this.ctx = context;
        basketItemList = new ArrayList<>();
    }

    public void setData(List<Item> list) {
        if (basketItemList != null && list.size() > 0) {
            this.basketItemList.clear();
            this.basketItemList.addAll(list);
            notifyDataSetChanged();
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(ctx).inflate(R.layout.basket_item,parent,false);
        final ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.goodName.setText(basketItemList.get(position).getEntryTitle());
        holder.goodDescription.setText(basketItemList.get(position).getSumm().getSumm());
        holder.goodPrice.setText(basketItemList.get(position).getEntryPrice().getPrice());
        Picasso.with(ctx).load(basketItemList.get(position).getEntryPhoto().getThumb()).into(holder.itemPhoto);

        holder.basketMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(ctx, holder.basketMenu);
                popupMenu.inflate(R.menu.basket_menu);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){

                            case R.id.delete_from_basket:
                                //Удалить с козинки
                                Toast.makeText(ctx, basketItemList.get(position).getEntryTitle() + " повинно бути видалено :)", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.wish_wad:
                                //в список бажань
                                Toast.makeText(ctx, basketItemList.get(position).getEntryTitle() + " додано в бажання", Toast.LENGTH_SHORT).show();
                                break;
                            default:
                                break;
                        }
                        return false;
                    }
                });

                popupMenu.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return basketItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView goodName, goodDescription, goodPrice;
        public ImageView itemPhoto, basketMenu;


        public ViewHolder(View itemView) {
            super(itemView);
            goodName = (TextView) itemView.findViewById(R.id.good_name);
            goodDescription = (TextView) itemView.findViewById(R.id.good_description);
            goodPrice = (TextView) itemView.findViewById(R.id.price);
            itemPhoto = (ImageView) itemView.findViewById(R.id.item_photo);
            basketMenu = (ImageView) itemView.findViewById(R.id.basket_menu);
        }
    }
}