package com.example.listexample;

import java.util.ArrayList;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity {
	
	private final static String mTag = "MainActivity";
	private ListView mList = null;
	private MyAdapter mAdapter = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mAdapter = new MyAdapter();
		mList = (ListView)findViewById(R.id.lvlist);
		mList.setAdapter(mAdapter);
		
		//Add elements
		mAdapter.addElement("David1");
		mAdapter.addElement("David2");
		mAdapter.addElement("David3");
		mAdapter.addElement("David4");
		mAdapter.addElement("David5");
		mAdapter.addElement("David6");
		mAdapter.addElement("David7");
		mAdapter.addElement("David8");
		mAdapter.addElement("David9");
		mAdapter.addElement("David10");
		mAdapter.addElement("David11");
		mAdapter.addElement("David12");
		mAdapter.addElement("David13");
		mAdapter.addElement("David14");
		mAdapter.addElement("David1");
		mAdapter.addElement("David2");
		mAdapter.addElement("David3");
		mAdapter.addElement("David4");
		mAdapter.addElement("David5");
		mAdapter.addElement("David6");
		mAdapter.addElement("David7");
		mAdapter.addElement("David8");
		mAdapter.addElement("David9");
		mAdapter.addElement("David10");
		mAdapter.addElement("David11");
		mAdapter.addElement("David12");
		mAdapter.addElement("David13");
		mAdapter.addElement("David14");
		
	}
	
	private class MyAdapter extends BaseAdapter {
		
		ArrayList<String> mData = new ArrayList<String>(); 
		
		public void addElement(String name){
			mData.add(name);
			notifyDataSetChanged();
		}
		
		public void clear(){
			mData.clear();
		}

		@Override
		public int getCount() {
			return mData.size();
		}

		@Override
		public Object getItem(int position) {
			return mData.get(position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ViewHolder viewHolder = new ViewHolder();
			
			if (convertView == null){
				Log.d(mTag, "getView: creating new row for positioning" + position);
				
				convertView = getLayoutInflater().inflate(R.layout.row_list1, null);
				
				viewHolder = new ViewHolder();
				viewHolder.setTextView((TextView)convertView.findViewById(R.id.txtName));
				convertView.setTag(viewHolder);
			}else{
				Log.d(mTag, "getView: reusing row for positioning" + position);
			}
			
			//Change content
			String name = (String)getItem(position);
			viewHolder.getTextView().setText(name);
			
			return convertView;
		}
		
		//HolderPattern
		private class ViewHolder{
			private TextView mTextView = null;
			
			public TextView getTextView(){
				return mTextView;
			}
			
			public void setTextView(TextView mTextView){
				this.mTextView = mTextView;
			}
			
		}
	}
}
