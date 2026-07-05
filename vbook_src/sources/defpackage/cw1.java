package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cw1  reason: default package */
/* loaded from: classes.dex */
public final class cw1 implements un6 {
    public final xn6 a = new xn6(this, true);
    public kn6 b;
    public kn6 c;

    public cw1() {
        kn6 kn6Var = kn6.b;
        this.b = kn6Var;
        this.c = kn6Var;
    }

    public final void a() {
        kn6 kn6Var;
        if (this.b.ordinal() < this.c.ordinal()) {
            kn6Var = this.b;
        } else {
            kn6Var = this.c;
        }
        xn6 xn6Var = this.a;
        if (xn6Var.h == kn6.b && kn6Var == kn6.a) {
            return;
        }
        xn6Var.g(kn6Var);
    }

    @Override // defpackage.un6
    public final xn6 k() {
        return this.a;
    }
}
