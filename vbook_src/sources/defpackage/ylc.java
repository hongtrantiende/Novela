package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ylc  reason: default package */
/* loaded from: classes3.dex */
public final class ylc extends fdd {
    public final klc C;
    public final cza D;
    public final sw7 E;
    public zmc F;
    public String G;
    public String H;
    public String I;
    public int J;
    public boolean K;
    public List L;
    public List M;
    public List N;
    public final String c;
    public final String d;
    public final wl6 e;
    public final n64 f;

    public ylc(String str, String str2, wl6 wl6Var, n64 n64Var, klc klcVar) {
        this.c = str;
        this.d = str2;
        this.e = wl6Var;
        this.f = n64Var;
        this.C = klcVar;
        ks3 ks3Var = ks3.a;
        this.D = dza.a(new qlc(true, "", "", "", false, "", "", 0, ks3Var, ks3Var, ks3Var));
        this.E = new sw7();
        this.G = "";
        this.H = "";
        this.I = "";
        this.L = ks3Var;
        this.M = ks3Var;
        this.N = ks3Var;
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new xr0(this, (m42) null, 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:17:0x0046, B:19:0x004a), top: B:27:0x0046 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.ylc r4, java.lang.String r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.tlc
            if (r0 == 0) goto L13
            r0 = r6
            tlc r0 = (defpackage.tlc) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            tlc r0 = new tlc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            sw7 r5 = r0.b
            java.lang.String r0 = r0.a
            defpackage.hre.r(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L32:
            defpackage.hre.r(r6)
            sw7 r6 = r4.E
            r0.a = r5
            r0.b = r6
            r0.e = r2
            java.lang.Object r0 = r6.o(r0)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L46
            return r1
        L46:
            zmc r0 = r4.F     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L64
            klc r0 = r4.C     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = r4.c     // Catch: java.lang.Throwable -> L62
            plc r0 = (defpackage.plc) r0     // Catch: java.lang.Throwable -> L62
            r0.getClass()     // Catch: java.lang.Throwable -> L62
            r5.getClass()     // Catch: java.lang.Throwable -> L62
            r1.getClass()     // Catch: java.lang.Throwable -> L62
            bnc r0 = r0.c     // Catch: java.lang.Throwable -> L62
            zmc r0 = r0.d(r5, r1)     // Catch: java.lang.Throwable -> L62
            r4.F = r0     // Catch: java.lang.Throwable -> L62
            goto L64
        L62:
            r4 = move-exception
            goto L68
        L64:
            r6.q(r3)
            return r0
        L68:
            r6.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ylc.j(ylc, java.lang.String, n42):java.lang.Object");
    }

    @Override // defpackage.gdd
    public final void d() {
        if (this.F != null) {
            String str = this.G;
            plc plcVar = (plc) this.C;
            plcVar.getClass();
            str.getClass();
            String str2 = this.c;
            str2.getClass();
            plcVar.c.a(str, str2);
        }
    }
}
