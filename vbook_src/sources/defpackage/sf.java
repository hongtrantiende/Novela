package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sf  reason: default package */
/* loaded from: classes.dex */
public final class sf implements k61 {
    public Canvas a = tf.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.k61
    public final void a(nl5 nl5Var, long j, long j2, long j3, long j4, ljc ljcVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap a = ay5.a(nl5Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect2.top = i4;
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = i4 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(a, rect, rect2, lre.k(ljcVar));
    }

    @Override // defpackage.k61
    public final void b(yj yjVar, ljc ljcVar) {
        Canvas canvas = this.a;
        if (yjVar instanceof yj) {
            canvas.drawPath(yjVar.a, lre.k(ljcVar));
        } else {
            xk5.q("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.k61
    public final void c(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.k61
    public final void d(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.k61
    public final void e(float f, float f2, float f3, float f4, float f5, float f6, ljc ljcVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, lre.k(ljcVar));
    }

    @Override // defpackage.k61
    public final void f(yj yjVar, int i) {
        Region.Op op;
        Canvas canvas = this.a;
        if (yjVar instanceof yj) {
            Path path = yjVar.a;
            if (i == 0) {
                op = Region.Op.DIFFERENCE;
            } else {
                op = Region.Op.INTERSECT;
            }
            canvas.clipPath(path, op);
            return;
        }
        xk5.q("Unable to obtain android.graphics.Path");
    }

    @Override // defpackage.k61
    public final void g(float f, float f2, float f3, float f4, ljc ljcVar) {
        this.a.drawRect(f, f2, f3, f4, lre.k(ljcVar));
    }

    @Override // defpackage.k61
    public final void h(rk9 rk9Var, ljc ljcVar) {
        this.a.saveLayer(rk9Var.a, rk9Var.b, rk9Var.c, rk9Var.d, lre.k(ljcVar), 31);
    }

    @Override // defpackage.k61
    public final void i() {
        this.a.save();
    }

    @Override // defpackage.k61
    public final void j() {
        dce.s(this.a, false);
    }

    @Override // defpackage.k61
    public final void k(float[] fArr) {
        if (!pye.n(fArr)) {
            Matrix matrix = new Matrix();
            fre.r(matrix, fArr);
            this.a.concat(matrix);
        }
    }

    @Override // defpackage.k61
    public final void l(nl5 nl5Var, long j, ljc ljcVar) {
        this.a.drawBitmap(ay5.a(nl5Var), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), lre.k(ljcVar));
    }

    @Override // defpackage.k61
    public final void n(float f, long j, ljc ljcVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) ljcVar.b);
    }

    @Override // defpackage.k61
    public final void o(float f, float f2, float f3, float f4, int i) {
        Region.Op op;
        Canvas canvas = this.a;
        if (i == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f, f2, f3, f4, op);
    }

    @Override // defpackage.k61
    public final void p(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.k61
    public final void q() {
        this.a.restore();
    }

    @Override // defpackage.k61
    public final void s(long j, long j2, ljc ljcVar) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) ljcVar.b);
    }

    @Override // defpackage.k61
    public final void t() {
        dce.s(this.a, true);
    }

    @Override // defpackage.k61
    public final void u(float f, float f2, float f3, float f4, float f5, float f6, boolean z, ljc ljcVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, z, (Paint) ljcVar.b);
    }
}
