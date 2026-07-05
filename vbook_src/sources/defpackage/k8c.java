package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k8c  reason: default package */
/* loaded from: classes.dex */
public final class k8c {
    public final jt1 a;
    public final l97 b;
    public final int c;
    public final jj9 d;
    public final cza e;
    public final m41 f;
    public final cza g;
    public final cza h;
    public oz9 i;
    public final sw7 j;
    public final sw7 k;
    public final LinkedHashMap l;
    public uy5 m;
    public List n;
    public final sj4 o;
    public final cza p;
    public final cza q;
    public final jj9 r;
    public final jj9 s;
    public final jj9 t;

    public k8c(jt1 jt1Var, l97 l97Var, int i, jj9 jj9Var, cza czaVar) {
        this.a = jt1Var;
        this.b = l97Var;
        this.c = i;
        this.d = jj9Var;
        this.e = czaVar;
        m41 a = k27.a(nq2.C(rse.b(), ab3.a));
        this.f = a;
        cza a2 = dza.a(Boolean.FALSE);
        this.g = a2;
        cza a3 = dza.a(0);
        this.h = a3;
        this.i = new oz9(0L, 7);
        this.j = new sw7();
        this.k = new sw7();
        this.l = new LinkedHashMap();
        this.m = uy5.e;
        this.n = ks3.a;
        sj4 A = z1d.A(new s02(new q4c(this, (m42) null, 7), 6));
        this.o = A;
        cza a4 = dza.a(new pz9());
        this.p = a4;
        this.q = dza.a(null);
        jj9 K = z1d.K(z1d.N(a2, new h8c(null, this)), a, uha.a(), null);
        this.r = K;
        s02 s02Var = new s02(new fk4(16L, new g8c(new sj4[]{a4, A, z1d.A(new mx(((dt8) l97Var.a).a.d, 14)), a2, czaVar, a3}, 0), null), 3);
        k83 k83Var = new k83(this, null, 4);
        int i2 = yk4.a;
        jj9 K2 = z1d.K(z1d.A(z1d.N(s02Var, new we1(k83Var, (m42) null, 2))), a, uha.a(), null);
        this.s = K2;
        this.t = z1d.K(new yh2(1, K, K2, new u7(3, 11, (m42) null)), a, uha.a(), zn9.a);
    }

    public static final List a(k8c k8cVar, long j, zc6 zc6Var, uy5 uy5Var, cd6 cd6Var) {
        char c;
        long j2;
        Object obj;
        int i;
        int i2;
        List list;
        boolean b = zy5.b(j, 0L);
        ks3 ks3Var = ks3.a;
        if (!b) {
            long j3 = 9205357640488583168L;
            if (zc6Var.a != 9205357640488583168L) {
                char c2 = ' ';
                int i3 = (int) (j >> 32);
                int i4 = (int) (j & 4294967295L);
                int i5 = 0;
                uy5 uy5Var2 = new uy5(0, 0, i3, i4);
                if (!uy5Var2.equals(k8cVar.m)) {
                    k8cVar.m = uy5Var2;
                    int e = uy5Var2.e();
                    int b2 = uy5Var2.b();
                    if (e <= 0 || b2 <= 0) {
                        c = ' ';
                        j2 = 9205357640488583168L;
                        list = ks3Var;
                    } else if (b2 <= e * 2) {
                        list = tl1.A(uy5Var2);
                        c = ' ';
                        j2 = 9205357640488583168L;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        int i6 = 0;
                        while (true) {
                            int i7 = uy5Var2.d;
                            if (i6 >= i7) {
                                break;
                            }
                            char c3 = c2;
                            int min = Math.min(i6 + e, i7);
                            arrayList.add(new uy5(uy5Var2.a, i6, uy5Var2.c, min));
                            i6 = min;
                            c2 = c3;
                            j3 = j3;
                        }
                        c = c2;
                        j2 = j3;
                        list = arrayList;
                    }
                    k8cVar.n = list;
                } else {
                    c = ' ';
                    j2 = 9205357640488583168L;
                }
                List list2 = k8cVar.n;
                if (list2.size() <= 1) {
                    return list2;
                }
                uy5 uy5Var3 = null;
                if (cd6Var.a()) {
                    if (uy5Var != null) {
                        if (!uy5Var.f()) {
                            uy5Var3 = uy5Var;
                        }
                        if (uy5Var3 != null) {
                            uy5Var2 = uy5Var3;
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        uy5 uy5Var4 = (uy5) obj2;
                        if (uy5Var4.a < uy5Var2.c && uy5Var4.c > uy5Var2.a && uy5Var4.b < uy5Var2.d && uy5Var4.d > uy5Var2.b) {
                            arrayList2.add(obj2);
                        }
                    }
                    return arrayList2;
                }
                int i8 = k8cVar.c;
                long j4 = zc6Var.a;
                if (j4 != j2) {
                    Iterator it = zc6Var.f.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((mi8) obj).a == i8) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    mi8 mi8Var = (mi8) obj;
                    if (mi8Var != null) {
                        float f = mi8Var.c;
                        uy5 uy5Var5 = mi8Var.d;
                        float f2 = mi8Var.b;
                        if (zc6Var.j()) {
                            i = uy5Var5.e();
                            i2 = (int) (f - f2);
                        } else {
                            int b3 = uy5Var5.b();
                            i = (int) (f - f2);
                            i2 = b3;
                        }
                        if (i > 0 && i2 > 0) {
                            float f3 = zc6Var.h;
                            if (f3 < 0.01f) {
                                f3 = 0.01f;
                            }
                            float f4 = 1.0f / f3;
                            if (zc6Var.j()) {
                                float f5 = -zc6Var.g();
                                float f6 = i2;
                                uy5Var3 = new uy5(0, (int) dce.m(f5 - f2, nae.e, f6), i, (int) dce.m((f5 + (Float.intBitsToFloat((int) (j4 & 4294967295L)) * f4)) - f2, nae.e, f6));
                            } else {
                                float f7 = -zc6Var.f();
                                float f8 = i;
                                uy5Var3 = new uy5((int) dce.m(f7 - f2, nae.e, f8), 0, (int) dce.m((f7 + (Float.intBitsToFloat((int) (j4 >> c)) * f4)) - f2, nae.e, f8), i2);
                            }
                        }
                    }
                }
                if (uy5Var3 != null && !uy5Var3.f()) {
                    uy5 uy5Var6 = (uy5) sl1.c0(list2);
                    int max = Math.max(uy5Var6.e(), uy5Var6.b());
                    int i9 = uy5Var3.a - max;
                    if (i9 < 0) {
                        i9 = 0;
                    }
                    int i10 = uy5Var3.b - max;
                    if (i10 >= 0) {
                        i5 = i10;
                    }
                    int i11 = uy5Var3.c + max;
                    if (i11 <= i3) {
                        i3 = i11;
                    }
                    int i12 = uy5Var3.d + max;
                    if (i12 <= i4) {
                        i4 = i12;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list2) {
                        uy5 uy5Var7 = (uy5) obj3;
                        if (uy5Var7.a < i3 && uy5Var7.c > i9 && uy5Var7.b < i4 && uy5Var7.d > i5) {
                            arrayList3.add(obj3);
                        }
                    }
                    return arrayList3;
                }
            }
        }
        return ks3Var;
    }

