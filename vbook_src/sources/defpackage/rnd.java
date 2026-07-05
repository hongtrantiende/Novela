package defpackage;

import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rnd  reason: default package */
/* loaded from: classes.dex */
public final class rnd implements ox1, rn6 {
    public final rg a;
    public final ux1 b;
    public boolean c;
    public xn6 d;
    public lu4 e = uv1.a;

    public rnd(rg rgVar, ux1 ux1Var) {
        this.a = rgVar;
        this.b = ux1Var;
    }

    @Override // defpackage.rn6
    public final void C(un6 un6Var, jn6 jn6Var) {
        if (jn6Var == jn6.ON_DESTROY) {
            a();
        } else if (jn6Var == jn6.ON_CREATE && !this.c) {
            b(this.e);
        }
    }

    @Override // defpackage.ox1
    public final void a() {
        if (!this.c) {
            this.c = true;
            this.a.getView().setTag(R.id.wrapped_composition_tag, null);
            xn6 xn6Var = this.d;
            if (xn6Var != null) {
                xn6Var.f(this);
            }
            this.d = null;
        }
        this.b.a();
    }

    public final void b(lu4 lu4Var) {
        this.a.setOnReadyForComposition(new jk(16, this, lu4Var));
    }
}
