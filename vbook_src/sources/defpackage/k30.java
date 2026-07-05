package defpackage;

import java.nio.channels.AsynchronousFileChannel;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k30  reason: default package */
/* loaded from: classes3.dex */
public final class k30 extends w20 {
    public final /* synthetic */ AsynchronousFileChannel a;
    public final /* synthetic */ o30 b;
    public final /* synthetic */ String c;

    public k30(AsynchronousFileChannel asynchronousFileChannel, o30 o30Var, String str) {
        this.a = asynchronousFileChannel;
        this.b = o30Var;
        this.c = str;
    }

    @Override // defpackage.y00
    public final Object a(n42 n42Var) {
        this.a.close();
        return pvc.a;
    }

    @Override // defpackage.w20, defpackage.e10
    public final Object e(n42 n42Var) {
        AsynchronousFileChannel asynchronousFileChannel = this.a;
        this.b.getClass();
        return qye.k(new n30(asynchronousFileChannel, null), n42Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    @Override // defpackage.w20, defpackage.e10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.j30
            if (r0 == 0) goto L13
            r0 = r5
            j30 r0 = (defpackage.j30) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            j30 r0 = new j30
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r5)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r5)
            r0.c = r2
            java.lang.Object r5 = r4.e(r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L3a
            return r4
        L3a:
            java.lang.Number r5 = (java.lang.Number) r5
            long r4 = r5.longValue()
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 < 0) goto L47
            goto L48
        L47:
            r2 = 0
        L48:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k30.h(n42):java.lang.Object");
    }

    @Override // defpackage.w20
    public final Object i(long j, byte[] bArr, int i, int i2, m42 m42Var) {
        return rte.r(new i30(this.a, bArr, i, i2, j, 0), (n42) m42Var);
    }

    @Override // defpackage.w20
    public final Object j(long j, byte[] bArr, int i, int i2, m42 m42Var) {
        Object r = rte.r(new i30(this.a, bArr, i, i2, j, 1), (n42) m42Var);
        if (r == n82.a) {
            return r;
        }
        return pvc.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.a);
        sb.append('(');
        return s21.p(sb, this.c, ')');
    }
}
