package cn.edu.gdmec.android.boxuegu.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;


public class AdBannerFragment extends Fragment {

    private String ab;
    private ImageView iv;

    public static AdBannerFragment newInstance(Bundle args){
        AdBannerFragment af = new AdBannerFragment();
        af.setArguments(args);
        return af;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arg = getArguments();
        ab = arg.getString("ad");
    }

    @Override
    public void onResume() {
        super.onResume();
        if (ab != null){
            if ("banner_1".equals(ab)){
                iv.setImageResource(R.drawable.banner_1);
            }else if ("banner_2".equals(ab)){
                iv.setImageResource(R.drawable.banner_2);
            }else if ("banner_3".equals(ab)){
                iv.setImageResource(R.drawable.banner_3);
            }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (iv != null){
            iv.setImageDrawable(null);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        iv = new ImageView(getActivity());
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
        iv.setLayoutParams(lp);
        iv.setScaleType(ImageView.ScaleType.FIT_XY);
        return iv;
    }
}
