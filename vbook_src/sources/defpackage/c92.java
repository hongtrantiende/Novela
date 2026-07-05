package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c92  reason: default package */
/* loaded from: classes3.dex */
public final class c92 extends aa5 {
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c92(kj6 kj6Var, int i) {
        super(kj6Var);
        this.z = i;
    }

    @Override // defpackage.h2a
    public final void c() {
        iya iyaVar = null;
        switch (this.z) {
            case 0:
                this.v = false;
                lq a = tc4.a(e(), 0.01f);
                m82 m82Var = this.b;
                if (m82Var != null) {
                    iyaVar = z87.v(m82Var, null, null, new pf(this, a, (m42) null, 3), 3);
                }
                this.w = iyaVar;
                return;
            case 1:
                this.v = false;
                m82 m82Var2 = this.b;
                if (m82Var2 != null) {
                    z87.v(m82Var2, null, null, new o54(this, (m42) null, 23), 3);
                    return;
                }
                return;
            case 2:
                this.v = false;
                lq a2 = tc4.a(e(), 0.01f);
                m82 m82Var3 = this.b;
                if (m82Var3 != null) {
                    iyaVar = z87.v(m82Var3, null, null, new pf(this, a2, (m42) null, 14), 3);
                }
                this.w = iyaVar;
                return;
            default:
                this.v = false;
                lq a3 = tc4.a(e(), 0.01f);
                m82 m82Var4 = this.b;
                if (m82Var4 != null) {
                    iyaVar = z87.v(m82Var4, null, null, new pf(this, a3, (m42) null, 15), 3);
                }
                this.w = iyaVar;
                return;
        }
    }

    @Override // defpackage.aa5, defpackage.h2a
    public pvc l(boolean z, y78 y78Var) {
        int i = this.z;
        pvc pvcVar = pvc.a;
        iya iyaVar = null;
        switch (i) {
            case 2:
                if (g()) {
                    q();
                    m82 m82Var = this.b;
                    if (m82Var != null) {
                        iyaVar = z87.v(m82Var, ab3.a, null, new ema(z, this, null, 0), 2);
                    }
                    this.x = iyaVar;
                }
                return pvcVar;
            case 3:
                if (g()) {
                    q();
                    m82 m82Var2 = this.b;
                    if (m82Var2 != null) {
                        iyaVar = z87.v(m82Var2, ab3.a, null, new fpa(z, this, null, 0), 2);
                    }
                    this.x = iyaVar;
                }
                return pvcVar;
            default:
                return super.l(z, y78Var);
        }
    }

    @Override // defpackage.aa5, defpackage.h2a
    public pvc m(boolean z, y78 y78Var) {
        int i = this.z;
        pvc pvcVar = pvc.a;
        iya iyaVar = null;
        switch (i) {
            case 2:
                if (h()) {
                    q();
                    m82 m82Var = this.b;
                    if (m82Var != null) {
                        iyaVar = z87.v(m82Var, ab3.a, null, new ema(z, this, null, 1), 2);
                    }
                    this.x = iyaVar;
                }
                return pvcVar;
            case 3:
                if (h()) {
                    q();
                    m82 m82Var2 = this.b;
                    if (m82Var2 != null) {
                        iyaVar = z87.v(m82Var2, ab3.a, null, new fpa(z, this, null, 1), 2);
                    }
                    this.x = iyaVar;
                }
                return pvcVar;
            default:
                return super.m(z, y78Var);
        }
    }
}
