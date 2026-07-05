package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oj8  reason: default package */
/* loaded from: classes.dex */
public final class oj8 extends aab implements lu4 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rj8 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ xr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj8(rj8 rj8Var, int i, float f, xr xrVar, m42 m42Var) {
        super(2, m42Var);
        this.c = rj8Var;
        this.d = i;
        this.e = f;
        this.f = xrVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        oj8 oj8Var = new oj8(this.c, this.d, this.e, this.f, m42Var);
        oj8Var.b = obj;
        return oj8Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((oj8) create((i2a) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Type inference failed for: r11v12, types: [wl9, java.lang.Object] */
    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hre.r(obj);
                return pvcVar;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        rj8 rj8Var = this.c;
        ig6 ig6Var = new ig6((i2a) this.b, rj8Var, 2);
        this.a = 1;
        tj8 tj8Var = uj8.a;
        int i3 = this.d;
        rj8Var.q.i(rj8Var.j(new Integer(i3).intValue()));
        if (i3 > rj8Var.e) {
            z = true;
        } else {
            z = false;
        }
        int e = (ig6Var.e() - rj8Var.e) + 1;
        if (((z && i3 > ig6Var.e()) || (!z && i3 < rj8Var.e)) && Math.abs(i3 - rj8Var.e) >= 3) {
            if (z) {
                i = i3 - e;
                int i4 = rj8Var.e;
                if (i < i4) {
                    i = i4;
                }
            } else {
                int i5 = e + i3;
                i = rj8Var.e;
                if (i5 <= i) {
                    i = i5;
                }
            }
            ig6Var.f(i, 0);
        }
        Object l = ote.l(nae.e, ig6Var.b(i3) + this.e, this.f, new n71(new Object(), ig6Var, 1), this, 4);
        n82 n82Var = n82.a;
        if (l != n82Var) {
            l = pvcVar;
        }
        if (l == n82Var) {
            return n82Var;
        }
        return pvcVar;
    }
}
