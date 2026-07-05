package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: shb  reason: default package */
/* loaded from: classes3.dex */
public final class shb extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vhb b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shb(vhb vhbVar, int i, m42 m42Var) {
        super(2, m42Var);
        this.a = 1;
        this.b = vhbVar;
        this.c = i;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        vhb vhbVar = this.b;
        switch (i) {
            case 0:
                return new shb(vhbVar, m42Var, 0);
            case 1:
                return new shb(vhbVar, this.c, m42Var);
            default:
                return new shb(vhbVar, m42Var, 2);
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
                return ((shb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                ((shb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                return ((shb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        hs0 p;
        jq6 e;
        Object value;
        String c;
        r76[] r76VarArr;
        boolean booleanValue;
        boolean booleanValue2;
        boolean booleanValue3;
        boolean booleanValue4;
        boolean s;
        float g;
        List f;
        y1c y1cVar;
        int i = this.a;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
        vhb vhbVar = this.b;
        switch (i) {
            case 0:
                int i2 = this.c;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            hre.r(obj);
                            return pvcVar;
                        }
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                    p = obj;
                } else {
                    hre.r(obj);
                    a2c a2cVar = vhbVar.c;
                    this.c = 1;
                    p = ((i2c) a2cVar).p();
                    if (p == n82Var) {
                        return n82Var;
                    }
                }
                r58 r58Var = new r58(vhbVar, 11);
                this.c = 2;
                if (((sj4) p).a(r58Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
                hre.r(obj);
                a2c a2cVar2 = vhbVar.c;
                int i3 = this.c;
                ((i2c) a2cVar2).a.k.e(y1c.o[10], Integer.valueOf(i3));
                cza czaVar = vhbVar.f;
                int i4 = this.c;
                if (czaVar != null) {
                    while (true) {
                        Object value2 = czaVar.getValue();
                        int i5 = i4;
                        if (!czaVar.l(value2, rhb.a((rhb) value2, null, null, false, false, false, false, false, nae.e, null, null, i5, 1023))) {
                            i4 = i5;
                        }
                    }
                }
                cza czaVar2 = vhbVar.d.d;
                Integer valueOf = Integer.valueOf(i3);
                czaVar2.getClass();
                czaVar2.n(null, valueOf);
                return pvcVar;
            default:
                int i6 = this.c;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hre.r(obj);
                        e = obj;
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    a2c a2cVar3 = vhbVar.c;
                    this.c = 1;
                    e = ((i2c) a2cVar3).e();
                    if (e == n82Var) {
                        return n82Var;
                    }
                }
                List list = (List) e;
                cza czaVar3 = vhbVar.f;
                if (czaVar3 != null) {
                    do {
                        value = czaVar3.getValue();
                        a2c a2cVar4 = vhbVar.c;
                        c = ((i2c) a2cVar4).a.c();
                        i2c i2cVar = (i2c) a2cVar4;
                        y1c y1cVar2 = i2cVar.a;
                        ls0 ls0Var = y1cVar2.j;
                        r76VarArr = y1c.o;
                        booleanValue = ((Boolean) ls0Var.c(r76VarArr[9], y1cVar2)).booleanValue();
                        y1c y1cVar3 = i2cVar.a;
                        booleanValue2 = ((Boolean) y1cVar3.b.c(r76VarArr[1], y1cVar3)).booleanValue();
                        y1c y1cVar4 = i2cVar.a;
                        booleanValue3 = ((Boolean) y1cVar4.d.c(r76VarArr[3], y1cVar4)).booleanValue();
                        y1c y1cVar5 = i2cVar.a;
                        booleanValue4 = ((Boolean) y1cVar5.c.c(r76VarArr[2], y1cVar5)).booleanValue();
                        s = i2cVar.s();
                        g = i2cVar.g();
                        f = i2cVar.f();
                        y1cVar = i2cVar.a;
                    } while (!czaVar3.l(value, rhb.a((rhb) value, list, c, booleanValue, booleanValue2, booleanValue3, booleanValue4, s, g, f, null, ((Number) y1cVar.k.c(r76VarArr[10], y1cVar)).intValue(), 512)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ shb(vhb vhbVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = vhbVar;
    }
}
