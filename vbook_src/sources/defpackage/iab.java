package defpackage;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iab  reason: default package */
/* loaded from: classes.dex */
public final class iab extends jea implements m06 {
    public final long c;
    public final ArrayList d;
    public final List e;

    public iab(long j, ArrayList arrayList, List list) {
        this.c = j;
        this.d = arrayList;
        this.e = list;
    }

    @Override // defpackage.m06
    public final Object b(Object obj, float f) {
        if (obj == null) {
            obj = new esa(zl1.h);
        }
        boolean z = obj instanceof esa;
        List list = this.e;
        long j = this.c;
        ArrayList arrayList = this.d;
        if (z) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((zl1) arrayList.get(i)).getClass();
                arrayList2.add(new zl1(((esa) obj).a));
            }
            obj = new iab(j, arrayList2, list);
        }
        if (obj instanceof iab) {
            iab iabVar = (iab) obj;
            return new iab(oue.E(f, j, iabVar.c), c16.r(arrayList, iabVar.d, f), c16.s(list, iabVar.e, f));
        }
        return null;
    }

    @Override // defpackage.jea
    public final Shader c(long j) {
        float intBitsToFloat;
        long floatToRawIntBits;
        float[] fArr;
        long j2 = this.c;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            floatToRawIntBits = sxd.j(j);
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
            } else {
                intBitsToFloat = Float.intBitsToFloat(i2);
            }
            floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
        }
        ArrayList arrayList = this.d;
        List list = this.e;
        ase.D(arrayList, list);
        if (Build.VERSION.SDK_INT >= 29) {
            long[] B = ase.B(arrayList);
            if (list != null) {
                fArr = sl1.z0(list);
            } else {
                fArr = null;
            }
            return d15.a.c(floatToRawIntBits, B, fArr);
        }
        int u = ase.u(arrayList);
        return new SweepGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), ase.x(u, arrayList), ase.y(u, list, arrayList));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof iab) {
                iab iabVar = (iab) obj;
                if (!y78.d(this.c, iabVar.c) || !this.d.equals(iabVar.d) || !c16.i(this.e, iabVar.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.d.hashCode() + (Long.hashCode(this.c) * 31)) * 31;
        List list = this.e;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        String str;
        long j = this.c;
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = hl5.n("center=", y78.l(j), ", ");
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder("SweepGradient(");
        sb.append(str);
        sb.append("colors=");
        sb.append(this.d);
        sb.append(", stops=");
        return rs8.n(sb, this.e, ")");
    }
}
