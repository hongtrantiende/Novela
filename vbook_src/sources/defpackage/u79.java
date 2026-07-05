package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u79  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class u79 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b89 b;

    public /* synthetic */ u79(b89 b89Var, int i) {
        this.a = i;
        this.b = b89Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b89 b89Var = this.b;
        switch (i) {
            case 0:
                b89Var.g0 = true;
                return;
            case 1:
                b89Var.A();
                return;
            default:
                if (!b89Var.m0) {
                    m57 m57Var = b89Var.N;
                    m57Var.getClass();
                    m57Var.d(b89Var);
                    return;
                }
                return;
        }
    }
}
