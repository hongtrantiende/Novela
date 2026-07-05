package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x76  reason: default package */
/* loaded from: classes3.dex */
public final class x76 implements t76 {
    public final t76 a;

    public x76(t76 t76Var) {
        t76Var.getClass();
        this.a = t76Var;
    }

    @Override // defpackage.t76
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.t76
    public final List b() {
        return this.a.b();
    }

    @Override // defpackage.t76
    public final w66 e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        x76 x76Var;
        t76 t76Var;
        t76 t76Var2;
        if (obj == null) {
            return false;
        }
        w66 w66Var = null;
        if (obj instanceof x76) {
            x76Var = (x76) obj;
        } else {
            x76Var = null;
        }
        if (x76Var != null) {
            t76Var = x76Var.a;
        } else {
            t76Var = null;
        }
        t76 t76Var3 = this.a;
        if (!c16.i(t76Var3, t76Var)) {
            return false;
        }
        w66 e = t76Var3.e();
        if (e instanceof gi1) {
            if (obj instanceof t76) {
                t76Var2 = (t76) obj;
            } else {
                t76Var2 = null;
            }
            if (t76Var2 != null) {
                w66Var = t76Var2.e();
            }
            if (w66Var != null && (w66Var instanceof gi1)) {
                return nmd.B((gi1) e).equals(nmd.B((gi1) w66Var));
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}
