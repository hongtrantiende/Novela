package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vt0  reason: default package */
/* loaded from: classes.dex */
public final class vt0 {
    public final lha a;
    public final tkc b;
    public final vt4 c;
    public final hm8 d;
    public final hm8 e;
    public lf4 f;
    public final hm8 g;

    public vt0(lha lhaVar, tkc tkcVar, pkc pkcVar, vt4 vt4Var) {
        aga agaVar = mue.e;
        this.a = lhaVar;
        this.b = tkcVar;
        this.c = vt4Var;
        this.d = yae.z(pkcVar);
        this.e = yae.z(agaVar);
        this.f = wt0.a;
        this.g = yae.z(null);
    }

    public final void a(rk9 rk9Var, rk9 rk9Var2, aga agaVar) {
        gxa v;
        if (this.a.b()) {
            hm8 hm8Var = this.g;
            if (((yya) hm8Var.getValue()) == null) {
                if (agaVar == null) {
                    agaVar = (aga) this.e.getValue();
                }
                switch (agaVar.a) {
                    case 0:
                        v = tte.v(nae.e, nae.e, 3, qed.a);
                        break;
                    default:
                        v = pha.a;
                        break;
                }
                this.f = v;
            }
            hm8Var.setValue(((pkc) this.d.getValue()).a(new jc(this, 9), null, null, new gp(2, this, rk9Var2, rk9Var)));
        }
    }

    public final boolean b() {
        return ((Boolean) this.b.d.getValue()).booleanValue();
    }

    public final rk9 c() {
        yya yyaVar;
        rk9 rk9Var;
        if (this.a.b() && (yyaVar = (yya) this.g.getValue()) != null && (rk9Var = (rk9) yyaVar.getValue()) != null) {
            long j = ((y78) this.c.invoke()).a;
            if (!y78.d(j, 0L)) {
                return rk9Var.o(j);
            }
            return rk9Var;
        }
        return null;
    }
}
