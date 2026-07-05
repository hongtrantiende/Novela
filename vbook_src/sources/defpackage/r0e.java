package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r0e  reason: default package */
/* loaded from: classes.dex */
public final class r0e {
    public static final kj b = new kj("FirebaseAuth", "FirebaseAuthFallback:");
    public final k57 a;

    public r0e(qf4 qf4Var) {
        am8.s(qf4Var);
        qf4Var.a();
        am8.s(qf4Var.a);
        this.a = new k57(new qu1(qf4Var, r95.t()), 20);
        new HashMap();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l1e, java.lang.Object] */
    public final void a(bp9 bp9Var, p0e p0eVar) {
        am8.s(p0eVar);
        am8.s(bp9Var);
        wf2 y = st0.y((ru8) bp9Var.b);
        rwa rwaVar = new rwa(p0eVar, b);
        k57 k57Var = this.a;
        k57Var.getClass();
        qu1 qu1Var = (qu1) k57Var.b;
        rxd rxdVar = new rxd(k57Var, rwaVar, 1);
        h1e h1eVar = (h1e) qu1Var.a;
        ch0.w(h1eVar.f("/verifyPhoneNumber", (String) qu1Var.f), y, rxdVar, new Object(), (bm1) h1eVar.c);
    }

    public final void b(b3e b3eVar, p0e p0eVar) {
        am8.s(p0eVar);
        am8.s(b3eVar.c);
        kp3 kp3Var = b3eVar.c;
        String str = b3eVar.e;
        rwa rwaVar = new rwa(p0eVar, b);
        k57 k57Var = this.a;
        k57Var.getClass();
        am8.s(kp3Var);
        if (kp3Var.e) {
            k57Var.H(kp3Var.d, new odd(k57Var, kp3Var, str, rwaVar));
        } else {
            k57Var.I(new b3e(kp3Var, null, str), rwaVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l1e, java.lang.Object] */
    public final void c(u5e u5eVar, p0e p0eVar) {
        am8.s(u5eVar);
        am8.s(p0eVar);
        rwa rwaVar = new rwa(p0eVar, b);
        k57 k57Var = this.a;
        k57Var.getClass();
        u5eVar.K = true;
        qu1 qu1Var = (qu1) k57Var.b;
        pxd pxdVar = new pxd(k57Var, rwaVar, 2);
        qu1Var.getClass();
        h1e h1eVar = (h1e) qu1Var.a;
        ch0.w(h1eVar.f("/verifyAssertion", (String) qu1Var.f), u5eVar, pxdVar, new Object(), (bm1) h1eVar.c);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [l1e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, vz0, k1e] */
    public final void d(String str, String str2, String str3, String str4, p0e p0eVar) {
        am8.p(str);
        am8.p(str2);
        am8.s(p0eVar);
        rwa rwaVar = new rwa(p0eVar, b);
        k57 k57Var = this.a;
        k57Var.getClass();
        am8.p(str);
        am8.p(str2);
        ?? obj = new Object();
        am8.p(str);
        obj.b = str;
        am8.p(str2);
        obj.c = str2;
        obj.d = str3;
        obj.e = str4;
        obj.a = true;
        qu1 qu1Var = (qu1) k57Var.b;
        pxd pxdVar = new pxd(k57Var, rwaVar, 0);
        qu1Var.getClass();
        h1e h1eVar = (h1e) qu1Var.a;
        ch0.w(h1eVar.f("/verifyPassword", (String) qu1Var.f), obj, pxdVar, new Object(), (bm1) h1eVar.c);
    }
}
