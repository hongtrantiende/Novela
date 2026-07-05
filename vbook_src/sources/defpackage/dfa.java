package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dfa  reason: default package */
/* loaded from: classes.dex */
public final class dfa extends hfa {
    public final ffa c;
    public final float d;
    public final float e;

    public dfa(ffa ffaVar, float f, float f2) {
        this.c = ffaVar;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.hfa
    public final void a(Matrix matrix, tea teaVar, int i, Canvas canvas) {
        ffa ffaVar = this.c;
        float f = ffaVar.c;
        float f2 = this.e;
        float f3 = ffaVar.b;
        float f4 = this.d;
        RectF rectF = new RectF(nae.e, nae.e, (float) Math.hypot(f - f2, f3 - f4), nae.e);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        teaVar.getClass();
        rectF.bottom += i;
        rectF.offset(nae.e, -i);
        int i2 = teaVar.c;
        int[] iArr = tea.i;
        iArr[0] = i2;
        iArr[1] = teaVar.b;
        iArr[2] = teaVar.a;
        Paint paint = (Paint) teaVar.f;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, tea.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        ffa ffaVar = this.c;
        return (float) Math.toDegrees(Math.atan((ffaVar.c - this.e) / (ffaVar.b - this.d)));
    }
}
