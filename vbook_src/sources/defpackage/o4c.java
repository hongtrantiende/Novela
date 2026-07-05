package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o4c  reason: default package */
/* loaded from: classes3.dex */
public final class o4c extends aab implements lu4 {
    public final /* synthetic */ int a;
    public co4 b;
    public int c;
    public final /* synthetic */ y5c d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4c(y5c y5cVar, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = y5cVar;
        this.e = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new o4c(this.d, this.e, m42Var, 0);
            default:
                return new o4c(this.d, this.e, m42Var, 1);
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
                return ((o4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((o4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cf A[LOOP:3: B:58:0x01cf->B:59:0x01e6, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ec A[LOOP:4: B:62:0x01ec->B:63:0x0247, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0249  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r51) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o4c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
