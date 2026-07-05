package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cfa  reason: default package */
/* loaded from: classes.dex */
public final class cfa extends hfa {
    public final efa c;

    public cfa(efa efaVar) {
        this.c = efaVar;
    }

    @Override // defpackage.hfa
    public final void a(Matrix matrix, tea teaVar, int i, Canvas canvas) {
        boolean z;
        efa efaVar = this.c;
        float f = efaVar.f;
        float f2 = efaVar.g;
        RectF rectF = new RectF(efaVar.b, efaVar.c, efaVar.d, efaVar.e);
        Paint paint = (Paint) teaVar.e;
        if (f2 < nae.e) {
            z = true;
        } else {
            z = false;
        }
        Path path = (Path) teaVar.h;
        int[] iArr = tea.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = teaVar.c;
            iArr[2] = teaVar.b;
            iArr[3] = teaVar.a;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = teaVar.a;
            iArr[2] = teaVar.b;
            iArr[3] = teaVar.c;
        }
        float width = rectF.width() / 2.0f;
        if (width <= nae.e) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float z2 = a82.z(1.0f, f4, 2.0f, f4);
        float[] fArr = tea.l;
        fArr[1] = f4;
        fArr[2] = z2;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, (Paint) teaVar.g);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
