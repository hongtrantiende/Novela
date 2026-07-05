package defpackage;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ck3  reason: default package */
/* loaded from: classes.dex */
public final class ck3 extends CharacterStyle implements UpdateAppearance {
    public final bk3 a;

    public ck3(bk3 bk3Var) {
        this.a = bk3Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        PathEffect pathEffect;
        if (textPaint != null) {
            ye4 ye4Var = ye4.a;
            bk3 bk3Var = this.a;
            if (c16.i(bk3Var, ye4Var)) {
                textPaint.setStyle(Paint.Style.FILL);
            } else if (bk3Var instanceof s4b) {
                textPaint.setStyle(Paint.Style.STROKE);
                s4b s4bVar = (s4b) bk3Var;
                textPaint.setStrokeWidth(s4bVar.a);
                textPaint.setStrokeMiter(s4bVar.b);
                int i = s4bVar.d;
                if (i == 0) {
                    join = Paint.Join.MITER;
                } else if (i == 1) {
                    join = Paint.Join.ROUND;
                } else if (i == 2) {
                    join = Paint.Join.BEVEL;
                } else {
                    join = Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i2 = s4bVar.c;
                if (i2 == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i2 == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (i2 == 2) {
                    cap = Paint.Cap.SQUARE;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                zj zjVar = s4bVar.e;
                if (zjVar != null) {
                    pathEffect = zjVar.a;
                } else {
                    pathEffect = null;
                }
                textPaint.setPathEffect(pathEffect);
            } else {
                xk5.o();
            }
        }
    }
}
