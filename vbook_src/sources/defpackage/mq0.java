package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mq0  reason: default package */
/* loaded from: classes3.dex */
public final class mq0 extends fdd {
    public final n64 C;
    public final a4a D;
    public final fc7 E;
    public boolean J;
    public final String c;
    public final wl6 d;
    public final n83 e;
    public final g33 f;
    public final cza F = dza.a(new fq0("", ks3.a, false, true));
    public final cza G = dza.a(new gq0(false, false, null, null, ""));
    public final s02 H = new s02();
    public String I = "";
    public boolean K = true;
    public final LinkedHashMap L = new LinkedHashMap();
    public final LinkedHashMap M = new LinkedHashMap();

    public mq0(String str, wl6 wl6Var, n83 n83Var, g33 g33Var, n64 n64Var, a4a a4aVar, fc7 fc7Var) {
        this.c = str;
        this.d = wl6Var;
        this.e = n83Var;
        this.f = g33Var;
        this.C = n64Var;
        this.D = a4aVar;
        this.E = fc7Var;
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new hq0(this, null, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.mq0 r11, java.lang.String r12, java.lang.String r13, defpackage.n42 r14) {
        /*
            java.util.LinkedHashMap r1 = r11.L
            boolean r0 = r14 instanceof defpackage.kq0
            if (r0 == 0) goto L15
            r0 = r14
            kq0 r0 = (defpackage.kq0) r0
            int r2 = r0.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.e = r2
            goto L1a
        L15:
            kq0 r0 = new kq0
            r0.<init>(r11, r14)
        L1a:
            java.lang.Object r14 = r0.c
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L32
            h34 r12 = r0.b
            java.lang.String r13 = r0.a
            defpackage.hre.r(r14)     // Catch: java.lang.Throwable -> L2d
            r4 = r12
            r12 = r13
            goto L6c
        L2d:
            r0 = move-exception
            r14 = r0
            r4 = r12
            r12 = r13
            goto L76
        L32:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r11)
            r11 = 0
            return r11
        L39:
            defpackage.hre.r(r14)
            java.lang.Object r14 = r1.get(r12)
            r4 = r14
            h34 r4 = (defpackage.h34) r4
            if (r4 != 0) goto L46
            goto Lad
        L46:
            r9 = 0
            r10 = 88
            r5 = 1
            r6 = 1
            r7 = 0
            r8 = 0
            h34 r14 = defpackage.h34.a(r4, r5, r6, r7, r8, r9, r10)
            r1.put(r12, r14)
            r11.l()
            n83 r14 = r11.e     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = ""
            r0.a = r12     // Catch: java.lang.Throwable -> L70
            r0.b = r4     // Catch: java.lang.Throwable -> L70
            r0.e = r3     // Catch: java.lang.Throwable -> L70
            t83 r14 = (defpackage.t83) r14     // Catch: java.lang.Throwable -> L73
            java.lang.Object r14 = r14.a(r12, r13, r2, r0)     // Catch: java.lang.Throwable -> L73
            n82 r13 = defpackage.n82.a
            if (r14 != r13) goto L6c
            return r13
        L6c:
            nq0 r14 = (defpackage.nq0) r14     // Catch: java.lang.Throwable -> L70
        L6e:
            r2 = r4
            goto L7d
        L70:
            r0 = move-exception
            r14 = r0
            goto L76
        L73:
            r0 = move-exception
            r13 = r0
            r14 = r13
        L76:
            gs9 r13 = new gs9
            r13.<init>(r14)
            r14 = r13
            goto L6e
        L7d:
            boolean r13 = r14 instanceof defpackage.gs9
            if (r13 != 0) goto L96
            r13 = r14
            nq0 r13 = (defpackage.nq0) r13
            java.util.ArrayList r7 = r13.a
            r6 = 0
            r8 = 24
            r3 = 0
            r4 = 0
            r5 = 0
            h34 r13 = defpackage.h34.a(r2, r3, r4, r5, r6, r7, r8)
            r1.put(r12, r13)
            r11.l()
        L96:
            java.lang.Throwable r13 = defpackage.hs9.a(r14)
            if (r13 == 0) goto Lad
            r7 = 0
            r8 = 120(0x78, float:1.68E-43)
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 0
            h34 r13 = defpackage.h34.a(r2, r3, r4, r5, r6, r7, r8)
            r1.put(r12, r13)
            r11.l()
        Lad:
            pvc r11 = defpackage.pvc.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mq0.j(mq0, java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    public final void k(String str) {
        str.getClass();
        if (str.equals(this.I)) {
            return;
        }
        this.I = str;
        cza czaVar = this.F;
        if (czaVar != null) {
            while (true) {
                Object value = czaVar.getValue();
                String str2 = str;
                if (czaVar.l(value, fq0.a((fq0) value, str2, false, false, null, 29))) {
                    break;
                }
                str = str2;
            }
        }
        LinkedHashMap linkedHashMap = this.M;
        for (w26 w26Var : linkedHashMap.values()) {
            w26Var.cancel(null);
        }
        linkedHashMap.clear();
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new hq0(this, null, 1));
    }

    public final void l() {
        Object value;
        fq0 fq0Var;
        ArrayList arrayList;
        cza czaVar = this.F;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
                fq0Var = (fq0) value;
                Collection values = this.L.values();
                values.getClass();
                arrayList = new ArrayList();
                for (Object obj : values) {
                    h34 h34Var = (h34) obj;
                    boolean z = this.K;
                    boolean z2 = this.J;
                    boolean z3 = true;
                    if (z) {
                        z3 = z2 ? false : false;
                    } else if (!z2) {
                        z3 = h34Var.e.q;
                    }
                    if (z3) {
                        arrayList.add(obj);
                    }
                }
            } while (!czaVar.l(value, fq0.a(fq0Var, null, false, false, arrayList, 15)));
        }
    }
}
