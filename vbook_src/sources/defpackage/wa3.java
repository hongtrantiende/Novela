package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wa3  reason: default package */
/* loaded from: classes3.dex */
public abstract class wa3 extends ykb {
    public int c;

    public wa3(int i) {
        super(false, 0L);
        this.c = i;
    }

    public abstract m42 d();

    public Throwable e(Object obj) {
        ft1 ft1Var;
        if (obj instanceof ft1) {
            ft1Var = (ft1) obj;
        } else {
            ft1Var = null;
        }
        if (ft1Var == null) {
            return null;
        }
        return ft1Var.a;
    }

    public final void h(Throwable th) {
        c16.p(d().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        r4 = (defpackage.w26) r5.get(defpackage.r0f.I);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            m42 r0 = r11.d()     // Catch: java.lang.Throwable -> L1f defpackage.sa3 -> L22
            r0.getClass()     // Catch: java.lang.Throwable -> L1f defpackage.sa3 -> L22
            ta3 r0 = (defpackage.ta3) r0     // Catch: java.lang.Throwable -> L1f defpackage.sa3 -> L22
            n42 r1 = r0.e     // Catch: java.lang.Throwable -> L1f defpackage.sa3 -> L22
            java.lang.Object r0 = r0.C     // Catch: java.lang.Throwable -> L1f defpackage.sa3 -> L22
            d82 r2 = r1.getContext()     // Catch: java.lang.Throwable -> L1f defpackage.sa3 -> L22
            java.lang.Object r0 = defpackage.a7c.c(r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.sa3 -> L22
            lie r3 = defpackage.a7c.a     // Catch: java.lang.Throwable -> L1f defpackage.sa3 -> L22
            r4 = 0
            if (r0 == r3) goto L25
            gvc r3 = defpackage.tc4.t(r1, r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.sa3 -> L22
            goto L26
        L1f:
            r0 = move-exception
            goto L8c
        L22:
            r0 = move-exception
            goto L90
        L25:
            r3 = r4
        L26:
            d82 r5 = r1.getContext()     // Catch: java.lang.Throwable -> L49
            java.lang.Object r6 = r11.i()     // Catch: java.lang.Throwable -> L49
            java.lang.Throwable r7 = r11.e(r6)     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L4b
            int r8 = r11.c     // Catch: java.lang.Throwable -> L49
            r9 = 1
            if (r8 == r9) goto L3e
            r10 = 2
            if (r8 != r10) goto L3d
            goto L3e
        L3d:
            r9 = 0
        L3e:
            if (r9 == 0) goto L4b
            r0f r4 = defpackage.r0f.I     // Catch: java.lang.Throwable -> L49
            b82 r4 = r5.get(r4)     // Catch: java.lang.Throwable -> L49
            w26 r4 = (defpackage.w26) r4     // Catch: java.lang.Throwable -> L49
            goto L4b
        L49:
            r1 = move-exception
            goto L80
        L4b:
            if (r4 == 0) goto L62
            boolean r5 = r4.isActive()     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L62
            java.util.concurrent.CancellationException r4 = r4.getCancellationException()     // Catch: java.lang.Throwable -> L49
            r11.c(r4)     // Catch: java.lang.Throwable -> L49
            gs9 r4 = defpackage.hre.i(r4)     // Catch: java.lang.Throwable -> L49
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L49
            goto L74
        L62:
            if (r7 == 0) goto L6d
            gs9 r4 = new gs9     // Catch: java.lang.Throwable -> L49
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L49
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L49
            goto L74
        L6d:
            java.lang.Object r4 = r11.f(r6)     // Catch: java.lang.Throwable -> L49
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L49
        L74:
            if (r3 == 0) goto L7c
            boolean r1 = r3.t0()     // Catch: java.lang.Throwable -> L1f defpackage.sa3 -> L22
            if (r1 == 0) goto L9d
        L7c:
            defpackage.a7c.a(r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.sa3 -> L22
            return
        L80:
            if (r3 == 0) goto L88
            boolean r3 = r3.t0()     // Catch: java.lang.Throwable -> L1f defpackage.sa3 -> L22
            if (r3 == 0) goto L8b
        L88:
            defpackage.a7c.a(r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.sa3 -> L22
        L8b:
            throw r1     // Catch: java.lang.Throwable -> L1f defpackage.sa3 -> L22
        L8c:
            r11.h(r0)
            goto L9d
        L90:
            m42 r11 = r11.d()
            d82 r11 = r11.getContext()
            java.lang.Throwable r0 = r0.a
            defpackage.c16.p(r11, r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa3.run():void");
    }

    public void c(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
