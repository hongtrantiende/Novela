package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ib7  reason: default package */
/* loaded from: classes.dex */
public final class ib7 implements i0a {
    public final pw4 a;
    public final dwc b;
    public final o74 c;

    public ib7(dwc dwcVar, o74 o74Var, pw4 pw4Var) {
        this.b = dwcVar;
        o74Var.getClass();
        this.c = o74Var;
        this.a = pw4Var;
    }

    @Override // defpackage.i0a
    public final void a(Object obj, Object obj2) {
        n0a.c(this.b, obj, obj2);
    }

    @Override // defpackage.i0a
    public final void b(Object obj) {
        this.b.getClass();
        ((pw4) obj).c.d = false;
        this.c.getClass();
        a82.x(obj);
        throw null;
    }

    @Override // defpackage.i0a
    public final boolean c(Object obj) {
        this.c.getClass();
        a82.x(obj);
        throw null;
    }

    @Override // defpackage.i0a
    public final pw4 d() {
        pw4 pw4Var = this.a;
        if (pw4Var instanceof pw4) {
            return pw4Var.f();
        }
        return ((jw4) pw4Var.a(5)).a();
    }

    @Override // defpackage.i0a
    public final void e(Object obj, vh1 vh1Var, y54 y54Var) {
        this.b.getClass();
        dwc.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.i0a
    public final boolean f(pw4 pw4Var, pw4 pw4Var2) {
        this.b.getClass();
        if (!pw4Var.c.equals(pw4Var2.c)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.i0a
    public final int g(pw4 pw4Var) {
        this.b.getClass();
        return pw4Var.c.hashCode();
    }
}
