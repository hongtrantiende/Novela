package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: glb  reason: default package */
/* loaded from: classes.dex */
public final class glb {
    public final i45 a;
    public i45 b;
    public ArrayList c;
    public ArrayList d;
    public HashMap e;

    public glb(i45 i45Var) {
        this.a = i45Var;
    }

    public final i45 a() {
        return (i45) c().get(0);
    }

    public final List b() {
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            i45 i45Var = this.a;
            arrayList2.add(rqe.i(d, i45Var.c, i45Var.d));
        }
        ArrayList v = tl1.v(tl1.A(arrayList2));
        this.d = v;
        return v;
    }

    public final List c() {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(b());
        arrayList2.add(this.a);
        wl1.O(new la3(this, 10), arrayList2);
        this.c = arrayList2;
        return arrayList2;
    }

    public final double d(i45 i45Var) {
        i45Var.getClass();
        Object obj = ((HashMap) e()).get(f());
        obj.getClass();
        double doubleValue = ((Number) obj).doubleValue();
        Object obj2 = ((HashMap) e()).get(a());
        obj2.getClass();
        double doubleValue2 = doubleValue - ((Number) obj2).doubleValue();
        Object obj3 = ((HashMap) e()).get(i45Var);
        obj3.getClass();
        double doubleValue3 = ((Number) obj3).doubleValue();
        Object obj4 = ((HashMap) e()).get(a());
        obj4.getClass();
        double doubleValue4 = doubleValue3 - ((Number) obj4).doubleValue();
        if (doubleValue2 == 0.0d) {
            return 0.5d;
        }
        return doubleValue4 / doubleValue2;
    }

    public final Map e() {
        HashMap hashMap = this.e;
        if (hashMap != null) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList(b());
        arrayList.add(this.a);
        HashMap hashMap2 = new HashMap();
        int size = arrayList.size();
        char c = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            int i2 = i + 1;
            i45 i45Var = (i45) obj;
            i45Var.getClass();
            int i3 = i45Var.a;
            double H = xbe.H((i3 >> 16) & 255);
            double H2 = xbe.H((i3 >> 8) & 255);
            double H3 = xbe.H(i3 & 255);
            double[][] dArr = xbe.a;
            double[] dArr2 = dArr[c];
            double d = (dArr2[2] * H3) + (dArr2[1] * H2) + (dArr2[c] * H);
            double[] dArr3 = dArr[1];
            double d2 = (dArr3[2] * H3) + (dArr3[1] * H2) + (dArr3[c] * H);
            double[] dArr4 = dArr[2];
            double d3 = (dArr4[2] * H3) + (dArr4[1] * H2) + (dArr4[c] * H);
            double[] dArr5 = xbe.b;
            double d4 = d / dArr5[c];
            double d5 = d2 / dArr5[1];
            double G = xbe.G(d4);
            double G2 = xbe.G(d5);
            double[] dArr6 = new double[3];
            dArr6[c] = (116.0d * G2) - 16.0d;
            dArr6[1] = (G - G2) * 500.0d;
            dArr6[2] = (G2 - xbe.G(d3 / dArr5[2])) * 200.0d;
            double atan2 = (Math.atan2(dArr6[2], dArr6[1]) * 57.29577951308232d) % 360.0d;
            if (atan2 < 0.0d) {
                atan2 += 360.0d;
            }
            double pow = Math.pow(Math.hypot(dArr6[1], dArr6[2]), 1.07d) * 0.02d;
            double d6 = (atan2 - 50.0d) % 360.0d;
            if (d6 < 0.0d) {
                d6 += 360.0d;
            }
            hashMap2.put(i45Var, Double.valueOf((Math.cos(d6 * 0.017453292519943295d) * pow) - 0.5d));
            i = i2;
            c = 0;
        }
        this.e = hashMap2;
        return hashMap2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof glb) || !this.a.equals(((glb) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final i45 f() {
        return (i45) c().get(c().size() - 1);
    }

    public final int hashCode() {
        return this.a.a;
    }

    public final String toString() {
        return "TemperatureCache(input=" + this.a + ")";
    }
}
