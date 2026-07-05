package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zla  reason: default package */
/* loaded from: classes3.dex */
public final class zla extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ bma d;
    public final /* synthetic */ y78 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zla(boolean z, bma bmaVar, y78 y78Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = z;
        this.d = bmaVar;
        this.e = y78Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new zla(this.c, this.d, this.e, m42Var, 0);
            default:
                return new zla(this.c, this.d, this.e, m42Var, 1);
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
                return ((zla) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((zla) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r6.a(r14) == r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00eb, code lost:
        if (r6.a(r14) == r5) goto L52;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zla.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
