package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qbd  reason: default package */
/* loaded from: classes3.dex */
public final class qbd extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ubd b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qbd(ubd ubdVar, long j, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = ubdVar;
        this.c = j;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new qbd(this.b, this.c, m42Var, 0);
            default:
                return new qbd(this.b, this.c, m42Var, 1);
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
                ((qbd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((qbd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        long j = this.c;
        ubd ubdVar = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                ((r6d) ubdVar.C).a.j.e(s9d.t[12], Long.valueOf(j));
                cza czaVar = ubdVar.R;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, s6d.a((s6d) value, 0, 0, 0, false, false, false, false, nae.e, nae.e, 0L, this.c, 0, nae.e, false, nae.e, nae.e, 0, 0, false, false, nae.e, false, false, 8387583)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                hre.r(obj);
                ((r6d) ubdVar.C).a.i.e(s9d.t[11], Long.valueOf(j));
                cza czaVar2 = ubdVar.R;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, s6d.a((s6d) value2, 0, 0, 0, false, false, false, false, nae.e, nae.e, this.c, 0L, 0, nae.e, false, nae.e, nae.e, 0, 0, false, false, nae.e, false, false, 8388095)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
