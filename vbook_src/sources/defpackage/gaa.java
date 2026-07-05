package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gaa  reason: default package */
/* loaded from: classes3.dex */
public final class gaa implements AutoCloseable {
    public hk2 C;
    public pta D;
    public final String a;
    public final ii2 b;
    public final h1a c;
    public final pb1 d;
    public final sw7 e;
    public un2 f;

    public gaa(String str, ii2 ii2Var, h1a h1aVar, pb1 pb1Var) {
        str.getClass();
        this.a = str;
        this.b = ii2Var;
        this.c = h1aVar;
        this.d = pb1Var;
        this.e = new sw7();
    }

    public static wad Q(String str) {
        t36 A;
        ArrayList arrayList = new ArrayList();
        k46 c = r36.d.c(str);
        if (c instanceof t36) {
            for (k46 k46Var : (Iterable) c) {
                abd S = S(k46Var);
                if (S != null) {
                    arrayList.add(S);
                }
            }
        } else {
            String str2 = null;
            t36 A2 = null;
            if (c instanceof d56) {
                d56 d56Var = (d56) c;
                k46 k46Var2 = (k46) d56Var.get("tracks");
                if (k46Var2 != null && (A = oc2.A(k46Var2)) != null) {
                    A2 = A;
                } else {
                    k46 k46Var3 = (k46) d56Var.get("data");
                    if (k46Var3 != null) {
                        A2 = oc2.A(k46Var3);
                    }
                }
                if (A2 != null) {
                    for (k46 k46Var4 : A2.a) {
                        abd S2 = S(k46Var4);
                        if (S2 != null) {
                            arrayList.add(S2);
                        }
                    }
                } else {
                    abd S3 = S(c);
                    if (S3 != null) {
                        arrayList.add(S3);
                    }
                }
            } else if (c instanceof i56) {
                String x = oc2.x(c);
                if (x != null) {
                    if (!k4b.j0(x)) {
                        str2 = x;
                    }
                    if (str2 != null) {
                        arrayList.add(new abd(str2));
                    }
                }
            } else {
                xk5.o();
                return null;
            }
        }
        return new wad(arrayList);
    }

    public static abd S(k46 k46Var) {
        i56 i56Var;
        String str;
        String str2;
        String str3;
        d56 B = oc2.B(k46Var);
        String str4 = null;
        if (B != null) {
            k46 k46Var2 = (k46) B.get("data");
            if (k46Var2 == null || (str2 = oc2.x(k46Var2)) == null) {
                k46 k46Var3 = (k46) B.get("url");
                if (k46Var3 != null) {
                    str2 = oc2.x(k46Var3);
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    k46 k46Var4 = (k46) B.get("link");
                    if (k46Var4 != null) {
                        str2 = oc2.x(k46Var4);
                    } else {
                        str2 = null;
                    }
                }
            }
            if (str2 != null && !k4b.j0(str2)) {
                k46 k46Var5 = (k46) B.get("title");
                if (k46Var5 == null || (str3 = oc2.x(k46Var5)) == null) {
                    k46 k46Var6 = (k46) B.get("name");
                    if (k46Var6 != null) {
                        str3 = oc2.x(k46Var6);
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        k46 k46Var7 = (k46) B.get("label");
                        if (k46Var7 != null) {
                            str4 = oc2.x(k46Var7);
                        }
                        if (str4 == null) {
                            str3 = "";
                        } else {
                            str3 = str4;
                        }
                    }
                }
                return new abd(str3, str2);
            }
        } else {
            if (k46Var instanceof i56) {
                i56Var = (i56) k46Var;
            } else {
                i56Var = null;
            }
            if (i56Var != null) {
                str = oc2.x(i56Var);
            } else {
                str = null;
            }
            if (str != null && !k4b.j0(str)) {
                return new abd(str);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(int r11, java.lang.String r12, boolean r13, defpackage.n42 r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gaa.C(int, java.lang.String, boolean, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (r1 != r7) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(java.lang.String r19, defpackage.n42 r20) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gaa.G(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:18:0x0041, B:20:0x0049), top: B:28:0x0041 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.caa
            if (r0 == 0) goto L13
            r0 = r5
            caa r0 = (defpackage.caa) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            caa r0 = new caa
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            sw7 r0 = r0.a
            defpackage.hre.r(r5)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L2e:
            defpackage.hre.r(r5)
            sw7 r5 = r4.e
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.o(r0)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            un2 r5 = r4.q()     // Catch: java.lang.Throwable -> L53
            pta r1 = r4.D     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L55
            pta r1 = new pta     // Catch: java.lang.Throwable -> L53
            h1a r2 = r4.c     // Catch: java.lang.Throwable -> L53
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L53
            r4.D = r1     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r4 = move-exception
            goto L59
        L55:
            r0.q(r3)
            return r1
        L59:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gaa.o(n42):java.lang.Object");
    }

    public final un2 q() {
        String str;
        if (this.f == null) {
            ii2 ii2Var = this.b;
            gk2 gk2Var = ii2Var.c;
            String str2 = this.a;
            hk2 hk2Var = (hk2) gk2Var.k0(str2).d();
            this.C = hk2Var;
            un2 a = g54.a(ii2Var, hk2Var.j, hk2Var.l);
            this.f = a;
            String str3 = a.a;
            hk2 hk2Var2 = this.C;
            String str4 = null;
            if (hk2Var2 != null) {
                if (!c16.i(str3, hk2Var2.l)) {
                    un2 un2Var = this.f;
                    if (un2Var != null) {
                        str = un2Var.a;
                    } else {
                        str = null;
                    }
                    if (un2Var != null) {
                        str4 = un2Var.b;
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    gk2Var.H0(str, str4, str2);
                }
            } else {
                c16.w("book");
                throw null;
            }
        }
        un2 un2Var2 = this.f;
        if (un2Var2 != null) {
            return un2Var2;
        }
        throw new Exception();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r3 == r7) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r0 == r7) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
        return r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(boolean r35, defpackage.n42 r36) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gaa.x(boolean, n42):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
