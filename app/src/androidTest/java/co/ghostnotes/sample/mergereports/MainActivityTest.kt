package co.ghostnotes.sample.mergereports

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.filters.LargeTest
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {

    @get:Rule
    val activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun messageButton_clicked() {
        val preMessage = "No message"
        val postMessage = "Hello!"

        // Before
        onView(withId(R.id.message_text)).check(matches(withText(preMessage)))

        // Test
        onView(withId(R.id.test_button)).perform(click())
        onView(withId(R.id.message_text)).check(matches(withText(postMessage)))
    }

}
