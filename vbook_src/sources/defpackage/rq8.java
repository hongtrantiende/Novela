package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rq8  reason: default package */
/* loaded from: classes3.dex */
public final class rq8 {
    public static final pq8 b = new pq8(0);
    public final ArrayList a;

    public rq8(ArrayList arrayList) {
        this.a = arrayList;
    }

    public static float b(qq8 qq8Var, int i) {
        String str = qq8Var.c;
        pr8 pr8Var = qq8Var.d;
        float f = pr8Var.a;
        int length = str.length();
        if (length == 0) {
            return f;
        }
        return a82.c(pr8Var.c, f, dce.n(i - qq8Var.a, 0, length) / length, f);
    }

    public final Integer a(float f, float f2) {
        Object next;
        float f3;
        float f4;
        qq8 qq8Var;
        Object next2;
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                pr8 pr8Var = ((qq8) obj).d;
                if (pr8Var.d > pr8Var.b && pr8Var.c > pr8Var.a) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    pr8 pr8Var2 = ((qq8) obj2).d;
                    if (f2 >= pr8Var2.b && f2 <= pr8Var2.d) {
                        arrayList3.add(obj2);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    Iterator it = arrayList3.iterator();
                    if (!it.hasNext()) {
                        next2 = null;
                    } else {
                        next2 = it.next();
                        if (it.hasNext()) {
                            float e = sze.e(((qq8) next2).d, f);
                            do {
                                Object next3 = it.next();
                                float e2 = sze.e(((qq8) next3).d, f);
                                if (Float.compare(e, e2) > 0) {
                                    next2 = next3;
                                    e = e2;
                                }
                            } while (it.hasNext());
                        }
                    }
                    qq8Var = (qq8) next2;
                } else {
                    Iterator it2 = arrayList2.iterator();
                    if (!it2.hasNext()) {
                        next = null;
                    } else {
                        next = it2.next();
                        if (it2.hasNext()) {
                            pr8 pr8Var3 = ((qq8) next).d;
                            float e3 = sze.e(pr8Var3, f);
                            float f5 = pr8Var3.b;
                            if (f2 < f5) {
                                f3 = f5 - f2;
                            } else {
                                float f6 = pr8Var3.d;
                                if (f2 > f6) {
                                    f3 = f2 - f6;
                                } else {
                                    f3 = 0.0f;
                                }
                            }
                            float f7 = e3 + f3;
                            do {
                                Object next4 = it2.next();
                                pr8 pr8Var4 = ((qq8) next4).d;
                                float e4 = sze.e(pr8Var4, f);
                                float f8 = pr8Var4.b;
                                if (f2 < f8) {
                                    f4 = f8 - f2;
                                } else {
                                    float f9 = pr8Var4.d;
                                    if (f2 > f9) {
                                        f4 = f2 - f9;
                                    } else {
                                        f4 = 0.0f;
                                    }
                                }
                                float f10 = e4 + f4;
                                if (Float.compare(f7, f10) > 0) {
                                    next = next4;
                                    f7 = f10;
                                }
                            } while (it2.hasNext());
                        }
                    }
                    qq8Var = (qq8) next;
                }
                if (qq8Var != null) {
                    pr8 pr8Var5 = qq8Var.d;
                    float f11 = pr8Var5.a;
                    int i3 = qq8Var.a;
                    float f12 = pr8Var5.c - f11;
                    int length = qq8Var.c.length();
                    if (f12 > nae.e && length != 0) {
                        i3 += dce.n(k27.A(dce.m((f - f11) / f12, nae.e, 1.0f) * length), 0, length);
                    }
                    return Integer.valueOf(i3);
                }
            }
        }
        return null;
    }
}
