package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yg7  reason: default package */
/* loaded from: classes3.dex */
public final class yg7 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zm4 b;
    public final /* synthetic */ bsa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yg7(zm4 zm4Var, bsa bsaVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = zm4Var;
        this.c = bsaVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new yg7(this.b, this.c, m42Var, 0);
            default:
                return new yg7(this.b, this.c, m42Var, 1);
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
                ((yg7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((yg7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        bsa bsaVar = this.c;
        zm4 zm4Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                zm4.a(zm4Var);
                if (bsaVar != null) {
                    ((w03) bsaVar).b();
                }
                return pvcVar;
            default:
                hre.r(obj);
                zm4.a(zm4Var);
                if (bsaVar != null) {
                    ((w03) bsaVar).b();
                }
                return pvcVar;
        }
    }
}
