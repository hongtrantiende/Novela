package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: de1  reason: default package */
/* loaded from: classes3.dex */
public final class de1 extends aab implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de1(List list, boolean z, boolean z2, y5c y5cVar, String str, m42 m42Var) {
        super(2, m42Var);
        this.a = 3;
        this.f = list;
        this.c = z;
        this.e = z2;
        this.C = y5cVar;
        this.d = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.C;
        switch (i) {
            case 0:
                boolean z = this.e;
                String str = this.d;
                de1 de1Var = new de1(this.c, (ee1) obj2, z, str, m42Var);
                de1Var.f = obj;
                return de1Var;
            case 1:
                boolean z2 = this.e;
                return new de1((cqb) this.f, this.c, this.d, (String) obj2, z2, m42Var, 1);
            case 2:
                boolean z3 = this.e;
                return new de1((y5c) this.f, this.c, this.d, (String) obj2, z3, m42Var, 2);
            default:
                String str2 = this.d;
                return new de1((List) this.f, this.c, this.e, (y5c) obj2, str2, m42Var);
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
                return ((de1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((de1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((de1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((de1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ de1(fdd fddVar, boolean z, String str, String str2, boolean z2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.f = fddVar;
        this.c = z;
        this.d = str;
        this.C = str2;
        this.e = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de1(boolean z, ee1 ee1Var, boolean z2, String str, m42 m42Var) {
        super(2, m42Var);
        this.a = 0;
        this.c = z;
        this.C = ee1Var;
        this.e = z2;
        this.d = str;
    }
}
