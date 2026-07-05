package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: is8  reason: default package */
/* loaded from: classes3.dex */
public final class is8 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss8 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ is8(int i, int i2, m42 m42Var, ss8 ss8Var) {
        super(2, m42Var);
        this.a = i2;
        this.b = ss8Var;
        this.c = i;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        ss8 ss8Var = this.b;
        switch (i) {
            case 0:
                return new is8(this.c, 0, m42Var, ss8Var);
            case 1:
                return new is8(this.c, 1, m42Var, ss8Var);
            case 2:
                return new is8(this.c, 2, m42Var, ss8Var);
            case 3:
                return new is8(this.c, 3, m42Var, ss8Var);
            case 4:
                return new is8(4, m42Var, ss8Var);
            default:
                return new is8(5, m42Var, ss8Var);
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
                ((is8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((is8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((is8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((is8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 4:
                return ((is8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                ((is8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r3 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
        if (r3.a(r1, r31) == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
        return r5;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ is8(int i, m42 m42Var, ss8 ss8Var) {
        super(2, m42Var);
        this.a = i;
        this.b = ss8Var;
    }
}
