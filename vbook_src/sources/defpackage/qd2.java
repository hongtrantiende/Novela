package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qd2  reason: default package */
/* loaded from: classes.dex */
public class qd2 {
    public final float[] a;

    public qd2(float[] fArr) {
        this.a = fArr;
        if (fArr.length == 8) {
            return;
        }
        vs.m("Points array size should be 8");
        throw null;
    }

    public final float a() {
        return this.a[6];
    }

    public final float b() {
        return this.a[7];
    }

    public final long c(float f) {
        float f2 = 1.0f - f;
        float[] fArr = this.a;
        float f3 = f2 * f2 * f2;
        float f4 = 3.0f * f;
        float f5 = f4 * f2 * f2;
        float f6 = f4 * f * f2;
        float f7 = (fArr[4] * f6) + (fArr[2] * f5) + (fArr[0] * f3);
        float f8 = f * f * f;
        float a = (a() * f8) + f7;
        float f9 = (fArr[3] * f5) + (fArr[1] * f3);
        return wi4.a(a, (b() * f8) + (fArr[5] * f6) + f9);
    }

    public final yk8 d(float f) {
        float f2 = 1.0f - f;
        long c = c(f);
        float[] fArr = this.a;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = f2 * f2;
        float f8 = 2.0f * f2 * f;
        float f9 = f * f;
        return new yk8(w9e.a(f3, f4, (f5 * f) + (f3 * f2), (f6 * f) + (f4 * f2), (fArr[4] * f9) + (f5 * f8) + (f3 * f7), (fArr[5] * f9) + (f6 * f8) + (f4 * f7), nc2.i(c), nc2.j(c)), w9e.a(nc2.i(c), nc2.j(c), (a() * f9) + (fArr[4] * f8) + (fArr[2] * f7), (b() * f9) + (fArr[5] * f8) + (fArr[3] * f7), (a() * f) + (fArr[4] * f2), (b() * f) + (fArr[5] * f2), a(), b()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [su7, qd2] */
    public final su7 e(q09 q09Var) {
        float[] fArr = new float[8];
        ?? qd2Var = new qd2(fArr);
        b00.b0(0, 14, this.a, fArr);
        qd2Var.g(q09Var, 0);
        qd2Var.g(q09Var, 2);
        qd2Var.g(q09Var, 4);
        qd2Var.g(q09Var, 6);
        return qd2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd2)) {
            return false;
        }
        return Arrays.equals(this.a, ((qd2) obj).a);
    }

    public final boolean f() {
        float[] fArr = this.a;
        if (Math.abs(fArr[0] - a()) >= 1.0E-4f || Math.abs(fArr[1] - b()) >= 1.0E-4f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("anchor0: (");
        float[] fArr = this.a;
        sb.append(fArr[0]);
        sb.append(", ");
        sb.append(fArr[1]);
        sb.append(") control0: (");
        sb.append(fArr[2]);
        sb.append(", ");
        sb.append(fArr[3]);
        sb.append("), control1: (");
        sb.append(fArr[4]);
        sb.append(", ");
        sb.append(fArr[5]);
        sb.append("), anchor1: (");
        sb.append(a());
        sb.append(", ");
        sb.append(b());
        sb.append(')');
        return sb.toString();
    }
}
