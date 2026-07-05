package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: klf  reason: default package */
/* loaded from: classes.dex */
public final class klf extends lxd {
    public final hre b;
    public final hre c;
    public final int[] d;
    public final int e;

    public klf(hre hreVar, hre hreVar2) {
        boolean z;
        int i;
        this.b = hreVar;
        this.c = hreVar2;
        int t = hreVar2.t();
        if (t <= 28) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int[] iArr = new int[t];
            this.d = iArr;
            long j = 0;
            int i2 = 0;
            int i3 = 0;
            while (i2 < t) {
                sjf d = d(i2);
                long j2 = d.e | j;
                if (j2 == j) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < i3) {
                            if (d.equals(d(iArr[i4] & 31))) {
                                break;
                            }
                            i4++;
                        } else {
                            i4 = -1;
                            break;
                        }
                    }
                    if (i4 != -1) {
                        if (d.c) {
                            i = iArr[i4] | (1 << (i2 + 4));
                        } else {
                            i = i2;
                        }
                        iArr[i4] = i;
                        i2++;
                        j = j2;
                    }
                }
                iArr[i3] = i2;
                i3++;
                i2++;
                j = j2;
            }
            this.e = i3;
            return;
        }
        vs.m("metadata size too large");
        throw null;
    }

    @Override // defpackage.lxd
    public final void a(dlf dlfVar, vkf vkfVar) {
        for (int i = 0; i < this.e; i++) {
            int i2 = this.d[i];
            sjf d = d(i2 & 31);
            if (!d.c) {
                hre hreVar = this.b;
                int t = hreVar.t();
                if (i2 >= t) {
                    hreVar = this.c;
                    i2 -= t;
                }
                dlfVar.a(d, d.b.cast(hreVar.v(i2)), vkfVar);
            } else {
                dlfVar.b(d, new ilf(this, d, i2), vkfVar);
            }
        }
    }

    @Override // defpackage.lxd
    public final int b() {
        return this.e;
    }

    @Override // defpackage.lxd
    public final Set c() {
        return new tz(this, 3);
    }

    public final sjf d(int i) {
        hre hreVar = this.b;
        int t = hreVar.t();
        if (i >= t) {
            return this.c.u(i - t);
        }
        return hreVar.u(i);
    }
}
