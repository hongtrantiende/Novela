package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xb9  reason: default package */
/* loaded from: classes3.dex */
public final class xb9 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ zb9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb9(zb9 zb9Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = zb9Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        zb9 zb9Var = this.c;
        switch (i) {
            case 0:
                return new xb9(zb9Var, m42Var, 0);
            case 1:
                return new xb9(zb9Var, m42Var, 1);
            case 2:
                return new xb9(zb9Var, m42Var, 2);
            case 3:
                return new xb9(zb9Var, m42Var, 3);
            default:
                return new xb9(zb9Var, m42Var, 4);
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
                return ((xb9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((xb9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((xb9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((xb9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((xb9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
