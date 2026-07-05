package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qg9  reason: default package */
/* loaded from: classes.dex */
public final class qg9 extends jea implements m06 {
    public final List c;
    public final List d;
    public final long e;
    public final float f;
    public final int g;

    public qg9(List list, List list2, long j, float f, int i) {
        this.c = list;
        this.d = list2;
        this.e = j;
        this.f = f;
        this.g = i;
    }

    @Override // defpackage.m06
    public final Object b(Object obj, float f) {
        if (obj == null) {
            obj = new esa(zl1.h);
        }
        boolean z = obj instanceof esa;
        List list = this.c;
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((zl1) list.get(i)).getClass();
                arrayList.add(new zl1(((esa) obj).a));
            }
            obj = new qg9(arrayList, this.d, this.e, this.f, this.g);
        }
        if (obj instanceof qg9) {
            qg9 qg9Var = (qg9) obj;
            ArrayList r = c16.r(list, qg9Var.c, f);
            ArrayList s = c16.s(this.d, qg9Var.d, f);
            long E = oue.E(f, this.e, qg9Var.e);
            float o = b23.o(this.f, qg9Var.f, f);
            if (f >= 0.5f) {
                this = qg9Var;
            }
            return new qg9(r, s, E, o, this.g);
        }
        return null;
    }

    @Override // defpackage.jea
    public final Shader c(long j) {
        float intBitsToFloat;
        float intBitsToFloat2;
        float[] fArr;
        long j2 = this.e;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long j3 = sxd.j(j);
            intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            intBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        float f = this.f;
        if (f == Float.POSITIVE_INFINITY) {
            f = dna.c(j) / 2.0f;
        }
        float f2 = f;
        List list = this.c;
        List list2 = this.d;
        ase.D(list, list2);
        int i3 = Build.VERSION.SDK_INT;
        int i4 = this.g;
        if (i3 >= 29) {
            long[] B = ase.B(list);
            if (list2 != null) {
                fArr = sl1.z0(list2);
            } else {
                fArr = null;
            }
            return d15.a.b(floatToRawIntBits, f2, B, fArr, i4);
        }
        int u = ase.u(list);
        return new RadialGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), f2, ase.x(u, list), ase.y(u, list2, list), kte.k(i4));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qg9) {
                qg9 qg9Var = (qg9) obj;
                if (this.c.equals(qg9Var.c) && c16.i(this.d, qg9Var.d) && y78.d(this.e, qg9Var.e) && this.f == qg9Var.f && this.g == qg9Var.g) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.c.hashCode() * 31;
        List list = this.d;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return Integer.hashCode(this.g) + nk2.d(this.f, hl5.c((hashCode + i) * 31, this.e, 31), 31);
    }

    public final String toString() {
        String str;
        long j = this.e;
        String str2 = "";
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            str = "";
        } else {
            str = hl5.n("center=", y78.l(j), ", ");
        }
        float f = this.f;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str2 = a82.k("radius=", f, ", ");
        }
        String x = yf2.x(this.g);
        StringBuilder sb = new StringBuilder("RadialGradient(colors=");
        sb.append(this.c);
        sb.append(", stops=");
        sb.append(this.d);
        sb.append(", ");
        nk2.C(sb, str, str2, "tileMode=", x);
        sb.append(")");
        return sb.toString();
    }
}
