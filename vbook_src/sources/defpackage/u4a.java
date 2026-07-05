package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u4a  reason: default package */
/* loaded from: classes.dex */
public final class u4a extends aab implements lu4 {
    public final /* synthetic */ float C;
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ y4a e;
    public final /* synthetic */ tkc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4a(Object obj, Object obj2, y4a y4aVar, tkc tkcVar, float f, m42 m42Var) {
        super(2, m42Var);
        this.c = obj;
        this.d = obj2;
        this.e = y4aVar;
        this.f = tkcVar;
        this.C = f;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        u4a u4aVar = new u4a(this.c, this.d, this.e, this.f, this.C, m42Var);
        u4aVar.b = obj;
        return u4aVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((u4a) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        y4a y4aVar = this.e;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            m82 m82Var = (m82) this.b;
            Object obj2 = this.c;
            Object obj3 = this.d;
            if (!c16.i(obj2, obj3)) {
                y4a.Y(y4aVar);
            } else {
                y4aVar.K = null;
                if (c16.i(y4aVar.c.getValue(), obj2)) {
                    return pvcVar;
                }
            }
            boolean i2 = c16.i(obj2, obj3);
            float f = this.C;
            if (!i2) {
                tkc tkcVar = this.f;
                tkcVar.p(obj2);
                tkcVar.n(0L);
                y4aVar.b.setValue(obj2);
                tkcVar.j(f);
            }
            y4aVar.h0(f);
            if (y4aVar.J.i()) {
                z87.v(m82Var, null, null, new ov9(y4aVar, (m42) null, 1), 3);
            } else {
                y4aVar.I = Long.MIN_VALUE;
            }
            this.a = 1;
            Object b0 = y4a.b0(y4aVar, this);
            n82 n82Var = n82.a;
            if (b0 == n82Var) {
                return n82Var;
            }
        }
        y4aVar.g0();
        return pvcVar;
    }
}
