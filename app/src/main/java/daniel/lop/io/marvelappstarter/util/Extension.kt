package daniel.lop.io.marvelappstarter.util

import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment

fun Fragment.toast(message: String, duration: Int = Toast.LENGTH_LONG) {
    Toast.makeText(requireContext(), message, duration).show()
}

fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.INVISIBLE
}

fun String.limitDescription(characters: Int): String {
    return if (this.length > characters) {
        this.substring(0, characters) + "..."
    } else {
        this
    }
}