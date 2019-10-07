package simacoders.com.android.mvvmdatabindingproject.main;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import simacoders.com.android.mvvmdatabindingproject.R;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton mFloatingActionButton;
    private Toolbar mToolbar;
    private TextView mRatingNumberText, mTitleText, mPriceText;
    private EditText mSearchEditText;
    private ImageView mSearchImage, mItemImage;
    private RatingBar mRatingBar;
    private Button mSelectItemButton, mAddToCardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();

        setListeners();

        setSupportActionBar(mToolbar);

    }

    private void setupViews() {

        mFloatingActionButton = findViewById(R.id.fab_main_show);

        mRatingNumberText = findViewById(R.id.txt_main_rating_number);
        mTitleText = findViewById(R.id.txt_main_title_text);
        mPriceText = findViewById(R.id.txt_main_price);

        mSearchEditText = findViewById(R.id.edt_main_search);

        mSearchImage = findViewById(R.id.img_main_search);
        mItemImage = findViewById(R.id.img_main_item_pic);

        mRatingBar = findViewById(R.id.rbar_main_rating);

        mSelectItemButton = findViewById(R.id.btn_main_select_item);
        mAddToCardButton = findViewById(R.id.btn_main_add_card);

        mToolbar = findViewById(R.id.toolbar);


    }

    private void setListeners() {

    }

}
