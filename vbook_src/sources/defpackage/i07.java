package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i07  reason: default package */
/* loaded from: classes.dex */
public final class i07 extends h6 {
    public final i6 a;

    public i07(i6 i6Var, aw7 aw7Var) {
        this.a = i6Var;
    }

    @Override // defpackage.h6
    public final void a(Object obj) {
        o6 o6Var = this.a.a;
        if (o6Var != null) {
            o6Var.a(obj);
        } else {
            vs.k("Launcher has not been initialized");
        }
    }

    @Override // defpackage.h6
    public final void b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
