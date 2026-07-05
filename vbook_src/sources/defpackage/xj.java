package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xj  reason: default package */
/* loaded from: classes3.dex */
public final class xj extends wl8 {
    public final ru7 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xj(defpackage.vt4 r2, defpackage.ru7 r3) {
        /*
            r1 = this;
            if (r2 == 0) goto L14
            java.lang.Object r2 = r2.invoke()
            wl8 r2 = (defpackage.wl8) r2
            if (r2 == 0) goto L14
            java.util.List r2 = r2.a
            if (r2 == 0) goto L14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            goto L19
        L14:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L19:
            r2 = 2
            r1.<init>(r2, r0)
            r1.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xj.<init>(vt4, ru7):void");
    }

    @Override // defpackage.wl8
    public final Object a(gi1 gi1Var) {
        gi1Var.getClass();
        if (gi1Var.equals(cm9.a(ky9.class))) {
            try {
                return ny9.a(this.c);
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException("Koin could not create a SavedStateHandle: the ViewModel's CreationExtras has no SavedStateRegistryOwner. Resolve the ViewModel via koinViewModel()/koinNavViewModel() with a proper owner (e.g. a NavBackStackEntry), and inject SavedStateHandle directly in the ViewModel constructor (not lazily/outside construction).", e);
            }
        }
        return super.a(gi1Var);
    }
}
