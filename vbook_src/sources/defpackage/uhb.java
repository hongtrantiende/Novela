package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uhb  reason: default package */
/* loaded from: classes3.dex */
public final class uhb extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ vhb c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhb(String str, vhb vhbVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 0;
        this.d = str;
        this.c = vhbVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        String str = this.d;
        vhb vhbVar = this.c;
        switch (i) {
            case 0:
                return new uhb(str, vhbVar, m42Var);
            case 1:
                return new uhb(vhbVar, str, m42Var, 1);
            default:
                return new uhb(vhbVar, str, m42Var, 2);
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
                return ((uhb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((uhb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((uhb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0140 A[LOOP:1: B:47:0x0140->B:48:0x0162, LOOP_START] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uhb(vhb vhbVar, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = vhbVar;
        this.d = str;
    }
}
