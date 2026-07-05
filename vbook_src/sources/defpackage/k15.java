package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k15  reason: default package */
/* loaded from: classes.dex */
public final class k15 implements l1a {
    public final /* synthetic */ int a;
    public final Object b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public long e;
    public long f;

    public k15(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new Object();
                this.c = new LinkedHashMap();
                this.d = new LinkedHashMap();
                return;
            default:
                this.b = new Object();
                this.c = new LinkedHashMap();
                this.d = new LinkedHashMap();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.l1a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.n42 r7) {
        /*
            r6 = this;
            int r0 = r6.a
            r1 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            switch(r0) {
                case 0: goto L52;
                default: goto L9;
            }
        L9:
            boolean r0 = r7 instanceof defpackage.ub5
            if (r0 == 0) goto L1a
            r0 = r7
            ub5 r0 = (defpackage.ub5) r0
            int r4 = r0.c
            r5 = r4 & r2
            if (r5 == 0) goto L1a
            int r4 = r4 - r2
            r0.c = r4
            goto L1f
        L1a:
            ub5 r0 = new ub5
            r0.<init>(r6, r7)
        L1f:
            java.lang.Object r7 = r0.a
            n82 r2 = defpackage.n82.a
            int r4 = r0.c
            if (r4 == 0) goto L33
            if (r4 != r3) goto L2d
            defpackage.hre.r(r7)
            goto L3e
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            goto L4e
        L33:
            defpackage.hre.r(r7)
            r0.c = r3
            pvc r7 = defpackage.pvc.a
            if (r7 != r2) goto L3e
            r1 = r2
            goto L4e
        L3e:
            java.lang.Object r7 = r6.b
            monitor-enter(r7)
            java.util.LinkedHashMap r0 = r6.c     // Catch: java.lang.Throwable -> L4f
            r0.clear()     // Catch: java.lang.Throwable -> L4f
            java.util.LinkedHashMap r6 = r6.d     // Catch: java.lang.Throwable -> L4f
            r6.clear()     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r7)
            pvc r1 = defpackage.pvc.a
        L4e:
            return r1
        L4f:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        L52:
            boolean r0 = r7 instanceof defpackage.j15
            if (r0 == 0) goto L63
            r0 = r7
            j15 r0 = (defpackage.j15) r0
            int r4 = r0.c
            r5 = r4 & r2
            if (r5 == 0) goto L63
            int r4 = r4 - r2
            r0.c = r4
            goto L68
        L63:
            j15 r0 = new j15
            r0.<init>(r6, r7)
        L68:
            java.lang.Object r7 = r0.a
            n82 r2 = defpackage.n82.a
            int r4 = r0.c
            if (r4 == 0) goto L7c
            if (r4 != r3) goto L76
            defpackage.hre.r(r7)
            goto L87
        L76:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            goto Lbd
        L7c:
            defpackage.hre.r(r7)
            r0.c = r3
            pvc r7 = defpackage.pvc.a
            if (r7 != r2) goto L87
            r1 = r2
            goto Lbd
        L87:
            java.lang.Object r7 = r6.b
            monitor-enter(r7)
            java.util.LinkedHashMap r0 = r6.d     // Catch: java.lang.Throwable -> Lbe
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> Lbe
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> Lbe
            java.util.List r0 = defpackage.sl1.C0(r0)     // Catch: java.lang.Throwable -> Lbe
            java.util.LinkedHashMap r1 = r6.d     // Catch: java.lang.Throwable -> Lbe
            r1.clear()     // Catch: java.lang.Throwable -> Lbe
            java.util.LinkedHashMap r6 = r6.c     // Catch: java.lang.Throwable -> Lbe
            r6.clear()     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r7)
            java.util.Iterator r6 = r0.iterator()
        La5:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lbb
            java.lang.Object r7 = r6.next()
            l15 r7 = (defpackage.l15) r7
            jj r7 = r7.a
            android.graphics.Bitmap r7 = defpackage.ay5.a(r7)
            r7.recycle()
            goto La5
        Lbb:
            pvc r1 = defpackage.pvc.a
        Lbd:
            return r1
        Lbe:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k15.a(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b2  */
    /* JADX WARN: Type inference failed for: r7v41, types: [s6f, t38, java.lang.Object] */
    @Override // defpackage.l1a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r29, java.lang.Object[] r30, defpackage.m42 r31) {
        /*
            Method dump skipped, instructions count: 2362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k15.b(java.lang.String, java.lang.Object[], m42):java.lang.Object");
    }

    public String c(gb5 gb5Var) {
        String str;
        synchronized (this.b) {
            long j = this.e + 1;
            this.e = j;
            str = "html-element-" + j;
            this.c.put(str, gb5Var);
        }
        return str;
    }

    public String d(hb5 hb5Var) {
        String str;
        synchronized (this.b) {
            long j = this.f + 1;
            this.f = j;
            str = "html-elements-" + j;
            this.d.put(str, hb5Var);
        }
        return str;
    }

    public i15 e(Object obj) {
        String str;
        i15 i15Var;
        if (obj instanceof i15) {
            return (i15) obj;
        }
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = this.c;
                if (obj != null) {
                    str = obj.toString();
                } else {
                    str = null;
                }
                i15Var = (i15) linkedHashMap.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return i15Var;
    }

    public gb5 f(Object obj) {
        String str;
        gb5 gb5Var;
        if (obj instanceof gb5) {
            return (gb5) obj;
        }
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = this.c;
                if (obj != null) {
                    str = obj.toString();
                } else {
                    str = null;
                }
                gb5Var = (gb5) linkedHashMap.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return gb5Var;
    }

    public hb5 g(Object obj) {
        String str;
        hb5 hb5Var;
        if (obj instanceof hb5) {
            return (hb5) obj;
        }
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = this.d;
                if (obj != null) {
                    str = obj.toString();
                } else {
                    str = null;
                }
                hb5Var = (hb5) linkedHashMap.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return hb5Var;
    }

    public l15 h(Object obj) {
        String str;
        l15 l15Var;
        if (obj instanceof l15) {
            return (l15) obj;
        }
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = this.d;
                if (obj != null) {
                    str = obj.toString();
                } else {
                    str = null;
                }
                l15Var = (l15) linkedHashMap.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return l15Var;
    }
}
