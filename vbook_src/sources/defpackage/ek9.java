package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ek9  reason: default package */
/* loaded from: classes.dex */
public final class ek9 {
    public fk9 a;
    public int b;
    public lv4 c;
    public lu4 d;
    public int e;
    public gv7 f;
    public tv7 g;

    public ek9(fk9 fk9Var) {
        this.a = fk9Var;
    }

    public final boolean a() {
        boolean z;
        if (this.a != null) {
            lv4 lv4Var = this.c;
            if (lv4Var != null) {
                z = lv4Var.a();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final u16 b(Object obj) {
        u16 f;
        fk9 fk9Var = this.a;
        if (fk9Var != null && (f = fk9Var.f(this, obj)) != null) {
            return f;
        }
        return u16.a;
    }

    public final void c() {
        fk9 fk9Var = this.a;
        if (fk9Var != null) {
            fk9Var.c();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i;
        int i2 = this.b;
        if (z) {
            i = i2 | 32;
        } else {
            i = i2 & (-33);
        }
        this.b = i;
    }

    public final void e(lu4 lu4Var) {
        this.d = lu4Var;
    }
}
