package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gad  reason: default package */
/* loaded from: classes3.dex */
public final class gad implements vfd {
    public final /* synthetic */ xt4 a;
    public final /* synthetic */ at1 b;

    public gad(xt4 xt4Var, at1 at1Var) {
        this.a = xt4Var;
        this.b = at1Var;
    }

    @Override // defpackage.vfd
    public final ygd g(String str) {
        this.a.invoke(str);
        String c = kad.c(str);
        if (!kad.b.contains(c) && !kad.a.containsKey(c)) {
            return null;
        }
        return new ygd(new byte[0]);
    }

    @Override // defpackage.vfd
    public final void x(String str) {
        at1 at1Var = this.b;
        if (!((l36) at1Var).N()) {
            ((bt1) at1Var).P(pvc.a);
        }
    }
}
