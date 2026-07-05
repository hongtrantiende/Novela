package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z4b  reason: default package */
/* loaded from: classes.dex */
public abstract class z4b extends ex3 {
    public final ex3 a;
    public boolean b;
    public final rwa c;

    public z4b(ex3 ex3Var) {
        ex3Var.getClass();
        this.a = ex3Var;
        this.b = ex3Var.f();
        this.c = new rwa(new n3b(22));
    }

    @Override // defpackage.ex3
    public boolean b(cp3 cp3Var, cp3 cp3Var2) {
        cp3Var.getClass();
        cp3Var2.getClass();
        return g(cp3Var, cp3Var2);
    }

    @Override // defpackage.ex3
    public final boolean c(cp3 cp3Var, al6 al6Var) {
        cp3Var.getClass();
        al6Var.getClass();
        return g(cp3Var, al6Var);
    }

    @Override // defpackage.ex3
    public void e() {
        ((gl5) this.c.k()).clear();
        this.a.e();
    }

    @Override // defpackage.ex3
    public final boolean f() {
        return this.b;
    }

    public abstract boolean g(cp3 cp3Var, y28 y28Var);

    public final boolean h(cp3 cp3Var, y28 y28Var) {
        cp3Var.getClass();
        y28Var.getClass();
        gl5 gl5Var = (gl5) this.c.k();
        Object obj = gl5Var.get(cp3Var);
        if (obj == null) {
            obj = new gl5();
            gl5Var.put(cp3Var, obj);
        }
        gl5 gl5Var2 = (gl5) obj;
        Object obj2 = gl5Var2.get(y28Var);
        if (obj2 == null) {
            obj2 = Boolean.valueOf(this.a.d(cp3Var, y28Var));
            gl5Var2.put(y28Var, obj2);
        }
        return ((Boolean) obj2).booleanValue();
    }
}
