package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rzb  reason: default package */
/* loaded from: classes3.dex */
public final class rzb extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ a0c c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rzb(a0c a0cVar, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.c = a0cVar;
        this.d = i;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        int i2 = this.d;
        a0c a0cVar = this.c;
        switch (i) {
            case 0:
                return new rzb(a0cVar, i2, m42Var, 0);
            default:
                return new rzb(a0cVar, i2, m42Var, 1);
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
                return ((rzb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((rzb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object k;
        int i = this.a;
        int i2 = this.d;
        n82 n82Var = n82.a;
        a0c a0cVar = this.c;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        k = obj;
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    vpc l = a0cVar.l();
                    this.b = 1;
                    xyb xybVar = l.a;
                    xybVar.getClass();
                    k = xybVar.k(this);
                    if (k == n82Var) {
                        return n82Var;
                    }
                }
                int n = dce.n(i2, 1, ((syb) k).c);
                i2c i2cVar = (i2c) a0cVar.c;
                y1c y1cVar = i2cVar.a;
                String c = y1cVar.c();
                String j = i2cVar.j();
                c.getClass();
                h49 b = y1cVar.b();
                b.getClass();
                b.h(n, "tts_break_length_" + c + "_" + j);
                cza czaVar = a0cVar.d;
                if (czaVar != null) {
                    while (true) {
                        Object value = czaVar.getValue();
                        int i4 = n;
                        if (!czaVar.l(value, nzb.a((nzb) value, nae.e, nae.e, null, null, null, null, null, null, null, 0, null, false, null, null, i4, false, false, false, 245759))) {
                            n = i4;
                        }
                    }
                }
                return pvcVar;
            default:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    i2c i2cVar2 = (i2c) a0cVar.c;
                    y1c y1cVar2 = i2cVar2.a;
                    String c2 = y1cVar2.c();
                    String j2 = i2cVar2.j();
                    c2.getClass();
                    h49 b2 = y1cVar2.b();
                    b2.getClass();
                    b2.h(i2, "tts_break_" + c2 + "_" + j2);
                    this.b = 1;
                    a0cVar.n();
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }
}
