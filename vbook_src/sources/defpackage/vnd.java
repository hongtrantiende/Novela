package defpackage;

import android.view.ViewGroup;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vnd  reason: default package */
/* loaded from: classes.dex */
public abstract class vnd {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.rnd a(defpackage.z0 r7, defpackage.vw1 r8, defpackage.tu1 r9) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.mz4.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L40
            r0 = 6
            xy0 r0 = defpackage.xpe.a(r2, r0, r3)
            mfb r4 = defpackage.to.I
            java.lang.Object r4 = r4.getValue()
            d82 r4 = (defpackage.d82) r4
            m41 r4 = defpackage.k27.a(r4)
            qq4 r5 = new qq4
            r6 = 2
            r5.<init>(r0, r3, r6)
            r6 = 3
            defpackage.z87.v(r4, r3, r3, r5, r6)
            jc r4 = new jc
            r5 = 18
            r4.<init>(r0, r5)
            java.lang.Object r0 = defpackage.dra.c
            monitor-enter(r0)
            java.util.List r5 = defpackage.dra.i     // Catch: java.lang.Throwable -> L3d
            java.util.ArrayList r4 = defpackage.sl1.o0(r5, r4)     // Catch: java.lang.Throwable -> L3d
            defpackage.dra.i = r4     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)
            defpackage.dra.a()
            goto L40
        L3d:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L40:
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L53
            android.view.View r0 = r7.getChildAt(r1)
            boolean r1 = r0 instanceof defpackage.rg
            if (r1 == 0) goto L51
            rg r0 = (defpackage.rg) r0
            goto L57
        L51:
            r0 = r3
            goto L57
        L53:
            r7.removeAllViews()
            goto L51
        L57:
            if (r0 != 0) goto L6b
            rg r0 = new rg
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1, r8)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r4 = defpackage.vnd.a
            r7.addView(r1, r4)
        L6b:
            vw1 r1 = r0.getComposeViewContext()
            if (r1 == r8) goto L74
            r7.m(r8)
        L74:
            vw1 r7 = r7.getComposeViewContext$ui()
            if (r7 == 0) goto L80
            r8.d()
            r0.setComposeViewContextIncrementedDuringInit$ui(r2)
        L80:
            r7 = 2131362492(0x7f0a02bc, float:1.8344766E38)
            java.lang.Object r1 = r0.getTag(r7)
            boolean r2 = r1 instanceof defpackage.rnd
            if (r2 == 0) goto L8e
            r3 = r1
            rnd r3 = (defpackage.rnd) r3
        L8e:
            if (r3 != 0) goto Lae
            rnd r3 = new rnd
            kuc r1 = new kuc
            od6 r2 = r0.getRoot()
            r1.<init>(r2)
            r8.f()
            px1 r2 = r8.c
            r2.getClass()
            ux1 r4 = new ux1
            r4.<init>(r2, r1)
            r3.<init>(r0, r4)
            r0.setTag(r7, r3)
        Lae:
            r3.b(r9)
            r8.f()
            px1 r7 = r8.c
            r7.getClass()
            und r8 = new und
            r8.<init>(r7)
            r0.setFrameEndScheduler$ui(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vnd.a(z0, vw1, tu1):rnd");
    }
}
