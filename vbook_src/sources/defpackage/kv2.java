package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kv2  reason: default package */
/* loaded from: classes.dex */
public final class kv2 implements b47 {
    public final jya a;
    public final q04 b;
    public ei0 c;
    public b47 d;
    public boolean e = true;
    public boolean f;

    public kv2(q04 q04Var, xfb xfbVar) {
        this.b = q04Var;
        this.a = new jya(xfbVar);
    }

    @Override // defpackage.b47
    public final void a(my8 my8Var) {
        b47 b47Var = this.d;
        if (b47Var != null) {
            b47Var.a(my8Var);
            my8Var = this.d.e();
        }
        this.a.a(my8Var);
    }

    @Override // defpackage.b47
    public final long b() {
        if (this.e) {
            return this.a.b();
        }
        b47 b47Var = this.d;
        b47Var.getClass();
        return b47Var.b();
    }

    @Override // defpackage.b47
    public final boolean c() {
        if (this.e) {
            this.a.getClass();
            return false;
        }
        b47 b47Var = this.d;
        b47Var.getClass();
        return b47Var.c();
    }

    public final void d(ei0 ei0Var) {
        b47 b47Var;
        b47 j = ei0Var.j();
        if (j != null && j != (b47Var = this.d)) {
            if (b47Var == null) {
                this.d = j;
                this.c = ei0Var;
                ((e47) j).a((my8) this.a.e);
                return;
            }
            throw new pz3(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    @Override // defpackage.b47
    public final my8 e() {
        b47 b47Var = this.d;
        if (b47Var != null) {
            return b47Var.e();
        }
        return (my8) this.a.e;
    }
}
