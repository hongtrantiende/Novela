package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ng1  reason: default package */
/* loaded from: classes3.dex */
public final class ng1 extends fdd {
    public final cza C;
    public final s02 D;
    public int E;
    public boolean F;
    public boolean G;
    public wzc H;
    public final cza I;
    public final cza J;
    public String K;
    public int L;
    public boolean M;
    public boolean N;
    public final LinkedHashMap O;
    public final HashMap P;
    public final LinkedHashMap Q;
    public long R;
    public w26 S;
    public final String c;
    public final m0d d;
    public final gf1 e;
    public final n64 f;

    public ng1(String str, m0d m0dVar, gf1 gf1Var, n64 n64Var) {
        this.c = str;
        this.d = m0dVar;
        this.e = gf1Var;
        this.f = n64Var;
        rs3 rs3Var = rs3.a;
        ks3 ks3Var = ks3.a;
        this.C = dza.a(new cg1(true, false, false, false, null, ks3Var, "", "", "", false, false, false, false, false, false, false, "", false, false, false, false, false, false, false, ks3Var, rs3Var, "", 0, null, ks3Var));
        this.D = new s02();
        this.E = 1;
        this.I = dza.a(null);
        this.J = dza.a(ks3Var);
        this.K = "";
        this.L = 1;
        this.M = true;
        this.O = new LinkedHashMap();
        this.P = new HashMap();
        this.Q = new LinkedHashMap();
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        ru2 ru2Var = ru2.c;
        f(a, ru2Var, new oi(this, (m42) null, 13));
        f(jdd.a(this), ru2Var, new ig1(0, this, null));
        l();
    }

    public static final Object j(ng1 ng1Var, n42 n42Var) {
        ng1Var.getClass();
        return z87.E(ab3.a, new rg0(ng1Var, null, 1), n42Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.ng1 r6, defpackage.j62 r7, defpackage.n42 r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof defpackage.kg1
            if (r0 == 0) goto L16
            r0 = r8
            kg1 r0 = (defpackage.kg1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.e = r1
            goto L1b
        L16:
            kg1 r0 = new kg1
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2f
            ng1 r7 = r0.b
            j62 r0 = r0.a
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = r0
            goto L55
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L35:
            defpackage.hre.r(r8)
            long r4 = r7.a
            gf1 r8 = r6.e     // Catch: java.lang.Throwable -> L55
            r0.a = r7     // Catch: java.lang.Throwable -> L55
            r0.b = r6     // Catch: java.lang.Throwable -> L55
            r0.e = r3     // Catch: java.lang.Throwable -> L55
            yf1 r8 = (defpackage.yf1) r8     // Catch: java.lang.Throwable -> L55
            java.lang.Object r8 = r8.g(r4, r0)     // Catch: java.lang.Throwable -> L55
            n82 r0 = defpackage.n82.a
            if (r8 != r0) goto L4d
            return r0
        L4d:
            r0 = r7
            r7 = r6
        L4f:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L2d
            r7.o(r8)     // Catch: java.lang.Throwable -> L2d
            goto L56
        L55:
            r0 = r7
        L56:
            hk1 r7 = defpackage.jdd.a(r6)
            sw2 r8 = defpackage.ab3.a
            ru2 r8 = defpackage.ru2.c
            n0 r1 = new n0
            r3 = 22
            r1.<init>(r6, r2, r3)
            r6.f(r7, r8, r1)
            r6.n(r0)
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ng1.k(ng1, j62, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            r40 = this;
            r0 = r40
            r1 = 1
            r0.E = r1
            java.util.HashMap r1 = r0.P
            r1.clear()
            cza r1 = r0.I
            java.lang.Object r1 = r1.getValue()
            r2 = r1
            j62 r2 = (defpackage.j62) r2
            if (r2 == 0) goto L72
            cza r6 = r0.C
            if (r6 == 0) goto L72
        L19:
            java.lang.Object r7 = r6.getValue()
            r8 = r7
            cg1 r8 = (defpackage.cg1) r8
            ks3 r38 = defpackage.ks3.a
            r39 = 130019312(0x7bfeff0, float:2.8879508E-34)
            r9 = 1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            java.lang.String r35 = ""
            r36 = 0
            r37 = 0
            cg1 r1 = defpackage.cg1.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            cza r3 = r0.J
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            wzc r4 = r0.H
            java.util.List r5 = r1.D
            cg1 r1 = r0.p(r1, r2, r3, r4, r5)
            boolean r1 = r6.l(r7, r1)
            if (r1 == 0) goto L19
        L72:
            int r1 = r0.E
            w26 r2 = r0.S
            r3 = 0
            if (r2 == 0) goto L7c
            r2.cancel(r3)
        L7c:
            hk1 r2 = defpackage.jdd.a(r0)
            sw2 r4 = defpackage.ab3.a
            ru2 r4 = defpackage.ru2.c
            jg1 r5 = new jg1
            r5.<init>(r1, r0, r3)
            w26 r1 = r0.f(r2, r4, r5)
            r0.S = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ng1.l():void");
    }

    public final void m(String str) {
        Object value;
        str.getClass();
        this.K = k4b.N0(str).toString();
        this.L = 1;
        this.M = true;
        this.O.clear();
        cza czaVar = this.C;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, cg1.a((cg1) value, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, false, true, false, ks3.a, null, null, 0, null, null, 2088763391)));
            if (this.N && this.M) {
                hk1 a = jdd.a(this);
                sw2 sw2Var = ab3.a;
                f(a, ru2.c, new ig1(1, this, null));
            }
        } else if (this.N) {
        }
    }

    public final void n(j62 j62Var) {
        Iterable<o62> iterable = (Iterable) this.J.getValue();
        ArrayList arrayList = new ArrayList(tl1.s(iterable, 10));
        for (o62 o62Var : iterable) {
            arrayList.add(o62Var.a.a);
        }
        Set H0 = sl1.H0(arrayList);
        Set entrySet = this.O.entrySet();
        entrySet.getClass();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getClass();
            Object key = entry.getKey();
            key.getClass();
            if (H0.contains((String) key)) {
                it.remove();
            }
        }
        this.I.m(j62Var);
    }

    public final void o(List list) {
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((o62) it.next()).a.a);
        }
        Set H0 = sl1.H0(arrayList);
        Set entrySet = this.O.entrySet();
        entrySet.getClass();
        Iterator it2 = entrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            entry.getClass();
            Object key = entry.getKey();
            key.getClass();
            if (H0.contains((String) key)) {
                it2.remove();
            }
        }
        cza czaVar = this.J;
        czaVar.getClass();
        czaVar.n(null, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r2 == null) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cg1 p(defpackage.cg1 r34, defpackage.j62 r35, java.util.List r36, defpackage.wzc r37, java.util.List r38) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ng1.p(cg1, j62, java.util.List, wzc, java.util.List):cg1");
    }
}
