package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d37  reason: default package */
/* loaded from: classes.dex */
public final class d37 implements c37 {
    public final int a;
    public final int b;
    public final Map c;
    public final jc d;
    public final y0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ e37 g;
    public final /* synthetic */ dg h;

    public d37(int i, int i2, Map map, jc jcVar, y0 y0Var, e37 e37Var, dg dgVar) {
        this.f = i;
        this.g = e37Var;
        this.h = dgVar;
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = jcVar;
        this.e = y0Var;
    }

    @Override // defpackage.c37
    public final void a() {
        e37 e37Var = this.g;
        boolean z = e37Var instanceof ry6;
        dg dgVar = this.h;
        if (z) {
            dgVar.invoke(((ry6) e37Var).L);
            return;
        }
        dgVar.invoke(new wla(this.f, e37Var.getLayoutDirection(), e37Var.f(), e37Var.G0()));
    }

    @Override // defpackage.c37
    public final xt4 b() {
        return this.d;
    }

    @Override // defpackage.c37
    public final lu4 c() {
        return this.e;
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
    public final Map g() {
        return this.c;
    }
}
