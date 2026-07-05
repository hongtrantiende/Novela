package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zo9  reason: default package */
/* loaded from: classes3.dex */
public final class zo9 implements rn6 {
    public final /* synthetic */ lu4 C;
    public final /* synthetic */ jn6 a;
    public final /* synthetic */ zl9 b;
    public final /* synthetic */ m82 c;
    public final /* synthetic */ jn6 d;
    public final /* synthetic */ f61 e;
    public final /* synthetic */ sw7 f;

    public zo9(jn6 jn6Var, zl9 zl9Var, m82 m82Var, jn6 jn6Var2, f61 f61Var, sw7 sw7Var, lu4 lu4Var) {
        this.a = jn6Var;
        this.b = zl9Var;
        this.c = m82Var;
        this.d = jn6Var2;
        this.e = f61Var;
        this.f = sw7Var;
        this.C = lu4Var;
    }

    @Override // defpackage.rn6
    public final void C(un6 un6Var, jn6 jn6Var) {
        jn6 jn6Var2 = this.a;
        zl9 zl9Var = this.b;
        if (jn6Var == jn6Var2) {
            zl9Var.a = z87.v(this.c, null, null, new z45(16, (m42) null, (Object) this.f, (Object) this.C, false), 3);
            return;
        }
        if (jn6Var == this.d) {
            w26 w26Var = (w26) zl9Var.a;
            if (w26Var != null) {
                w26Var.cancel(null);
            }
            zl9Var.a = null;
        }
        if (jn6Var == jn6.ON_DESTROY) {
            this.e.resumeWith(pvc.a);
        }
    }
}
