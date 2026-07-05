package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p11  reason: default package */
/* loaded from: classes3.dex */
public final class p11 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ i11 c;
    public final /* synthetic */ byte[] d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p11(i11 i11Var, byte[] bArr, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.c = i11Var;
        this.d = bArr;
        this.e = i;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new p11(this.c, this.d, this.e, m42Var, 0);
            default:
                return new p11(this.c, this.d, this.e, m42Var, 1);
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
                return ((p11) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((p11) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.e;
        byte[] bArr = this.d;
        i11 i11Var = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
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
                this.b = 1;
                if (gae.q(i11Var, bArr, i2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
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
                this.b = 1;
                if (gae.q(i11Var, bArr, i2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
