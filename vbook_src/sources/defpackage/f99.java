package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f99  reason: default package */
/* loaded from: classes.dex */
public abstract class f99 {
    public final tk6 a;

    public f99(vt4 vt4Var) {
        this.a = new tk6(vt4Var);
    }

    public abstract i99 a(Object obj);

    public z3d b() {
        return this.a;
    }

    public final i99 c(xt4 xt4Var) {
        return new i99(this, null, false, null, xt4Var, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r2 == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.z3d d(defpackage.i99 r3, defpackage.z3d r4) {
        /*
            r2 = this;
            boolean r2 = r4 instanceof defpackage.um3
            r0 = 0
            if (r2 == 0) goto L16
            boolean r2 = r3.e
            if (r2 == 0) goto L43
            r0 = r4
            um3 r0 = (defpackage.um3) r0
            hm8 r2 = r0.a
            java.lang.Object r4 = r3.a()
            r2.setValue(r4)
            goto L43
        L16:
            boolean r2 = r4 instanceof defpackage.uza
            if (r2 == 0) goto L36
            boolean r2 = r3.b
            if (r2 != 0) goto L22
            java.lang.Object r2 = r3.f
            if (r2 == 0) goto L43
        L22:
            boolean r2 = r3.e
            if (r2 != 0) goto L43
            java.lang.Object r2 = r3.a()
            uza r4 = (defpackage.uza) r4
            java.lang.Object r1 = r4.a
            boolean r2 = defpackage.c16.i(r2, r1)
            if (r2 == 0) goto L43
        L34:
            r0 = r4
            goto L43
        L36:
            boolean r2 = r4 instanceof defpackage.my1
            if (r2 == 0) goto L43
            xt4 r2 = r3.d
            my1 r4 = (defpackage.my1) r4
            xt4 r1 = r4.a
            if (r2 != r1) goto L43
            goto L34
        L43:
            if (r0 != 0) goto L70
            boolean r2 = r3.e
            if (r2 == 0) goto L5c
            um3 r2 = new um3
            java.lang.Object r4 = r3.f
            kra r3 = r3.c
            if (r3 != 0) goto L53
            zj1 r3 = defpackage.zj1.G
        L53:
            hm8 r0 = new hm8
            r0.<init>(r4, r3)
            r2.<init>(r0)
            return r2
        L5c:
            xt4 r2 = r3.d
            if (r2 == 0) goto L66
            my1 r3 = new my1
            r3.<init>(r2)
            return r3
        L66:
            uza r2 = new uza
            java.lang.Object r3 = r3.a()
            r2.<init>(r3)
            return r2
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f99.d(i99, z3d):z3d");
    }
}
