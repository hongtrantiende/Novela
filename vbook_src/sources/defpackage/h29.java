package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h29  reason: default package */
/* loaded from: classes.dex */
public final class h29 extends fb6 implements vt4 {
    public final /* synthetic */ yl9 a;
    public final /* synthetic */ i29 b;
    public final /* synthetic */ uy5 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h29(yl9 yl9Var, i29 i29Var, uy5 uy5Var, long j, long j2) {
        super(0);
        this.a = yl9Var;
        this.b = i29Var;
        this.c = uy5Var;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        i29 i29Var = this.b;
        this.a.a = i29Var.getPositionProvider().g(this.c, this.d, i29Var.getParentLayoutDirection(), this.e);
        return pvc.a;
    }
}
