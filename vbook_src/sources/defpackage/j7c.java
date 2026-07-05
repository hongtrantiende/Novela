package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j7c  reason: default package */
/* loaded from: classes.dex */
public final class j7c {
    public final int a;
    public final oe0 b;
    public final k0 c;
    public j7c d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ k7c h;

    public j7c(k7c k7cVar, int i, oe0 oe0Var, k0 k0Var) {
        this.h = k7cVar;
        this.a = i;
        this.b = oe0Var;
        this.c = k0Var;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        xm9 xm9Var;
        xm9 xm9Var2;
        long v;
        long j5 = this.h.f;
        oe0 oe0Var = this.b;
        i38 s = voe.s(oe0Var, 2);
        od6 v2 = voe.v(oe0Var);
        boolean K = v2.K();
        kn knVar = v2.c0;
        if (!K) {
            xm9Var2 = null;
        } else {
            if (((i38) knVar.e) != s) {
                long floatToRawIntBits = Float.floatToRawIntBits((int) (j >> 32));
                long j6 = s.c;
                i38 i38Var = (i38) knVar.e;
                i38Var.getClass();
                xm9Var = new xm9(hif.v(i38Var.l0(s, (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (floatToRawIntBits << 32), true)), (4294967295L & (((int) (v & 4294967295L)) + ((int) (j6 & 4294967295L)))) | ((((int) (v >> 32)) + ((int) (j6 >> 32))) << 32), j3, j4, j5, fArr, oe0Var);
            } else {
                xm9Var = new xm9(j, j2, j3, j4, j5, fArr, oe0Var);
            }
            xm9Var2 = xm9Var;
        }
        if (xm9Var2 == null) {
            return;
        }
        this.c.invoke(xm9Var2);
    }

    public final void b() {
        j7c j7cVar;
        k7c k7cVar = this.h;
        wu7 wu7Var = k7cVar.a;
        int i = this.a;
        j7c j7cVar2 = (j7c) wu7Var.g(i);
        if (j7cVar2 != null) {
            if (j7cVar2 != this) {
                int d = wu7Var.d(i);
                Object[] objArr = wu7Var.c;
                Object obj = objArr[d];
                wu7Var.b[d] = i;
                objArr[d] = j7cVar2;
                while (true) {
                    j7c j7cVar3 = j7cVar2.d;
                    if (j7cVar3 == null) {
                        break;
                    } else if (j7cVar3 == this) {
                        j7cVar2.d = this.d;
                        this.d = null;
                        return;
                    } else {
                        j7cVar2 = j7cVar3;
                    }
                }
            } else {
                j7c j7cVar4 = this.d;
                this.d = null;
                if (j7cVar4 != null) {
                    int d2 = wu7Var.d(i);
                    Object[] objArr2 = wu7Var.c;
                    Object obj2 = objArr2[d2];
                    wu7Var.b[d2] = i;
                    objArr2[d2] = j7cVar4;
                    return;
                }
                od6 v = voe.v(this.b.a);
                if (v.J()) {
                    vk9 rectManager = ((rg) rd6.a(v)).getRectManager();
                    rectManager.getClass();
                    if (v.C != -4) {
                        kj kjVar = rectManager.c;
                        int e = rectManager.e(v);
                        long[] jArr = (long[]) kjVar.b;
                        int i2 = e + 2;
                        jArr[i2] = jArr[i2] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
        }
        j7c j7cVar5 = k7cVar.b;
        if (j7cVar5 == this) {
            k7cVar.b = j7cVar5.d;
            this.d = null;
            return;
        }
        if (j7cVar5 != null) {
            j7cVar = j7cVar5.d;
        } else {
            j7cVar = null;
        }
        while (true) {
            j7c j7cVar6 = j7cVar5;
            j7cVar5 = j7cVar;
            if (j7cVar5 != null) {
                if (j7cVar5 == this) {
                    if (j7cVar6 != null) {
                        j7cVar6.d = j7cVar5.d;
                    }
                    this.d = null;
                    return;
                }
                j7cVar = j7cVar5.d;
            } else {
                return;
            }
        }
    }
}
