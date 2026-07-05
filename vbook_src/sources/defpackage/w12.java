package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w12  reason: default package */
/* loaded from: classes3.dex */
public final class w12 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ s11 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w12(s11 s11Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = s11Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                w12 w12Var = new w12(this.c, m42Var, 0);
                w12Var.b = obj;
                return w12Var;
            default:
                w12 w12Var2 = new w12(this.c, m42Var, 1);
                w12Var2.b = obj;
                return w12Var2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((w12) create(obj, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((w12) create(obj, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        boolean z = true;
        s11 s11Var = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                if (obj2 == null && !s11Var.i()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                hre.r(obj);
                if (obj2 == null && !s11Var.i()) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
