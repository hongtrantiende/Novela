package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ds2  reason: default package */
/* loaded from: classes3.dex */
public final class ds2 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ es2 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ds2(es2 es2Var, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = es2Var;
        this.c = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        String str = this.c;
        es2 es2Var = this.b;
        switch (i) {
            case 0:
                return new ds2(es2Var, str, m42Var, 0);
            default:
                return new ds2(es2Var, str, m42Var, 1);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                ((ds2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((ds2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        String str = this.c;
        es2 es2Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                es2Var.h(es2Var.f, new vr2(str));
                return pvcVar;
            default:
                hre.r(obj);
                es2Var.h(es2Var.f, new wr2(str));
                return pvcVar;
        }
    }
}
