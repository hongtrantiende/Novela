package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xu9  reason: default package */
/* loaded from: classes.dex */
public final class xu9 {
    public final List a;
    public final long b;
    public final jq6 c;

    /* JADX WARN: Multi-variable type inference failed */
    public xu9(AbstractList abstractList, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        char c;
        char c2;
        qd2 qd2Var;
        qd2 qd2Var2;
        List list;
        char c3;
        char c4;
        abstractList.getClass();
        this.a = abstractList;
        this.b = j;
        jq6 t = tl1.t();
        char c5 = 3;
        char c6 = 2;
        if (abstractList.size() > 0 && ((ob4) abstractList.get(0)).a.size() == 3) {
            yk8 d = ((qd2) ((ob4) abstractList.get(0)).a.get(1)).d(0.5f);
            arrayList2 = tl1.C(((ob4) abstractList.get(0)).a.get(0), (qd2) d.a);
            arrayList = tl1.C((qd2) d.b, ((ob4) abstractList.get(0)).a.get(2));
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        int size = abstractList.size();
        if (size >= 0) {
            int i = 0;
            qd2Var = null;
            qd2Var2 = null;
            while (true) {
                if (i == 0 && arrayList != null) {
                    list = arrayList;
                } else if (i == this.a.size()) {
                    if (arrayList2 == null) {
                        c = c5;
                        c2 = c6;
                        break;
                    }
                    list = arrayList2;
                } else {
                    list = ((ob4) this.a.get(i)).a;
                }
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    qd2 qd2Var3 = (qd2) list.get(i2);
                    if (!qd2Var3.f()) {
                        if (qd2Var2 != null) {
                            t.add(qd2Var2);
                        }
                        c3 = c5;
                        c4 = c6;
                        if (qd2Var == null) {
                            qd2Var = qd2Var3;
                            qd2Var2 = qd2Var;
                        } else {
                            qd2Var2 = qd2Var3;
                        }
                    } else {
                        c3 = c5;
                        if (qd2Var2 != null) {
                            float[] fArr = qd2Var2.a;
                            c4 = c6;
                            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                            qd2 qd2Var4 = new qd2(copyOf);
                            copyOf[6] = qd2Var3.a();
                            copyOf[7] = qd2Var3.b();
                            qd2Var2 = qd2Var4;
                        } else {
                            c4 = c6;
                        }
                    }
                    i2++;
                    c5 = c3;
                    c6 = c4;
                }
                c = c5;
                c2 = c6;
                if (i == size) {
                    break;
                }
                i++;
                c5 = c;
                c6 = c2;
            }
        } else {
            c = 3;
            c2 = 2;
            qd2Var = null;
            qd2Var2 = null;
        }
        if (qd2Var2 != null && qd2Var != null) {
            float[] fArr2 = qd2Var2.a;
            float f = fArr2[0];
            float f2 = fArr2[1];
            float f3 = fArr2[c2];
            float f4 = fArr2[c];
            float f5 = fArr2[4];
            float f6 = fArr2[5];
            float[] fArr3 = qd2Var.a;
            t.add(w9e.a(f, f2, f3, f4, f5, f6, fArr3[0], fArr3[1]));
        } else {
            t.add(w9e.a(nc2.i(this.b), nc2.j(this.b), nc2.i(this.b), nc2.j(this.b), nc2.i(this.b), nc2.j(this.b), nc2.i(this.b), nc2.j(this.b)));
        }
        jq6 r = tl1.r(t);
        this.c = r;
        Object obj = r.get(r.a() - 1);
        int a = r.a();
        int i3 = 0;
        while (i3 < a) {
            qd2 qd2Var5 = (qd2) this.c.get(i3);
            qd2 qd2Var6 = (qd2) obj;
            if (Math.abs(qd2Var5.a[0] - qd2Var6.a()) <= 1.0E-4f && Math.abs(qd2Var5.a[1] - qd2Var6.b()) <= 1.0E-4f) {
                i3++;
                obj = qd2Var5;
            } else {
                vs.m("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
                throw null;
            }
        }
    }

    public static float[] a(xu9 xu9Var, float[] fArr, int i) {
        float[] fArr2;
        char c;
        char c2;
        char c3;
        char c4;
        char c5 = 1;
        char c6 = 4;
        if ((i & 1) != 0) {
            fArr2 = new float[4];
        } else {
            fArr2 = fArr;
        }
        jq6 jq6Var = xu9Var.c;
        if (fArr2.length >= 4) {
            int a = jq6Var.a();
            float f = Float.MIN_VALUE;
            char c7 = 0;
            float f2 = Float.MAX_VALUE;
            float f3 = Float.MAX_VALUE;
            int i2 = 0;
            float f4 = Float.MIN_VALUE;
            while (i2 < a) {
                qd2 qd2Var = (qd2) jq6Var.get(i2);
                qd2Var.getClass();
                boolean f5 = qd2Var.f();
                float[] fArr3 = qd2Var.a;
                if (f5) {
                    fArr2[c7] = fArr3[c7];
                    fArr2[c5] = fArr3[c5];
                    fArr2[2] = fArr3[c7];
                    fArr2[3] = fArr3[c5];
                    c = c5;
                    c2 = c6;
                    c3 = c7;
                    c4 = 2;
                } else {
                    c = c5;
                    float min = Math.min(fArr3[c7], qd2Var.a());
                    c2 = c6;
                    float min2 = Math.min(fArr3[c], qd2Var.b());
                    c3 = c7;
                    float max = Math.max(fArr3[c7], qd2Var.a());
                    float max2 = Math.max(fArr3[c], qd2Var.b());
                    c4 = 2;
                    fArr2[c3] = Math.min(min, Math.min(fArr3[2], fArr3[c2]));
                    fArr2[c] = Math.min(min2, Math.min(fArr3[3], fArr3[5]));
                    fArr2[2] = Math.max(max, Math.max(fArr3[2], fArr3[c2]));
                    fArr2[3] = Math.max(max2, Math.max(fArr3[3], fArr3[5]));
                }
                f2 = Math.min(f2, fArr2[c3]);
                f3 = Math.min(f3, fArr2[c]);
                f = Math.max(f, fArr2[c4]);
                f4 = Math.max(f4, fArr2[3]);
                i2++;
                c7 = c3;
                c6 = c2;
                c5 = c;
            }
            fArr2[c7] = f2;
            fArr2[c5] = f3;
            fArr2[2] = f;
            fArr2[3] = f4;
            return fArr2;
        }
        vs.m("Required bounds size of 4");
        return null;
    }

    public final xu9 b() {
        float[] a = a(this, null, 3);
        float f = a[2] - a[0];
        float f2 = a[3] - a[1];
        float max = Math.max(f, f2);
        return c(new wu9(((max - f) / 2.0f) - a[0], max, ((max - f2) / 2.0f) - a[1]));
    }

    public final xu9 c(q09 q09Var) {
        long j = this.b;
        long a = q09Var.a(nc2.i(j), nc2.j(j));
        long a2 = wi4.a(Float.intBitsToFloat((int) (a >> 32)), Float.intBitsToFloat((int) (a & 4294967295L)));
        jq6 t = tl1.t();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            t.add(((ob4) list.get(i)).a(q09Var));
        }
        return new xu9(tl1.r(t), a2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu9)) {
            return false;
        }
        return c16.i(this.a, ((xu9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[RoundedPolygon. Cubics = ");
        sb.append(sl1.i0(this.c, null, null, null, null, 63));
        sb.append(" || Features = ");
        sb.append(sl1.i0(this.a, null, null, null, null, 63));
        sb.append(" || Center = (");
        long j = this.b;
        sb.append(nc2.i(j));
        sb.append(", ");
        sb.append(nc2.j(j));
        sb.append(")]");
        return sb.toString();
    }
}
