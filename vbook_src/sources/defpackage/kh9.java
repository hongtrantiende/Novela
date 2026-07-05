package defpackage;

import java.io.IOException;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kh9  reason: default package */
/* loaded from: classes3.dex */
public final class kh9 implements s11 {
    public final n21 b;
    public fk1 c;
    public final ly0 d;
    public final y26 e;
    public final d82 f;

    /* JADX WARN: Type inference failed for: r2v1, types: [ly0, java.lang.Object] */
    public kh9(n21 n21Var, d82 d82Var) {
        d82Var.getClass();
        this.b = n21Var;
        this.d = new Object();
        y26 y26Var = new y26((w26) d82Var.get(r0f.I));
        this.e = y26Var;
        this.f = d82Var.plus(y26Var).plus(new i82("RawSourceChannel"));
    }

    @Override // defpackage.s11, defpackage.f31
    public final void a(Throwable th) {
        String message;
        if (this.c != null) {
            return;
        }
        String str = "Channel was cancelled";
        k27.o(this.e, (th == null || (r1 = th.getMessage()) == null) ? "Channel was cancelled" : "Channel was cancelled", th);
        this.b.close();
        if (th != null && (message = th.getMessage()) != null) {
            str = message;
        }
        this.c = new fk1(new IOException(str, th));
    }

    @Override // defpackage.s11, defpackage.f31
    public final Throwable b() {
        Throwable th;
        fk1 fk1Var = this.c;
        if (fk1Var != null && (th = fk1Var.a) != null) {
            if (th instanceof c72) {
                return ((c72) th).a();
            }
            if (th instanceof CancellationException) {
                return nye.b(((CancellationException) th).getMessage(), th);
            }
            return new ik1(th);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    @Override // defpackage.s11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r7, defpackage.n42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.jh9
            if (r0 == 0) goto L13
            r0 = r8
            jh9 r0 = (defpackage.jh9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jh9 r0 = new jh9
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 0
            ly0 r4 = r6.d
            r5 = 1
            if (r1 == 0) goto L31
            if (r1 != r5) goto L2b
            int r7 = r0.a
            defpackage.hre.r(r8)
            goto L60
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L31:
            defpackage.hre.r(r8)
            fk1 r8 = r6.c
            if (r8 == 0) goto L4c
            java.lang.Throwable r6 = r6.b()
            if (r6 != 0) goto L4b
            long r0 = r4.c
            long r6 = (long) r7
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L46
            r3 = r5
        L46:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L4b:
            throw r6
        L4c:
            o54 r8 = new o54
            r8.<init>(r6, r7, r2)
            r0.a = r7
            r0.d = r5
            d82 r6 = r6.f
            java.lang.Object r6 = defpackage.z87.E(r6, r8, r0)
            n82 r8 = defpackage.n82.a
            if (r6 != r8) goto L60
            return r8
        L60:
            long r0 = r4.c
            long r6 = (long) r7
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L68
            r3 = r5
        L68:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh9.e(int, n42):java.lang.Object");
    }

    @Override // defpackage.s11
    public final ly0 h() {
        return this.d;
    }

    @Override // defpackage.s11
    public final boolean i() {
        if (this.c != null && this.d.k()) {
            return true;
        }
        return false;
    }
}
