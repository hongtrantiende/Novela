package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kk  reason: default package */
/* loaded from: classes.dex */
public final class kk implements m82 {
    public final View a;
    public final tub b;
    public final m82 c;
    public final AtomicReference d = new AtomicReference(null);

    public kk(View view, tub tubVar, m82 m82Var) {
        this.a = view;
        this.b = tubVar;
        this.c = m82Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.ay8 r8, defpackage.n42 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.hk
            if (r0 == 0) goto L13
            r0 = r9
            hk r0 = (defpackage.hk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            hk r0 = new hk
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return
        L27:
            defpackage.hre.r(r9)
            goto L51
        L2b:
            defpackage.hre.r(r9)
            r9 = r2
            jk r2 = new jk
            r1 = 0
            r2.<init>(r1, r8, r7)
            l0 r4 = new l0
            r8 = 13
            r5 = 0
            r4.<init>(r7, r5, r8)
            r0.c = r9
            z45 r1 = new z45
            r6 = 19
            java.util.concurrent.atomic.AtomicReference r3 = r7.d
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = defpackage.k27.p(r1, r0)
            n82 r8 = defpackage.n82.a
            if (r7 != r8) goto L51
            return
        L51:
            defpackage.ls2.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk.a(ay8, n42):void");
    }

    @Override // defpackage.m82
    public final d82 q() {
        return this.c.q();
    }
}
