package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.mozilla.javascript.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i55  reason: default package */
/* loaded from: classes3.dex */
public final class i55 {
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final long n;
    public static final /* synthetic */ int o = 0;
    public pgd a;
    public bt1 f;
    public s45 g;
    public final sw7 b = new sw7();
    public ArrayList c = new ArrayList();
    public List d = ks3.a;
    public final LinkedHashMap e = new LinkedHashMap();
    public final Object h = new Object();
    public final h55 i = new h55(this);

    static {
        hq7 hq7Var = wl3.b;
        am3 am3Var = am3.SECONDS;
        j = jue.O(30, am3Var);
        k = jue.O(15, am3Var);
        l = jue.O(10, am3Var);
        m = jue.O(10, am3Var);
        n = jue.O(Context.VERSION_ES6, am3.MILLISECONDS);
    }

    public static Object l(long j2, long j3, xt4 xt4Var, n42 n42Var) {
        if (wl3.c(j2, 0L) <= 0) {
            j2 = j3;
        }
        long e = wl3.e(j2);
        if (e > 0) {
            return k27.G(jue.P(e, am3.MILLISECONDS), new w00(3, null, xt4Var), n42Var);
        }
        return xt4Var.invoke(n42Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, defpackage.n42 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.t45
            if (r0 == 0) goto L14
            r0 = r10
            t45 r0 = (defpackage.t45) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            t45 r0 = new t45
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.a
            int r0 = r6.c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L28
            defpackage.hre.r(r10)
            goto L45
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r1
        L2e:
            defpackage.hre.r(r10)
            u45 r5 = new u45
            r10 = 0
            r5.<init>(r7, r1, r10)
            r6.c = r2
            long r3 = defpackage.i55.j
            r1 = r8
            java.lang.Object r7 = l(r1, r3, r5, r6)
            n82 r8 = defpackage.n82.a
            if (r7 != r8) goto L45
            return r8
        L45:
            pvc r7 = defpackage.pvc.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i55.a(long, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r11 == r7) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r9, defpackage.n42 r11, java.lang.String r12) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.v45
            if (r0 == 0) goto L14
            r0 = r11
            v45 r0 = (defpackage.v45) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            v45 r0 = new v45
            r0.<init>(r8, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.c
            int r0 = r6.e
            r1 = 2
            r2 = 1
            r3 = 0
            n82 r7 = defpackage.n82.a
            if (r0 == 0) goto L3b
            if (r0 == r2) goto L33
            if (r0 != r1) goto L2d
            defpackage.hre.r(r11)
            return r11
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r3
        L33:
            long r9 = r6.b
            java.lang.String r12 = r6.a
            defpackage.hre.r(r11)
            goto L4b
        L3b:
            defpackage.hre.r(r11)
            r6.a = r12
            r6.b = r9
            r6.e = r2
            java.lang.Object r11 = r8.d(r6)
            if (r11 != r7) goto L4b
            goto L63
        L4b:
            pgd r11 = (defpackage.pgd) r11
            ge r5 = new ge
            r8 = 10
            r5.<init>(r11, r12, r3, r8)
            r6.a = r3
            r6.b = r9
            r6.e = r1
            long r3 = defpackage.i55.l
            r1 = r9
            java.lang.Object r8 = l(r1, r3, r5, r6)
            if (r8 != r7) goto L64
        L63:
            return r7
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i55.b(long, n42, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.n42 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.w45
            if (r0 == 0) goto L13
            r0 = r7
            w45 r0 = (defpackage.w45) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            w45 r0 = new w45
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            n82 r1 = defpackage.n82.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L28
            defpackage.hre.r(r7)
            goto L74
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L2e:
            defpackage.hre.r(r7)
            java.lang.Object r7 = r6.h
            monitor-enter(r7)
            bt1 r2 = r6.f     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L40
            pvc r5 = defpackage.pvc.a     // Catch: java.lang.Throwable -> L3e
            r2.P(r5)     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r6 = move-exception
            goto L79
        L40:
            s45 r2 = r6.g     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L4b
            bt1 r2 = r2.b     // Catch: java.lang.Throwable -> L3e
            pvc r5 = defpackage.pvc.a     // Catch: java.lang.Throwable -> L3e
            r2.P(r5)     // Catch: java.lang.Throwable -> L3e
        L4b:
            r6.f = r4     // Catch: java.lang.Throwable -> L3e
            r6.g = r4     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3e
            r2.<init>()     // Catch: java.lang.Throwable -> L3e
            r6.c = r2     // Catch: java.lang.Throwable -> L3e
            ks3 r2 = defpackage.ks3.a     // Catch: java.lang.Throwable -> L3e
            r6.d = r2     // Catch: java.lang.Throwable -> L3e
            java.util.LinkedHashMap r2 = r6.e     // Catch: java.lang.Throwable -> L3e
            r2.clear()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r7)
            sw2 r7 = defpackage.ab3.a
            n35 r7 = defpackage.zz6.a
            rg0 r2 = new rg0
            r5 = 11
            r2.<init>(r6, r4, r5)
            r0.c = r3
            java.lang.Object r7 = defpackage.z87.E(r7, r2, r0)
            if (r7 != r1) goto L74
            return r1
        L74:
            r6.a = r4
            pvc r6 = defpackage.pvc.a
            return r6
        L79:
            monitor-exit(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i55.c(n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r8.o(r0) == r5) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:23:0x004e, B:25:0x0052), top: B:38:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Type inference failed for: r0v11, types: [qw7] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v7, types: [qw7] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [qw7] */
    /* JADX WARN: Type inference failed for: r1v9, types: [qw7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.n42 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.x45
            if (r0 == 0) goto L13
            r0 = r8
            x45 r0 = (defpackage.x45) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            x45 r0 = new x45
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            i55 r1 = r0.b
            qw7 r0 = r0.a
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L2f
            goto L6f
        L2f:
            r7 = move-exception
            goto L81
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L37:
            qw7 r1 = r0.a
            defpackage.hre.r(r8)
            r8 = r1
            goto L4e
        L3e:
            defpackage.hre.r(r8)
            sw7 r8 = r7.b
            r0.a = r8
            r0.e = r3
            java.lang.Object r1 = r8.o(r0)
            if (r1 != r5) goto L4e
            goto L6a
        L4e:
            pgd r1 = r7.a     // Catch: java.lang.Throwable -> L74
            if (r1 != 0) goto L77
            sw2 r1 = defpackage.ab3.a     // Catch: java.lang.Throwable -> L74
            n35 r1 = defpackage.zz6.a     // Catch: java.lang.Throwable -> L74
            n35 r1 = r1.f     // Catch: java.lang.Throwable -> L74
            z45 r3 = new z45     // Catch: java.lang.Throwable -> L74
            r6 = 0
            r3.<init>(r7, r4, r6)     // Catch: java.lang.Throwable -> L74
            r0.a = r8     // Catch: java.lang.Throwable -> L74
            r0.b = r7     // Catch: java.lang.Throwable -> L74
            r0.e = r2     // Catch: java.lang.Throwable -> L74
            java.lang.Object r0 = defpackage.z87.E(r1, r3, r0)     // Catch: java.lang.Throwable -> L74
            if (r0 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r1 = r0
            r0 = r8
            r8 = r1
            r1 = r7
        L6f:
            pgd r8 = (defpackage.pgd) r8     // Catch: java.lang.Throwable -> L2f
            r1.a = r8     // Catch: java.lang.Throwable -> L2f
            goto L78
        L74:
            r7 = move-exception
            r0 = r8
            goto L81
        L77:
            r0 = r8
        L78:
            pgd r7 = r7.a     // Catch: java.lang.Throwable -> L2f
            r7.getClass()     // Catch: java.lang.Throwable -> L2f
            r0.q(r4)
            return r7
        L81:
            r0.q(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i55.d(n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|(1:(1:9)(2:28|29))(2:30|(1:32))|10|(1:14)|(1:16)|17|18|19|(1:24)(2:21|22)))|33|6|(0)(0)|10|(2:12|14)|(0)|17|18|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
        r5 = new defpackage.gs9(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(defpackage.pgd r6, defpackage.n42 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.a55
            if (r0 == 0) goto L13
            r0 = r7
            a55 r0 = (defpackage.a55) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            a55 r0 = new a55
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.hre.r(r7)
            goto L45
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r3
        L2c:
            defpackage.hre.r(r7)
            sw2 r7 = defpackage.ab3.a
            n35 r7 = defpackage.zz6.a
            d53 r1 = new d53
            r4 = 29
            r1.<init>(r5, r6, r3, r4)
            r0.c = r2
            java.lang.Object r7 = defpackage.z87.E(r7, r1, r0)
            n82 r5 = defpackage.n82.a
            if (r7 != r5) goto L45
            return r5
        L45:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L52
            java.lang.String r5 = "null"
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L52
            r3 = r7
        L52:
            if (r3 != 0) goto L56
            java.lang.String r3 = ""
        L56:
            s46 r5 = defpackage.v46.a     // Catch: java.lang.Throwable -> L64
            r5.getClass()     // Catch: java.lang.Throwable -> L64
            c4b r6 = defpackage.c4b.a     // Catch: java.lang.Throwable -> L64
            java.lang.Object r5 = r5.a(r6, r3)     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L64
            goto L6b
        L64:
            r5 = move-exception
            gs9 r6 = new gs9
            r6.<init>(r5)
            r5 = r6
        L6b:
            boolean r6 = r5 instanceof defpackage.gs9
            if (r6 == 0) goto L71
            goto L72
        L71:
            r3 = r5
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i55.e(pgd, n42):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r12 == r6) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (defpackage.ade.r(r10, r0) == r6) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(long r10, defpackage.n42 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.b55
            if (r0 == 0) goto L13
            r0 = r12
            b55 r0 = (defpackage.b55) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            b55 r0 = new b55
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L42
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.hre.r(r12)
            return r12
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r2
        L34:
            long r10 = r0.a
            pgd r1 = r0.b
            defpackage.hre.r(r12)
            goto L68
        L3c:
            long r10 = r0.a
            defpackage.hre.r(r12)
            goto L50
        L42:
            defpackage.hre.r(r12)
            r0.a = r10
            r0.e = r5
            java.lang.Object r12 = r9.d(r0)
            if (r12 != r6) goto L50
            goto L74
        L50:
            r1 = r12
            pgd r1 = (defpackage.pgd) r1
            r7 = 0
            int r12 = defpackage.wl3.c(r10, r7)
            if (r12 <= 0) goto L68
            r0.b = r1
            r0.a = r10
            r0.e = r4
            java.lang.Object r12 = defpackage.ade.r(r10, r0)
            if (r12 != r6) goto L68
            goto L74
        L68:
            r0.b = r2
            r0.a = r10
            r0.e = r3
            java.io.Serializable r9 = r9.e(r1, r0)
            if (r9 != r6) goto L75
        L74:
            return r6
        L75:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i55.f(long, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r11 == r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (defpackage.z87.E(r1, r5, r0) != r7) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r9, defpackage.n42 r11, java.lang.String r12) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.c55
            if (r0 == 0) goto L13
            r0 = r11
            c55 r0 = (defpackage.c55) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            c55 r0 = new c55
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            int r1 = r0.e
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            n82 r7 = defpackage.n82.a
            if (r1 == 0) goto L4b
            if (r1 == r5) goto L43
            if (r1 == r4) goto L3d
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            defpackage.hre.r(r11)
            return r11
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r6
        L37:
            long r8 = r0.b
            defpackage.hre.r(r11)
            goto L84
        L3d:
            long r9 = r0.b
            defpackage.hre.r(r11)
            goto L76
        L43:
            long r9 = r0.b
            java.lang.String r12 = r0.a
            defpackage.hre.r(r11)
            goto L5e
        L4b:
            defpackage.hre.r(r11)
            r8.j()
            r0.a = r12
            r0.b = r9
            r0.e = r5
            java.lang.Object r11 = r8.d(r0)
            if (r11 != r7) goto L5e
            goto L92
        L5e:
            pgd r11 = (defpackage.pgd) r11
            sw2 r1 = defpackage.ab3.a
            n35 r1 = defpackage.zz6.a
            nd0 r5 = new nd0
            r5.<init>(r11, r12, r6, r4)
            r0.a = r6
            r0.b = r9
            r0.e = r4
            java.lang.Object r11 = defpackage.z87.E(r1, r5, r0)
            if (r11 != r7) goto L76
            goto L92
        L76:
            r0.a = r6
            r0.b = r9
            r0.e = r3
            java.lang.Object r8 = r8.a(r9, r0)
            if (r8 != r7) goto L83
            goto L92
        L83:
            r8 = r9
        L84:
            r0.a = r6
            r0.b = r8
            r0.e = r2
            long r8 = defpackage.i55.n
            java.lang.Object r8 = defpackage.ade.r(r8, r0)
            if (r8 != r7) goto L93
        L92:
            return r7
        L93:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i55.g(long, n42, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r8 == r5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (defpackage.z87.E(r6, r1, r0) != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r7, defpackage.n42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.d55
            if (r0 == 0) goto L13
            r0 = r8
            d55 r0 = (defpackage.d55) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            d55 r0 = new d55
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r8)
            goto L5f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L31:
            java.lang.String r7 = r0.a
            defpackage.hre.r(r8)
            goto L48
        L37:
            defpackage.hre.r(r8)
            r6.j()
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.d(r0)
            if (r8 != r5) goto L48
            goto L5e
        L48:
            pgd r8 = (defpackage.pgd) r8
            sw2 r6 = defpackage.ab3.a
            n35 r6 = defpackage.zz6.a
            nd0 r1 = new nd0
            r3 = 3
            r1.<init>(r8, r7, r4, r3)
            r0.a = r4
            r0.d = r2
            java.lang.Object r6 = defpackage.z87.E(r6, r1, r0)
            if (r6 != r5) goto L5f
        L5e:
            return r5
        L5f:
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i55.h(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (defpackage.z87.E(r0, r7, r1) != r13) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (a(0, r1) == r13) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r15, java.lang.String r16, defpackage.n42 r17) {
        /*
            r14 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.e55
            if (r1 == 0) goto L15
            r1 = r0
            e55 r1 = (defpackage.e55) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            e55 r1 = new e55
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.c
            int r2 = r1.e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r11 = 0
            n82 r13 = defpackage.n82.a
            if (r2 == 0) goto L4c
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L33
            defpackage.hre.r(r0)
            return r0
        L33:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r14)
            r14 = 0
            return r14
        L3a:
            defpackage.hre.r(r0)
            goto L8f
        L3e:
            defpackage.hre.r(r0)
            goto L7e
        L42:
            java.lang.String r2 = r1.b
            java.lang.String r6 = r1.a
            defpackage.hre.r(r0)
            r9 = r6
        L4a:
            r10 = r2
            goto L64
        L4c:
            defpackage.hre.r(r0)
            r14.j()
            r1.a = r15
            r2 = r16
            r1.b = r2
            r1.e = r6
            java.lang.Object r6 = r14.d(r1)
            if (r6 != r13) goto L61
            goto L9d
        L61:
            r9 = r15
            r0 = r6
            goto L4a
        L64:
            r8 = r0
            pgd r8 = (defpackage.pgd) r8
            sw2 r0 = defpackage.ab3.a
            n35 r0 = defpackage.zz6.a
            qq4 r7 = new qq4
            r12 = 4
            r7.<init>(r8, r9, r10, r11, r12)
            r1.a = r11
            r1.b = r11
            r1.e = r5
            java.lang.Object r0 = defpackage.z87.E(r0, r7, r1)
            if (r0 != r13) goto L7e
            goto L9d
        L7e:
            hq7 r0 = defpackage.wl3.b
            r1.a = r11
            r1.b = r11
            r1.e = r4
            r4 = 0
            java.lang.Object r14 = r14.a(r4, r1)
            if (r14 != r13) goto L8f
            goto L9d
        L8f:
            r1.a = r11
            r1.b = r11
            r1.e = r3
            long r2 = defpackage.i55.n
            java.lang.Object r14 = defpackage.ade.r(r2, r1)
            if (r14 != r13) goto L9e
        L9d:
            return r13
        L9e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i55.i(java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    public final void j() {
        synchronized (this.h) {
            this.c = new ArrayList();
            this.e.clear();
            this.f = jxe.c();
            this.g = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r8 == r5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (defpackage.z87.E(r6, r1, r0) != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r7, defpackage.n42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.f55
            if (r0 == 0) goto L13
            r0 = r8
            f55 r0 = (defpackage.f55) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            f55 r0 = new f55
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r8)
            goto L5d
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L31:
            java.lang.String r7 = r0.a
            defpackage.hre.r(r8)
            goto L45
        L37:
            defpackage.hre.r(r8)
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.d(r0)
            if (r8 != r5) goto L45
            goto L5c
        L45:
            pgd r8 = (defpackage.pgd) r8
            sw2 r6 = defpackage.ab3.a
            n35 r6 = defpackage.zz6.a
            db r1 = new db
            r3 = 20
            r1.<init>(r8, r7, r4, r3)
            r0.a = r4
            r0.d = r2
            java.lang.Object r6 = defpackage.z87.E(r6, r1, r0)
            if (r6 != r5) goto L5d
        L5c:
            return r5
        L5d:
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i55.k(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(long r15, defpackage.n42 r17, java.util.List r18) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i55.m(long, n42, java.util.List):java.lang.Object");
    }
}
