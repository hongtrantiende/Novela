package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j71  reason: default package */
/* loaded from: classes.dex */
public final class j71 implements oi8 {
    public final lu4 a;
    public final float b;
    public final float c;
    public final hm8 d = yae.z(s0b.n);

    public j71(lu4 lu4Var, float f, float f2) {
        this.a = lu4Var;
        this.b = f;
        this.c = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oi8
    public final int d(int i, int i2) {
        float f;
        g96 g96Var;
        ArrayList arrayList;
        float f2;
        float f3;
        int i3;
        float f4;
        Object obj;
        int size;
        int i4;
        int i5;
        Object obj2;
        int i6;
        float f5 = i;
        float f6 = i2;
        g96 g96Var2 = (g96) this.a.invoke(Float.valueOf(f5), Float.valueOf(f6));
        List list = g96Var2.a;
        List list2 = g96Var2.a;
        int i7 = g96Var2.c;
        boolean isEmpty = list.isEmpty();
        float f7 = this.b;
        ks3 ks3Var = ks3.a;
        float f8 = nae.e;
        int i8 = 1;
        if (isEmpty) {
            g96Var = g96Var2;
            f2 = f7;
            arrayList = ks3Var;
            f3 = 0.0f;
            f = 2.0f;
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(g96Var2);
            f = 2.0f;
            if (g96Var2.b().b - (g96Var2.b().a / 2.0f) >= nae.e && g96Var2.b().equals(g96Var2.get(i7))) {
                if (f7 == nae.e) {
                    g96Var = g96Var2;
                    f2 = f7;
                    arrayList = arrayList2;
                    f3 = 0.0f;
                } else {
                    arrayList = arrayList2;
                    g96Var = g96Var2;
                    arrayList.add(r1d.i(g96Var2, f5, f6, f7, g96Var2.b(), g96Var2.e));
                }
            } else {
                g96Var = g96Var2;
                arrayList = arrayList2;
                int i9 = g96Var.e - i7;
                if (i9 <= 0 && g96Var.b().g > nae.e) {
                    arrayList.add(r1d.q(g96Var, 0, 0, f5, f6));
                } else {
                    int i10 = 0;
                    while (i10 < i9) {
                        float f9 = f8;
                        g96 g96Var3 = (g96) sl1.j0(arrayList);
                        int i11 = i7 + i10;
                        int size2 = list2.size() - 1;
                        if (i11 > 0) {
                            float f10 = g96Var.get(i11 - 1).a;
                            int i12 = i8;
                            int i13 = g96Var3.f;
                            List list3 = g96Var3.a;
                            i3 = i9;
                            f4 = f7;
                            Iterator it = new ry5(i13, list3.size() - 1, i12).iterator();
                            while (true) {
                                sy5 sy5Var = (sy5) it;
                                if (sy5Var.c) {
                                    obj = sy5Var.next();
                                    if (g96Var3.get(((Number) obj).intValue()).a == f10) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            Integer num = (Integer) obj;
                            if (num != null) {
                                size = num.intValue();
                            } else {
                                size = list3.size() - 1;
                            }
                            size2 = size - 1;
                        } else {
                            i3 = i9;
                            f4 = f7;
                        }
                        arrayList.add(r1d.q(g96Var3, i7, size2, f5, f6));
                        i10++;
                        f8 = f9;
                        i9 = i3;
                        f7 = f4;
                        i8 = 1;
                    }
                    f2 = f7;
                    f3 = f8;
                    if (f2 != f3) {
                        arrayList.set(arrayList.size() - 1, r1d.i((g96) sl1.j0(arrayList), f5, f6, f2, ((g96) sl1.j0(arrayList)).b(), ((g96) sl1.j0(arrayList)).e));
                    }
                }
            }
            f2 = f7;
            f3 = 0.0f;
        }
        int i14 = g96Var.d;
        boolean isEmpty2 = list2.isEmpty();
        float f11 = this.c;
        ks3 ks3Var2 = ks3Var;
        if (!isEmpty2) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(g96Var);
            if ((g96Var.c().a / f) + g96Var.c().b <= f5 && g96Var.c().equals(g96Var.get(i14))) {
                ks3Var2 = arrayList3;
                if (f11 != f3) {
                    arrayList3.add(r1d.i(g96Var, f5, f6, -f11, g96Var.c(), g96Var.f));
                    ks3Var2 = arrayList3;
                }
            } else {
                int i15 = i14 - g96Var.f;
                if (i15 <= 0 && g96Var.c().g > f3) {
                    arrayList3.add(r1d.q(g96Var, 0, 0, f5, f6));
                    ks3Var2 = arrayList3;
                } else {
                    int i16 = 0;
                    while (i16 < i15) {
                        g96 g96Var4 = (g96) sl1.j0(arrayList3);
                        int i17 = i14 - i16;
                        if (i17 < list2.size() - 1) {
                            float f12 = g96Var.get(i17 + 1).a;
                            Iterator it2 = dce.r(g96Var4.e - 1, 0).iterator();
                            while (true) {
                                sy5 sy5Var2 = (sy5) it2;
                                i4 = i15;
                                if (sy5Var2.c) {
                                    obj2 = sy5Var2.next();
                                    if (g96Var4.get(((Number) obj2).intValue()).a == f12) {
                                        break;
                                    }
                                    i15 = i4;
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            Integer num2 = (Integer) obj2;
                            if (num2 != null) {
                                i6 = num2.intValue();
                            } else {
                                i6 = 0;
                            }
                            i5 = i6 + 1;
                        } else {
                            i4 = i15;
                            i5 = 0;
                        }
                        arrayList3.add(r1d.q(g96Var4, i14, i5, f5, f6));
                        i16++;
                        i15 = i4;
                    }
                    ks3Var2 = arrayList3;
                    if (f11 != f3) {
                        arrayList3.set(arrayList3.size() - 1, r1d.i((g96) sl1.j0(arrayList3), f5, f6, -f11, ((g96) sl1.j0(arrayList3)).c(), ((g96) sl1.j0(arrayList3)).f));
                        ks3Var2 = arrayList3;
                    }
                }
            }
        }
        s0b s0bVar = new s0b(g96Var, arrayList, ks3Var2, f5, f6, f2, f11);
        hm8 hm8Var = this.d;
        hm8Var.setValue(s0bVar);
        if (((s0b) hm8Var.getValue()).l) {
            return k27.A(((s0b) hm8Var.getValue()).a());
        }
        return i;
    }
}
