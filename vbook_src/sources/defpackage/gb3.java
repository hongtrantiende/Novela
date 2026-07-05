package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gb3  reason: default package */
/* loaded from: classes3.dex */
public final class gb3 implements bn9 {
    public final xt4 a;
    public hb3 b;

    public gb3(xt4 xt4Var) {
        this.a = xt4Var;
    }

    @Override // defpackage.bn9
    public final void b() {
        hb3 hb3Var = this.b;
        if (hb3Var != null) {
            hb3Var.a();
        }
        this.b = null;
    }

    @Override // defpackage.bn9
    public final void c() {
        this.b = (hb3) this.a.invoke(yte.c);
    }

    @Override // defpackage.bn9
    public final void a() {
    }
}
