package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pe0  reason: default package */
/* loaded from: classes.dex */
public final class pe0 extends uq7 {
    public oe0 b;
    public bt1 c;

    @Override // defpackage.uq7
    public final mq7 b() {
        return new oe0(this);
    }

    @Override // defpackage.uq7
    public final /* bridge */ /* synthetic */ void d(mq7 mq7Var) {
        oe0 oe0Var = (oe0) mq7Var;
    }

    public final Object e(n42 n42Var) {
        bt1 bt1Var = this.c;
        if (bt1Var == null) {
            bt1Var = jxe.c();
            this.c = bt1Var;
            oe0 oe0Var = this.b;
            if (oe0Var != null && oe0Var.J) {
                k0 k0Var = new k0(6, oe0Var, oe0Var.L);
                od6 v = voe.v(oe0Var);
                int i = v.b;
                vk9 rectManager = ((rg) rd6.a(v)).getRectManager();
                k7c k7cVar = rectManager.d;
                k7cVar.getClass();
                wu7 wu7Var = k7cVar.a;
                j7c j7cVar = new j7c(k7cVar, i, oe0Var, k0Var);
                Object b = wu7Var.b(i);
                if (b == null) {
                    wu7Var.i(i, j7cVar);
                    b = j7cVar;
                }
                j7c j7cVar2 = (j7c) b;
                if (j7cVar2 != j7cVar) {
                    while (true) {
                        j7c j7cVar3 = j7cVar2.d;
                        if (j7cVar3 == null) {
                            break;
                        }
                        j7cVar2 = j7cVar3;
                    }
                    j7cVar2.d = j7cVar;
                }
                od6 v2 = voe.v(oe0Var.a);
                if (vk9.d(v2)) {
                    kj kjVar = rectManager.c;
                    int e = rectManager.e(v2);
                    long[] jArr = (long[]) kjVar.b;
                    int i2 = e + 2;
                    jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
                }
                rectManager.f = true;
                rectManager.k();
                oe0Var.K = j7cVar;
            }
        }
        Object r = bt1Var.r(n42Var);
        if (r == n82.a) {
            return r;
        }
        return pvc.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 234;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
