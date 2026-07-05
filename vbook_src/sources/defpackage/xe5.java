package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xe5  reason: default package */
/* loaded from: classes3.dex */
public final class xe5 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(xe5.class, "requestLogged");
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(xe5.class, "responseLogged");
    public final nw6 a;
    public final StringBuilder b = new StringBuilder();
    public final StringBuilder c = new StringBuilder();
    public final y26 d = k27.c();
    public final y26 e = k27.c();
    private volatile /* synthetic */ int requestLogged = 0;
    private volatile /* synthetic */ int responseLogged = 0;

    public xe5(nw6 nw6Var) {
        this.a = nw6Var;
    }

    public final void a() {
        y26 y26Var = this.d;
        if (!f.compareAndSet(this, 0, 1)) {
            return;
        }
        try {
            String obj = k4b.N0(this.b).toString();
            if (obj.length() > 0) {
                this.a.m(obj);
            }
        } finally {
            y26Var.o0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ue5
            if (r0 == 0) goto L13
            r0 = r5
            ue5 r0 = (defpackage.ue5) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ue5 r0 = new ue5
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            pvc r2 = defpackage.pvc.a
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L27
            defpackage.hre.r(r5)
            goto L48
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.xe5.g
            r1 = 0
            boolean r5 = r5.compareAndSet(r4, r1, r3)
            if (r5 != 0) goto L3b
            goto L5d
        L3b:
            r0.c = r3
            y26 r5 = r4.d
            java.lang.Object r5 = r5.join(r0)
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L48
            return r0
        L48:
            java.lang.StringBuilder r5 = r4.c
            java.lang.CharSequence r5 = defpackage.k4b.N0(r5)
            java.lang.String r5 = r5.toString()
            int r0 = r5.length()
            if (r0 <= 0) goto L5d
            nw6 r4 = r4.a
            r4.m(r5)
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe5.b(n42):java.lang.Object");
    }

    public final void c(String str) {
        String obj = k4b.N0(str).toString();
        StringBuilder sb = this.b;
        sb.append(obj);
        sb.append('\n');
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ve5
            if (r0 == 0) goto L13
            r0 = r6
            ve5 r0 = (defpackage.ve5) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ve5 r0 = new ve5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.lang.String r5 = r0.a
            defpackage.hre.r(r6)
            goto L40
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r6)
            r0.a = r5
            r0.d = r2
            y26 r6 = r4.e
            java.lang.Object r6 = r6.join(r0)
            n82 r0 = defpackage.n82.a
            if (r6 != r0) goto L40
            return r0
        L40:
            java.lang.StringBuilder r4 = r4.c
            r4.append(r5)
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe5.d(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.we5
            if (r0 == 0) goto L13
            r0 = r6
            we5 r0 = (defpackage.we5) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            we5 r0 = new we5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.lang.String r5 = r0.a
            defpackage.hre.r(r6)
            goto L40
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r6)
            r0.a = r5
            r0.d = r2
            y26 r6 = r4.d
            java.lang.Object r6 = r6.join(r0)
            n82 r0 = defpackage.n82.a
            if (r6 != r0) goto L40
            return r0
        L40:
            java.lang.CharSequence r5 = defpackage.k4b.N0(r5)
            java.lang.String r5 = r5.toString()
            nw6 r4 = r4.a
            r4.m(r5)
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe5.e(java.lang.String, n42):java.lang.Object");
    }
}
