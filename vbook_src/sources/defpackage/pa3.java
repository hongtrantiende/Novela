package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pa3  reason: default package */
/* loaded from: classes.dex */
public final class pa3 implements AutoCloseable {
    public final oa3 a;
    public boolean b;
    public final /* synthetic */ ra3 c;

    public pa3(ra3 ra3Var, oa3 oa3Var) {
        this.c = ra3Var;
        this.a = oa3Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.b) {
            this.b = true;
            ra3 ra3Var = this.c;
            synchronized (ra3Var.D) {
                oa3 oa3Var = this.a;
                int i = oa3Var.h - 1;
                oa3Var.h = i;
                if (i == 0 && oa3Var.f) {
                    ra3Var.m0(oa3Var);
                }
            }
        }
    }
}
