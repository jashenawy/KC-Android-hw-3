package com.example.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.Items;
import com.example.myapplication.R;

import java.util.List;
public class ItemAdapter extends ArrayAdapter<Items> {
  List<Items> itemsListAdapter;

  public ItemAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
    super(context, resource, objects);
    itemsListAdapter = objects;
  }

  @NonNull
  @Override
  public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    View view = LayoutInflater.from(getContext()).inflate(R.layout.layout, parent, false);
   Items currentItem = itemsListAdapter.get(position);

    ImageView imageView = view.findViewById(R.id.image);
    TextView itemName = view.findViewById(R.id.textView);

    imageView.setImageResource(currentItem.getItemImage());
    itemName.setText(currentItem.getItemName());






      ImageView deletButton = view.findViewById(R.id.delete);
      deletButton.setOnClickListener(new View.OnClickListener() {
          Items remove = itemsListAdapter.get(position);
          @Override
          public void onClick(View view) {
              AlertDialog.Builder Builder = new AlertDialog.Builder(getContext()).setMessage("Are you sure you want to remove this?")
                      .setTitle("Confirmation").setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialogInterface, int i) {
                              itemsListAdapter.remove(remove);
                              notifyDataSetChanged();
                          }
                      }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialogInterface, int i) {
                              dialogInterface.dismiss();
                          }
                      });
              Builder.show();
          }
      });









    return view;

















  }
}
