package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iw4  reason: default package */
/* loaded from: classes.dex */
public abstract class iw4 implements Cloneable {
    public final ow4 a;
    public ow4 b;

    public iw4(ow4 ow4Var) {
        this.a = ow4Var;
        if (!ow4Var.f()) {
            this.b = ow4Var.h();
        } else {
            vs.m("Default instance must be immutable.");
            throw null;
        }
    }

    public static void d(Object obj, Object obj2) {
        w89 w89Var = w89.c;
        w89Var.getClass();
        w89Var.a(obj.getClass()).a(obj, obj2);
    }

    public final ow4 a() {
        ow4 b = b();
        b.getClass();
        if (ow4.e(b, true)) {
            return b;
        }
        throw new lvc();
    }

    public final ow4 b() {
        boolean f = this.b.f();
        ow4 ow4Var = this.b;
        if (!f) {
            return ow4Var;
        }
        ow4Var.getClass();
        w89 w89Var = w89.c;
        w89Var.getClass();
        w89Var.a(ow4Var.getClass()).b(ow4Var);
        ow4Var.g();
        return this.b;
    }

    public final void c() {
        if (!this.b.f()) {
            ow4 h = this.a.h();
            d(h, this.b);
            this.b = h;
        }
    }

    public final Object clone() {
        iw4 iw4Var = (iw4) this.a.b(5);
        iw4Var.b = b();
        return iw4Var;
    }
}
