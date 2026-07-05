package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ir5  reason: default package */
/* loaded from: classes3.dex */
public final class ir5 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public long c;
    public /* synthetic */ long d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir5(Object obj, long j, long j2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.e = obj;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return new ir5((ur5) obj2, this.c, this.d, m42Var, 0);
            case 1:
                return new ir5((ss8) obj2, this.c, this.d, m42Var, 1);
            case 2:
                ir5 ir5Var = new ir5((t3a) obj2, m42Var);
                ir5Var.d = ((z4d) obj).a;
                return ir5Var;
            case 3:
                return new ir5((y5c) obj2, this.c, this.d, m42Var, 3);
            case 4:
                return new ir5((tqc) obj2, this.c, this.d, m42Var, 4);
            default:
                return new ir5((ubd) obj2, this.c, this.d, m42Var, 5);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((ir5) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((ir5) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                long j = ((z4d) obj).a;
                ir5 ir5Var = new ir5((t3a) this.e, (m42) obj2);
                ir5Var.d = j;
                return ir5Var.invokeSuspend(pvcVar);
            case 3:
                return ((ir5) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((ir5) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((ir5) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fd, code lost:
        if (r0 == r6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012d, code lost:
        if (r0 != r6) goto L46;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir5(t3a t3aVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 2;
        this.e = t3aVar;
    }
}
