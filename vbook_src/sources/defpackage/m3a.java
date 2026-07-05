package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m3a  reason: default package */
/* loaded from: classes3.dex */
public final class m3a extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ o3a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3a(o3a o3aVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = o3aVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        o3a o3aVar = this.c;
        switch (i) {
            case 0:
                return new m3a(o3aVar, m42Var, 0);
            default:
                return new m3a(o3aVar, m42Var, 1);
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
                return ((m3a) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((m3a) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        o3a o3aVar = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                if (o3a.a(o3aVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                if (o3aVar.c(this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
