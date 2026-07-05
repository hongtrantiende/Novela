package defpackage;

import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wcd  reason: default package */
/* loaded from: classes.dex */
public final class wcd extends kp {
    public final View W;
    public final x08 a0;
    public wx9 b0;
    public xt4 c0;
    public xt4 d0;
    public xt4 e0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wcd(android.content.Context r8, defpackage.xt4 r9, defpackage.pv4 r10, defpackage.xx9 r11, int r12, defpackage.wg8 r13) {
        /*
            r7 = this;
            java.lang.Object r9 = r9.invoke(r8)
            r5 = r9
            android.view.View r5 = (android.view.View) r5
            x08 r4 = new x08
            r4.<init>()
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.W = r5
            r0.a0 = r4
            r7 = 0
            r0.setClipChildren(r7)
            java.lang.String r7 = java.lang.String.valueOf(r3)
            r8 = 0
            if (r11 == 0) goto L28
            java.lang.Object r9 = r11.e(r7)
            goto L29
        L28:
            r9 = r8
        L29:
            boolean r10 = r9 instanceof android.util.SparseArray
            if (r10 == 0) goto L30
            r8 = r9
            android.util.SparseArray r8 = (android.util.SparseArray) r8
        L30:
            if (r8 == 0) goto L35
            r5.restoreHierarchyState(r8)
        L35:
            if (r11 == 0) goto L44
            jp r8 = new jp
            r9 = 2
            r8.<init>(r0, r9)
            wx9 r7 = r11.a(r7, r8)
            r0.setSavableRegistryEntry(r7)
        L44:
            kg r7 = defpackage.kg.J
            r0.c0 = r7
            r0.d0 = r7
            r0.e0 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wcd.<init>(android.content.Context, xt4, pv4, xx9, int, wg8):void");
    }

    public static final void o(wcd wcdVar) {
        wcdVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(wx9 wx9Var) {
        wx9 wx9Var2 = this.b0;
        if (wx9Var2 != null) {
            ((yx9) wx9Var2).o();
        }
        this.b0 = wx9Var;
    }

    public final x08 getDispatcher() {
        return this.a0;
    }

    public final xt4 getReleaseBlock() {
        return this.e0;
    }

    public final xt4 getResetBlock() {
        return this.d0;
    }

    public /* bridge */ /* synthetic */ z0 getSubCompositionView() {
        return null;
    }

    public final xt4 getUpdateBlock() {
        return this.c0;
    }

    public final void setReleaseBlock(xt4 xt4Var) {
        this.e0 = xt4Var;
        setRelease(new jp(this, 3));
    }

    public final void setResetBlock(xt4 xt4Var) {
        this.d0 = xt4Var;
        setReset(new jp(this, 4));
    }

    public final void setUpdateBlock(xt4 xt4Var) {
        this.c0 = xt4Var;
        setUpdate(new jp(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
