package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zk6  reason: default package */
/* loaded from: classes.dex */
public final class zk6 implements oid {
    public vt4 a;
    public hm8 b;
    public final hm8 c = yae.z(Boolean.FALSE);

    public final long a() {
        f23 f23Var;
        if (this.b == null) {
            vt4 vt4Var = this.a;
            if (vt4Var == null || (f23Var = (f23) vt4Var.invoke()) == null) {
                f23Var = f23.c;
            }
            this.b = yae.z(f23Var);
            this.a = null;
        }
        hm8 hm8Var = this.b;
        hm8Var.getClass();
        return ((f23) hm8Var.getValue()).b;
    }

    public final long b() {
        f23 f23Var;
        if (this.b == null) {
            vt4 vt4Var = this.a;
            if (vt4Var == null || (f23Var = (f23) vt4Var.invoke()) == null) {
                f23Var = f23.c;
            }
            this.b = yae.z(f23Var);
            this.a = null;
        }
        hm8 hm8Var = this.b;
        hm8Var.getClass();
        return ((f23) hm8Var.getValue()).a;
    }

    public final boolean c() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }
}
