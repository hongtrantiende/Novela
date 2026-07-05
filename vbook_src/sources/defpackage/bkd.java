package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bkd  reason: default package */
/* loaded from: classes.dex */
public final class bkd implements rh8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rh8 b;
    public final /* synthetic */ rh8 c;

    public /* synthetic */ bkd(rh8 rh8Var, rh8 rh8Var2, int i) {
        this.a = i;
        this.b = rh8Var;
        this.c = rh8Var2;
    }

    @Override // defpackage.rh8
    public final float a() {
        int i = this.a;
        rh8 rh8Var = this.c;
        rh8 rh8Var2 = this.b;
        switch (i) {
            case 0:
                return rh8Var2.a() - ((th8) rh8Var).d;
            default:
                return rh8Var.a() + rh8Var2.a();
        }
    }

    @Override // defpackage.rh8
    public final float b(tc6 tc6Var) {
        int i = this.a;
        rh8 rh8Var = this.c;
        rh8 rh8Var2 = this.b;
        tc6Var.getClass();
        switch (i) {
            case 0:
                return rh8Var2.b(tc6Var) - ((th8) rh8Var).b(tc6Var);
            default:
                return rh8Var.b(tc6Var) + rh8Var2.b(tc6Var);
        }
    }

    @Override // defpackage.rh8
    public final float c(tc6 tc6Var) {
        int i = this.a;
        rh8 rh8Var = this.c;
        rh8 rh8Var2 = this.b;
        tc6Var.getClass();
        switch (i) {
            case 0:
                return rh8Var2.c(tc6Var) - ((th8) rh8Var).c(tc6Var);
            default:
                return rh8Var.c(tc6Var) + rh8Var2.c(tc6Var);
        }
    }

    @Override // defpackage.rh8
    public final float d() {
        int i = this.a;
        rh8 rh8Var = this.c;
        rh8 rh8Var2 = this.b;
        switch (i) {
            case 0:
                return rh8Var2.d() - ((th8) rh8Var).b;
            default:
                return rh8Var.d() + rh8Var2.d();
        }
    }
}
