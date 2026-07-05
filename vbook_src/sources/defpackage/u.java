package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u  reason: default package */
/* loaded from: classes3.dex */
public final class u extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(wmc wmcVar, int i, int i2, aw7 aw7Var, aw7 aw7Var2, m42 m42Var) {
        super(2, m42Var);
        this.a = 7;
        this.d = wmcVar;
        this.b = i;
        this.c = i2;
        this.e = aw7Var;
        this.f = aw7Var2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                u uVar = new u((v) obj2, this.c, m42Var, 0);
                uVar.e = obj;
                return uVar;
            case 1:
                return new u((r26) this.d, (sk1) this.e, this.c, (ud0) obj2, m42Var);
            case 2:
                u uVar2 = new u((l71) this.d, this.c, (gxa) obj2, m42Var, 2);
                uVar2.e = obj;
                return uVar2;
            case 3:
                return new u((uo3) this.d, (pm4) this.e, (kj6) obj2, this.c, m42Var, 3);
            case 4:
                return new u((sj4[]) this.d, this.c, (AtomicInteger) this.e, (xy0) obj2, m42Var);
            case 5:
                return new u((ao4) this.e, (String) obj2, m42Var);
            case 6:
                u uVar3 = new u((ur5) obj2, this.c, m42Var, 6);
                uVar3.e = obj;
                return uVar3;
            case 7:
                return new u((wmc) this.d, this.b, this.c, (aw7) this.e, (aw7) obj2, m42Var);
            case 8:
                u uVar4 = new u((llb) this.d, this.c, (String) obj2, m42Var, 8);
                uVar4.e = obj;
                return uVar4;
            case 9:
                u uVar5 = new u((y5c) obj2, this.c, m42Var, 9);
                uVar5.e = obj;
                return uVar5;
            case 10:
                u uVar6 = new u((bic) obj2, this.c, m42Var, 10);
                uVar6.e = obj;
                return uVar6;
            default:
                return new u((ubd) this.d, (mjc) this.e, (xic) obj2, this.c, m42Var, 11);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((u) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((u) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((u) create((i2a) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((u) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((u) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((u) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((u) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((u) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((u) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((u) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((u) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((u) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0357, code lost:
        if (r5 == r9) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0827, code lost:
        if (r3 == r8) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x085d, code lost:
        if (defpackage.ade.r(r9, r28) == r8) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x092e, code lost:
        if (r3 == r8) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0945, code lost:
        if (r3 == r8) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0962, code lost:
        if (r3 == r8) goto L450;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x096c  */
    /* JADX WARN: Type inference failed for: r2v44, types: [wl9, java.lang.Object] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 2548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r26 r26Var, sk1 sk1Var, int i, ud0 ud0Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 1;
        this.d = r26Var;
        this.e = sk1Var;
        this.c = i;
        this.f = ud0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ao4 ao4Var, String str, m42 m42Var) {
        super(2, m42Var);
        this.a = 5;
        this.e = ao4Var;
        this.f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.f = obj;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, int i, Object obj2, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.d = obj;
        this.c = i;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(sj4[] sj4VarArr, int i, AtomicInteger atomicInteger, xy0 xy0Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 4;
        this.d = sj4VarArr;
        this.c = i;
        this.e = atomicInteger;
        this.f = xy0Var;
    }
}
