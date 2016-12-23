package com.developer110.expandablelayoutsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.developer110.expandablelayout.ExpandableLayout;
import com.developer110.expandablelayout.ExpandableLayoutListView;


public class MainActivity extends Activity {

	private final String[] array = {"Hello", "World", "Android", "is", "Awesome", "World", "Android", "is", "Awesome", "World", "Android", "is", "Awesome", "World", "Android", "is", "Awesome"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.view_row, R.id.header_text, array);
		final ExpandableLayoutListView expandableLayoutListView = (ExpandableLayoutListView) findViewById(R.id.listview);

		expandableLayoutListView.setAdapter(arrayAdapter);

		final ExpandableLayout expandableLayout = (ExpandableLayout) findViewById(R.id.first);
		expandableLayout.setOnHeaderClickListener(new ExpandableLayout.OnHeaderClickListener() {
			@Override
			public void onClick(View view) {
				if (expandableLayout.isOpened()) {
					Toast.makeText(MainActivity.this, "Layout collapsed", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(MainActivity.this, "Layout expanded", Toast.LENGTH_SHORT).show();
				}
			}
		});

	}

}