    public static final void b(k8c k8cVar, List list) {
        LinkedHashMap linkedHashMap = k8cVar.l;
        if (!linkedHashMap.isEmpty()) {
            HashSet A0 = sl1.A0(list);
            Collection<pi8> values = linkedHashMap.values();
            values.getClass();
            long j = 0;
            for (pi8 pi8Var : values) {
                j += pi8Var.e;
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            Set keySet = linkedHashMap.keySet();
            keySet.getClass();
            Set<hi0> set = keySet;
            int i = 0;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (hi0 hi0Var : set) {
                    if (!A0.contains(hi0Var) && (i = i + 1) < 0) {
                        tl1.L();
                        throw null;
                    }
                }
            }
            while (it.hasNext()) {
                if (j > 16000000 || i > 8) {
                    Object next = it.next();
                    next.getClass();
                    Map.Entry entry = (Map.Entry) next;
                    if (!A0.contains(entry.getKey())) {
                        j -= ((pi8) entry.getValue()).e;
                        i--;
                        it.remove();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.k8c r8, float r9, defpackage.uy5 r10, defpackage.n42 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.d8c
            if (r0 == 0) goto L13
            r0 = r11
            d8c r0 = (defpackage.d8c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            d8c r0 = new d8c
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            defpackage.hre.r(r11)     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            goto L6e
        L26:
            r8 = move-exception
            goto L71
        L28:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r3
        L2e:
            defpackage.hre.r(r11)
            int r11 = r10.e()     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            float r11 = (float) r11     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            float r11 = r11 * r9
            long r4 = (long) r11     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            int r11 = r10.b()     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            float r11 = (float) r11     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            float r11 = r11 * r9
            long r6 = (long) r11     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            long r4 = r4 * r6
            r6 = 25000000(0x17d7840, double:1.2351641E-316)
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 <= 0) goto L48
            return r3
        L48:
            d82 r11 = r0.getContext()     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            defpackage.k27.q(r11)     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            jt1 r11 = r8.a     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            jj9 r8 = r8.d     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            aza r8 = r8.a     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            zy5 r8 = (defpackage.zy5) r8     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            long r4 = r8.a     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            r6 = 0
            uy5 r8 = defpackage.pc2.b(r6, r4)     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            r0.c = r2     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            java.lang.Object r11 = r11.n(r8, r10, r9, r0)     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            n82 r8 = defpackage.n82.a
            if (r11 != r8) goto L6e
            return r8
        L6e:
            pi8 r11 = (defpackage.pi8) r11     // Catch: java.lang.Exception -> L26 java.util.concurrent.CancellationException -> L75
            return r11
        L71:
            r8.printStackTrace()
            return r3
        L75:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k8c.c(k8c, float, uy5, n42):java.lang.Object");
    }

    public final void d() {
        cza czaVar;
        Object value;
        cza czaVar2;
        Object value2;
        cza czaVar3;
        Object value3;
        do {
            czaVar = this.p;
            value = czaVar.getValue();
            pz9 pz9Var = (pz9) value;
        } while (!czaVar.l(value, new pz9()));
        do {
            czaVar2 = this.q;
            value2 = czaVar2.getValue();
            uy5 uy5Var = (uy5) value2;
        } while (!czaVar2.l(value2, null));
        do {
            czaVar3 = this.g;
            value3 = czaVar3.getValue();
            ((Boolean) value3).getClass();
        } while (!czaVar3.l(value3, Boolean.FALSE));
    }
}
