package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jw4  reason: default package */
/* loaded from: classes.dex */
public abstract class jw4 implements Cloneable {
    public final pw4 a;
    public pw4 b;

    public jw4(pw4 pw4Var) {
        this.a = pw4Var;
        if (!pw4Var.e()) {
            this.b = pw4Var.f();
        } else {
            vs.m("Default instance must be immutable.");
            throw null;
        }
    }

    public final pw4 a() {
        boolean e = this.b.e();
        pw4 pw4Var = this.b;
        if (!e) {
            return pw4Var;
        }
        pw4Var.getClass();
        y89 y89Var = y89.c;
        y89Var.getClass();
        y89Var.a(pw4Var.getClass()).b(pw4Var);
        pw4Var.b &= Integer.MAX_VALUE;
        return this.b;
    }

    public final Object clone() {
        jw4 jw4Var = (jw4) this.a.a(5);
        jw4Var.b = a();
        return jw4Var;
    }
}
