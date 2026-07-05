package defpackage;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vo6  reason: default package */
/* loaded from: classes.dex */
public final class vo6 extends jea implements m06 {
    public final List c;
    public final List d;
    public final long e;
    public final long f;
    public final int g;

    public vo6(int i, long j, long j2, List list, List list2) {
        this.c = list;
        this.d = list2;
        this.e = j;
        this.f = j2;
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
            obj = new vo6(this.g, this.e, this.f, arrayList, this.d);
        }
        if (obj instanceof vo6) {
            vo6 vo6Var = (vo6) obj;
            ArrayList r = c16.r(list, vo6Var.c, f);
            ArrayList s = c16.s(this.d, vo6Var.d, f);
            long t = c16.t(f, this.e, vo6Var.e);
            long t2 = c16.t(f, this.f, vo6Var.f);
            if (f >= 0.5f) {
                this = vo6Var;
            }
            return new vo6(this.g, t, t2, r, s);
        }
        return null;
    }

    @Override // defpackage.jea
    public final Shader c(long j) {
        long j2 = this.e;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.f;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i4);
        return eh.d(this.g, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vo6) {
                vo6 vo6Var = (vo6) obj;
                if (c16.i(this.c, vo6Var.c) && c16.i(this.d, vo6Var.d) && y78.d(this.e, vo6Var.e) && y78.d(this.f, vo6Var.f) && this.g == vo6Var.g) {
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
        return Integer.hashCode(this.g) + hl5.c(hl5.c((hashCode + i) * 31, this.e, 31), this.f, 31);
    }

    public final String toString() {
        String str;
        long j = this.e;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0) {
            str = "";
        } else {
            str = hl5.n("start=", y78.l(j), ", ");
        }
        long j2 = this.f;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = hl5.n("end=", y78.l(j2), ", ");
        }
        String x = yf2.x(this.g);
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.c);
        sb.append(", stops=");
        sb.append(this.d);
        sb.append(", ");
        nk2.C(sb, str, str2, "tileMode=", x);
        sb.append(")");
        return sb.toString();
    }
}
