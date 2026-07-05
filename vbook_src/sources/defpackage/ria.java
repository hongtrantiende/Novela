package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ria  reason: default package */
/* loaded from: classes3.dex */
public final class ria extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ sia c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ria(sia siaVar, boolean z, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = siaVar;
        this.d = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        boolean z = this.d;
        sia siaVar = this.c;
        switch (i) {
            case 0:
                return new ria(siaVar, z, m42Var, 0);
            case 1:
                return new ria(siaVar, z, m42Var, 1);
            default:
                return new ria(siaVar, z, m42Var, 2);
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
                return ((ria) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((ria) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ria) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        cza czaVar;
        Object value;
        cza czaVar2;
        Object value2;
        int i = this.a;
        sia siaVar = this.c;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    dn6 dn6Var = siaVar.c;
                    this.b = 1;
                    en6 en6Var = (en6) dn6Var;
                    ls0 ls0Var = en6Var.a.I;
                    r76 r76Var = dx.W[33];
                    boolean z = this.d;
                    ls0Var.e(r76Var, Boolean.valueOf(z));
                    bw7 c = en6Var.c();
                    while (true) {
                        cza czaVar3 = (cza) c;
                        Object value3 = czaVar3.getValue();
                        boolean z2 = z;
                        if (czaVar3.l(value3, oia.a((oia) value3, 0, 0, 0, 0, 0, false, false, z2, Token.SWITCH))) {
                            if (pvcVar == n82Var) {
                                return n82Var;
                            }
                        } else {
                            z = z2;
                        }
                    }
                }
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    dn6 dn6Var2 = siaVar.c;
                    this.b = 1;
                    en6 en6Var2 = (en6) dn6Var2;
                    ls0 ls0Var2 = en6Var2.a.G;
                    r76 r76Var2 = dx.W[31];
                    boolean z3 = this.d;
                    ls0Var2.e(r76Var2, Boolean.valueOf(z3));
                    bw7 c2 = en6Var2.c();
                    do {
                        czaVar = (cza) c2;
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, oia.a((oia) value, 0, 0, 0, 0, 0, z3, false, false, 223)));
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            default:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    dn6 dn6Var3 = siaVar.c;
                    this.b = 1;
                    en6 en6Var3 = (en6) dn6Var3;
                    ls0 ls0Var3 = en6Var3.a.H;
                    r76 r76Var3 = dx.W[32];
                    boolean z4 = this.d;
                    ls0Var3.e(r76Var3, Boolean.valueOf(z4));
                    bw7 c3 = en6Var3.c();
                    do {
                        czaVar2 = (cza) c3;
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, oia.a((oia) value2, 0, 0, 0, 0, 0, false, z4, false, 191)));
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }
}
