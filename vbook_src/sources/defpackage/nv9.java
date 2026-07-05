package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nv9  reason: default package */
/* loaded from: classes.dex */
public final class nv9 implements m42 {
    public final mv9 a;
    public final /* synthetic */ zl9 b;
    public final /* synthetic */ vl9 c;
    public final /* synthetic */ zl9 d;

    public nv9(xl9 xl9Var, zl9 zl9Var, vl9 vl9Var, zl9 zl9Var2) {
        this.b = zl9Var;
        this.c = vl9Var;
        this.d = zl9Var2;
        this.a = new mv9(xl9Var);
    }

    @Override // defpackage.m42
    public final d82 getContext() {
        return this.a;
    }

    @Override // defpackage.m42
    public final void resumeWith(Object obj) {
        Throwable a = hs9.a(obj);
        vl9 vl9Var = this.c;
        if (a != null) {
            this.b.a = a;
            vl9Var.a = true;
            a.printStackTrace();
            return;
        }
        hre.r(obj);
        if (obj == null) {
            obj = pvc.a;
        }
        this.d.a = obj;
        vl9Var.a = true;
    }
}
