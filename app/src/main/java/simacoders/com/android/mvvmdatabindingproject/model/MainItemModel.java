package simacoders.com.android.mvvmdatabindingproject.model;

public class MainItemModel {

    private int mId;

    private String mTitle;

    private int mImageId;

    private int mRatingNumber;

    private int mPrice;

    public MainItemModel(int mId, String mTitle, int mImageId, int mRatingNumber, int mPrice) {
        this.mId = mId;
        this.mTitle = mTitle;
        this.mImageId = mImageId;
        this.mRatingNumber = mRatingNumber;
        this.mPrice = mPrice;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public int getmImageId() {
        return mImageId;
    }

    public void setmImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public int getmRatingNumber() {
        return mRatingNumber;
    }

    public void setmRatingNumber(int mRatingNumber) {
        this.mRatingNumber = mRatingNumber;
    }

    public int getmPrice() {
        return mPrice;
    }

    public void setmPrice(int mPrice) {
        this.mPrice = mPrice;
    }
}
