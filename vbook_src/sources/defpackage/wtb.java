package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wtb  reason: default package */
/* loaded from: classes.dex */
public final class wtb extends aab implements lu4 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ytb b;
    public final /* synthetic */ d19 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtb(ytb ytbVar, d19 d19Var, boolean z, m42 m42Var) {
        super(2, m42Var);
        this.b = ytbVar;
        this.c = d19Var;
        this.d = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        wtb wtbVar = new wtb(this.b, this.c, this.d, m42Var);
        wtbVar.a = obj;
        return wtbVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((wtb) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        hre.r(obj);
        m82 m82Var = (m82) this.a;
        ytb ytbVar = this.b;
        d19 d19Var = this.c;
        srb srbVar = new srb(ytbVar, d19Var, null, 4);
        p82 p82Var = p82.d;
        z87.v(m82Var, null, p82Var, srbVar, 1);
        boolean z = this.d;
        z87.v(m82Var, null, p82Var, new vtb(d19Var, ytbVar, z, (m42) null), 1).invokeOnCompletion(new cj0(ytbVar, 2));
        return z87.v(m82Var, null, p82Var, new vtb(ytbVar, d19Var, z, (m42) null), 1);
    }
}
