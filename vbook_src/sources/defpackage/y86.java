package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y86  reason: default package */
/* loaded from: classes3.dex */
public final class y86 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ z86 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y86(z86 z86Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = z86Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        z86 z86Var = this.c;
        switch (i) {
            case 0:
                return new y86(z86Var, m42Var, 0);
            case 1:
                return new y86(z86Var, m42Var, 1);
            case 2:
                return new y86(z86Var, m42Var, 2);
            default:
                return new y86(z86Var, m42Var, 3);
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
                return ((y86) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((y86) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((y86) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((y86) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
        if (defpackage.z86.a(r7, r15) == r10) goto L37;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y86.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
