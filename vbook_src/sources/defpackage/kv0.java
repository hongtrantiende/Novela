package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kv0  reason: default package */
/* loaded from: classes.dex */
public final class kv0 extends te0 {
    public f61 a;
    public xt4 b;

    @Override // defpackage.te0
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // defpackage.te0
    public final void b(Throwable th) {
        f61 f61Var = this.a;
        if (f61Var != null) {
            f61Var.resumeWith(hre.i(th));
        }
    }
}
