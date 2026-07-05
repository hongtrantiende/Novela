package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zr6  reason: default package */
/* loaded from: classes.dex */
public final class zr6 extends as6 implements rn6 {
    public final un6 e;
    public final /* synthetic */ zu7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr6(zu7 zu7Var, un6 un6Var, q78 q78Var) {
        super(zu7Var, q78Var);
        this.f = zu7Var;
        this.e = un6Var;
    }

    @Override // defpackage.rn6
    public final void C(un6 un6Var, jn6 jn6Var) {
        un6 un6Var2 = this.e;
        kn6 kn6Var = un6Var2.k().h;
        if (kn6Var == kn6.a) {
            this.f.h(this.a);
            return;
        }
        kn6 kn6Var2 = null;
        while (kn6Var2 != kn6Var) {
            a(d());
            kn6Var2 = kn6Var;
            kn6Var = un6Var2.k().h;
        }
    }

    @Override // defpackage.as6
    public final void b() {
        this.e.k().f(this);
    }

    @Override // defpackage.as6
    public final boolean c(un6 un6Var) {
        if (this.e == un6Var) {
            return true;
        }
        return false;
    }

    @Override // defpackage.as6
    public final boolean d() {
        if (this.e.k().h.compareTo(kn6.d) >= 0) {
            return true;
        }
        return false;
    }
}
