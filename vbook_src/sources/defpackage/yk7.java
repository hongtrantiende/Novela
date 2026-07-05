package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yk7  reason: default package */
/* loaded from: classes3.dex */
public final class yk7 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yha d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yk7(boolean z, yha yhaVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = z;
        this.d = yhaVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new yk7(this.c, this.d, m42Var, 0);
            default:
                return new yk7(this.c, this.d, m42Var, 1);
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
                return ((yk7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((yk7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        zha zhaVar = zha.a;
        zha zhaVar2 = zha.b;
        zha zhaVar3 = zha.c;
        boolean z = this.c;
        n82 n82Var = n82.a;
        yha yhaVar = this.d;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                    return pvcVar;
                }
                hre.r(obj);
                if (z) {
                    this.b = 1;
                    if (yhaVar.c()) {
                        zhaVar2 = zhaVar3;
                    }
                    if (yha.a(yhaVar, zhaVar2, this) != n82Var) {
                        return pvcVar;
                    }
                } else if (yhaVar.e()) {
                    this.b = 2;
                    if (yha.a(yhaVar, zhaVar, this) != n82Var) {
                        return pvcVar;
                    }
                } else {
                    return pvcVar;
                }
                return n82Var;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1 && i3 != 2) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                    return pvcVar;
                }
                hre.r(obj);
                if (z) {
                    this.b = 1;
                    if (yhaVar.c()) {
                        zhaVar2 = zhaVar3;
                    }
                    if (yha.a(yhaVar, zhaVar2, this) != n82Var) {
                        return pvcVar;
                    }
                } else if (yhaVar.e()) {
                    this.b = 2;
                    if (yha.a(yhaVar, zhaVar, this) != n82Var) {
                        return pvcVar;
                    }
                } else {
                    return pvcVar;
                }
                return n82Var;
        }
    }
}
