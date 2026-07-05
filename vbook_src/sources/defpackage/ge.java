package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ge  reason: default package */
/* loaded from: classes3.dex */
public final class ge extends aab implements xt4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ge(Object obj, Object obj2, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new ge((pe) this.d, (mu4) obj, m42Var, 0);
            case 1:
                return new ge((qe) this.d, (mu4) obj, m42Var, 1);
            case 2:
                return new ge((cn) this.d, (oob) obj, m42Var, 2);
            case 3:
                return new ge((yh0) this.d, (String) obj, m42Var, 3);
            case 4:
                return new ge((vi0) this.d, (ui0) obj, m42Var, 4);
            case 5:
                return new ge((gh2) obj, m42Var, 5);
            case 6:
                return new ge((o84) this.d, (l54) obj, m42Var, 6);
            case 7:
                return new ge((o84) this.d, (mo2) obj, m42Var, 7);
            case 8:
                return new ge((be4) obj, m42Var, 8);
            case 9:
                return new ge((tj4) this.d, (zl9) obj, m42Var, 9);
            case 10:
                return new ge((pgd) this.d, (String) obj, m42Var, 10);
            case 11:
                return new ge((i55) this.d, (pgd) obj, m42Var, 11);
            case 12:
                return new ge((r59) this.d, (String) obj, m42Var, 12);
            default:
                return new ge((ns2) this.d, (cr9) obj, m42Var, 13);
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj;
        switch (i) {
            case 0:
                return ((ge) create(m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((ge) create(m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((ge) create(m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((ge) create(m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((ge) create(m42Var)).invokeSuspend(pvcVar);
            case 5:
                return ((ge) create(m42Var)).invokeSuspend(pvcVar);
            case 6:
                return ((ge) create(m42Var)).invokeSuspend(pvcVar);
            case 7:
                return ((ge) create(m42Var)).invokeSuspend(pvcVar);
            case 8:
                return ((ge) create(m42Var)).invokeSuspend(pvcVar);
            case 9:
                return ((ge) create(m42Var)).invokeSuspend(pvcVar);
            case 10:
                return ((ge) create(m42Var)).invokeSuspend(pvcVar);
            case 11:
                return ((ge) create(m42Var)).invokeSuspend(pvcVar);
            case 12:
                return ((ge) create(m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ge) create(m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x019a, code lost:
        if (r0 == r8) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #11 {all -> 0x0054, blocks: (B:13:0x004a, B:15:0x0052, B:20:0x005a), top: B:325:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:341:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ge.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ge(Object obj, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.c = obj;
    }
}
