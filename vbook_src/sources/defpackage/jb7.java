package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jb7  reason: default package */
/* loaded from: classes.dex */
public final class jb7 implements j0a {
    public final x2 a;
    public final ewc b;
    public final p74 c;

    public jb7(ewc ewcVar, p74 p74Var, x2 x2Var) {
        this.b = ewcVar;
        p74Var.getClass();
        this.c = p74Var;
        this.a = x2Var;
    }

    @Override // defpackage.j0a
    public final void a(Object obj, Object obj2) {
        o0a.k(this.b, obj, obj2);
    }

    @Override // defpackage.j0a
    public final void b(Object obj) {
        this.b.getClass();
        bwc bwcVar = ((qw4) obj).unknownFields;
        if (bwcVar.e) {
            bwcVar.e = false;
        }
        this.c.getClass();
        a82.x(obj);
        throw null;
    }

    @Override // defpackage.j0a
    public final boolean c(Object obj) {
        this.c.getClass();
        a82.x(obj);
        throw null;
    }

    @Override // defpackage.j0a
    public final qw4 d() {
        x2 x2Var = this.a;
        if (x2Var instanceof qw4) {
            return ((qw4) x2Var).j();
        }
        return ((kw4) ((qw4) x2Var).d(5)).b();
    }

    @Override // defpackage.j0a
    public final boolean e(qw4 qw4Var, qw4 qw4Var2) {
        this.b.getClass();
        if (!qw4Var.unknownFields.equals(qw4Var2.unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.j0a
    public final int f(qw4 qw4Var) {
        this.b.getClass();
        return qw4Var.unknownFields.hashCode();
    }

    @Override // defpackage.j0a
    public final void g(Object obj, vh1 vh1Var, z54 z54Var) {
        this.b.getClass();
        ewc.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.j0a
    public final int h(qw4 qw4Var) {
        this.b.getClass();
        bwc bwcVar = qw4Var.unknownFields;
        int i = bwcVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < bwcVar.a; i3++) {
            i2 += fl1.f(3, (c31) bwcVar.c[i3]) + fl1.i(bwcVar.b[i3] >>> 3) + fl1.h(2) + (fl1.h(1) * 2);
        }
        bwcVar.d = i2;
        return i2;
    }

    @Override // defpackage.j0a
    public final void i(Object obj, n07 n07Var) {
        this.c.getClass();
        a82.x(obj);
        throw null;
    }
}
