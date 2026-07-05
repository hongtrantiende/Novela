package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hb7  reason: default package */
/* loaded from: classes.dex */
public final class hb7 implements h0a {
    public final w2 a;
    public final cwc b;
    public final n74 c;

    public hb7(cwc cwcVar, n74 n74Var, w2 w2Var) {
        this.b = cwcVar;
        n74Var.getClass();
        this.c = n74Var;
        this.a = w2Var;
    }

    @Override // defpackage.h0a
    public final void a(Object obj, Object obj2) {
        m0a.k(this.b, obj, obj2);
    }

    @Override // defpackage.h0a
    public final void b(Object obj) {
        this.b.getClass();
        zvc zvcVar = ((ow4) obj).unknownFields;
        if (zvcVar.e) {
            zvcVar.e = false;
        }
        this.c.getClass();
        a82.x(obj);
        throw null;
    }

    @Override // defpackage.h0a
    public final boolean c(Object obj) {
        this.c.getClass();
        a82.x(obj);
        throw null;
    }

    @Override // defpackage.h0a
    public final ow4 d() {
        w2 w2Var = this.a;
        if (w2Var instanceof ow4) {
            return ((ow4) w2Var).h();
        }
        return ((iw4) ((ow4) w2Var).b(5)).b();
    }

    @Override // defpackage.h0a
    public final int e(ow4 ow4Var) {
        this.b.getClass();
        zvc zvcVar = ow4Var.unknownFields;
        int i = zvcVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < zvcVar.a; i3++) {
            i2 += el1.f(3, (a31) zvcVar.c[i3]) + el1.i(zvcVar.b[i3] >>> 3) + el1.h(2) + (el1.h(1) * 2);
        }
        zvcVar.d = i2;
        return i2;
    }

    @Override // defpackage.h0a
    public final int f(ow4 ow4Var) {
        this.b.getClass();
        return ow4Var.unknownFields.hashCode();
    }

    @Override // defpackage.h0a
    public final void g(Object obj, fz4 fz4Var) {
        this.c.getClass();
        a82.x(obj);
        throw null;
    }

    @Override // defpackage.h0a
    public final boolean h(ow4 ow4Var, ow4 ow4Var2) {
        this.b.getClass();
        if (!ow4Var.unknownFields.equals(ow4Var2.unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.h0a
    public final void i(Object obj, vh1 vh1Var, x54 x54Var) {
        this.b.getClass();
        cwc.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
