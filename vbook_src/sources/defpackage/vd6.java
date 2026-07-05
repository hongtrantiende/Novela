package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vd6  reason: default package */
/* loaded from: classes.dex */
public final class vd6 implements c37 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ wd6 e;
    public final /* synthetic */ be6 f;
    public final /* synthetic */ xt4 g;

    public vd6(int i, int i2, Map map, xt4 xt4Var, wd6 wd6Var, be6 be6Var, xt4 xt4Var2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = xt4Var;
        this.e = wd6Var;
        this.f = be6Var;
        this.g = xt4Var2;
    }

    @Override // defpackage.c37
    public final void a() {
        vv5 vv5Var;
        od6 od6Var = this.f.a;
        boolean I0 = this.e.I0();
        xt4 xt4Var = this.g;
        if (I0 && (vv5Var = ((wv5) od6Var.c0.d).v0) != null) {
            xt4Var.invoke(vv5Var.L);
        } else {
            xt4Var.invoke(((wv5) od6Var.c0.d).L);
        }
    }

    @Override // defpackage.c37
    public final int d() {
        return this.b;
    }

    @Override // defpackage.c37
    public final int e() {
        return this.a;
    }

    @Override // defpackage.c37
    public final xt4 f() {
        return this.d;
    }

    @Override // defpackage.c37
    public final Map g() {
        return this.c;
    }
}
