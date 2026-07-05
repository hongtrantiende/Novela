package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oe0  reason: default package */
/* loaded from: classes.dex */
public final class oe0 extends mq7 {
    public j7c K;
    public final /* synthetic */ pe0 L;

    public oe0(pe0 pe0Var) {
        this.L = pe0Var;
    }

    @Override // defpackage.mq7
    public final void A1() {
        pe0 pe0Var = this.L;
        if (pe0Var.b == this) {
            pe0Var.b = null;
        }
        j7c j7cVar = this.K;
        if (j7cVar != null) {
            j7cVar.b();
        }
        this.K = null;
    }

    @Override // defpackage.mq7
    public final void z1() {
        pe0 pe0Var = this.L;
        pe0Var.b = this;
        if (pe0Var.c != null) {
            k0 k0Var = new k0(6, this, pe0Var);
            od6 v = voe.v(this);
            int i = v.b;
            vk9 rectManager = ((rg) rd6.a(v)).getRectManager();
            k7c k7cVar = rectManager.d;
            k7cVar.getClass();
            wu7 wu7Var = k7cVar.a;
            j7c j7cVar = new j7c(k7cVar, i, this, k0Var);
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
            od6 v2 = voe.v(this.a);
            if (vk9.d(v2)) {
                kj kjVar = rectManager.c;
                int e = rectManager.e(v2);
                long[] jArr = (long[]) kjVar.b;
                int i2 = e + 2;
                jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
            }
            rectManager.f = true;
            rectManager.k();
            this.K = j7cVar;
        }
    }
}
