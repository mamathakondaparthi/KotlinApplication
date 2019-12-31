package com.scienstechnologies.kotlinapplication

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity


class FragmentUtils {

    enum class FragmentAnimation {
        TRANSITION_POP,
        TRANSITION_FADE_IN_OUT,
        TRANSITION_SLIDE_LEFT_RIGHT,
        TRANSITION_SLIDE_LEFT_RIGHT_WITHOUT_EXIT,
        TRANSITION_NONE
    }

    companion object {

        fun replaceFragment(
            activity: AppCompatActivity,
            fragment: Fragment,
            addToBackStack: Boolean? = true,
            layoutId: Int? = R.id.fragment_container,
            animationType: FragmentAnimation? = FragmentAnimation.TRANSITION_POP
        ) {

            val fragmentManager = activity.supportFragmentManager
            val transaction = fragmentManager.beginTransaction()

            when (animationType) {
                FragmentAnimation.TRANSITION_SLIDE_LEFT_RIGHT -> {
                    transaction.setCustomAnimations(
                        R.anim.slide_in_from_rigth,
                        R.anim.slide_out_to_left,
                        R.anim.slide_in_from_left,
                        R.anim.slide_out_to_right
                    )
                }

                FragmentAnimation.TRANSITION_SLIDE_LEFT_RIGHT_WITHOUT_EXIT -> {
                    transaction.setCustomAnimations(R.anim.slide_in_from_rigth, 0)
                }

                FragmentAnimation.TRANSITION_FADE_IN_OUT -> {
                    transaction.setCustomAnimations(R.anim.anim_frag_fade_in, R.anim.anim_frag_fade_out)
                }

                FragmentAnimation.TRANSITION_POP -> {
                    transaction.setCustomAnimations(
                        R.anim.anim_enter,
                        R.anim.anim_exit,
                        R.anim.anim_pop_enter,
                        R.anim.anim_pop_exit
                    )
                }

                FragmentAnimation.TRANSITION_NONE -> {
                    transaction.setCustomAnimations(0, 0)
                }

            }

            if (addToBackStack!!)
                transaction.addToBackStack(fragment.javaClass.canonicalName)

            transaction.replace(layoutId!!, fragment, fragment.javaClass.canonicalName)
            transaction.commit()

        }
    }
}