package com.luisrodriguez.android.criminalintent;



import java.util.UUID;
import java.util.Date;
/**
 * Created by Luis Antonio on 13/04/2018.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime () {
        mId = UUID.randomUUID();
        mDate = new Date ();
    }
    public UUID getmId() {
        return mId;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public boolean ismSolved() {
        return mSolved;
    }
}
