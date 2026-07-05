package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vn0  reason: default package */
/* loaded from: classes.dex */
public final class vn0 implements r94 {
    public final /* synthetic */ int a;
    public final r94 b;

    public vn0(int i, byte b) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new rma(35152, 2, "image/png");
                return;
            default:
                this.b = new rma(16973, 2, "image/bmp");
                return;
        }
    }

    @Override // defpackage.r94
    public final void a() {
        switch (this.a) {
            case 0:
            case 1:
                return;
            default:
                this.b.a();
                return;
        }
    }

    @Override // defpackage.r94
    public final int b(s94 s94Var, fr2 fr2Var) {
        int i = this.a;
        r94 r94Var = this.b;
        switch (i) {
            case 0:
                return ((rma) r94Var).b(s94Var, fr2Var);
            case 1:
                return ((rma) r94Var).b(s94Var, fr2Var);
            default:
                return r94Var.b(s94Var, fr2Var);
        }
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        int i = this.a;
        r94 r94Var = this.b;
        switch (i) {
            case 0:
                return ((rma) r94Var).c(s94Var);
            case 1:
                return ((rma) r94Var).c(s94Var);
            default:
                return r94Var.c(s94Var);
        }
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        int i = this.a;
        r94 r94Var = this.b;
        switch (i) {
            case 0:
                ((rma) r94Var).d(j, j2);
                return;
            case 1:
                ((rma) r94Var).d(j, j2);
                return;
            default:
                r94Var.d(j, j2);
                return;
        }
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        int i = this.a;
        r94 r94Var = this.b;
        switch (i) {
            case 0:
                ((rma) r94Var).f(t94Var);
                return;
            case 1:
                ((rma) r94Var).f(t94Var);
                return;
            default:
                r94Var.f(t94Var);
                return;
        }
    }

    private final void g() {
    }

    private final void h() {
    }

    public vn0(int i) {
        this.a = 2;
        if ((i & 1) != 0) {
            this.b = new rma(65496, 2, "image/jpeg");
        } else {
            this.b = new p36();
        }
    }
}
