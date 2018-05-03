package com.luisrodriguez.android.criminalintent;
import android.support.v4.app.Fragment;
/**
 * Created by Luis Antonio on 02/05/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment(); 
    }
}