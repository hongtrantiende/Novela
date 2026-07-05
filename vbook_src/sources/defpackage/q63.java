package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q63  reason: default package */
/* loaded from: classes3.dex */
public final class q63 {
    public final rc9 a;
    public final ii2 b;
    public final sw7 c = new sw7();
    public final mfb d = new mfb(new rj2(17));
    public aw4 e;

    public q63(rc9 rc9Var, ii2 ii2Var) {
        this.a = rc9Var;
        this.b = ii2Var;
    }

    public static final xnc a(q63 q63Var, List list) {
        xnc xncVar = new xnc();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cp2 cp2Var = (cp2) it.next();
            if (cp2Var.f == 1) {
                xncVar.a(cp2Var.c, cp2Var.d);
            }
        }
        return xncVar;
    }

    public static hn8 b(String str) {
        if (str != null && str.length() != 0) {
            return hn8.f(ie2.u(pe4.a), str);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fb9 e(Map map, String str) {
        List u0 = sl1.u0(map.entrySet(), new kn4(22));
        int size = map.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((Map.Entry) u0.get(i)).getKey();
        }
        int size2 = map.size();
        String[] strArr2 = new String[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            strArr2[i2] = ((Map.Entry) u0.get(i2)).getValue();
        }
        m66 m66Var = pe4.a;
        hn8 f = hn8.f(ie2.u(m66Var), "dictionary");
        m66Var.Q(f);
        hn8 f2 = hn8.f(f, str);
        m66Var.V(f2, false);
        lj9 lj9Var = new lj9(m66Var.g1(f2, false));
        try {
            lj9Var.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                if (i3 != 0) {
                    lj9Var.i0("\n");
                }
                lj9Var.i0(strArr2[i3]);
            }
            for (int i4 = 0; i4 < size; i4++) {
                lj9Var.i0("\n");
                lj9Var.i0(strArr[i4]);
            }
            try {
                lj9Var.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                lj9Var.close();
            } catch (Throwable th3) {
                pye.e(th, th3);
            }
        }
        if (th == null) {
            return new fb9("dictionary/".concat(str), u0.size());
        }
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fb9 f(Map map, String str) {
        List u0 = sl1.u0(map.entrySet(), new kn4(23));
        int size = map.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((Map.Entry) u0.get(i)).getKey();
        }
        int size2 = map.size();
        String[] strArr2 = new String[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            strArr2[i2] = ((Map.Entry) u0.get(i2)).getValue();
        }
        ne3 ne3Var = new ne3(strArr);
        ne3Var.a();
        m66 m66Var = pe4.a;
        hn8 f = hn8.f(ie2.u(m66Var), "dictionary");
        m66Var.Q(f);
        hn8 f2 = hn8.f(f, str);
        m66Var.V(f2, false);
        lj9 lj9Var = new lj9(m66Var.g1(f2, false));
        try {
            int[] iArr = ne3Var.c;
            lj9Var.writeInt(iArr.length);
            for (int i3 : iArr) {
                lj9Var.writeInt(i3);
            }
            int[] iArr2 = ne3Var.b;
            lj9Var.writeInt(iArr2.length);
            for (int i4 : iArr2) {
                lj9Var.writeInt(i4);
            }
            lj9Var.writeInt(size2);
            for (int i5 = 0; i5 < size2; i5++) {
                if (i5 != 0) {
                    lj9Var.i0("\n");
                }
                lj9Var.i0(strArr2[i5]);
            }
            for (int i6 = 0; i6 < size; i6++) {
                lj9Var.i0("\n");
                lj9Var.i0(strArr[i6]);
            }
            try {
                lj9Var.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                lj9Var.close();
            } catch (Throwable th3) {
                pye.e(th, th3);
            }
        }
        if (th == null) {
            return new fb9("dictionary/".concat(str), u0.size());
        }
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.LinkedHashMap, java.util.Map] */
    public static Object j(hn8 hn8Var) {
        if (hn8Var != null && pe4.a.j0(hn8Var)) {
            mj9 mj9Var = new mj9(tl1.J(hn8Var.toFile()));
            Throwable th = null;
            try {
                int readInt = mj9Var.readInt();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < readInt; i++) {
                    String S = mj9Var.S();
                    S.getClass();
                    arrayList.add(S);
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < readInt; i2++) {
                    String S2 = mj9Var.S();
                    S2.getClass();
                    arrayList2.add(S2);
                }
                ?? linkedHashMap = new LinkedHashMap();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    linkedHashMap.put(arrayList2.get(i3), arrayList.get(i3));
                }
                try {
                    mj9Var.close();
                } catch (Throwable th2) {
                    th = th2;
                }
                th = th;
                th = linkedHashMap;
            } catch (Throwable th3) {
                th = th3;
                try {
                    mj9Var.close();
                } catch (Throwable th4) {
                    pye.e(th, th4);
                }
            }
            if (th == null) {
                return th;
            }
            throw th;
        }
        return ls3.a;
    }

    public static xnc k(List list) {
        xnc xncVar = new xnc();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cp2 cp2Var = (cp2) it.next();
            if (cp2Var.f == 0) {
                xncVar.a(cp2Var.c, cp2Var.d);
            }
        }
        return xncVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static qe3 l(hn8 hn8Var) {
        Throwable th;
        if (hn8Var != null && pe4.a.j0(hn8Var)) {
            mj9 mj9Var = new mj9(tl1.J(hn8Var.toFile()));
            qe3 th2 = null;
            try {
                int readInt = mj9Var.readInt();
                int[] iArr = new int[readInt];
                for (int i = 0; i < readInt; i++) {
                    iArr[i] = mj9Var.readInt();
                }
                int readInt2 = mj9Var.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i2 = 0; i2 < readInt2; i2++) {
                    iArr2[i2] = mj9Var.readInt();
                }
                int readInt3 = mj9Var.readInt();
                String[] strArr = new String[readInt3];
                for (int i3 = 0; i3 < readInt3; i3++) {
                    strArr[i3] = null;
                }
                for (int i4 = 0; i4 < readInt3; i4++) {
                    strArr[i4] = mj9Var.S();
                }
                qe3 qe3Var = new qe3(new pe3(iArr2, iArr, readInt3), strArr);
                try {
                    mj9Var.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
                th = th2;
                th2 = qe3Var;
            } catch (Throwable th4) {
                try {
                    mj9Var.close();
                    th = th4;
                } catch (Throwable th5) {
                    pye.e(th4, th5);
                    th = th4;
                }
            }
            if (th == null) {
                return th2;
            }
            throw th;
        }
        return new qe3(new pe3(new int[0], new int[0], 0), new String[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.LinkedHashMap, java.util.Map] */
    public static Object m(hn8 hn8Var) {
        if (hn8Var != null && pe4.a.j0(hn8Var)) {
            mj9 mj9Var = new mj9(tl1.J(hn8Var.toFile()));
            Throwable th = null;
            try {
                int readInt = mj9Var.readInt();
                for (int i = 0; i < readInt; i++) {
                    mj9Var.readInt();
                }
                int readInt2 = mj9Var.readInt();
                for (int i2 = 0; i2 < readInt2; i2++) {
                    mj9Var.readInt();
                }
                int readInt3 = mj9Var.readInt();
                String[] strArr = new String[readInt3];
                int i3 = 0;
                while (true) {
                    String str = "";
                    if (i3 >= readInt3) {
                        break;
                    }
                    String S = mj9Var.S();
                    if (S != null) {
                        str = S;
                    }
                    strArr[i3] = str;
                    i3++;
                }
                String[] strArr2 = new String[readInt3];
                for (int i4 = 0; i4 < readInt3; i4++) {
                    String S2 = mj9Var.S();
                    if (S2 == null) {
                        S2 = "";
                    }
                    strArr2[i4] = S2;
                }
                ?? linkedHashMap = new LinkedHashMap(readInt3);
                for (int i5 = 0; i5 < readInt3; i5++) {
                    linkedHashMap.put(strArr2[i5], strArr[i5]);
                }
                try {
                    mj9Var.close();
                } catch (Throwable th2) {
                    th = th2;
                }
                th = th;
                th = linkedHashMap;
            } catch (Throwable th3) {
                th = th3;
                try {
                    mj9Var.close();
                } catch (Throwable th4) {
                    pye.e(th, th4);
                }
            }
            if (th == null) {
                return th;
            }
            throw th;
        }
        return ls3.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    public static Integer o(hn8 hn8Var) {
        Throwable th;
        pe4.a.getClass();
        mj9 mj9Var = new mj9(tl1.J(hn8Var.toFile()));
        Integer th2 = null;
        try {
            Integer num = new Integer(mj9Var.readInt());
            try {
                mj9Var.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            th = th2;
            th2 = num;
        } catch (Throwable th4) {
            try {
                mj9Var.close();
                th = th4;
            } catch (Throwable th5) {
                pye.e(th4, th5);
                th = th4;
            }
        }
        if (th == null) {
            return th2;
        }
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static Integer p(hn8 hn8Var) {
        Throwable th;
        pe4.a.getClass();
        mj9 mj9Var = new mj9(tl1.J(hn8Var.toFile()));
        Integer th2 = null;
        try {
            int readInt = mj9Var.readInt();
            for (int i = 0; i < readInt; i++) {
                mj9Var.readInt();
            }
            int readInt2 = mj9Var.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                mj9Var.readInt();
            }
            Integer num = new Integer(mj9Var.readInt());
            try {
                mj9Var.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            th = th2;
            th2 = num;
        } catch (Throwable th4) {
            try {
                mj9Var.close();
                th = th4;
            } catch (Throwable th5) {
                pye.e(th4, th5);
                th = th4;
            }
        }
        if (th == null) {
            return th2;
        }
        throw th;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r8.o(r1) == r6) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058 A[Catch: all -> 0x0091, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0091, blocks: (B:23:0x0050, B:27:0x0058), top: B:39:0x0050 }] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [qw7] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [qw7] */
    /* JADX WARN: Type inference failed for: r1v8, types: [qw7] */
    /* JADX WARN: Type inference failed for: r2v6, types: [qw7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.n42 r8) {
        /*
            r7 = this;
            ii2 r0 = r7.b
            boolean r1 = r8 instanceof defpackage.b63
            if (r1 == 0) goto L15
            r1 = r8
            b63 r1 = (defpackage.b63) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            b63 r1 = new b63
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.c
            int r2 = r1.e
            r3 = 2
            r4 = 1
            r5 = 0
            n82 r6 = defpackage.n82.a
            if (r2 == 0) goto L40
            if (r2 == r4) goto L39
            if (r2 != r3) goto L33
            q63 r0 = r1.b
            qw7 r1 = r1.a
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L31
            goto L82
        L31:
            r7 = move-exception
            goto L93
        L33:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r5
        L39:
            qw7 r2 = r1.a
            defpackage.hre.r(r8)
            r8 = r2
            goto L50
        L40:
            defpackage.hre.r(r8)
            sw7 r8 = r7.c
            r1.a = r8
            r1.e = r4
            java.lang.Object r2 = r8.o(r1)
            if (r2 != r6) goto L50
            goto L7e
        L50:
            aw4 r2 = r7.e     // Catch: java.lang.Throwable -> L91
            if (r2 == 0) goto L58
            r8.q(r5)
            return r2
        L58:
            gk2 r2 = r0.Q     // Catch: java.lang.Throwable -> L91
            pk2 r2 = r2.s0(r4)     // Catch: java.lang.Throwable -> L91
            java.util.List r2 = r2.c()     // Catch: java.lang.Throwable -> L91
            gk2 r0 = r0.Q     // Catch: java.lang.Throwable -> L91
            r4 = 0
            pk2 r0 = r0.s0(r4)     // Catch: java.lang.Throwable -> L91
            java.util.List r0 = r0.c()     // Catch: java.lang.Throwable -> L91
            r1.a = r8     // Catch: java.lang.Throwable -> L91
            r1.b = r7     // Catch: java.lang.Throwable -> L91
            r1.e = r3     // Catch: java.lang.Throwable -> L91
            g63 r3 = new g63     // Catch: java.lang.Throwable -> L91
            r3.<init>(r7, r2, r0, r5)     // Catch: java.lang.Throwable -> L91
            java.lang.Object r0 = defpackage.k27.p(r3, r1)     // Catch: java.lang.Throwable -> L91
            if (r0 != r6) goto L7f
        L7e:
            return r6
        L7f:
            r1 = r8
            r8 = r0
            r0 = r7
        L82:
            aw4 r8 = (defpackage.aw4) r8     // Catch: java.lang.Throwable -> L31
            r0.e = r8     // Catch: java.lang.Throwable -> L31
            aw4 r7 = r7.e     // Catch: java.lang.Throwable -> L31
            r7.getClass()     // Catch: java.lang.Throwable -> L31
            r1.q(r5)
            return r7
        L8f:
            r1 = r8
            goto L93
        L91:
            r7 = move-exception
            goto L8f
        L93:
            r1.q(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q63.c(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, defpackage.n42 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.c63
            if (r0 == 0) goto L13
            r0 = r9
            c63 r0 = (defpackage.c63) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            c63 r0 = new c63
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            a63 r7 = r0.b
            defpackage.hre.r(r9)
            goto L70
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L33:
            java.util.List r7 = r0.a
            defpackage.hre.r(r9)
            goto L5f
        L39:
            defpackage.hre.r(r9)
            ii2 r7 = r7.b
            gk2 r7 = r7.Q
            zl2 r9 = r7.n0(r3, r8)
            java.util.List r9 = r9.c()
            r1 = 0
            zl2 r7 = r7.n0(r1, r8)
            java.util.List r7 = r7.c()
            r0.a = r9
            r0.e = r3
            xnc r7 = k(r7)
            if (r7 != r5) goto L5c
            goto L6e
        L5c:
            r6 = r9
            r9 = r7
            r7 = r6
        L5f:
            r8 = r9
            a63 r8 = (defpackage.a63) r8
            r0.a = r4
            r0.b = r8
            r0.e = r2
            xnc r9 = k(r7)
            if (r9 != r5) goto L6f
        L6e:
            return r5
        L6f:
            r7 = r8
        L70:
            a63 r9 = (defpackage.a63) r9
            i69 r8 = new i69
            r8.<init>(r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q63.d(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[LOOP:0: B:18:0x0053->B:20:0x0059, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(defpackage.hn8 r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.h63
            if (r0 == 0) goto L13
            r0 = r6
            h63 r0 = (defpackage.h63) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            h63 r0 = new h63
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.a
            int r6 = r0.c
            r1 = 1
            if (r6 == 0) goto L2c
            if (r6 != r1) goto L25
            defpackage.hre.r(r4)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r4)
            r0.c = r1
            java.lang.Object r4 = j(r5)
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L3a
            return r5
        L3a:
            java.util.Map r4 = (java.util.Map) r4
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            int r6 = r4.size()
            int r6 = defpackage.p17.k(r6)
            r5.<init>(r6)
            java.util.Set r4 = r4.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L53:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L77
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r0 = r6.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            char r0 = r0.charAt(r1)
            java.lang.Character r1 = new java.lang.Character
            r1.<init>(r0)
            java.lang.Object r6 = r6.getValue()
            r5.put(r1, r6)
            goto L53
        L77:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q63.g(hn8, n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.hn8 r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.i63
            if (r0 == 0) goto L13
            r0 = r6
            i63 r0 = (defpackage.i63) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            i63 r0 = new i63
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.a
            int r6 = r0.c
            r1 = 1
            if (r6 == 0) goto L2c
            if (r6 != r1) goto L25
            defpackage.hre.r(r4)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r4)
            r0.c = r1
            java.lang.Object r4 = j(r5)
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L3a
            return r5
        L3a:
            java.util.Map r4 = (java.util.Map) r4
            nz6 r5 = new nz6
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q63.h(hn8, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|(1:(1:(3:10|11|12)(2:14|15))(1:16))(3:84|(1:86)|69)|17|18|19|(2:20|(1:64)(3:22|(5:27|28|(3:30|(2:32|33)(1:(2:36|(2:45|46)(2:43|44))(2:47|48))|34)|49|(3:54|55|56))|57))|65|66|(2:(3:70|11|12)|69)(1:71)))|87|6|(0)(0)|17|18|19|(3:20|(0)(0)|57)|65|66|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fb, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011c, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0120, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0121, code lost:
        defpackage.pye.e(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0124, code lost:
        r0 = null;
        r6 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be A[Catch: all -> 0x00fb, TRY_ENTER, TryCatch #2 {all -> 0x00fb, blocks: (B:21:0x00a0, B:22:0x00af, B:29:0x00be, B:32:0x00c5, B:34:0x00cd, B:36:0x00db, B:52:0x0105, B:47:0x00f7, B:50:0x00fe, B:51:0x0102, B:54:0x010a, B:56:0x0110), top: B:74:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b5 A[EDGE_INSN: B:72:0x00b5->B:24:0x00b5 ?: BREAK  , EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.f76 r18, defpackage.n42 r19) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q63.i(f76, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|(1:(1:9)(2:74|75))(2:76|(1:78)(1:79))|10|11|12|(2:13|(1:56)(3:15|(5:20|21|(3:23|(2:25|26)(1:(2:29|(2:37|38)(2:35|36))(2:39|40))|27)|41|(3:46|47|48))|49))|57|58|(2:60|61)(1:63)))|80|6|(0)(0)|10|11|12|(3:13|(0)(0)|49)|57|58|(0)(0)|(1:(1:71))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0104, code lost:
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0105, code lost:
        defpackage.pye.e(r12, r13);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3 A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #2 {all -> 0x00dd, blocks: (B:19:0x0084, B:20:0x0093, B:26:0x00a3, B:29:0x00aa, B:31:0x00b2, B:33:0x00c0, B:48:0x00e9, B:43:0x00d8, B:46:0x00df, B:47:0x00e5, B:50:0x00ee, B:52:0x00f4), top: B:66:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0099 A[EDGE_INSN: B:64:0x0099->B:22:0x0099 ?: BREAK  , EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable n(defpackage.f76 r13, defpackage.n42 r14) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q63.n(f76, n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.l63
            if (r0 == 0) goto L13
            r0 = r6
            l63 r0 = (defpackage.l63) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            l63 r0 = new l63
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            aw4 r5 = r0.a
            defpackage.hre.r(r6)
            goto L53
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L2e:
            defpackage.hre.r(r6)
            aw4 r6 = r5.e
            if (r6 == 0) goto L57
            rc9 r1 = r5.a
            eb9 r1 = r1.a()
            if (r1 == 0) goto L3f
            java.lang.String r2 = r1.a
        L3f:
            hn8 r1 = b(r2)
            r0.a = r6
            r0.d = r3
            java.lang.Object r5 = r5.h(r1, r0)
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L50
            return r0
        L50:
            r4 = r6
            r6 = r5
            r5 = r4
        L53:
            nz6 r6 = (defpackage.nz6) r6
            r5.i = r6
        L57:
            pvc r5 = defpackage.pvc.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q63.q(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.m63
            if (r0 == 0) goto L13
            r0 = r6
            m63 r0 = (defpackage.m63) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            m63 r0 = new m63
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            aw4 r5 = r0.a
            defpackage.hre.r(r6)
            goto L53
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L2e:
            defpackage.hre.r(r6)
            aw4 r6 = r5.e
            if (r6 == 0) goto L57
            rc9 r5 = r5.a
            eb9 r5 = r5.d()
            if (r5 == 0) goto L3f
            java.lang.String r2 = r5.a
        L3f:
            hn8 r5 = b(r2)
            r0.a = r6
            r0.d = r3
            qe3 r5 = l(r5)
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L50
            return r0
        L50:
            r4 = r6
            r6 = r5
            r5 = r4
        L53:
            a63 r6 = (defpackage.a63) r6
            r5.b = r6
        L57:
            pvc r5 = defpackage.pvc.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q63.r(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.n63
            if (r0 == 0) goto L13
            r0 = r6
            n63 r0 = (defpackage.n63) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            n63 r0 = new n63
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            aw4 r5 = r0.a
            defpackage.hre.r(r6)
            goto L53
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L2e:
            defpackage.hre.r(r6)
            aw4 r6 = r5.e
            if (r6 == 0) goto L57
            rc9 r1 = r5.a
            eb9 r1 = r1.g()
            if (r1 == 0) goto L3f
            java.lang.String r2 = r1.a
        L3f:
            hn8 r1 = b(r2)
            r0.a = r6
            r0.d = r3
            java.io.Serializable r5 = r5.g(r1, r0)
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L50
            return r0
        L50:
            r4 = r6
            r6 = r5
            r5 = r4
        L53:
            java.util.Map r6 = (java.util.Map) r6
            r5.d = r6
        L57:
            pvc r5 = defpackage.pvc.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q63.s(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.o63
            if (r0 == 0) goto L13
            r0 = r6
            o63 r0 = (defpackage.o63) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            o63 r0 = new o63
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            aw4 r5 = r0.a
            defpackage.hre.r(r6)
            goto L53
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L2e:
            defpackage.hre.r(r6)
            aw4 r6 = r5.e
            if (r6 == 0) goto L57
            rc9 r5 = r5.a
            eb9 r5 = r5.h()
            if (r5 == 0) goto L3f
            java.lang.String r2 = r5.a
        L3f:
            hn8 r5 = b(r2)
            r0.a = r6
            r0.d = r3
            qe3 r5 = l(r5)
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L50
            return r0
        L50:
            r4 = r6
            r6 = r5
            r5 = r4
        L53:
            a63 r6 = (defpackage.a63) r6
            r5.c = r6
        L57:
            pvc r5 = defpackage.pvc.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q63.t(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.p63
            if (r0 == 0) goto L13
            r0 = r6
            p63 r0 = (defpackage.p63) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p63 r0 = new p63
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            aw4 r5 = r0.a
            defpackage.hre.r(r6)
            goto L53
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L2e:
            defpackage.hre.r(r6)
            aw4 r6 = r5.e
            if (r6 == 0) goto L57
            rc9 r5 = r5.a
            eb9 r5 = r5.j()
            if (r5 == 0) goto L3f
            java.lang.String r2 = r5.a
        L3f:
            hn8 r5 = b(r2)
            r0.a = r6
            r0.d = r3
            qe3 r5 = l(r5)
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L50
            return r0
        L50:
            r4 = r6
            r6 = r5
            r5 = r4
        L53:
            a63 r6 = (defpackage.a63) r6
            r5.a = r6
        L57:
            pvc r5 = defpackage.pvc.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q63.u(n42):java.lang.Object");
    }
}
