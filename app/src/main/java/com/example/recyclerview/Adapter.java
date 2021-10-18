package com.example.recyclerview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.cardViewNesneTutucu> {
    private Context context;
    private List<String> ulkelerListesi;

    public Adapter(Context context, List<String> ulkelerListesi) {
        this.context = context;
        this.ulkelerListesi = ulkelerListesi;
    }

    public class cardViewNesneTutucu extends RecyclerView.ViewHolder {
        private TextView satirYazi;
        private CardView satirCardView;

        public cardViewNesneTutucu(View view) {
            super(view);
            satirYazi = view.findViewById(R.id.satirYazi);
            satirCardView = view.findViewById(R.id.satirCardView);


        }
    }

    @NonNull
    @Override
    public cardViewNesneTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_tasarim, parent, false);


        return new cardViewNesneTutucu(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull cardViewNesneTutucu holder, int position) {
            String ulke =ulkelerListesi.get(position);
            holder.satirYazi.setText(ulke);
            holder.satirCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
    }

    @Override
    public int getItemCount() {
        return ulkelerListesi.size();
    }


}

