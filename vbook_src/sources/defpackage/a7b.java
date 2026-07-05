package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a7b  reason: default package */
/* loaded from: classes.dex */
public final class a7b extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ b7b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7b(b7b b7bVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = b7bVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new a7b(this.c, m42Var, 0);
            case 1:
                return new a7b(this.c, m42Var, 1);
            case 2:
                return new a7b(this.c, m42Var, 2);
            case 3:
                return new a7b(this.c, m42Var, 3);
            default:
                return new a7b(this.c, m42Var, 4);
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
                return ((a7b) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((a7b) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((a7b) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((a7b) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                ((a7b) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82.a;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        b7b b7bVar = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                final o7b o7bVar = (o7b) b7bVar.c.b;
                sj4 z = z1d.z(new s02(yae.G(new vt4() { // from class: l7b
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i3 = r2;
                        o7b o7bVar2 = o7bVar;
                        switch (i3) {
                            case 0:
                                return new zy5(o7bVar2.a.f());
                            case 1:
                                return new zy5(((zy5) o7bVar2.a.d.getValue()).a);
                            case 2:
                                return Integer.valueOf(o7bVar2.a.j0.h());
                            default:
                                return dye.s(o7bVar2.a.g());
                        }
                    }
                }), 8), 80L);
                z6b z6bVar = new z6b(b7bVar, 0);
                this.b = 1;
                if (z.a(z6bVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                final o7b o7bVar2 = (o7b) b7bVar.c.b;
                s02 G = yae.G(new vt4() { // from class: l7b
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i32 = r2;
                        o7b o7bVar22 = o7bVar2;
                        switch (i32) {
                            case 0:
                                return new zy5(o7bVar22.a.f());
                            case 1:
                                return new zy5(((zy5) o7bVar22.a.d.getValue()).a);
                            case 2:
                                return Integer.valueOf(o7bVar22.a.j0.h());
                            default:
                                return dye.s(o7bVar22.a.g());
                        }
                    }
                });
                z6b z6bVar2 = new z6b(b7bVar, 1);
                this.b = 1;
                Object a = G.a(new tm6(z6bVar2, 15), this);
                if (a != n82Var) {
                    a = pvcVar;
                }
                if (a == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                final o7b o7bVar3 = (o7b) b7bVar.c.b;
                s02 G2 = yae.G(new vt4() { // from class: l7b
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i32 = r2;
                        o7b o7bVar22 = o7bVar3;
                        switch (i32) {
                            case 0:
                                return new zy5(o7bVar22.a.f());
                            case 1:
                                return new zy5(((zy5) o7bVar22.a.d.getValue()).a);
                            case 2:
                                return Integer.valueOf(o7bVar22.a.j0.h());
                            default:
                                return dye.s(o7bVar22.a.g());
                        }
                    }
                });
                z6b z6bVar3 = new z6b(b7bVar, 2);
                this.b = 1;
                if (G2.a(z6bVar3, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 3:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                final o7b o7bVar4 = (o7b) b7bVar.c.b;
                s02 G3 = yae.G(new vt4() { // from class: l7b
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i32 = r2;
                        o7b o7bVar22 = o7bVar4;
                        switch (i32) {
                            case 0:
                                return new zy5(o7bVar22.a.f());
                            case 1:
                                return new zy5(((zy5) o7bVar22.a.d.getValue()).a);
                            case 2:
                                return Integer.valueOf(o7bVar22.a.j0.h());
                            default:
                                return dye.s(o7bVar22.a.g());
                        }
                    }
                });
                z6b z6bVar4 = new z6b(b7bVar, 3);
                this.b = 1;
                if (G3.a(z6bVar4, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    throw a82.e(obj);
                }
                hre.r(obj);
                pga pgaVar = b7bVar.k;
                z6b z6bVar5 = new z6b(b7bVar, 4);
                this.b = 1;
                pgaVar.a(z6bVar5, this);
                return n82Var;
        }
    }
}
