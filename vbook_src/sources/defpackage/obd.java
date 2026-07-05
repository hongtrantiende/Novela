package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: obd  reason: default package */
/* loaded from: classes3.dex */
public final class obd extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ubd b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ obd(ubd ubdVar, float f, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = ubdVar;
        this.c = f;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new obd(this.b, this.c, m42Var, 0);
            case 1:
                return new obd(this.b, this.c, m42Var, 1);
            case 2:
                return new obd(this.b, this.c, m42Var, 2);
            default:
                return new obd(this.b, this.c, m42Var, 3);
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
                ((obd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((obd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((obd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((obd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = this.c;
        ubd ubdVar = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                ((r6d) ubdVar.C).a.n.e(s9d.t[16], Float.valueOf(f));
                cza czaVar = ubdVar.R;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, s6d.a((s6d) value, 0, 0, 0, false, false, false, false, nae.e, nae.e, 0L, 0L, 0, nae.e, false, nae.e, this.c, 0, 0, false, false, nae.e, false, false, 8355839)));
                    return pvcVar;
                }
                return pvcVar;
            case 1:
                hre.r(obj);
                ((r6d) ubdVar.C).a.h.e(s9d.t[10], Float.valueOf(f));
                cza czaVar2 = ubdVar.R;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, s6d.a((s6d) value2, 0, 0, 0, false, false, false, false, nae.e, this.c, 0L, 0L, 0, nae.e, false, nae.e, nae.e, 0, 0, false, false, nae.e, false, false, 8388351)));
                    return pvcVar;
                }
                return pvcVar;
            case 2:
                hre.r(obj);
                ((r6d) ubdVar.C).a.l.e(s9d.t[14], Float.valueOf(f));
                cza czaVar3 = ubdVar.R;
                if (czaVar3 != null) {
                    do {
                        value3 = czaVar3.getValue();
                    } while (!czaVar3.l(value3, s6d.a((s6d) value3, 0, 0, 0, false, false, false, false, nae.e, nae.e, 0L, 0L, 0, this.c, false, nae.e, nae.e, 0, 0, false, false, nae.e, false, false, 8384511)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                hre.r(obj);
                ((r6d) ubdVar.C).a.g.e(s9d.t[9], Float.valueOf(f));
                cza czaVar4 = ubdVar.R;
                if (czaVar4 != null) {
                    do {
                        value4 = czaVar4.getValue();
                    } while (!czaVar4.l(value4, s6d.a((s6d) value4, 0, 0, 0, false, false, false, false, this.c, nae.e, 0L, 0L, 0, nae.e, false, nae.e, nae.e, 0, 0, false, false, nae.e, false, false, 8388479)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
