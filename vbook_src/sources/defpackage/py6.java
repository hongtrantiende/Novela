package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: py6  reason: default package */
/* loaded from: classes.dex */
public final class py6 extends fb6 implements vt4 {
    public final /* synthetic */ ry6 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ow8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py6(ry6 ry6Var, long j, long j2, ow8 ow8Var) {
        super(0);
        this.a = ry6Var;
        this.b = j;
        this.c = j2;
        this.d = ow8Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        ry6 ry6Var = this.a;
        ry6Var.i1().a = false;
        ry6Var.i1().b = this.b;
        ry6Var.i1().c = this.c;
        xt4 f = this.d.a.f();
        if (f != null) {
            f.invoke(ry6Var.i1());
        }
        return pvc.a;
    }
}
