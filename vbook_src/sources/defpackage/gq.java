package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gq  reason: default package */
/* loaded from: classes.dex */
public final class gq implements zg8 {
    public final String a;
    public final sw7 b;
    public lx9 c;
    public final sw7 d;
    public final LinkedHashMap e;

    public gq(String str) {
        str.getClass();
        this.a = str;
        this.b = new sw7();
        this.d = new sw7();
        this.e = new LinkedHashMap();
    }

    public static Integer Q(int i, List list) {
        tp tpVar;
        int i2 = 0;
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i2 + 1;
            if (i2 >= 0) {
                int i5 = 0;
                for (Object obj2 : ((sp) obj).a) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        tp tpVar2 = (tp) obj2;
                        int length = tpVar2.a.a.length() + i3;
                        if (i3 <= i && i <= length) {
                            return Integer.valueOf((i - i3) + tpVar2.b);
                        }
                        i3 = length + 1;
                        i5 = i6;
                    } else {
                        tl1.M();
                        throw null;
                    }
                }
                i2 = i4;
            } else {
                tl1.M();
                throw null;
            }
        }
        sp spVar = (sp) sl1.k0(list);
        if (spVar == null || (tpVar = (tp) sl1.k0(spVar.a)) == null) {
            return null;
        }
        return Integer.valueOf(tpVar.a.a.length() + tpVar.b);
    }

    public static final void q(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            arrayList2.add(new sp(sl1.C0(arrayList)));
            arrayList.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r9.o(r0) == r5) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:23:0x004c, B:25:0x0050), top: B:37:0x004c }] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v6, types: [qw7] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [qw7] */
    /* JADX WARN: Type inference failed for: r1v7, types: [qw7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(defpackage.n42 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.aq
            if (r0 == 0) goto L13
            r0 = r9
            aq r0 = (defpackage.aq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aq r0 = new aq
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 2
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3c
            if (r1 == r2) goto L35
            if (r1 != r3) goto L2f
            qw7 r0 = r0.a
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L2d
            goto L73
        L2d:
            r8 = move-exception
            goto L81
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r4
        L35:
            qw7 r1 = r0.a
            defpackage.hre.r(r9)
            r9 = r1
            goto L4c
        L3c:
            defpackage.hre.r(r9)
            sw7 r9 = r8.b
            r0.a = r9
            r0.d = r2
            java.lang.Object r1 = r9.o(r0)
            if (r1 != r5) goto L4c
            goto L6f
        L4c:
            lx9 r1 = r8.c     // Catch: java.lang.Throwable -> L7a
            if (r1 != 0) goto L7d
            eb5 r1 = new eb5     // Catch: java.lang.Throwable -> L7a
            android.content.Context r2 = defpackage.twe.e     // Catch: java.lang.Throwable -> L7a
            r2.getClass()     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = r8.a     // Catch: java.lang.Throwable -> L7a
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L7a
            android.net.Uri r2 = android.net.Uri.fromFile(r2)     // Catch: java.lang.Throwable -> L7a
            r0.a = r9     // Catch: java.lang.Throwable -> L7a
            r0.d = r3     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r1.r(r2, r0)     // Catch: java.lang.Throwable -> L7a
            if (r0 != r5) goto L70
        L6f:
            return r5
        L70:
            r7 = r0
            r0 = r9
            r9 = r7
        L73:
            r1 = r9
            lx9 r1 = (defpackage.lx9) r1     // Catch: java.lang.Throwable -> L2d
            r8.c = r1     // Catch: java.lang.Throwable -> L2d
            r9 = r0
            goto L7d
        L7a:
            r8 = move-exception
            r0 = r9
            goto L81
        L7d:
            r9.q(r4)
            return r1
        L81:
            r0.q(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq.C(n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r8 == r5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (r8 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    @Override // defpackage.zg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E0(defpackage.ch8 r7, defpackage.n42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.wp
            if (r0 == 0) goto L13
            r0 = r8
            wp r0 = (defpackage.wp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            wp r0 = new wp
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.hre.r(r8)
            goto L5e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L31:
            ch8 r7 = r0.a
            defpackage.hre.r(r8)
            goto L45
        L37:
            defpackage.hre.r(r8)
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r6.C(r0)
            if (r8 != r5) goto L45
            goto L5d
        L45:
            lx9 r8 = (defpackage.lx9) r8
            int r6 = r7.a
            r0.a = r2
            r0.d = r3
            r8.getClass()
            tr0 r7 = new tr0
            r1 = 15
            r7.<init>(r6, r1)
            java.lang.Object r8 = r8.q(r7, r0)
            if (r8 != r5) goto L5e
        L5d:
            return r5
        L5e:
            bp8 r8 = (defpackage.bp8) r8
            dh8 r6 = new dh8
            int r7 = r8.b
            int r8 = r8.a
            r6.<init>(r7, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq.E0(ch8, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
        if (r2.o(r0) != r8) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(int r10, defpackage.n42 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.eq
            if (r0 == 0) goto L13
            r0 = r11
            eq r0 = (defpackage.eq) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            eq r0 = new eq
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.d
            int r1 = r0.f
            sw7 r2 = r9.d
            r3 = 3
            r4 = 2
            r5 = 1
            java.util.LinkedHashMap r6 = r9.e
            r7 = 0
            n82 r8 = defpackage.n82.a
            if (r1 == 0) goto L50
            if (r1 == r5) goto L46
            if (r1 == r4) goto L40
            if (r1 != r3) goto L3a
            int r9 = r0.a
            sw7 r2 = r0.c
            java.lang.Object r10 = r0.b
            java.util.List r10 = (java.util.List) r10
            defpackage.hre.r(r11)
            goto L92
        L3a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r7
        L40:
            int r9 = r0.a
            defpackage.hre.r(r11)
            goto L80
        L46:
            int r10 = r0.a
            java.lang.Object r1 = r0.b
            qw7 r1 = (defpackage.qw7) r1
            defpackage.hre.r(r11)
            goto L61
        L50:
            defpackage.hre.r(r11)
            r0.b = r2
            r0.a = r10
            r0.f = r5
            java.lang.Object r11 = r2.o(r0)
            if (r11 != r8) goto L60
            goto L91
        L60:
            r1 = r2
        L61:
            java.lang.Integer r11 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lbd
            r11.<init>(r10)     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r11 = r6.get(r11)     // Catch: java.lang.Throwable -> Lbd
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> Lbd
            r1.q(r7)
            if (r11 == 0) goto L72
            return r11
        L72:
            r0.b = r7
            r0.a = r10
            r0.f = r4
            java.io.Serializable r11 = r9.o(r10, r0)
            if (r11 != r8) goto L7f
            goto L91
        L7f:
            r9 = r10
        L80:
            r10 = r11
            java.util.List r10 = (java.util.List) r10
            r0.b = r10
            r0.c = r2
            r0.a = r9
            r0.f = r3
            java.lang.Object r11 = r2.o(r0)
            if (r11 != r8) goto L92
        L91:
            return r8
        L92:
            java.lang.Integer r11 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lb3
            r11.<init>(r9)     // Catch: java.lang.Throwable -> Lb3
            r6.put(r11, r10)     // Catch: java.lang.Throwable -> Lb3
            int r9 = r6.size()     // Catch: java.lang.Throwable -> Lb3
            r11 = 8
            if (r9 <= r11) goto Lb5
            java.util.Set r9 = r6.keySet()     // Catch: java.lang.Throwable -> Lb3
            r9.getClass()     // Catch: java.lang.Throwable -> Lb3
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r9 = defpackage.sl1.b0(r9)     // Catch: java.lang.Throwable -> Lb3
            r6.remove(r9)     // Catch: java.lang.Throwable -> Lb3
            goto Lb5
        Lb3:
            r9 = move-exception
            goto Lb9
        Lb5:
            r2.q(r7)
            return r10
        Lb9:
            r2.q(r7)
            throw r9
        Lbd:
            r9 = move-exception
            r1.q(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq.G(int, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r12 == r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r12 == r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // defpackage.zg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H0(defpackage.n42 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.vp
            if (r0 == 0) goto L13
            r0 = r12
            vp r0 = (defpackage.vp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vp r0 = new vp
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            n82 r4 = defpackage.n82.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.hre.r(r12)
            goto L65
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r11)
            r11 = 0
            return r11
        L31:
            defpackage.hre.r(r12)
            goto L41
        L35:
            defpackage.hre.r(r12)
            r0.c = r3
            java.lang.Object r12 = r11.C(r0)
            if (r12 != r4) goto L41
            goto L64
        L41:
            r9 = r12
            lx9 r9 = (defpackage.lx9) r9
            int r11 = r9.f
            r6 = 0
            if (r11 <= 0) goto L6d
            ix9 r7 = new ix9
            r7.<init>(r9, r3)
            android.util.Size r8 = new android.util.Size
            r11 = 512(0x200, float:7.17E-43)
            r8.<init>(r11, r11)
            r0.c = r2
            hq r5 = new hq
            r10 = 25
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r12 = r9.q(r5, r0)
            if (r12 != r4) goto L65
        L64:
            return r4
        L65:
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            r11 = 100
            byte[] r6 = defpackage.zxe.l(r12, r11)
        L6d:
            ah8 r11 = new ah8
            r11.<init>(r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq.H0(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    @Override // defpackage.zg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(defpackage.ch8 r7, int r8, int r9, defpackage.m42 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.dq
            if (r0 == 0) goto L13
            r0 = r10
            dq r0 = (defpackage.dq) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            dq r0 = new dq
            n42 r10 = (defpackage.n42) r10
            r0.<init>(r6, r10)
        L1a:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            int r9 = r0.b
            int r8 = r0.a
            defpackage.hre.r(r10)
            goto L4b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L32:
            defpackage.hre.r(r10)
            if (r9 > r8) goto L3a
            ks3 r6 = defpackage.ks3.a
            return r6
        L3a:
            int r7 = r7.a
            r0.a = r8
            r0.b = r9
            r0.e = r2
            java.lang.Object r10 = r6.G(r7, r0)
            n82 r6 = defpackage.n82.a
            if (r10 != r6) goto L4b
            return r6
        L4b:
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r10.iterator()
            r10 = 0
            r0 = r10
        L58:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r7.next()
            sp r1 = (defpackage.sp) r1
            java.lang.String r2 = r1.c
            int r2 = r2.length()
            int r2 = r2 + r0
            if (r0 >= r9) goto L94
            if (r2 <= r8) goto L94
            java.util.ArrayList r0 = r1.b
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.tl1.s(r0, r3)
            r1.<init>(r3)
            int r3 = r0.size()
            r4 = r10
        L81:
            if (r4 >= r3) goto L91
            java.lang.Object r5 = r0.get(r4)
            int r4 = r4 + 1
            gh8 r5 = (defpackage.gh8) r5
            eh8 r5 = r5.b
            r1.add(r5)
            goto L81
        L91:
            defpackage.xl1.P(r6, r1)
        L94:
            int r0 = r2 + 1
            goto L58
        L97:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq.O(ch8, int, int, m42):java.lang.Object");
    }

    @Override // defpackage.zg8
    public final Object T() {
        Object gs9Var;
        Throwable th;
        try {
            m66 m66Var = pe4.a;
            String str = hn8.b;
            x56 N0 = m66Var.N0(fn8.d(this.a, false));
            Throwable th2 = null;
            Object t = cne.t(N0);
            try {
                N0.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            th = th2;
            gs9Var = t;
        } catch (Throwable th4) {
            gs9Var = new gs9(th4);
        }
        if (th != null) {
            throw th;
        } else if (gs9Var instanceof gs9) {
            return ks3.a;
        } else {
            return gs9Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046 A[LOOP:0: B:18:0x0044->B:19:0x0046, LOOP_END] */
    @Override // defpackage.zg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable T0(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.zp
            if (r0 == 0) goto L13
            r0 = r5
            zp r0 = (defpackage.zp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zp r0 = new zp
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r5)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r5)
            r0.c = r2
            java.lang.Object r5 = r4.C(r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L3a
            return r4
        L3a:
            lx9 r5 = (defpackage.lx9) r5
            int r4 = r5.f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            r0 = 0
        L44:
            if (r0 >= r4) goto L51
            ch8 r1 = new ch8
            r1.<init>(r0)
            r5.add(r1)
            int r0 = r0 + 1
            goto L44
        L51:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq.T0(n42):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r8 == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r8 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    @Override // defpackage.zg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable W0(defpackage.ty5 r7, defpackage.n42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.xp
            if (r0 == 0) goto L13
            r0 = r8
            xp r0 = (defpackage.xp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xp r0 = new xp
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.hre.r(r8)
            goto L52
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L31:
            ty5 r7 = r0.a
            defpackage.hre.r(r8)
            goto L45
        L37:
            defpackage.hre.r(r8)
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r6.C(r0)
            if (r8 != r5) goto L45
            goto L51
        L45:
            lx9 r8 = (defpackage.lx9) r8
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r8.o(r7, r0)
            if (r8 != r5) goto L52
        L51:
            return r5
        L52:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.tl1.s(r8, r7)
            r6.<init>(r7)
            java.util.Iterator r7 = r8.iterator()
        L63:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L7c
            java.lang.Object r8 = r7.next()
            bp8 r8 = (defpackage.bp8) r8
            dh8 r0 = new dh8
            int r1 = r8.b
            int r8 = r8.a
            r0.<init>(r1, r8)
            r6.add(r0)
            goto L63
        L7c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq.W0(ty5, n42):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dd, code lost:
        if (r1 != r7) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    @Override // defpackage.zg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c1(defpackage.ch8 r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, defpackage.n42 r26) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq.c1(ch8, int, int, int, int, int, int, int, int, n42):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        lx9 lx9Var = this.c;
        if (lx9Var != null) {
            lx9Var.close();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:(7:12|13|14|(9:16|(3:18|(3:20|21|22)(1:24)|23)|25|26|(1:28)|29|30|(1:32)|34)|(1:36)|37|(1:42)(2:39|40))(2:43|44))(5:45|46|47|(6:50|14|(0)|(0)|37|(0)(0))|49))(1:51))(2:65|(1:69)(1:67))|52|(2:54|(1:62)(2:58|(2:60|49)(4:61|47|(0)|49)))(1:64)))|72|6|7|(0)(0)|52|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
        if (r14 == r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0140, code lost:
        r6 = new defpackage.gs9(r10);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:14:0x0030, B:45:0x00d4, B:47:0x00d8, B:49:0x00e7, B:51:0x00f1, B:52:0x00f5, B:54:0x0101, B:55:0x010f, B:57:0x0120, B:21:0x004a, B:41:0x00a8, B:37:0x008a), top: B:67:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    @Override // defpackage.zg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(defpackage.ch8 r11, int r12, int r13, defpackage.m42 r14) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq.d0(ch8, int, int, m42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r1 != r7) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable o(int r18, defpackage.n42 r19) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq.o(int, n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    @Override // defpackage.zg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o0(defpackage.ch8 r7, defpackage.m42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.yp
            if (r0 == 0) goto L13
            r0 = r8
            yp r0 = (defpackage.yp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            yp r0 = new yp
            n42 r8 = (defpackage.n42) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.hre.r(r8)
            goto L3e
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.hre.r(r8)
            int r7 = r7.a
            r0.c = r2
            java.lang.Object r8 = r6.G(r7, r0)
            n82 r6 = defpackage.n82.a
            if (r8 != r6) goto L3e
            return r6
        L3e:
            r0 = r8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            y4 r4 = new y4
            r6 = 14
            r4.<init>(r6)
            r5 = 30
            java.lang.String r1 = "\n"
            r2 = 0
            r3 = 0
            java.lang.String r6 = defpackage.sl1.i0(r0, r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq.o0(ch8, m42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[LOOP:0: B:19:0x005b->B:21:0x0061, LOOP_END] */
    /* JADX WARN: Type inference failed for: r7v3, types: [xl9, java.lang.Object] */
    @Override // defpackage.zg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u0(defpackage.ch8 r6, defpackage.m42 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cq
            if (r0 == 0) goto L13
            r0 = r7
            cq r0 = (defpackage.cq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            cq r0 = new cq
            n42 r7 = (defpackage.n42) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            xl9 r5 = r0.a
            defpackage.hre.r(r7)
            goto L4a
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L30:
            defpackage.hre.r(r7)
            xl9 r7 = new xl9
            r7.<init>()
            int r6 = r6.a
            r0.a = r7
            r0.d = r2
            java.lang.Object r5 = r5.G(r6, r0)
            n82 r6 = defpackage.n82.a
            if (r5 != r6) goto L47
            return r6
        L47:
            r4 = r7
            r7 = r5
            r5 = r4
        L4a:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.tl1.s(r7, r0)
            r6.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
        L5b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r7.next()
            sp r0 = (defpackage.sp) r0
            int r1 = r5.a
            java.lang.String r2 = r0.c
            int r2 = r2.length()
            int r2 = r2 + r1
            int r3 = r2 + 1
            r5.a = r3
            fh8 r3 = new fh8
            java.util.ArrayList r0 = r0.b
            r3.<init>(r1, r0, r2)
            r6.add(r3)
            goto L5b
        L7f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq.u0(ch8, m42):java.lang.Object");
    }
}
