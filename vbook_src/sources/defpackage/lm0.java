package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lm0  reason: default package */
/* loaded from: classes3.dex */
public final class lm0 implements PointerInputEventHandler {
    public final /* synthetic */ vt4 C;
    public final /* synthetic */ float D;
    public final /* synthetic */ vt4 E;
    public final /* synthetic */ kj6 a;
    public final /* synthetic */ dm8 b;
    public final /* synthetic */ dm8 c;
    public final /* synthetic */ qo3 d;
    public final /* synthetic */ zl0 e;
    public final /* synthetic */ vt4 f;

    public lm0(kj6 kj6Var, dm8 dm8Var, dm8 dm8Var2, qo3 qo3Var, zl0 zl0Var, vt4 vt4Var, vt4 vt4Var2, float f, vt4 vt4Var3) {
        this.a = kj6Var;
        this.b = dm8Var;
        this.c = dm8Var2;
        this.d = qo3Var;
        this.e = zl0Var;
        this.f = vt4Var;
        this.C = vt4Var2;
        this.D = f;
        this.E = vt4Var3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r4.intValue() == (r2 + 1)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.zl9 r3, defpackage.vt4 r4, defpackage.qo3 r5, defpackage.zl0 r6, defpackage.vt4 r7) {
        /*
            java.lang.Object r0 = r3.a
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            r3.a = r1
            java.lang.Object r3 = r4.invoke()
            so3 r3 = (defpackage.so3) r3
            cj3 r3 = r3.d
            if (r3 == 0) goto L63
            boolean r4 = r5.i
            if (r4 == 0) goto L63
            java.lang.String r4 = r3.k
            if (r4 == 0) goto L27
            java.util.Map r1 = r3.n
            pm0 r2 = new pm0
            r2.<init>(r4)
            java.lang.Object r4 = r1.get(r2)
            r1 = r4
            java.lang.Integer r1 = (java.lang.Integer) r1
        L27:
            if (r0 == 0) goto L60
            java.lang.Integer r4 = r3.b
            int r2 = r3.d
            int r3 = r3.q
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            if (r1 == 0) goto L3c
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L3c
            goto L60
        L3c:
            if (r4 != 0) goto L3f
            goto L4d
        L3f:
            int r3 = r4.intValue()
            if (r3 == r2) goto L4d
            int r2 = r2 + 1
            int r3 = r4.intValue()
            if (r3 != r2) goto L60
        L4d:
            y51 r3 = defpackage.y51.a
            r6.c(r3)
            boolean r3 = r5.h
            if (r3 != 0) goto L57
            goto L63
        L57:
            lbc r3 = new lbc
            r3.<init>(r0)
            r6.c(r3)
            return
        L60:
            r7.invoke()
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm0.a(zl9, vt4, qo3, zl0, vt4):void");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [zl9, java.lang.Object] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        ?? obj = new Object();
        kj6 kj6Var = this.a;
        dm8 dm8Var = this.b;
        dm8 dm8Var2 = this.c;
        qo3 qo3Var = this.d;
        zl0 zl0Var = this.e;
        hm0 hm0Var = new hm0(obj, kj6Var, dm8Var, dm8Var2, qo3Var, zl0Var, 0);
        vt4 vt4Var = this.f;
        return yae.h(d19Var, new mm0(190L, hm0Var, new im0(zl0Var, obj, vt4Var, qo3Var, 0), new im0(zl0Var, obj, vt4Var, qo3Var, 1), new p6(vt4Var, qo3Var, kj6Var, zl0Var, this.E, 3), new jm0(vt4Var, qo3Var, dm8Var, dm8Var2, kj6Var, this.C, this.D, zl0Var), null), m42Var);
    }
}
