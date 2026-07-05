package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pz2  reason: default package */
/* loaded from: classes3.dex */
public final class pz2 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz2(vhb vhbVar, String str, String str2, boolean z, m42 m42Var) {
        super(2, m42Var);
        this.a = 5;
        this.c = vhbVar;
        this.f = str;
        this.e = str2;
        this.d = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.e;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                pz2 pz2Var = new pz2(0, m42Var, (s11) obj3, (k78) obj2, this.d);
                pz2Var.c = obj;
                return pz2Var;
            case 1:
                pz2 pz2Var2 = new pz2(1, m42Var, (f31) obj3, (k78) obj2, this.d);
                pz2Var2.c = obj;
                return pz2Var2;
            case 2:
                return new pz2((ur5) obj3, (List) obj2, this.d, m42Var, 2);
            case 3:
                return new pz2(this.d, (mh6) this.c, (lf4) obj3, (p15) obj2, m42Var);
            case 4:
                return new pz2((gia) obj3, (List) obj2, this.d, m42Var, 4);
            case 5:
                return new pz2((vhb) this.c, (String) obj3, (String) obj2, this.d, m42Var);
            case 6:
                return new pz2(6, m42Var, (aw7) obj3, (yu7) obj2, this.d);
            case 7:
                return new pz2((y5c) obj3, (List) obj2, this.d, m42Var, 7);
            case 8:
                pz2 pz2Var3 = new pz2((shc) obj3, (w43) obj2, this.d, m42Var, 8);
                pz2Var3.c = obj;
                return pz2Var3;
            case 9:
                pz2 pz2Var4 = new pz2((g0d) obj3, (String) obj2, this.d, m42Var, 9);
                pz2Var4.c = obj;
                return pz2Var4;
            case 10:
                return new pz2((ubd) obj3, (List) obj2, this.d, m42Var, 10);
            default:
                return new pz2((lsd) obj3, (z4d) obj2, m42Var);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((pz2) create((bod) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((pz2) create((mi9) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((pz2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((pz2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((pz2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((pz2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((pz2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((pz2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((pz2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((pz2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((pz2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((pz2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0107, code lost:
        if (((java.lang.Boolean) r0).booleanValue() != false) goto L11;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 1438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pz2(int i, m42 m42Var, Object obj, Object obj2, boolean z) {
        super(2, m42Var);
        this.a = i;
        this.f = obj;
        this.d = z;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pz2(fdd fddVar, Object obj, boolean z, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.f = fddVar;
        this.e = obj;
        this.d = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz2(lsd lsdVar, z4d z4dVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 11;
        this.f = lsdVar;
        this.e = z4dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz2(boolean z, mh6 mh6Var, lf4 lf4Var, p15 p15Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 3;
        this.d = z;
        this.c = mh6Var;
        this.f = lf4Var;
        this.e = p15Var;
    }
}
