package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vdb  reason: default package */
/* loaded from: classes3.dex */
public final class vdb extends aab implements xt4 {
    public final /* synthetic */ boolean C;
    public final /* synthetic */ xt4 D;
    public int a;
    public final /* synthetic */ heb b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdb(heb hebVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, xt4 xt4Var, m42 m42Var) {
        super(1, m42Var);
        this.b = hebVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.C = z5;
        this.D = xt4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        return new vdb(this.b, this.c, this.d, this.e, this.f, this.C, this.D, m42Var);
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        return ((vdb) create((m42) obj)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return obj;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        xcb xcbVar = this.b.b;
        this.a = 1;
        Object d = xcbVar.c.d(this.c, this.d, this.e, this.f, this.C, this.D, this);
        n82 n82Var = n82.a;
        if (d == n82Var) {
            return n82Var;
        }
        return d;
    }
}
