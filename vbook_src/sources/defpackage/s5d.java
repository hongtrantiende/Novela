package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s5d  reason: default package */
/* loaded from: classes3.dex */
public final class s5d extends h2a {
    public iya v;

    @Override // defpackage.h2a
    public final boolean k() {
        return i().j.a();
    }

    @Override // defpackage.h2a
    public final pvc l(boolean z, y78 y78Var) {
        iya iyaVar = this.v;
        pvc pvcVar = pvc.a;
        if (iyaVar != null && iyaVar.isActive()) {
            return pvcVar;
        }
        m82 m82Var = this.b;
        iya iyaVar2 = null;
        if (m82Var != null) {
            iyaVar2 = z87.v(m82Var, null, null, new r5d(z, this, null, 0), 3);
        }
        this.v = iyaVar2;
        return pvcVar;
    }

    @Override // defpackage.h2a
    public final pvc m(boolean z, y78 y78Var) {
        iya iyaVar = this.v;
        pvc pvcVar = pvc.a;
        if (iyaVar != null && iyaVar.isActive()) {
            return pvcVar;
        }
        m82 m82Var = this.b;
        iya iyaVar2 = null;
        if (m82Var != null) {
            iyaVar2 = z87.v(m82Var, null, null, new r5d(z, this, null, 1), 3);
        }
        this.v = iyaVar2;
        return pvcVar;
    }

    @Override // defpackage.h2a
    public final void c() {
    }

    @Override // defpackage.h2a
    public final void b(float f, float f2) {
    }

    @Override // defpackage.h2a
    public final void p(float f, float f2) {
    }
}
