package com.promatics.androidcustomlistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;

import com.promatics.androidcustomlistview.adapters.CustomAdapter;
import com.promatics.androidcustomlistview.beanclass.CustomListItems;


public class CustomListViewActivity extends Activity {

	
	CustomListItems custom_list_items[] = new CustomListItems[] {
			new CustomListItems(R.drawable.contacts_image, "A","First Alphabet of the letters", R.drawable.arrow_right),
			new CustomListItems(R.drawable.contacts_image, "B","Second Alphabet of the letters", R.drawable.arrow_right),
			new CustomListItems(R.drawable.contacts_image, "C","Third Alphabet of the letters", R.drawable.arrow_right),
			new CustomListItems(R.drawable.contacts_image, "D","Forth Alphabet of the letters", R.drawable.arrow_right),
			new CustomListItems(R.drawable.contacts_image, "F","Fifth Alphabet of the letters", R.drawable.arrow_right),
			new CustomListItems(R.drawable.contacts_image, "G","Sixth Alphabet of the letters", R.drawable.arrow_right),
			new CustomListItems(R.drawable.contacts_image, "H","Seventh Alphabet of the letters", R.drawable.arrow_right),
			new CustomListItems(R.drawable.contacts_image, "I","Eighth Alphabet of the letters", R.drawable.arrow_right),
			new CustomListItems(R.drawable.contacts_image, "J","Ninth Alphabet of the letters", R.drawable.arrow_right),
			new CustomListItems(R.drawable.contacts_image, "K","Tenth Alphabet of the letters", R.drawable.arrow_right)

	};
	
	ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        
        lv = (ListView)findViewById(R.id.listView1);
        
        CustomAdapter  adapter = new CustomAdapter(this, R.layout.list_item, custom_list_items);
        lv.setAdapter(adapter);
       
        lv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				
			}
		});
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.custom_list_view, menu);
        return true;
    }
    
}
