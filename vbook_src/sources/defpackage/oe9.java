package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oe9  reason: default package */
/* loaded from: classes3.dex */
public final class oe9 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ re9 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oe9(re9 re9Var, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.b = re9Var;
        this.c = i;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new oe9(this.b, this.c, m42Var, 0);
            case 1:
                return new oe9(this.b, this.c, m42Var, 1);
            case 2:
                return new oe9(this.b, this.c, m42Var, 2);
            case 3:
                return new oe9(this.b, this.c, m42Var, 3);
            case 4:
                return new oe9(this.b, this.c, m42Var, 4);
            case 5:
                return new oe9(this.b, this.c, m42Var, 5);
            case 6:
                return new oe9(this.b, m42Var, 6);
            case 7:
                return new oe9(this.b, m42Var, 7);
            case 8:
                return new oe9(this.b, m42Var, 8);
            case 9:
                return new oe9(this.b, m42Var, 9);
            default:
                return new oe9(this.b, m42Var, 10);
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
                ((oe9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((oe9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((oe9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((oe9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 4:
                ((oe9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 5:
                ((oe9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 6:
                return ((oe9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 7:
                return ((oe9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 8:
                return ((oe9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 9:
                return ((oe9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((oe9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        int i = this.a;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
        re9 re9Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                sc9 sc9Var = re9Var.c;
                be9 be9Var = (be9) sc9Var;
                be9Var.c.f.e(rc9.q[5], Integer.valueOf(this.c));
                be9Var.S();
                cza czaVar = re9Var.d;
                int i2 = this.c;
                if (czaVar != null) {
                    while (true) {
                        Object value6 = czaVar.getValue();
                        int i3 = i2;
                        if (!czaVar.l(value6, me9.a((me9) value6, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, i3, 0, 0, false, false, 63487))) {
                            i2 = i3;
                        }
                    }
                }
                return pvcVar;
            case 1:
                hre.r(obj);
                sc9 sc9Var2 = re9Var.c;
                be9 be9Var2 = (be9) sc9Var2;
                be9Var2.c.j.e(rc9.q[9], Integer.valueOf(this.c));
                be9Var2.S();
                cza czaVar2 = re9Var.d;
                int i4 = this.c;
                if (czaVar2 != null) {
                    while (true) {
                        Object value7 = czaVar2.getValue();
                        int i5 = i4;
                        if (!czaVar2.l(value7, me9.a((me9) value7, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, i5, 0, false, false, 61439))) {
                            i4 = i5;
                        }
                    }
                }
                return pvcVar;
            case 2:
                hre.r(obj);
                sc9 sc9Var3 = re9Var.c;
                be9 be9Var3 = (be9) sc9Var3;
                be9Var3.c.g.e(rc9.q[6], Integer.valueOf(this.c));
                be9Var3.S();
                cza czaVar3 = re9Var.d;
                int i6 = this.c;
                if (czaVar3 != null) {
                    while (true) {
                        Object value8 = czaVar3.getValue();
                        int i7 = i6;
                        if (!czaVar3.l(value8, me9.a((me9) value8, null, null, null, null, null, false, 0L, 0L, i7, 0, 0, 0, 0, 0, false, false, 65279))) {
                            i6 = i7;
                        }
                    }
                }
                return pvcVar;
            case 3:
                hre.r(obj);
                sc9 sc9Var4 = re9Var.c;
                be9 be9Var4 = (be9) sc9Var4;
                be9Var4.c.h.e(rc9.q[7], Integer.valueOf(this.c));
                be9Var4.S();
                cza czaVar4 = re9Var.d;
                int i8 = this.c;
                if (czaVar4 != null) {
                    while (true) {
                        Object value9 = czaVar4.getValue();
                        int i9 = i8;
                        if (!czaVar4.l(value9, me9.a((me9) value9, null, null, null, null, null, false, 0L, 0L, 0, i9, 0, 0, 0, 0, false, false, 65023))) {
                            i8 = i9;
                        }
                    }
                }
                return pvcVar;
            case 4:
                hre.r(obj);
                sc9 sc9Var5 = re9Var.c;
                be9 be9Var5 = (be9) sc9Var5;
                be9Var5.c.i.e(rc9.q[8], Integer.valueOf(this.c));
                be9Var5.S();
                cza czaVar5 = re9Var.d;
                int i10 = this.c;
                if (czaVar5 != null) {
                    while (true) {
                        Object value10 = czaVar5.getValue();
                        int i11 = i10;
                        if (!czaVar5.l(value10, me9.a((me9) value10, null, null, null, null, null, false, 0L, 0L, 0, 0, i11, 0, 0, 0, false, false, 64511))) {
                            i10 = i11;
                        }
                    }
                }
                return pvcVar;
            case 5:
                hre.r(obj);
                sc9 sc9Var6 = re9Var.c;
                be9 be9Var6 = (be9) sc9Var6;
                be9Var6.c.k.e(rc9.q[10], Integer.valueOf(this.c));
                be9Var6.S();
                cza czaVar6 = re9Var.d;
                int i12 = this.c;
                if (czaVar6 != null) {
                    while (true) {
                        Object value11 = czaVar6.getValue();
                        int i13 = i12;
                        if (!czaVar6.l(value11, me9.a((me9) value11, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, i13, false, false, 57343))) {
                            i12 = i13;
                        }
                    }
                }
                return pvcVar;
            case 6:
                int i14 = this.c;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    sc9 sc9Var7 = re9Var.c;
                    this.c = 1;
                    if (((be9) sc9Var7).k(this) == n82Var) {
                        return n82Var;
                    }
                }
                cza czaVar7 = re9Var.d;
                if (czaVar7 != null) {
                    do {
                        value = czaVar7.getValue();
                    } while (!czaVar7.l(value, me9.a((me9) value, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65519)));
                    return pvcVar;
                }
                return pvcVar;
            case 7:
                int i15 = this.c;
                if (i15 != 0) {
                    if (i15 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    sc9 sc9Var8 = re9Var.c;
                    this.c = 1;
                    if (((be9) sc9Var8).l(this) == n82Var) {
                        return n82Var;
                    }
                }
                cza czaVar8 = re9Var.d;
                if (czaVar8 != null) {
                    do {
                        value2 = czaVar8.getValue();
                    } while (!czaVar8.l(value2, me9.a((me9) value2, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65533)));
                    return pvcVar;
                }
                return pvcVar;
            case 8:
                int i16 = this.c;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    sc9 sc9Var9 = re9Var.c;
                    this.c = 1;
                    if (((be9) sc9Var9).n(this) == n82Var) {
                        return n82Var;
                    }
                }
                cza czaVar9 = re9Var.d;
                if (czaVar9 != null) {
                    do {
                        value3 = czaVar9.getValue();
                    } while (!czaVar9.l(value3, me9.a((me9) value3, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65531)));
                    return pvcVar;
                }
                return pvcVar;
            case 9:
                int i17 = this.c;
                if (i17 != 0) {
                    if (i17 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    sc9 sc9Var10 = re9Var.c;
                    this.c = 1;
                    if (((be9) sc9Var10).o(this) == n82Var) {
                        return n82Var;
                    }
                }
                cza czaVar10 = re9Var.d;
                if (czaVar10 != null) {
                    do {
                        value4 = czaVar10.getValue();
                    } while (!czaVar10.l(value4, me9.a((me9) value4, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65527)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                int i18 = this.c;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    sc9 sc9Var11 = re9Var.c;
                    this.c = 1;
                    if (((be9) sc9Var11).p(this) == n82Var) {
                        return n82Var;
                    }
                }
                cza czaVar11 = re9Var.d;
                if (czaVar11 != null) {
                    do {
                        value5 = czaVar11.getValue();
                    } while (!czaVar11.l(value5, me9.a((me9) value5, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, false, 65534)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oe9(re9 re9Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = re9Var;
    }
}
