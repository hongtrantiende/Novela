package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q56  reason: default package */
/* loaded from: classes3.dex */
public final class q56 extends fs9 implements mu4 {
    public int b;
    public /* synthetic */ jr2 c;
    public final /* synthetic */ s56 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q56(s56 s56Var, m42 m42Var) {
        super(3, m42Var);
        this.d = s56Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        pvc pvcVar = (pvc) obj2;
        q56 q56Var = new q56(this.d, (m42) obj3);
        q56Var.c = (jr2) obj;
        return q56Var.invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        s56 s56Var = this.d;
        z1 z1Var = (z1) s56Var.d;
        jr2 jr2Var = this.c;
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
            byte w = z1Var.w();
            if (w == 1) {
                return s56Var.d(true);
            }
            if (w == 0) {
                return s56Var.d(false);
            }
            if (w == 6) {
                this.c = null;
                this.b = 1;
                obj = s56.a(s56Var, jr2Var, this);
                n82 n82Var = n82.a;
                if (obj == n82Var) {
                    return n82Var;
                }
            } else if (w == 8) {
                return s56Var.c();
            } else {
                z1.r(z1Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
        }
        return (k46) obj;
    }
}
