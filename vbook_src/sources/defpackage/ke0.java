package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ke0  reason: default package */
/* loaded from: classes.dex */
public final class ke0 implements r94 {
    public final /* synthetic */ int a;
    public final km8 b;
    public final rma c;

    public ke0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new km8(4);
                this.c = new rma(-1, -1, "image/webp");
                return;
            default:
                this.b = new km8(4);
                this.c = new rma(-1, -1, "image/avif");
                return;
        }
    }

    @Override // defpackage.r94
    public final void a() {
        int i = this.a;
    }

    @Override // defpackage.r94
    public final int b(s94 s94Var, fr2 fr2Var) {
        switch (this.a) {
            case 0:
                return this.c.b(s94Var, fr2Var);
            default:
                return this.c.b(s94Var, fr2Var);
        }
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        int i = this.a;
        km8 km8Var = this.b;
        switch (i) {
            case 0:
                tt2 tt2Var = (tt2) s94Var;
                tt2Var.b(4, false);
                km8Var.J(4);
                tt2Var.f(km8Var.a, 0, 4, false);
                if (km8Var.B() == 1718909296) {
                    km8Var.J(4);
                    tt2Var.f(km8Var.a, 0, 4, false);
                    if (km8Var.B() == 1635150182) {
                        return true;
                    }
                }
                return false;
            default:
                km8Var.J(4);
                tt2 tt2Var2 = (tt2) s94Var;
                tt2Var2.f(km8Var.a, 0, 4, false);
                if (km8Var.B() == 1380533830) {
                    tt2Var2.b(4, false);
                    km8Var.J(4);
                    tt2Var2.f(km8Var.a, 0, 4, false);
                    if (km8Var.B() == 1464156752) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                this.c.d(j, j2);
                return;
            default:
                this.c.d(j, j2);
                return;
        }
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        int i = this.a;
        rma rmaVar = this.c;
        switch (i) {
            case 0:
                rmaVar.f(t94Var);
                return;
            default:
                rmaVar.f(t94Var);
                return;
        }
    }

    private final void g() {
    }

    private final void h() {
    }
}
