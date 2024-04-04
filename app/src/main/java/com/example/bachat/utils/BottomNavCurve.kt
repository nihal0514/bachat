package com.example.bachat.utils

import android.graphics.PointF
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

private const val CURVE_CIRCLE_RADIUS =  53

private val mFirstCurveStartPoint = PointF()
private val mFirstCurveControlPoint1 = PointF()
private val mFirstCurveControlPoint2 = PointF()
private val mFirstCurveEndPoint = PointF()

private val mSecondCurveControlPoint1 = PointF()
private val mSecondCurveControlPoint2 = PointF()
private var mSecondCurveStartPoint = PointF()
private val mSecondCurveEndPoint = PointF()


class BottomNavCurve : Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return Outline.Generic(path = Path().apply {

            mFirstCurveStartPoint.set(
                (size.width / 2) - (CURVE_CIRCLE_RADIUS * 3) - (CURVE_CIRCLE_RADIUS / 3),
                0F
            );
            mFirstCurveEndPoint.set(
                size.width / 2,
                (CURVE_CIRCLE_RADIUS + (CURVE_CIRCLE_RADIUS / 4)).toFloat()
            );
            mSecondCurveStartPoint = mFirstCurveEndPoint;
            mSecondCurveEndPoint.set(
                (size.width / 2) + (CURVE_CIRCLE_RADIUS * 3) + (CURVE_CIRCLE_RADIUS / 3),
                0F
            );

            mFirstCurveControlPoint1.set(
                mFirstCurveStartPoint.x + CURVE_CIRCLE_RADIUS + (CURVE_CIRCLE_RADIUS / 4),
                mFirstCurveStartPoint.y
            );
            mFirstCurveControlPoint2.set(
                mFirstCurveEndPoint.x - (CURVE_CIRCLE_RADIUS * 2) + CURVE_CIRCLE_RADIUS,
                mFirstCurveEndPoint.y
            );

            mSecondCurveControlPoint1.set(
                mSecondCurveStartPoint.x + (CURVE_CIRCLE_RADIUS * 2) - CURVE_CIRCLE_RADIUS,
                mSecondCurveStartPoint.y
            );
            mSecondCurveControlPoint2.set(
                mSecondCurveEndPoint.x - (CURVE_CIRCLE_RADIUS + (CURVE_CIRCLE_RADIUS / 4)),
                mSecondCurveEndPoint.y
            );

            mFirstCurveStartPoint.set(
                (size.width / 2) - (CURVE_CIRCLE_RADIUS * 2) - (CURVE_CIRCLE_RADIUS / 3),
                0F
            );
            mFirstCurveEndPoint.set(
                size.width / 2,
                (CURVE_CIRCLE_RADIUS + (CURVE_CIRCLE_RADIUS / 4)).toFloat()
            );
            mSecondCurveStartPoint = mFirstCurveEndPoint;
            mSecondCurveEndPoint.set(
                (size.width / 2) + (CURVE_CIRCLE_RADIUS * 2) + (CURVE_CIRCLE_RADIUS / 3),
                0F
            );

            mFirstCurveControlPoint1.set(
                mFirstCurveStartPoint.x + CURVE_CIRCLE_RADIUS + (CURVE_CIRCLE_RADIUS / 4),
                mFirstCurveStartPoint.y
            );
            mFirstCurveControlPoint2.set(
                mFirstCurveEndPoint.x - (CURVE_CIRCLE_RADIUS * 2) + CURVE_CIRCLE_RADIUS,
                mFirstCurveEndPoint.y
            );

            mSecondCurveControlPoint1.set(
                mSecondCurveStartPoint.x + (CURVE_CIRCLE_RADIUS * 2) - CURVE_CIRCLE_RADIUS,
                mSecondCurveStartPoint.y
            );
            mSecondCurveControlPoint2.set(
                mSecondCurveEndPoint.x - (CURVE_CIRCLE_RADIUS + (CURVE_CIRCLE_RADIUS / 4)),
                mSecondCurveEndPoint.y
            );

            moveTo(0F, 0F);
            lineTo(mFirstCurveStartPoint.x, mFirstCurveStartPoint.y);

            cubicTo(
                mFirstCurveControlPoint1.x, mFirstCurveControlPoint1.y,
                mFirstCurveControlPoint2.x, mFirstCurveControlPoint2.y,
                mFirstCurveEndPoint.x, mFirstCurveEndPoint.y
            );

            cubicTo(
                mSecondCurveControlPoint1.x, mSecondCurveControlPoint1.y,
                mSecondCurveControlPoint2.x, mSecondCurveControlPoint2.y,
                mSecondCurveEndPoint.x, mSecondCurveEndPoint.y
            );

            lineTo(size.width, 0F);
            lineTo(size.width, size.height);
            lineTo(0F, size.height);
            close();
        })
    }
}
