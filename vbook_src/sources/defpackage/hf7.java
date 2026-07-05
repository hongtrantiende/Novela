package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hf7  reason: default package */
/* loaded from: classes3.dex */
public final class hf7 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b93 b;
    public final /* synthetic */ aw7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hf7(b93 b93Var, aw7 aw7Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = b93Var;
        this.c = aw7Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        aw7 aw7Var = this.c;
        b93 b93Var = this.b;
        switch (i) {
            case 0:
                return new hf7(b93Var, aw7Var, m42Var, 0);
            default:
                return new hf7(b93Var, aw7Var, m42Var, 1);
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
                ((hf7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((hf7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.c;
        b93 b93Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                b93Var.j(((jub) aw7Var.getValue()).a.b);
                return pvcVar;
            default:
                hre.r(obj);
                b93Var.j(((jub) aw7Var.getValue()).a.b);
                return pvcVar;
        }
    }
}
