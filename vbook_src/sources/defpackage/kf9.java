package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kf9  reason: default package */
/* loaded from: classes3.dex */
public abstract class kf9 extends fdd {
    public final mfb c = new mfb(new u76(this, 28));
    public final s02 d = new s02();

    public abstract void j(String str, String str2);

    public abstract void k();

    public abstract void l(String str);

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(2:10|11)(2:22|23))(4:24|25|26|(1:28))|12|13|(1:15)|16|(1:18)|19))|31|6|7|(0)(0)|12|13|(0)|16|(0)|19) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
        r7 = new defpackage.gs9(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.f76 r5, defpackage.xt4 r6, defpackage.n42 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.hf9
            if (r0 == 0) goto L13
            r0 = r7
            hf9 r0 = (defpackage.hf9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            hf9 r0 = new hf9
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            pvc r2 = defpackage.pvc.a
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2b
            f76 r5 = r0.a
            defpackage.hre.r(r7)     // Catch: java.lang.Throwable -> L29
            goto L42
        L29:
            r6 = move-exception
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L32:
            defpackage.hre.r(r7)
            r0.a = r5     // Catch: java.lang.Throwable -> L29
            r0.d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r6 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L29
            n82 r7 = defpackage.n82.a
            if (r6 != r7) goto L42
            return r7
        L42:
            r7 = r2
            goto L49
        L44:
            gs9 r7 = new gs9
            r7.<init>(r6)
        L49:
            boolean r6 = r7 instanceof defpackage.gs9
            s02 r0 = r4.d
            if (r6 != 0) goto L5e
            r6 = r7
            pvc r6 = (defpackage.pvc) r6
            ef9 r6 = new ef9
            java.lang.String r1 = r5.getName()
            r6.<init>(r1)
            r4.h(r0, r6)
        L5e:
            java.lang.Throwable r6 = defpackage.hs9.a(r7)
            if (r6 == 0) goto L73
            r6.printStackTrace()
            df9 r6 = new df9
            java.lang.String r5 = r5.getName()
            r6.<init>(r5)
            r4.h(r0, r6)
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf9.m(f76, xt4, n42):java.lang.Object");
    }

    public abstract Object n(byte[] bArr, m42 m42Var);

    public abstract sj4 o();

    public abstract void p(f76 f76Var, cs9 cs9Var);
}
