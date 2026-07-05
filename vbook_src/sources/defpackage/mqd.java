package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mqd  reason: default package */
/* loaded from: classes3.dex */
public final class mqd extends aab implements lu4 {
    public final /* synthetic */ int a = 1;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqd(atd atdVar, y78 y78Var, z09 z09Var, m42 m42Var) {
        super(2, m42Var);
        this.c = atdVar;
        this.d = y78Var;
        this.e = z09Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                mqd mqdVar = new mqd((nqd) obj2, m42Var);
                mqdVar.e = obj;
                return mqdVar;
            default:
                return new mqd((atd) this.c, (y78) obj2, (z09) this.e, m42Var);
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
                return ((mqd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((mqd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014d  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqd(nqd nqdVar, m42 m42Var) {
        super(2, m42Var);
        this.d = nqdVar;
    }
}
