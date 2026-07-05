package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vma  reason: default package */
/* loaded from: classes.dex */
public final class vma extends c3e {
    public final ux9 C;
    public final d89 D;
    public Object b;
    public Object c;
    public uv7 d;
    public uv7 e;
    public u8a f;

    public vma() {
        super(7);
        this.C = new ux9(this, 14);
        el7 el7Var = new el7(this, 17);
        dra.e(dra.a);
        synchronized (dra.c) {
            dra.h = sl1.o0(dra.h, el7Var);
        }
        this.D = new d89(el7Var, 4);
    }

    @Override // defpackage.c3e
    public final xt4 F(u8a u8aVar) {
        u8a u8aVar2 = this.f;
        if (u8aVar2 != null && !u8aVar2.equals(u8aVar)) {
            e39.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f = u8aVar;
        return this.C;
    }

    @Override // defpackage.c3e
    public final void G(ta1 ta1Var) {
        this.f = null;
        this.c = null;
        this.e = null;
        p();
    }

    @Override // defpackage.c3e
    public final void o(u8a u8aVar) {
        this.c = null;
        this.e = null;
    }

    @Override // defpackage.c3e
    public final void p() {
        synchronized (this.a) {
            try {
                this.b = this.c;
                if (this.e == null) {
                    this.d = null;
                } else {
                    if (this.d == null) {
                        uv7 uv7Var = uz9.a;
                        this.d = new uv7();
                    }
                    uv7 uv7Var2 = this.d;
                    this.d = this.e;
                    this.e = uv7Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.c3e
    public final void s() {
        this.D.a();
        this.c = null;
        this.e = null;
        synchronized (this.a) {
            this.f = null;
            this.b = null;
            this.d = null;
        }
    }
}
