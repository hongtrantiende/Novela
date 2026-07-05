package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zrd  reason: default package */
/* loaded from: classes.dex */
public final class zrd extends uq7 {
    public final btd b;
    public final boolean c;
    public final xt4 d;
    public final xt4 e;

    public zrd(btd btdVar, boolean z, xt4 xt4Var, xt4 xt4Var2) {
        btdVar.getClass();
        this.b = btdVar;
        this.c = z;
        this.d = xt4Var;
        this.e = xt4Var2;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new lsd(this.b, this.c, this.d, this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r2 != r6) goto L26;
     */
    @Override // defpackage.uq7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.mq7 r9) {
        /*
            r8 = this;
            lsd r9 = (defpackage.lsd) r9
            r9.getClass()
            btd r0 = r8.b
            r0.getClass()
            btd r1 = r9.M
            boolean r1 = defpackage.c16.i(r1, r0)
            xt4 r2 = r9.P
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L18
            r2 = r4
            goto L19
        L18:
            r2 = r3
        L19:
            xt4 r5 = r8.e
            if (r5 != 0) goto L1f
            r6 = r4
            goto L20
        L1f:
            r6 = r3
        L20:
            xt4 r7 = r8.d
            if (r2 != r6) goto L32
            xt4 r2 = r9.O
            if (r2 != 0) goto L2a
            r2 = r4
            goto L2b
        L2a:
            r2 = r3
        L2b:
            if (r7 != 0) goto L2f
            r6 = r4
            goto L30
        L2f:
            r6 = r3
        L30:
            if (r2 == r6) goto L33
        L32:
            r3 = r4
        L33:
            r9.M = r0
            boolean r8 = r8.c
            r9.N = r8
            r9.O = r7
            r9.P = r5
            if (r1 == 0) goto L41
            if (r3 == 0) goto L46
        L41:
            hab r8 = r9.W
            r8.J1()
        L46:
            if (r1 != 0) goto L4d
            hab r8 = r9.X
            r8.J1()
        L4d:
            r0 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            r9.V = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zrd.d(mq7):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zrd) {
                zrd zrdVar = (zrd) obj;
                if (!c16.i(this.b, zrdVar.b) || this.c != zrdVar.c || !c16.i(this.d, zrdVar.d) || !c16.i(this.e, zrdVar.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k(this.b.hashCode() * 31, 31, this.c);
        int i = 0;
        xt4 xt4Var = this.d;
        if (xt4Var == null) {
            hashCode = 0;
        } else {
            hashCode = xt4Var.hashCode();
        }
        int i2 = (k + hashCode) * 31;
        xt4 xt4Var2 = this.e;
        if (xt4Var2 != null) {
            i = xt4Var2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "ZoomableElement(zoomable=" + this.b + ", userSetupContentSize=" + this.c + ", onLongPress=" + this.d + ", onTap=" + this.e + ")";
    }
}
