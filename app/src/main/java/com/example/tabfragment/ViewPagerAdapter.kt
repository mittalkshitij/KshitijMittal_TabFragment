package com.example.tabfragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter : FragmentPagerAdapter {

    private final var fragmentList1: ArrayList<Fragment> = ArrayList()
    private final var fragmentTitleList1: ArrayList<String> = ArrayList()

    // this is a secondary constructor of ViewPagerAdapter class.
    public constructor(supportFragmentManager: FragmentManager)
            : super(supportFragmentManager)

    override fun getCount(): Int {
        return fragmentList1.size
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList1.get(position)
    }

    fun addFragment(fragment: Fragment, title: String) {
        fragmentList1.add(fragment)
        fragmentTitleList1.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitleList1.get(position)
    }
}
