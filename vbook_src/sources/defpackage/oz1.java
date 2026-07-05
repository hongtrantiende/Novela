package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oz1  reason: default package */
/* loaded from: classes3.dex */
public final class oz1 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ pz1 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oz1(pz1 pz1Var, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.c = pz1Var;
        this.d = i;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new oz1(this.c, this.d, m42Var, 0);
            case 1:
                return new oz1(this.c, this.d, m42Var, 1);
            case 2:
                return new oz1(this.c, this.d, m42Var, 2);
            default:
                return new oz1(this.c, this.d, m42Var, 3);
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
                return ((oz1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((oz1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((oz1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((oz1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        switch (this.a) {
            case 0:
                pvc pvcVar = pvc.a;
                pz1 pz1Var = this.c;
                n82 n82Var = n82.a;
                int i = this.b;
                if (i != 0) {
                    if (i == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    kz1 kz1Var = pz1Var.c;
                    int i2 = this.d;
                    this.b = 1;
                    lz1 lz1Var = (lz1) kz1Var;
                    lz1Var.a.v.e(dx.W[20], Integer.valueOf(i2));
                    cza czaVar = lz1Var.c;
                    Integer num = new Integer(i2);
                    czaVar.getClass();
                    czaVar.n(null, num);
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                cza czaVar2 = pz1Var.d;
                int i3 = this.d;
                if (czaVar2 != null) {
                    do {
                        value = czaVar2.getValue();
                    } while (!czaVar2.l(value, qz1.a((qz1) value, i3, 0, 0, 0, false, 30)));
                    return pvcVar;
                }
                return pvcVar;
            case 1:
                pvc pvcVar2 = pvc.a;
                n82 n82Var2 = n82.a;
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
                    kz1 kz1Var2 = this.c.c;
                    int i5 = this.d;
                    this.b = 1;
                    lz1 lz1Var2 = (lz1) kz1Var2;
                    lz1Var2.a.t.e(dx.W[18], Integer.valueOf(i5));
                    cza czaVar3 = lz1Var2.f;
                    Integer num2 = new Integer(i5);
                    czaVar3.getClass();
                    czaVar3.n(null, num2);
                    lz1Var2.b.a = qre.r(i5);
                    if (pvcVar2 == n82Var2) {
                        return n82Var2;
                    }
                }
                cza czaVar4 = this.c.d;
                int i6 = this.d;
                if (czaVar4 != null) {
                    do {
                        value2 = czaVar4.getValue();
                    } while (!czaVar4.l(value2, qz1.a((qz1) value2, 0, 0, 0, i6, false, 23)));
                    return pvcVar2;
                }
                return pvcVar2;
            case 2:
                pvc pvcVar3 = pvc.a;
                pz1 pz1Var2 = this.c;
                n82 n82Var3 = n82.a;
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    kz1 kz1Var3 = pz1Var2.c;
                    int i8 = this.d;
                    this.b = 1;
                    lz1 lz1Var3 = (lz1) kz1Var3;
                    lz1Var3.a.x.e(dx.W[22], Integer.valueOf(i8));
                    cza czaVar5 = lz1Var3.e;
                    Integer num3 = new Integer(i8);
                    czaVar5.getClass();
                    czaVar5.n(null, num3);
                    if (pvcVar3 == n82Var3) {
                        return n82Var3;
                    }
                }
                cza czaVar6 = pz1Var2.d;
                int i9 = this.d;
                if (czaVar6 != null) {
                    do {
                        value3 = czaVar6.getValue();
                    } while (!czaVar6.l(value3, qz1.a((qz1) value3, 0, 0, i9, 0, false, 27)));
                    return pvcVar3;
                }
                return pvcVar3;
            default:
                pvc pvcVar4 = pvc.a;
                pz1 pz1Var3 = this.c;
                n82 n82Var4 = n82.a;
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    kz1 kz1Var4 = pz1Var3.c;
                    int i11 = this.d;
                    this.b = 1;
                    lz1 lz1Var4 = (lz1) kz1Var4;
                    lz1Var4.a.w.e(dx.W[21], Integer.valueOf(i11));
                    cza czaVar7 = lz1Var4.d;
                    Integer num4 = new Integer(i11);
                    czaVar7.getClass();
                    czaVar7.n(null, num4);
                    if (pvcVar4 == n82Var4) {
                        return n82Var4;
                    }
                }
                cza czaVar8 = pz1Var3.d;
                int i12 = this.d;
                if (czaVar8 != null) {
                    do {
                        value4 = czaVar8.getValue();
                    } while (!czaVar8.l(value4, qz1.a((qz1) value4, 0, i12, 0, 0, false, 29)));
                    return pvcVar4;
                }
                return pvcVar4;
        }
    }
}
