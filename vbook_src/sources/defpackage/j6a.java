package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j6a  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j6a implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7a b;

    public /* synthetic */ j6a(f7a f7aVar, int i) {
        this.a = i;
        this.b = f7aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v16, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v7, types: [yl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13 */
    @Override // defpackage.vt4
    public final Object invoke() {
        sc6 sc6Var;
        sc6 sc6Var2;
        rk9 rk9Var;
        int i;
        sc6 sc6Var3;
        ArrayList arrayList;
        sc6 c;
        int[] iArr;
        ArrayList arrayList2;
        int i2;
        ?? r5;
        rk9 b;
        yk8 yk8Var;
        long j;
        int i3;
        m82 m82Var;
        boolean z;
        int i4 = this.a;
        long j2 = 9205357640488583168L;
        pvc pvcVar = pvc.a;
        int i5 = 0;
        boolean z2 = false;
        f7a f7aVar = this.b;
        switch (i4) {
            case 0:
                y78 y78Var = (y78) f7aVar.J.getValue();
                if (y78Var != null) {
                    j2 = y78Var.a;
                }
                return new y78(j2);
            case 1:
                y78 y78Var2 = (y78) f7aVar.K.getValue();
                if (y78Var2 != null) {
                    j2 = y78Var2.a;
                }
                return new y78(j2);
            case 2:
                f7aVar.l();
                return pvcVar;
            case 3:
                rk9 rk9Var2 = yte.d;
                n7a n7aVar = f7aVar.a;
                f7aVar.I.getValue();
                if (f7aVar.i() != null && (sc6Var = f7aVar.H) != null && sc6Var.t()) {
                    ArrayList e = n7aVar.e(f7aVar.m());
                    ArrayList arrayList3 = new ArrayList(e.size());
                    int size = e.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        cu7 cu7Var = (cu7) e.get(i6);
                        g6a g6aVar = (g6a) n7aVar.a().e(cu7Var.a);
                        if (g6aVar != null) {
                            yk8Var = new yk8(cu7Var, g6aVar);
                        } else {
                            yk8Var = null;
                        }
                        if (yk8Var != null) {
                            arrayList3.add(yk8Var);
                        }
                    }
                    int size2 = arrayList3.size();
                    ArrayList arrayList4 = arrayList3;
                    if (size2 != 0) {
                        arrayList4 = arrayList3;
                        if (size2 != 1) {
                            arrayList4 = tl1.B(sl1.c0(arrayList3), sl1.j0(arrayList3));
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        if (arrayList4.isEmpty()) {
                            rk9Var = rk9Var2;
                            sc6Var2 = sc6Var;
                        } else {
                            int size3 = arrayList4.size();
                            int i7 = 0;
                            float f = Float.POSITIVE_INFINITY;
                            float f2 = Float.POSITIVE_INFINITY;
                            float f3 = Float.NEGATIVE_INFINITY;
                            float f4 = Float.NEGATIVE_INFINITY;
                            ArrayList arrayList5 = arrayList4;
                            while (i7 < size3) {
                                yk8 yk8Var2 = (yk8) arrayList5.get(i7);
                                cu7 cu7Var2 = (cu7) yk8Var2.a;
                                g6a g6aVar2 = (g6a) yk8Var2.b;
                                int i8 = g6aVar2.a.b;
                                int i9 = g6aVar2.b.b;
                                if (i8 == i9 || (c = cu7Var2.c()) == null) {
                                    i = size3;
                                    sc6Var3 = sc6Var;
                                    arrayList = arrayList5;
                                } else {
                                    int min = Math.min(i8, i9);
                                    int max = Math.max(i8, i9) - 1;
                                    if (min == max) {
                                        iArr = new int[1];
                                        iArr[i5] = min;
                                    } else {
                                        int[] iArr2 = new int[2];
                                        iArr2[i5] = min;
                                        iArr2[1] = max;
                                        iArr = iArr2;
                                    }
                                    int length = iArr.length;
                                    int i10 = i5;
                                    float f5 = Float.POSITIVE_INFINITY;
                                    float f6 = Float.POSITIVE_INFINITY;
                                    float f7 = Float.NEGATIVE_INFINITY;
                                    float f8 = Float.NEGATIVE_INFINITY;
                                    ArrayList arrayList6 = arrayList5;
                                    while (i10 < length) {
                                        int i11 = iArr[i10];
                                        int i12 = size3;
                                        fvb fvbVar = (fvb) cu7Var2.c.invoke();
                                        rk9 rk9Var3 = rk9.e;
                                        if (fvbVar == null) {
                                            arrayList2 = arrayList6;
                                            i2 = length;
                                        } else {
                                            arrayList2 = arrayList6;
                                            int length2 = fvbVar.a.a.b.length();
                                            i2 = length;
                                            arrayList2 = arrayList2;
                                            if (length2 >= 1) {
                                                r5 = false;
                                                b = fvbVar.b(dce.n(i11, 0, length2 - 1));
                                                f5 = Math.min(f5, b.a);
                                                f6 = Math.min(f6, b.b);
                                                f7 = Math.max(f7, b.c);
                                                f8 = Math.max(f8, b.d);
                                                i10++;
                                                i5 = r5;
                                                size3 = i12;
                                                arrayList6 = arrayList2;
                                                length = i2;
                                            }
                                        }
                                        b = rk9Var3;
                                        r5 = false;
                                        f5 = Math.min(f5, b.a);
                                        f6 = Math.min(f6, b.b);
                                        f7 = Math.max(f7, b.c);
                                        f8 = Math.max(f8, b.d);
                                        i10++;
                                        i5 = r5;
                                        size3 = i12;
                                        arrayList6 = arrayList2;
                                        length = i2;
                                    }
                                    i = size3;
                                    arrayList = arrayList6;
                                    long floatToRawIntBits = Float.floatToRawIntBits(f7);
                                    sc6Var3 = sc6Var;
                                    long e0 = sc6Var3.e0(c, (Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32));
                                    long e02 = sc6Var3.e0(c, (Float.floatToRawIntBits(f8) & 4294967295L) | (floatToRawIntBits << 32));
                                    f = Math.min(f, Float.intBitsToFloat((int) (e0 >> 32)));
                                    f2 = Math.min(f2, Float.intBitsToFloat((int) (e0 & 4294967295L)));
                                    f3 = Math.max(f3, Float.intBitsToFloat((int) (e02 >> 32)));
                                    f4 = Math.max(f4, Float.intBitsToFloat((int) (e02 & 4294967295L)));
                                }
                                i7++;
                                sc6Var = sc6Var3;
                                size3 = i;
                                arrayList5 = arrayList;
                                i5 = 0;
                            }
                            sc6Var2 = sc6Var;
                            rk9Var = new rk9(f, f2, f3, f4);
                        }
                        if (!rk9Var.equals(rk9Var2)) {
                            rk9 k = yte.w(sc6Var2).k(rk9Var);
                            if (k.c - k.a >= nae.e && k.d - k.b >= nae.e) {
                                rk9 o = k.o(sc6Var2.h0(0L));
                                float f9 = o.d;
                                k8a k8aVar = a7a.a;
                                return rk9.b(o, nae.e, nae.e, f9 + 100.0f, 7);
                            }
                        }
                    }
                }
                return null;
            case 4:
                f7a f7aVar2 = this.b;
                f7aVar2.p(true);
                f7aVar2.L.setValue(null);
                f7aVar2.M.setValue(null);
                f7aVar2.N = null;
                if (f7aVar2.O && f7aVar2.k()) {
                    ?? obj = new Object();
                    ?? obj2 = new Object();
                    ?? obj3 = new Object();
                    n7a n7aVar2 = f7aVar2.a;
                    ArrayList e2 = n7aVar2.e(f7aVar2.m());
                    ListIterator listIterator = e2.listIterator(e2.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            j = 0;
                            g6a g6aVar3 = (g6a) n7aVar2.a().e(((cu7) listIterator.previous()).a);
                            if (g6aVar3 != null && g6aVar3.a.b != g6aVar3.b.b) {
                                i3 = listIterator.nextIndex();
                            }
                        } else {
                            j = 0;
                            i3 = -1;
                        }
                    }
                    if (i3 != -1) {
                        int size4 = e2.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 < size4) {
                                cu7 cu7Var3 = (cu7) e2.get(i13);
                                g6a g6aVar4 = (g6a) n7aVar2.a().e(cu7Var3.a);
                                if (g6aVar4 != null) {
                                    ps e3 = cu7Var3.e();
                                    long a = sze.a(g6aVar4.a.b, g6aVar4.b.b);
                                    if (i13 >= i3) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    long j3 = cu7Var3.a;
                                    if (z) {
                                        obj.a = e3;
                                        obj2.a = new fxb(a);
                                        obj3.a = j3;
                                    }
                                } else {
                                    i13++;
                                }
                            }
                        }
                    }
                    Object obj4 = obj.a;
                    if (obj4 != null && obj2.a != null && obj3.a != j && ((CharSequence) obj4).length() > 0 && (m82Var = f7aVar2.P) != null) {
                        z87.v(m82Var, null, null, new z45(f7aVar2, (Object) obj, (Object) obj2, (Object) obj3, (m42) null, 18), 3);
                    }
                }
                f7aVar2.O = false;
                return pvcVar;
            case 5:
                f7aVar.e();
                if (f7aVar.j()) {
                    f7aVar.l();
                }
                return pvcVar;
            case 6:
                return Boolean.valueOf((f7aVar.S && f7aVar.j()) ? true : true);
            default:
                n7a n7aVar3 = f7aVar.a;
                ArrayList e4 = n7aVar3.e(f7aVar.m());
                if (!e4.isEmpty()) {
                    cv7 cv7Var = zx6.a;
                    cv7 cv7Var2 = new cv7();
                    int size5 = e4.size();
                    g6a g6aVar5 = null;
                    g6a g6aVar6 = null;
                    for (int i14 = 0; i14 < size5; i14++) {
                        cu7 cu7Var4 = (cu7) e4.get(i14);
                        g6a d = cu7Var4.d();
                        if (d != null) {
                            if (g6aVar5 == null) {
                                g6aVar5 = d;
                            }
                            long j4 = cu7Var4.a;
                            int c2 = cv7Var2.c(j4);
                            Object[] objArr = cv7Var2.c;
                            Object obj5 = objArr[c2];
                            cv7Var2.b[c2] = j4;
                            objArr[c2] = d;
                            g6aVar6 = d;
                        }
                    }
                    if (cv7Var2.e != 0) {
                        if (g6aVar5 != g6aVar6) {
                            g6aVar5.getClass();
                            f6a f6aVar = g6aVar5.a;
                            g6aVar6.getClass();
                            g6aVar5 = new g6a(f6aVar, g6aVar6.b, false);
                        }
                        n7aVar3.k.setValue(cv7Var2);
                        f7aVar.d.invoke(g6aVar5);
                        f7aVar.N = null;
                        zm4.a(f7aVar.D);
                        f7aVar.p(true);
                    }
                }
                return pvcVar;
        }
    }
}
