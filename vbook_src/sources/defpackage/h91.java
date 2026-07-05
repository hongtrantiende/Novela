package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h91  reason: default package */
/* loaded from: classes3.dex */
public final class h91 extends aab implements mu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ int c;
    public /* synthetic */ int d;
    public final /* synthetic */ tj4 e;
    public final /* synthetic */ zo0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h91(zo0 zo0Var, tj4 tj4Var, m42 m42Var, int i) {
        super(3, m42Var);
        this.a = i;
        this.f = zo0Var;
        this.e = tj4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        tj4 tj4Var = this.e;
        zo0 zo0Var = this.f;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        m42 m42Var = (m42) obj3;
        switch (i) {
            case 0:
                h91 h91Var = new h91((k91) zo0Var, tj4Var, m42Var, 0);
                h91Var.c = intValue;
                h91Var.d = intValue2;
                return h91Var.invokeSuspend(pvcVar);
            case 1:
                h91 h91Var2 = new h91((wu3) zo0Var, tj4Var, m42Var, 1);
                h91Var2.c = intValue;
                h91Var2.d = intValue2;
                return h91Var2.invokeSuspend(pvcVar);
            case 2:
                h91 h91Var3 = new h91((zu3) zo0Var, tj4Var, m42Var, 2);
                h91Var3.c = intValue;
                h91Var3.d = intValue2;
                return h91Var3.invokeSuspend(pvcVar);
            case 3:
                h91 h91Var4 = new h91((tb5) zo0Var, tj4Var, m42Var, 3);
                h91Var4.c = intValue;
                h91Var4.d = intValue2;
                return h91Var4.invokeSuspend(pvcVar);
            default:
                h91 h91Var5 = new h91((irc) zo0Var, tj4Var, m42Var, 4);
                h91Var5.c = intValue;
                h91Var5.d = intValue2;
                return h91Var5.invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        zo0 zo0Var = this.f;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.c;
                int i3 = this.d;
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
                this.c = i2;
                this.d = i3;
                this.b = 1;
                if (zo0.f((k91) zo0Var, this.e, y24.d, i2, i3, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
                int i5 = this.c;
                int i6 = this.d;
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.c = i5;
                this.d = i6;
                this.b = 1;
                if (zo0.f((wu3) zo0Var, this.e, y24.d, i5, i6, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 2:
                int i8 = this.c;
                int i9 = this.d;
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.c = i8;
                this.d = i9;
                this.b = 1;
                if (zo0.f((zu3) zo0Var, this.e, y24.d, i8, i9, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 3:
                int i11 = this.c;
                int i12 = this.d;
                int i13 = this.b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.c = i11;
                this.d = i12;
                this.b = 1;
                if (zo0.f((tb5) zo0Var, this.e, y24.d, i11, i12, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i14 = this.c;
                int i15 = this.d;
                int i16 = this.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.c = i14;
                this.d = i15;
                this.b = 1;
                if (zo0.f((irc) zo0Var, this.e, y24.d, i14, i15, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
