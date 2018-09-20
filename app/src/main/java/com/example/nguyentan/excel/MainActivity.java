package com.example.nguyentan.excel;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   LinearLayout linearLayoutRoot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ceateRelativeLayout();
        setContentView(linearLayoutRoot);

    }

    @SuppressLint({"ResourceAs Color", "ResourceAsColor"})
    private void ceateRelativeLayout() {
        linearLayoutRoot = new LinearLayout(this);

        //-------------------------- Creat bar title Hozirontal----------------------

        TextView textViewgoc = new TextView(this);
        RelativeLayout.LayoutParams layoutParamsgoc = new RelativeLayout.LayoutParams(140, 80);
        textViewgoc.setId(R.id.txtgoc);
        linearLayoutRoot.addView(textViewgoc, layoutParamsgoc);

        TextView goch = new TextView(this);
        RelativeLayout.LayoutParams paramgoch = new RelativeLayout.LayoutParams(2, ViewGroup.LayoutParams.WRAP_CONTENT);
        goch.setBackgroundColor(R.color.colorAccent);
        paramgoch.addRule(RelativeLayout.RIGHT_OF, textViewgoc.getId());
        linearLayoutRoot.addView(goch, paramgoch);

        TextView gocv = new TextView(this);
        RelativeLayout.LayoutParams paramsV = new RelativeLayout.LayoutParams(140, 2);
        paramsV.addRule(RelativeLayout.BELOW, textViewgoc.getId());
        gocv.setBackgroundColor(R.color.colorAccent);
        linearLayoutRoot.addView(gocv, paramsV);


        // -----------------------Create bar HORIZONTAL----------------------------
        RelativeLayout relativeLayouttitleHozirontal = new RelativeLayout(this);
        relativeLayouttitleHozirontal.setId(R.id.relativeLayouttitleHozirontal);
        RelativeLayout.LayoutParams layoutParamstitleHozirontal = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamstitleHozirontal.addRule(RelativeLayout.RIGHT_OF, textViewgoc.getId());

        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this);
        horizontalScrollView.setId(R.id.titlehorizontal);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);

        LinearLayout linearLayoutHozirontal = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParamsHozirontal = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT);
        linearLayoutHozirontal.setOrientation(LinearLayout.HORIZONTAL);
        for (int i = 0; i < 100; i++) {
            TextView a = new TextView(this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(2, 80);
            a.setBackgroundColor(R.color.colorAccent);
            linearLayoutHozirontal.addView(a, params);

            TextView titleHorizontal = new TextView(this);
            LinearLayout.LayoutParams layoutParamstitle = new LinearLayout.LayoutParams(200,80);
            layoutParamstitle.gravity=Gravity.CENTER_HORIZONTAL;
            titleHorizontal.setText("  a   ");
            linearLayoutHozirontal.addView(titleHorizontal, layoutParamstitle);

            TextView textphancach = new TextView(this);
            LinearLayout.LayoutParams paramv = new LinearLayout.LayoutParams(140, 2);
            textphancach.setBackgroundColor(R.color.colorAccent);
            linearLayoutHozirontal.addView(textphancach, paramv);
        }
        horizontalScrollView.addView(linearLayoutHozirontal, layoutParamsHozirontal);
        relativeLayouttitleHozirontal.addView(horizontalScrollView);
        linearLayoutRoot.addView(relativeLayouttitleHozirontal, layoutParamstitleHozirontal);


        //--------------------------Create bar Vertical-------------------------------
        RelativeLayout relativeLayouttitleVertical = new RelativeLayout(this);
        relativeLayouttitleVertical.setId(R.id.relativeLayouttitleVertical);
        RelativeLayout.LayoutParams layoutParamstitleVertical = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamstitleVertical.addRule(RelativeLayout.BELOW, textViewgoc.getId());

        ScrollView scrollViewVertical = new ScrollView(this);
        scrollViewVertical.setId(R.id.titleVertical);
        scrollViewVertical.setVerticalScrollBarEnabled(false);

        LinearLayout linearLayoutVertical = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParamsVertical = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        linearLayoutVertical.setOrientation(LinearLayout.VERTICAL);
        for (int i = 1; i < 100; i++) {
            TextView ab = new TextView(this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(140, 2);
            ab.setBackgroundColor(R.color.colorAccent);
            linearLayoutVertical.addView(ab, params);

            TextView titleVertical = new TextView(this);
            LinearLayout.LayoutParams layoutParamsVerticalIn = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT, 80);
            titleVertical.setText(Integer.toString(i));
            layoutParamsVerticalIn.gravity = Gravity.CENTER;
            linearLayoutVertical.addView(titleVertical, layoutParamsVerticalIn);

//            TextView textH = new TextView(this);
//            LinearLayout.LayoutParams paramh = new LinearLayout.LayoutParams(2, 80);
//            textH.setBackgroundColor(R.color.colorAccent);
//            linearLayoutVertical.addView(textH, paramh);
        }
        scrollViewVertical.addView(linearLayoutVertical, layoutParamsVertical);
        relativeLayouttitleVertical.addView(scrollViewVertical);
        linearLayoutRoot.addView(relativeLayouttitleVertical, layoutParamstitleVertical);


        // --------------------RealativeLayutCenter-----------------------
        //================= theo chiều ngang==========================
        RelativeLayout RlleVertical = new RelativeLayout(this);
        RelativeLayout.LayoutParams luParamstitleVertical = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        luParamstitleVertical.addRule(RelativeLayout.RIGHT_OF, relativeLayouttitleVertical.getId());
        luParamstitleVertical.addRule(RelativeLayout.BELOW, relativeLayouttitleHozirontal.getId());

        HorizontalScrollView horizontalScrollViewcrnter = new HorizontalScrollView(this);
        horizontalScrollViewcrnter.setHorizontalScrollBarEnabled(false);

        LinearLayout lnHozirontal = new LinearLayout(this);
        lnHozirontal.setOrientation(LinearLayout.HORIZONTAL);

        //==============theo chiều dọc================
        ScrollView scllViewVertical = new ScrollView(this);
        scllViewVertical.setVerticalScrollBarEnabled(false);

        LinearLayout lnLayoutVertical = new LinearLayout(this);
        lnLayoutVertical.setOrientation(LinearLayout.VERTICAL);
        for (int i = 0; i < 100; i++) {
            LinearLayout linearLayoutHozirontalcenter = new LinearLayout(this);
            linearLayoutHozirontalcenter.setOrientation(LinearLayout.HORIZONTAL);
            for (int j = 0; j < 100; j++) {
                TextView centerH = new TextView(this);
                LinearLayout.LayoutParams paramsaa = new LinearLayout.LayoutParams(2, 82);
                centerH.setBackgroundColor(R.color.colorAccent);
                linearLayoutHozirontalcenter.addView(centerH, paramsaa);

                TextView editTextHorizontal = new TextView(this);
                LinearLayout.LayoutParams layoutParamH = new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,82);
                editTextHorizontal.setText("");
                linearLayoutHozirontalcenter.addView(editTextHorizontal, layoutParamH);
//
//                TextView centerV = new TextView(this);
//                LinearLayout.LayoutParams paramsVV = new LinearLayout.LayoutParams(200, 2);
//                centerV.setBackgroundColor(R.color.colorAccent);
//                linearLayoutHozirontalcenter.addView(centerV, paramsVV);
            }
            lnLayoutVertical.addView(linearLayoutHozirontalcenter);
        }
        scllViewVertical.addView(lnLayoutVertical);
        lnHozirontal.addView(scllViewVertical);
        horizontalScrollViewcrnter.addView(lnHozirontal);
        RlleVertical.addView(horizontalScrollViewcrnter);
        linearLayoutRoot.addView(RlleVertical, luParamstitleVertical);
    }

}