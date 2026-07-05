package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rra  reason: default package */
/* loaded from: classes.dex */
public final class rra {
    public final xt4 a;
    public Object b;
    public gv7 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final tv7 e = axe.h();
    public final tv7 f = new tv7();
    public final uv7 g = new uv7();
    public final gw7 h = new gw7(new h23[16], 0);
    public final qv4 i = new qv4(this, 1);
    public final tv7 l = axe.h();
    public final HashMap m = new HashMap();

    public rra(xt4 xt4Var) {
        this.a = xt4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
        if (((defpackage.jza) r15).f(2) == false) goto L153;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x053c  */
    /* JADX WARN: Type inference failed for: r6v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rra.a(java.util.Set):boolean");
    }

    public final void b(Object obj, int i, Object obj2, gv7 gv7Var) {
        int i2;
        if (this.k <= 0) {
            int c = gv7Var.c(obj);
            if (c < 0) {
                c = ~c;
                i2 = -1;
            } else {
                i2 = gv7Var.c[c];
            }
            gv7Var.b[c] = obj;
            gv7Var.c[c] = i;
            if ((obj instanceof h23) && i2 != i) {
                g23 i3 = ((h23) obj).i();
                this.m.put(obj, i3.f);
                gv7 gv7Var2 = i3.e;
                tv7 tv7Var = this.l;
                axe.r(tv7Var, obj);
                Object[] objArr = gv7Var2.b;
                long[] jArr = gv7Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j & 255) < 128) {
                                    iza izaVar = (iza) objArr[(i4 << 3) + i6];
                                    if (izaVar instanceof jza) {
                                        ((jza) izaVar).g(2);
                                    }
                                    axe.c(tv7Var, izaVar, obj);
                                }
                                j >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
            }
            if (i2 == -1) {
                if (obj instanceof jza) {
                    ((jza) obj).g(2);
                }
                axe.c(this.e, obj, obj2);
            }
        }
    }

    public final void c(Object obj, Object obj2) {
        tv7 tv7Var = this.e;
        axe.q(tv7Var, obj2, obj);
        if ((obj2 instanceof h23) && !tv7Var.c(obj2)) {
            axe.r(this.l, obj2);
            this.m.remove(obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rra.d():void");
    }
}
