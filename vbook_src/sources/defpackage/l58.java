package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l58  reason: default package */
/* loaded from: classes3.dex */
public final class l58 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ n58 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l58(n58 n58Var, boolean z, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = n58Var;
        this.d = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        boolean z = this.d;
        n58 n58Var = this.c;
        switch (i) {
            case 0:
                return new l58(n58Var, z, m42Var, 0);
            case 1:
                return new l58(n58Var, z, m42Var, 1);
            case 2:
                return new l58(n58Var, z, m42Var, 2);
            default:
                return new l58(n58Var, z, m42Var, 3);
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
                return ((l58) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((l58) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((l58) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((l58) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l58.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
