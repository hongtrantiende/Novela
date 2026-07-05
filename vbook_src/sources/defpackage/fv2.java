package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fv2  reason: default package */
/* loaded from: classes3.dex */
public final class fv2 implements cp6 {
    public final jw0 a;
    public final cp6 b;
    public final ea3 c;

    public fv2(jw0 jw0Var, bp6 bp6Var, ea3 ea3Var) {
        bp6Var.getClass();
        this.a = jw0Var;
        this.b = bp6Var;
        this.c = ea3Var;
    }

    @Override // defpackage.cp6
    public final void a(xp6 xp6Var) {
        xp6Var.getClass();
        if (!((qo3) this.c.invoke()).e || !((sp6) this.a.invoke()).a) {
            return;
        }
        this.b.a(xp6Var);
    }

    @Override // defpackage.cp6
    public final cq6 b(xp6 xp6Var, String str, String str2) {
        xp6Var.getClass();
        str.getClass();
        if (((qo3) this.c.invoke()).e && ((sp6) this.a.invoke()).a) {
            return this.b.b(xp6Var, str, str2);
        }
        String obj = k4b.N0(str).toString();
        if (obj.length() == 0) {
            return new aq6();
        }
        if (!k4b.V(obj, "://", false)) {
            obj = "https://".concat(obj);
        }
        return new bq6(obj);
    }
}
