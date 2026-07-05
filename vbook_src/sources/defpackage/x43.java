package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x43  reason: default package */
/* loaded from: classes3.dex */
public final class x43 extends aab implements lu4 {
    public final /* synthetic */ boolean C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public Object G;
    public final /* synthetic */ fdd H;
    public final /* synthetic */ int a;
    public String b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x43(i53 i53Var, boolean z, boolean z2, List list, int i, int i2, boolean z3, m42 m42Var) {
        super(2, m42Var);
        this.a = 0;
        this.H = i53Var;
        this.e = z;
        this.C = z2;
        this.f = list;
        this.D = i;
        this.E = i2;
        this.F = z3;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        fdd fddVar = this.H;
        switch (i) {
            case 0:
                x43 x43Var = new x43((i53) fddVar, this.e, this.C, this.f, this.D, this.E, this.F, m42Var);
                x43Var.d = obj;
                return x43Var;
            case 1:
                x43 x43Var2 = new x43((ur5) fddVar, this.e, this.f, this.C, this.D, this.E, this.F, m42Var, 1);
                x43Var2.d = obj;
                return x43Var2;
            case 2:
                x43 x43Var3 = new x43((gia) fddVar, this.e, this.f, this.C, this.D, this.E, this.F, m42Var, 2);
                x43Var3.d = obj;
                return x43Var3;
            case 3:
                x43 x43Var4 = new x43((y5c) fddVar, this.e, this.f, this.C, this.D, this.E, this.F, m42Var, 3);
                x43Var4.d = obj;
                return x43Var4;
            default:
                x43 x43Var5 = new x43((ubd) fddVar, this.e, this.f, this.C, this.D, this.E, this.F, m42Var, 4);
                x43Var5.d = obj;
                return x43Var5;
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
                return ((x43) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((x43) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((x43) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((x43) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((x43) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:287:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d7  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x43.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x43(fdd fddVar, boolean z, List list, boolean z2, int i, int i2, boolean z3, m42 m42Var, int i3) {
        super(2, m42Var);
        this.a = i3;
        this.H = fddVar;
        this.e = z;
        this.f = list;
        this.C = z2;
        this.D = i;
        this.E = i2;
        this.F = z3;
    }
}
