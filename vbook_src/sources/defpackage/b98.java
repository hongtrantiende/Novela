package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import okhttp3.Protocol;
import okhttp3.Response;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b98  reason: default package */
/* loaded from: classes3.dex */
public final class b98 extends cf5 {
    public static final mfb F = new mfb(new rh7(28));
    public final d82 C;
    public final d82 D;
    public final Map E;
    public final x88 e;
    public final Set f = b00.F0(new df5[]{ki5.a, zfd.a, kw9.a});

    public b98(x88 x88Var) {
        this.e = x88Var;
        Map synchronizedMap = Collections.synchronizedMap(new xa6(new mp6(1, this, b98.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lokhttp3/OkHttpClient;", 0, 6), new bo7(25)));
        synchronizedMap.getClass();
        this.E = synchronizedMap;
        if (System.getProperty("kotlinx.io.pool.size.bytes") == null && c16.i(System.getProperty("java.vm.name"), "Dalvik") && Runtime.getRuntime().maxMemory() > 10000000) {
            System.setProperty("kotlinx.io.pool.size.bytes", "2097152");
        }
        d82 C = nq2.C(new y26(k27.r(super.q())), new t82(p40.d, 0));
        this.C = C;
        this.D = super.q().plus(C);
        z87.u(jz4.a, super.q(), p82.c, new o54(this, (m42) null, 25));
    }

    public static rh5 G(Response response, jv4 jv4Var, Object obj, d82 d82Var, oe4 oe4Var) {
        ii5 ii5Var = new ii5(response.d, response.c);
        Protocol protocol = response.b;
        protocol.getClass();
        int ordinal = protocol.ordinal();
        zg5 zg5Var = zg5.e;
        switch (ordinal) {
            case 0:
                zg5Var = zg5.g;
                break;
            case 1:
                zg5Var = zg5.f;
                break;
            case 2:
                zg5Var = zg5.h;
                break;
            case 3:
            case 4:
                break;
            case 5:
                zg5Var = zg5.i;
                break;
            case 6:
                zg5Var = zg5.d;
                break;
            default:
                xk5.o();
                return null;
        }
        zg5 zg5Var2 = zg5Var;
        h98 h98Var = new h98(response.f);
        if ((obj instanceof s11) && ((uy1) oe4Var.C).e(hh5.a) != null) {
            vm1.h();
            return null;
        }
        return new rh5(ii5Var, jv4Var, h98Var, zg5Var2, obj, d82Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r2 == r8) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f4  */
    /* JADX WARN: Type inference failed for: r6v4, types: [o45, c3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(defpackage.oe4 r25, defpackage.n42 r26) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b98.S(oe4, n42):java.lang.Object");
    }

    @Override // defpackage.cf5, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        b82 b82Var = this.C.get(r0f.I);
        b82Var.getClass();
        ((y26) b82Var).o0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g0(okhttp3.OkHttpClient r6, okhttp3.Request r7, defpackage.d82 r8, defpackage.oe4 r9, defpackage.n42 r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof defpackage.z88
            if (r0 == 0) goto L13
            r0 = r10
            z88 r0 = (defpackage.z88) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            z88 r0 = new z88
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r5 = r0.d
            int r10 = r0.f
            r1 = 1
            r2 = 0
            if (r10 == 0) goto L32
            if (r10 != r1) goto L2c
            jv4 r6 = r0.c
            oe4 r9 = r0.b
            d82 r8 = r0.a
            defpackage.hre.r(r5)
            goto L80
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L32:
            defpackage.hre.r(r5)
            jv4 r5 = defpackage.pi2.a(r2)
            r0.a = r8
            r0.b = r9
            r0.c = r5
            r0.f = r1
            f61 r10 = new f61
            m42 r0 = defpackage.w92.t(r0)
            r10.<init>(r1, r0)
            r10.u()
            r6.getClass()
            r7.getClass()
            okhttp3.internal.connection.RealCall r0 = new okhttp3.internal.connection.RealCall
            r3 = 0
            r0.<init>(r6, r7, r3)
            r0f r6 = defpackage.r0f.I
            b82 r6 = r8.get(r6)
            r6.getClass()
            w26 r6 = (defpackage.w26) r6
            lv0 r7 = new lv0
            r7.<init>(r0, r1)
            r6.invokeOnCompletion(r1, r1, r7)
            eb5 r6 = new eb5
            r6.<init>(r9, r10)
            r0.G(r6)
            java.lang.Object r6 = r10.s()
            n82 r7 = defpackage.n82.a
            if (r6 != r7) goto L7d
            return r7
        L7d:
            r4 = r6
            r6 = r5
            r5 = r4
        L80:
            okhttp3.Response r5 = (okhttp3.Response) r5
            okhttp3.ResponseBody r7 = r5.C
            w26 r10 = defpackage.k27.r(r8)
            cl7 r0 = new cl7
            r1 = 12
            r0.<init>(r7, r1)
            r10.invokeOnCompletion(r0)
            bz0 r7 = r7.v()
            d98 r10 = new d98
            r10.<init>(r7, r8, r9, r2)
            r7 = 2
            jz4 r0 = defpackage.jz4.a
            rwa r7 = defpackage.gae.t(r0, r8, r10, r7)
            java.lang.Object r7 = r7.b
            i11 r7 = (defpackage.i11) r7
            rh5 r5 = G(r5, r6, r7, r8, r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b98.g0(okhttp3.OkHttpClient, okhttp3.Request, d82, oe4, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m0(okhttp3.OkHttpClient r11, okhttp3.Request r12, defpackage.d82 r13, defpackage.oe4 r14, defpackage.n42 r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.a98
            if (r0 == 0) goto L13
            r0 = r15
            a98 r0 = (defpackage.a98) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            a98 r0 = new a98
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.e
            int r1 = r0.C
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            f98 r10 = r0.d
            jv4 r11 = r0.c
            oe4 r14 = r0.b
            d82 r13 = r0.a
            defpackage.hre.r(r15)
            goto L74
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            return r2
        L34:
            defpackage.hre.r(r15)
            jv4 r15 = defpackage.pi2.a(r2)
            java.lang.Object r1 = r14.C
            uy1 r1 = (defpackage.uy1) r1
            h40 r2 = defpackage.jgd.b
            java.lang.Object r1 = r1.c(r2)
            r9 = r1
            igd r9 = (defpackage.igd) r9
            f98 r4 = new f98
            x88 r10 = r10.e
            r10.getClass()
            r6 = r11
            r5 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            bt1 r10 = r4.c
            r10.P(r4)
            r0.a = r8
            r0.b = r14
            r0.c = r15
            r0.d = r4
            r0.C = r3
            bt1 r10 = r4.d
            java.lang.Object r10 = r10.r(r0)
            n82 r11 = defpackage.n82.a
            if (r10 != r11) goto L70
            return r11
        L70:
            r11 = r15
            r13 = r8
            r15 = r10
            r10 = r4
        L74:
            okhttp3.Response r15 = (okhttp3.Response) r15
            rh5 r10 = G(r15, r11, r10, r13, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b98.m0(okhttp3.OkHttpClient, okhttp3.Request, d82, oe4, n42):java.lang.Object");
    }

    @Override // defpackage.cf5, defpackage.m82
    public final d82 q() {
        return this.D;
    }
}
