package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ls8  reason: default package */
/* loaded from: classes3.dex */
public final class ls8 extends aab implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ss8 b;
    public int c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls8(int i, int i2, m42 m42Var, ss8 ss8Var) {
        super(2, m42Var);
        this.b = ss8Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        int i2 = this.d;
        ss8 ss8Var = this.b;
        switch (i) {
            case 0:
                return new ls8(i2, m42Var, ss8Var);
            default:
                return new ls8(this.c, i2, m42Var, ss8Var);
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
                return ((ls8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                ((ls8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.d;
        ss8 ss8Var = this.b;
        switch (i) {
            case 0:
                int i3 = this.c;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                wo5 wo5Var = ss8Var.e;
                String str = ss8Var.c;
                String m = a82.m(str, "_", i2);
                String str2 = ((rl5) ss8Var.R.getValue()).b;
                long b = by5.a.k().b();
                this.c = 1;
                ((ep5) wo5Var).a.c.J0(m, this.d, str2, 0.0d, b, str);
                n82 n82Var = n82.a;
                if (pvcVar == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                hre.r(obj);
                wpc wpcVar = ss8Var.F;
                String str3 = ss8Var.c;
                int i4 = this.c;
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                wpcVar.a(i4, i2, str3);
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls8(int i, m42 m42Var, ss8 ss8Var) {
        super(2, m42Var);
        this.b = ss8Var;
        this.d = i;
    }
}
