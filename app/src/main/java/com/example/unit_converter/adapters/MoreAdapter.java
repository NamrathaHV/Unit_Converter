package com.example.unit_converter.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import androidx.annotation.NonNull;

import com.google.android.material.snackbar.Snackbar;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.unit_converter.DisclaimerActivity;
import com.example.unit_converter.MainActivity;
import com.example.unit_converter.R;
import com.example.unit_converter.models.DataItemMore;

import java.util.List;

public class MoreAdapter extends RecyclerView.Adapter<MoreAdapter.ViewHolder> {

    private final List<DataItemMore> mItems;
    private final Context mContext;

    private static final String URL_LINKEDIN1 = "https://www.linkedin.com/in/namratha-h-v-2702";
    private static final String URL_LINKEDIN2 = "https://www.linkedin.com/in/sahana-s-gowda-1708";
    //public static String URL_STORE;

    public MoreAdapter(Context context, List<DataItemMore> items) {
        this.mContext = context;
        this.mItems = items;
        //URL_STORE = "" + mContext.getPackageName();
    }

    @NonNull
    @Override
    public MoreAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                     int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View itemView = inflater.inflate(R.layout.list_item_more, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final DataItemMore item = mItems.get(position);

        holder.textView.setText(item.getTitle());

        holder.textView.setOnClickListener(view -> {
            switch (item.getId()) {

                case "support_feedback":
                    String EMAIL = "1rn18cs089.sahanasg@gmail.com";
                    String[] emailAddress = {EMAIL};
                    Intent supportFeedback = new Intent(Intent.ACTION_SENDTO);
                    supportFeedback.setData(Uri.parse("mailto:"));
                    supportFeedback.putExtra(Intent.EXTRA_EMAIL, emailAddress);
                    supportFeedback.putExtra(Intent.EXTRA_SUBJECT,
                            mContext.getString(R.string.app_name));
                    supportFeedback.putExtra(Intent.EXTRA_TEXT,
                            MainActivity.DEVICE_INFORMATION + "\nApp Version: " +
                                    MainActivity.APP_VERSION +
                                    "\n--------------------------------------\nFeedback:");
                    mContext.startActivity(Intent.createChooser(supportFeedback,
                            mContext.getString(R.string.string_more_title_support_feedback)));
                    break;

                case "about_disclaimer":
                    mContext.startActivity(new Intent(mContext, DisclaimerActivity.class));
                    break;
                case "about_linkedin1":
                    Intent about_linkedin1 = new Intent(Intent.ACTION_VIEW, Uri.parse(URL_LINKEDIN1));
                    mContext.startActivity(Intent.createChooser(about_linkedin1,
                            mContext.getString(R.string.string_more_title_support_open)));
                    break;
                case "about_linkedin2":
                    Intent about_linkedin2 = new Intent(Intent.ACTION_VIEW, Uri.parse(URL_LINKEDIN2));
                    mContext.startActivity(Intent.createChooser(about_linkedin2,
                            mContext.getString(R.string.string_more_title_support_open)));
                    break;
                case "language_english":
                    Snackbar.make(holder.mView, "English", Snackbar.LENGTH_SHORT).show();
                    break;
                case "language_kannada":
                    Snackbar.make(holder.mView, "Kannada", Snackbar.LENGTH_SHORT).show();
                    break;
                case "language_hindi":
                    Snackbar.make(holder.mView, "Hindi", Snackbar.LENGTH_SHORT).show();
                    break;
                case "language_korean":
                    Snackbar.make(holder.mView, "Korean", Snackbar.LENGTH_SHORT).show();
                    break;
                case "language_japanese":
                    Snackbar.make(holder.mView, "Japanese", Snackbar.LENGTH_SHORT).show();
                    break;
                case "language_urdu":
                    Snackbar.make(holder.mView, "Urdu", Snackbar.LENGTH_SHORT).show();
                    break;
            }
        });
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        View mView;
        TextView textView;

        ViewHolder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.tv_list_more);

            mView = itemView;
        }
    }
}
