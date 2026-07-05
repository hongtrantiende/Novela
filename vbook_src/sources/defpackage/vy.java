package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vy  reason: default package */
/* loaded from: classes.dex */
public final class vy implements c37 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final Map d;
    public final xt4 e;
    public final /* synthetic */ xt4 f;
    public final /* synthetic */ e37 g;

    public /* synthetic */ vy(int i, int i2, Map map, xt4 xt4Var, xt4 xt4Var2, e37 e37Var, int i3) {
        this.a = i3;
        this.f = xt4Var2;
        this.g = e37Var;
        this.b = i;
        this.c = i2;
        this.d = map;
        this.e = xt4Var;
    }

    @Override // defpackage.c37
    public final void a() {
        int i = this.a;
        e37 e37Var = this.g;
        xt4 xt4Var = this.f;
        switch (i) {
            case 0:
                xt4Var.invoke(((wy) e37Var).a.L);
                return;
            default:
                xt4Var.invoke(((ry6) e37Var).L);
                return;
        }
    }

    @Override // defpackage.c37
    public final int d() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    @Override // defpackage.c37
    public final int e() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    @Override // defpackage.c37
    public final xt4 f() {
        switch (this.a) {
            case 0:
                return this.e;
            default:
                return this.e;
        }
    }

    @Override // defpackage.c37
    public final Map g() {
        switch (this.a) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }
}
