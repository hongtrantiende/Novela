package defpackage;

import androidx.media3.ui.AspectRatioFrameLayout;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h00  reason: default package */
/* loaded from: classes.dex */
public final class h00 implements Runnable {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;

    public h00(yze yzeVar, boolean z) {
        this.b = z;
        Objects.requireNonNull(yzeVar);
        this.c = yzeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r4 != r1) goto L22;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.a
            r1 = 0
            switch(r0) {
                case 0: goto L6d;
                default: goto L6;
            }
        L6:
            java.lang.Object r0 = r8.c
            yze r0 = (defpackage.yze) r0
            java.lang.Object r2 = r0.a
            lte r2 = (defpackage.lte) r2
            boolean r3 = r2.a()
            java.lang.Boolean r4 = r2.U
            r5 = 1
            if (r4 == 0) goto L21
            java.lang.Boolean r4 = r2.U
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L21
            r4 = r5
            goto L22
        L21:
            r4 = r1
        L22:
            boolean r8 = r8.b
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r8)
            r2.U = r6
            if (r4 != r8) goto L3c
            ppe r4 = r2.f
            defpackage.lte.m(r4)
            s56 r4 = r4.J
            java.lang.String r6 = "Default data collection state already set to"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            r4.f(r7, r6)
        L3c:
            boolean r4 = r2.a()
            if (r4 == r3) goto L55
            boolean r4 = r2.a()
            java.lang.Boolean r6 = r2.U
            if (r6 == 0) goto L53
            java.lang.Boolean r6 = r2.U
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L53
            r1 = r5
        L53:
            if (r4 == r1) goto L69
        L55:
            ppe r1 = r2.f
            defpackage.lte.m(r1)
            s56 r1 = r1.G
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            java.lang.String r3 = "Default data collection is different than actual status"
            r1.g(r8, r2, r3)
        L69:
            r0.p0()
            return
        L6d:
            r8.b = r1
            int r8 = androidx.media3.ui.AspectRatioFrameLayout.d
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h00.run():void");
    }

    public h00(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.c = aspectRatioFrameLayout;
    }
}
