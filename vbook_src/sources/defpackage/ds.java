package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ds  reason: default package */
/* loaded from: classes3.dex */
public final class ds extends aab implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(boolean z, qi8 qi8Var, aw7 aw7Var, si8 si8Var, ri8 ri8Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 4;
        this.c = z;
        this.d = qi8Var;
        this.e = aw7Var;
        this.f = si8Var;
        this.C = ri8Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        boolean z = this.c;
        Object obj2 = this.C;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                return new ds(this.c, (dm8) obj3, (dm8) obj2, m42Var, 0);
            case 1:
                ds dsVar = new ds(m42Var, (xt4) obj2, (fu9) obj3, z);
                dsVar.e = obj;
                return dsVar;
            case 2:
                ds dsVar2 = new ds((i53) obj3, z, (List) obj2, m42Var);
                dsVar2.e = obj;
                return dsVar2;
            case 3:
                return new ds(this.c, (dm8) obj3, (ora) obj2, m42Var, 3);
            default:
                return new ds(this.c, (qi8) this.d, (aw7) this.e, (si8) obj3, (ri8) obj2, m42Var);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((ds) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((ds) create((xjc) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((ds) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((ds) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((ds) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:?, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010d, code lost:
        if (r0 == r8) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013a, code lost:
        if (r0 == r8) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e7  */
    /* JADX WARN: Type inference failed for: r0v4, types: [wl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [wl9, java.lang.Object] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(i53 i53Var, boolean z, List list, m42 m42Var) {
        super(2, m42Var);
        this.a = 2;
        this.f = i53Var;
        this.c = z;
        this.C = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(m42 m42Var, xt4 xt4Var, fu9 fu9Var, boolean z) {
        super(2, m42Var);
        this.a = 1;
        this.c = z;
        this.f = fu9Var;
        this.C = xt4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ds(boolean z, dm8 dm8Var, Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = z;
        this.f = dm8Var;
        this.C = obj;
    }
}
