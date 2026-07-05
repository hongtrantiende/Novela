package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gh0  reason: default package */
/* loaded from: classes.dex */
public abstract class gh0 implements l02 {
    public final m02 a;

    public gh0(m02 m02Var) {
        m02Var.getClass();
        this.a = m02Var;
    }

    @Override // defpackage.l02
    public final boolean a(ymd ymdVar) {
        if (c(ymdVar) && e(this.a.a())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.l02
    public final o51 b(w02 w02Var) {
        w02Var.getClass();
        return z1d.s(new l0(this, null, 23));
    }

    public abstract int d();

    public abstract boolean e(Object obj);
}
