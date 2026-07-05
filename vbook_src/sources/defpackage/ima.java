package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ima  reason: default package */
/* loaded from: classes3.dex */
public final class ima extends yx5 {
    public volatile Object b;

    @Override // defpackage.yx5
    public final Object a(bm1 bm1Var) {
        if (this.b == null) {
            return super.a(bm1Var);
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        vs.k("Single instance created couldn't return value");
        return null;
    }

    @Override // defpackage.yx5
    public final Object b(bm1 bm1Var) {
        boolean z;
        if (this.b == null) {
            synchronized (this) {
                if (this.b != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.b = a(bm1Var);
                }
            }
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        vs.k("Single instance created couldn't return value");
        return null;
    }
}
