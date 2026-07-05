package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yj  reason: default package */
/* loaded from: classes.dex */
public final class yj {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public yj(Path path) {
        this.a = path;
    }

    public static void a(yj yjVar, rk9 rk9Var) {
        if (yjVar.b == null) {
            yjVar.b = new RectF();
        }
        RectF rectF = yjVar.b;
        rectF.getClass();
        rectF.set(rk9Var.a, rk9Var.b, rk9Var.c, rk9Var.d);
        Path path = yjVar.a;
        RectF rectF2 = yjVar.b;
        rectF2.getClass();
        path.addOval(rectF2, Path.Direction.CCW);
    }

    public static void b(yj yjVar, yj yjVar2) {
        Path path = yjVar.a;
        if (yjVar2 instanceof yj) {
            path.addPath(yjVar2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            xk5.q("Unable to obtain android.graphics.Path");
        }
    }

    public static void c(yj yjVar, rk9 rk9Var) {
        yjVar.getClass();
        float f = rk9Var.a;
        float f2 = rk9Var.d;
        float f3 = rk9Var.c;
        float f4 = rk9Var.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            dk.b("Invalid rectangle, make sure no value is NaN");
        }
        if (yjVar.b == null) {
            yjVar.b = new RectF();
        }
        RectF rectF = yjVar.b;
        rectF.getClass();
        rectF.set(rk9Var.a, f4, f3, f2);
        Path path = yjVar.a;
        RectF rectF2 = yjVar.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public static void d(yj yjVar, ou9 ou9Var) {
        if (yjVar.b == null) {
            yjVar.b = new RectF();
        }
        RectF rectF = yjVar.b;
        rectF.getClass();
        float f = ou9Var.a;
        long j = ou9Var.h;
        long j2 = ou9Var.g;
        long j3 = ou9Var.f;
        long j4 = ou9Var.e;
        rectF.set(f, ou9Var.b, ou9Var.c, ou9Var.d);
        if (yjVar.c == null) {
            yjVar.c = new float[8];
        }
        float[] fArr = yjVar.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = yjVar.a;
        RectF rectF2 = yjVar.b;
        rectF2.getClass();
        float[] fArr2 = yjVar.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final void e() {
        this.a.close();
    }

    public final void f(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    public final rk9 g() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new rk9(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void h(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void i(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    public final boolean j(yj yjVar, yj yjVar2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (i == 2) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        if (yjVar instanceof yj) {
            Path path = yjVar.a;
            if (yjVar2 instanceof yj) {
                return this.a.op(path, yjVar2.a, op);
            }
            xk5.q("Unable to obtain android.graphics.Path");
            return false;
        }
        xk5.q("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void k(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    public final void l() {
        this.a.reset();
    }

    public final void m() {
        this.a.rewind();
    }

    public final void n(int i) {
        Path.FillType fillType;
        if (i == 1) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        this.a.setFillType(fillType);
    }

    public final void o(float[] fArr) {
        if (this.d == null) {
            this.d = new Matrix();
        }
        Matrix matrix = this.d;
        matrix.getClass();
        fre.r(matrix, fArr);
        Matrix matrix2 = this.d;
        matrix2.getClass();
        this.a.transform(matrix2);
    }

    public final void p(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
