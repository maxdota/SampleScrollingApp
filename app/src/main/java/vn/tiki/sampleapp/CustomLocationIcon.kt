package vn.tiki.sampleapp

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CustomLocationIcon @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttrs: Int = 0
) : View(
    context, attrs, defStyleAttrs
) {

    val paintCircleBlue = Paint().apply {
        color = Color.parseColor("#C3D4F1")
        style = Paint.Style.FILL
        isAntiAlias = true
    }

    val paintCircleStrokeWhite = Paint().apply {
        color = Color.parseColor("#FFFFFF")
        style = Paint.Style.FILL
        isAntiAlias = true
    }

    val paintCircleStrokeBlue = Paint().apply {
        color = Color.parseColor("#346DF0")
        style = Paint.Style.STROKE
        isAntiAlias = true
        strokeWidth = 3f
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.let {
            it.drawCircle(10f, 10f, 10f, paintCircleBlue)
            it.drawCircle(10f, 10f, 13f, paintCircleStrokeWhite)
            it.drawCircle(10f, 10f, 16f, paintCircleStrokeBlue)
        }
    }
}