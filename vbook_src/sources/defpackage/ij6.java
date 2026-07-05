package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ij6  reason: default package */
/* loaded from: classes3.dex */
public final class ij6 extends aab implements lu4 {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij6(k2a k2aVar, int i, int i2, aw7 aw7Var, m42 m42Var) {
        super(2, m42Var);
        this.e = k2aVar;
        this.c = i;
        this.d = i2;
        this.f = aw7Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ij6 ij6Var = new ij6((kj6) obj2, this.c, this.d, m42Var);
                ij6Var.e = obj;
                return ij6Var;
            case 1:
                return new ij6((k2a) this.e, this.c, this.d, (aw7) obj2, m42Var);
            default:
                ij6 ij6Var2 = new ij6((ss8) obj2, m42Var);
                ij6Var2.e = obj;
                return ij6Var2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((ij6) create((i2a) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((ij6) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((ij6) create((wp8) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int h;
        fvb fvbVar;
        int i;
        fvb fvbVar2;
        int i2;
        int i3;
        int i4 = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        Object obj2 = this.f;
        switch (i4) {
            case 0:
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
                kj6 kj6Var = (kj6) obj2;
                ig6 ig6Var = new ig6((i2a) this.e, kj6Var, 1);
                int i6 = this.c;
                int i7 = this.d;
                r13 r13Var = ((fj6) kj6Var.f.getValue()).i;
                this.b = 1;
                if (cqe.d(ig6Var, i6, i7, 100, r13Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
                k2a k2aVar = (k2a) this.e;
                aw7 aw7Var = (aw7) obj2;
                int i8 = this.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                if (((fvb) aw7Var.getValue()) != null && (h = k2aVar.b.h()) > 0 && (fvbVar = (fvb) aw7Var.getValue()) != null && (i = (int) (fvbVar.c >> 32)) > 0 && h <= i && (fvbVar2 = (fvb) aw7Var.getValue()) != null) {
                    float f = fvbVar2.b(this.c).a;
                    fvb fvbVar3 = (fvb) aw7Var.getValue();
                    if (fvbVar3 != null) {
                        this.b = 1;
                        if (jxe.p(k2aVar, (((int) ((f + fvbVar3.b(this.d).c) / 2.0f)) - (h / 2)) - k2aVar.a.h(), this) == n82Var) {
                            return n82Var;
                        }
                        return pvcVar;
                    }
                    return pvcVar;
                }
                return pvcVar;
            default:
                ss8 ss8Var = (ss8) obj2;
                wp8 wp8Var = (wp8) this.e;
                int i9 = this.d;
                if (i9 != 0) {
                    if (i9 == 1) {
                        i2 = this.c;
                        i3 = this.b;
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    String str = wp8Var.a;
                    int i10 = wp8Var.d;
                    int i11 = wp8Var.c;
                    i2 = wp8Var.b;
                    if (c16.i(str, ss8Var.c) && i11 >= 0 && i10 > i11) {
                        dyb n = ss8Var.n();
                        this.e = null;
                        this.b = i2;
                        this.c = i2;
                        this.d = 1;
                        obj = n.l0(i2, i11, i10, this);
                        if (obj != n82Var) {
                            i3 = i2;
                        } else {
                            return n82Var;
                        }
                    } else {
                        return new uqc(-1, new vp8(i2, ks3.a));
                    }
                }
                return new uqc(i3, new vp8(i2, (List) obj));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij6(ss8 ss8Var, m42 m42Var) {
        super(2, m42Var);
        this.f = ss8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij6(kj6 kj6Var, int i, int i2, m42 m42Var) {
        super(2, m42Var);
        this.f = kj6Var;
        this.c = i;
        this.d = i2;
    }
}
