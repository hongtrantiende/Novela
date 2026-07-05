package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ex3  reason: default package */
/* loaded from: classes.dex */
public abstract class ex3 {
    public int a() {
        return 5;
    }

    public abstract boolean b(cp3 cp3Var, cp3 cp3Var2);

    public boolean c(cp3 cp3Var, al6 al6Var) {
        cp3Var.getClass();
        al6Var.getClass();
        return false;
    }

    public final boolean d(cp3 cp3Var, y28 y28Var) {
        cp3Var.getClass();
        y28Var.getClass();
        if (y28Var instanceof cp3) {
            return b(cp3Var, (cp3) y28Var);
        }
        if ((y28Var instanceof al6) && f()) {
            return c(cp3Var, (al6) y28Var);
        }
        return false;
    }

    public boolean f() {
        return false;
    }

    public void e() {
    }
}
