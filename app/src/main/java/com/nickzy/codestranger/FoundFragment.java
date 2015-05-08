package com.nickzy.codestranger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * 发现Fragment的界面
 */
public class FoundFragment extends Fragment {
	private Button btn_findfriend;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater,container,savedInstanceState);
		View view = inflater.inflate(R.layout.found_fragment,container,false);
		btn_findfriend = (Button)view.findViewById(R.id.btn_findfriend);
		btn_findfriend.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(getActivity(),FindfriendActivity.class);
				startActivity(intent);
			}
		});
		return view;
	}
}
