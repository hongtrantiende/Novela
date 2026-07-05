package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vy7  reason: default package */
/* loaded from: classes3.dex */
public final class vy7 extends aab implements lu4 {
    public int a;
    public final /* synthetic */ xy7 b;
    public final /* synthetic */ xic c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy7(xy7 xy7Var, xic xicVar, long j, boolean z, m42 m42Var) {
        super(2, m42Var);
        this.b = xy7Var;
        this.c = xicVar;
        this.d = j;
        this.e = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new vy7(this.b, this.c, this.d, this.e, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((vy7) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        q9d q9dVar = this.b.a;
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
            vad s = xy7.s(this.c);
            this.a = 1;
            Object b = q9dVar.b(s, null, this);
            n82 n82Var = n82.a;
            if (b == n82Var) {
                return n82Var;
            }
        }
        long j = this.d;
        if (j > 0) {
            hq7 hq7Var = wl3.b;
            q9dVar.a.G(wl3.e(jue.P(j, am3.MILLISECONDS)));
        }
        if (this.e) {
            q9dVar.c();
        }
        return pvc.a;
    }
}
