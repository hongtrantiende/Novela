package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ij3  reason: default package */
/* loaded from: classes.dex */
public final class ij3 extends aab implements mu4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij3(int i, int i2, m42 m42Var) {
        super(i, m42Var);
        this.a = i2;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                m82 m82Var = (m82) obj;
                long j = ((y78) obj2).a;
                new ij3(3, 0, (m42) obj3).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                m82 m82Var2 = (m82) obj;
                ((Number) obj2).floatValue();
                new ij3(3, 1, (m42) obj3).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                j59 j59Var = (j59) obj;
                long j2 = ((y78) obj2).a;
                new ij3(3, 2, (m42) obj3).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                hre.r(obj);
                return pvcVar;
            case 1:
                hre.r(obj);
                return pvcVar;
            default:
                hre.r(obj);
                return pvcVar;
        }
    }
}
