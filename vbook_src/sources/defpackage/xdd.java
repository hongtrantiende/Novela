package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xdd  reason: default package */
/* loaded from: classes.dex */
public final class xdd extends gdd {
    public final tv7 b;

    public xdd() {
        long[] jArr = tz9.a;
        this.b = new tv7();
    }

    @Override // defpackage.gdd
    public final void d() {
        tv7 tv7Var;
        tv7 tv7Var2 = this.b;
        if (tv7Var2.i()) {
            tv7Var = tz9.b;
            tv7Var.getClass();
        } else {
            tv7 tv7Var3 = new tv7(tv7Var2.e);
            tv7Var3.k(tv7Var2);
            tv7Var = tv7Var3;
        }
        Object[] objArr = tv7Var.c;
        long[] jArr = tv7Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            wdd wddVar = (wdd) objArr[(i << 3) + i3];
                            wddVar.d = true;
                            if (wddVar.c <= 0) {
                                e(wddVar.a);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void e(Object obj) {
        qdd qddVar;
        wdd wddVar = (wdd) this.b.l(obj);
        if (wddVar != null && (qddVar = wddVar.b) != null) {
            qddVar.a();
        }
    }
}
