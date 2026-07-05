package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l85  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class l85 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj8 b;
    public final /* synthetic */ m82 c;

    public /* synthetic */ l85(m82 m82Var, rj8 rj8Var) {
        this.a = 0;
        this.c = m82Var;
        this.b = rj8Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        boolean z = false;
        m82 m82Var = this.c;
        rj8 rj8Var = this.b;
        switch (i) {
            case 0:
                z87.v(m82Var, null, null, new r85(0, null, rj8Var), 3);
                return pvc.a;
            case 1:
                if (rj8Var.b()) {
                    z87.v(m82Var, null, null, new r85(1, null, rj8Var), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                if (rj8Var.c()) {
                    z87.v(m82Var, null, null, new r85(2, null, rj8Var), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                if (rj8Var.b()) {
                    z87.v(m82Var, null, null, new r85(1, null, rj8Var), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (rj8Var.c()) {
                    z87.v(m82Var, null, null, new r85(2, null, rj8Var), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ l85(int i, m82 m82Var, rj8 rj8Var) {
        this.a = i;
        this.b = rj8Var;
        this.c = m82Var;
    }
}
