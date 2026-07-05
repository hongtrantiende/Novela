package defpackage;

import android.net.ConnectivityManager;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x18  reason: default package */
/* loaded from: classes3.dex */
public final class x18 implements l02 {
    public final ConnectivityManager a;

    public x18(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.l02
    public final boolean a(ymd ymdVar) {
        if (!c(ymdVar)) {
            return false;
        }
        vs.k("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // defpackage.l02
    public final o51 b(w02 w02Var) {
        w02Var.getClass();
        return z1d.s(new qq4(w02Var, this, null, 27));
    }

    @Override // defpackage.l02
    public final boolean c(ymd ymdVar) {
        ymdVar.getClass();
        if (ymdVar.j.a() == null && ymdVar.j.a == c28.a) {
            return false;
        }
        return true;
    }
}
