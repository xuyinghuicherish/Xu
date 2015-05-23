package com.example.ui_gridviewAdapter;


import javax.security.auth.PrivateCredentialPermission;
import com.example.ui_gridview09.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AppGridAdapter  extends BaseAdapter
{
  private Context context;
   private int [] imageId={R.drawable.grid_payout,R.drawable.grid_bill,R.drawable.grid_report,R.drawable.grid_account_book,R.drawable
		   .grid_category,R.drawable.grid_user};
   private String [] tvInformation;
   public AppGridAdapter(Context context){
	   this.context=context;
	   tvInformation=context.getResources().getStringArray(R.array.inroductions);
   }
	@Override
	public int getCount()
	{
		return imageId.length;//返回的是小格子的数目
	}

	@Override
	public Object getItem(int position)
	{
		return imageId[position];
	}

	@Override
	public long getItemId(int position)
	{
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		
		ViewHolder viewHolder=null;//初始化
		if(convertView==null)//判断布局是否为空，如果为空，就加载布局
		{
			convertView=LayoutInflater.from(context).inflate(R.layout.main_body_item,null);
			//convertView=LayoutInflater.inflate(R.layout.main_body_item,null);
			viewHolder=new ViewHolder();
			viewHolder.ivIcon=(ImageView)convertView.findViewById(R.id.ivIcon);
			viewHolder.tvInformation =(TextView)convertView.findViewById(R.id.tvInformation);
			convertView.setTag(viewHolder);
		}else{
			viewHolder=(ViewHolder)convertView.getTag();
		}
		viewHolder.ivIcon.setImageResource(imageId[position]);
		viewHolder.tvInformation.setText(tvInformation[position]);
		return convertView;
		
	}
	 class ViewHolder{
		ImageView ivIcon;
		TextView   tvInformation;
	}

}
