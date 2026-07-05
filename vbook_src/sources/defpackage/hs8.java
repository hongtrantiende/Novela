package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hs8  reason: default package */
/* loaded from: classes3.dex */
public final class hs8 extends aab implements lu4 {
    public final /* synthetic */ int a = 1;
    public /* synthetic */ float b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs8(ss8 ss8Var, float f, m42 m42Var) {
        super(2, m42Var);
        this.c = ss8Var;
        this.b = f;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new hs8((ss8) obj2, this.b, m42Var);
            default:
                hs8 hs8Var = new hs8((ef2) obj2, m42Var);
                hs8Var.b = ((Number) obj).floatValue();
                return hs8Var;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((hs8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((hs8) create(Float.valueOf(((Number) obj).floatValue()), (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                hre.r(obj);
                ss8 ss8Var = (ss8) obj2;
                ((cm5) ss8Var.D).a.g.e(xh9.s[5], Float.valueOf(this.b));
                cza czaVar = ss8Var.Q;
                float f = this.b;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, dm5.a((dm5) value, 0, 0, nae.e, 0, 0, false, false, false, false, f, 0, 0, false, false, false, false, false, false, false, false, 0, 4193791)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                float f2 = this.b;
                hre.r(obj);
                ((ef2) obj2).d(f2);
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs8(ef2 ef2Var, m42 m42Var) {
        super(2, m42Var);
        this.c = ef2Var;
    }
}
