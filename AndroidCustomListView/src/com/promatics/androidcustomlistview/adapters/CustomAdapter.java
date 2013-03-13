package com.promatics.androidcustomlistview.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.promatics.androidcustomlistview.R;
import com.promatics.androidcustomlistview.beanclass.CustomListItems;

public class CustomAdapter extends ArrayAdapter<CustomListItems> {

	CustomListItems[] dataItems;
	Context context;
	int layoutResourceId;
	
	public CustomAdapter(Context context, int textViewResourceId,
			CustomListItems[] objects) {
		super(context, textViewResourceId, objects);
		this.context = context;
		this.layoutResourceId = textViewResourceId;
		this.dataItems = objects;
	}


	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		ViewHolder holder = null;

		if (row == null) {
			LayoutInflater inflater = ((Activity)context).getLayoutInflater();
			row = inflater.inflate(layoutResourceId, parent, false);

			holder = new ViewHolder();
			holder.contactImg = (ImageView) row.findViewById(R.id.iv_ContactImg);
			holder.txtTitle = (TextView) row.findViewById(R.id.tv_title);
			holder.txtDescription = (TextView) row.findViewById(R.id.tv_description);
			holder.right_arrow = (ImageView) row.findViewById(R.id.iv_arrowImg);

			row.setTag(holder);
		} else {
			holder = (ViewHolder) row.getTag();
		}

		CustomListItems customsitmes = dataItems[position];
		holder.txtTitle.setText(customsitmes.title);
		holder.contactImg.setImageResource(customsitmes.contactImage);
		holder.right_arrow.setImageResource(customsitmes.arrow_right);
		holder.txtDescription.setText(customsitmes.description);
		return row;
	}

	

	static class ViewHolder {
		ImageView contactImg, right_arrow;
		TextView txtTitle, txtDescription;
	}

}
