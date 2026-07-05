package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b75  reason: default package */
/* loaded from: classes.dex */
public final class b75 extends hh1 {
    public byte[] F;
    public volatile boolean G;
    public byte[] H;

    @Override // defpackage.gs6
    public final void b() {
        try {
            this.E.d(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.G) {
                byte[] bArr = this.F;
                if (bArr.length < i2 + 16384) {
                    this.F = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.E.read(this.F, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.G) {
                this.H = Arrays.copyOf(this.F, i2);
            }
            yae.k(this.E);
        } catch (Throwable th) {
            yae.k(this.E);
            throw th;
        }
    }

    @Override // defpackage.gs6
    public final void c() {
        this.G = true;
    }
}
