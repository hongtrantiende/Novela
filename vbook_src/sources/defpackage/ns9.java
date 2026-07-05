package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ns9  reason: default package */
/* loaded from: classes3.dex */
public final class ns9 extends b36 {
    public final f61 D;

    public ns9(f61 f61Var) {
        this.D = f61Var;
    }

    @Override // defpackage.b36
    public final boolean q() {
        return false;
    }

    @Override // defpackage.b36
    public final void r(Throwable th) {
        this.D.resumeWith(pvc.a);
    }
}
