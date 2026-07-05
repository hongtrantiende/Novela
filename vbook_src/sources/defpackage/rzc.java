package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rzc  reason: default package */
/* loaded from: classes3.dex */
public final class rzc extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rzc(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new rzc((szc) obj2, m42Var, 0);
            case 1:
                return new rzc((g0d) obj2, m42Var, 1);
            case 2:
                return new rzc((x0d) obj2, m42Var, 2);
            case 3:
                return new rzc((yh) obj2, m42Var, 3);
            case 4:
                return new rzc((dx4) obj2, m42Var, 4);
            case 5:
                return new rzc((at1) obj2, m42Var, 5);
            case 6:
                return new rzc((eod) obj2, m42Var, 6);
            case 7:
                return new rzc((lrd) obj2, m42Var, 7);
            default:
                return new rzc((lsd) obj2, m42Var, 8);
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
                return ((rzc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((rzc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((rzc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((rzc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((rzc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 5:
                return ((rzc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 6:
                return ((rzc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 7:
                return ((rzc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((rzc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rzc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
