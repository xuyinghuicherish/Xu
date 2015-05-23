package com.example.ui_gridview09;

import com.example.ui_gridviewAdapter.AppGridAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends Activity
{
 private GridView gridView;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_body);
		
		gridView = (GridView) findViewById(R.id.gvAppGrid);
		AppGridAdapter adapter=new AppGridAdapter(this);
		gridView.setAdapter(adapter);
	}

}
