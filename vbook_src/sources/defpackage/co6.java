package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: co6  reason: default package */
/* loaded from: classes.dex */
public final class co6 extends gdd {
    public final wu7 b;

    public co6() {
        wu7 wu7Var = oy5.a;
        this.b = new wu7();
    }

    @Override // defpackage.gdd
    public final void d() {
        wu7 wu7Var = this.b;
        int[] iArr = wu7Var.b;
        Object[] objArr = wu7Var.c;
        long[] jArr = wu7Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = iArr[i4];
                            kv7 kv7Var = (kv7) objArr[i4];
                            Object[] objArr2 = kv7Var.a;
                            int i6 = kv7Var.b;
                            for (int i7 = 0; i7 < i6; i7++) {
                                bo6 bo6Var = (bo6) objArr2[i7];
                                h61 h61Var = bo6Var.d;
                                if (h61Var != null) {
                                    h61Var.cancel();
                                }
                                bo6Var.d = null;
                                j07 j07Var = (j07) bo6Var.a.b;
                                j07Var.b = true;
                                j07Var.a = false;
                                j07Var.a();
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
}
