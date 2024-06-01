package com.example.medix.ui.customview

import android.content.Context
import android.util.AttributeSet
import android.util.Patterns
import androidx.appcompat.widget.AppCompatEditText

class EmailEditText @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : AppCompatEditText(context, attrs) {
    override fun onTextChanged(
        text: CharSequence,
        start: Int,
        lengthBefore: Int,
        lengthAfter: Int
    ) {
        if (text.toString().isNotEmpty())
            error = if (!Patterns.EMAIL_ADDRESS.matcher(text).matches()){
                "Invalid Email"
            } else {
                null
            }
        super.onTextChanged(text, start, lengthBefore, lengthAfter)
    }
}