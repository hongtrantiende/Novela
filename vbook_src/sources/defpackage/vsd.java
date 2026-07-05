package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vsd  reason: default package */
/* loaded from: classes3.dex */
public final class vsd extends aab implements lu4 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ atd c;
    public final /* synthetic */ float d;
    public final /* synthetic */ gxa e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsd(atd atdVar, float f, gxa gxaVar, long j, m42 m42Var) {
        super(2, m42Var);
        this.c = atdVar;
        this.d = f;
        this.e = gxaVar;
        this.f = j;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        vsd vsdVar = new vsd(this.c, this.d, this.e, this.f, m42Var);
        vsdVar.b = obj;
        return vsdVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((vsd) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        final m82 m82Var = (m82) this.b;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            final atd atdVar = this.c;
            float g = atdVar.g();
            float h = atdVar.h();
            final long floatToRawIntBits = (Float.floatToRawIntBits(g) << 32) | (Float.floatToRawIntBits(h) & 4294967295L);
            final float f = atdVar.f();
            float f2 = this.d;
            final float f3 = f2 - f;
            final long j = this.f;
            lu4 lu4Var = new lu4() { // from class: tsd
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    float floatValue = ((Float) obj2).floatValue();
                    ((Float) obj3).getClass();
                    z87.v(m82.this, null, null, new usd(atdVar, floatValue, j, f3, f, floatToRawIntBits, null), 3);
                    return pvc.a;
                }
            };
            this.b = null;
            this.a = 1;
            Object l = ote.l(f, f2, this.e, lu4Var, this, 4);
            n82 n82Var = n82.a;
            if (l == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }
}
