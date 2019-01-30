package edu.tjrac.swant.baselib.common.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import java.util.*

/**
 * Created by wpc on 2016/11/18.
 */
class FragmentsPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    val mFragments: MutableList<Fragment> = ArrayList()
    val mFragmentTitles: MutableList<String> = ArrayList()

    fun addFragment(fragment: Fragment, title: String) {
        mFragments.add(fragment)
        mFragmentTitles.add(title)
    }

    override fun getItem(i: Int): Fragment {
        return mFragments[i]
    }

    override fun getCount(): Int {
        return mFragments.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitles[position]
    }

    fun getFragmentByTitle(title: String): Fragment {
        val i = mFragmentTitles.indexOf(title)
        return mFragments[i]
    }


}