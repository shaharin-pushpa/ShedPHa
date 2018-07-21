package com.example.kowshick.dummyapp;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>implements Filterable {

    private List<Product>products;
    private List<Product>filteredlist;
    private Context context;
    public ProductAdapter(List<Product> products,Context context) {
        this.products = products;
        this.context=context;
        filteredlist=products;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.product_row,parent,false);
        return new ProductViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, final int position) {
        holder.productText.setText("Type: "+filteredlist.get(position).getType());
        holder.productImg.setImageResource(filteredlist.get(position).getProductImage());
        holder.name.setText(filteredlist.get(position).getProductName());
        holder.price.setText("Price: "+filteredlist.get(position).getPrice());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Product pd=filteredlist.get(position);
                Intent intent=new Intent(context,ProductDetailsAcitivity.class);
                intent.putExtra("msg",pd);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return filteredlist.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                String query = constraint.toString();
                if(query.isEmpty()){
                    filteredlist = products;
                }else{
                    List<Product>tempList = new ArrayList<>();
                    for(Product m : products){
                        if(m.getProductName().toLowerCase().contains(query.toLowerCase()) ||
                                m.getType().toLowerCase().contains(query.toLowerCase())){
                            tempList.add(m);
                        }
                    }
                    filteredlist = tempList;

                }
                FilterResults results = new FilterResults();
                results.values = filteredlist;
                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                filteredlist = (List<Product>) results.values;
                notifyDataSetChanged();

            }
        };
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder{
         TextView productText,name,price;
        ImageView productImg;
        public View layout;
        public ProductViewHolder(View itemView) {
            super(itemView);
            layout=itemView;
            productImg=itemView.findViewById(R.id.productIV);
            productText=itemView.findViewById(R.id.productInfoInput);
            name=itemView.findViewById(R.id.productName);
            price=itemView.findViewById(R.id.productPrice);

        }
    }


}
