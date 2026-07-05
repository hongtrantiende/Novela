package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zk1  reason: default package */
/* loaded from: classes.dex */
public final class zk1 extends xb1 {
    public final int C;
    public int D;
    public int d;
    public int e;
    public final int f;

    public zk1(byte[] bArr, int i, int i2, boolean z) {
        super(2, (byte) 0);
        this.D = Integer.MAX_VALUE;
        this.d = i2 + i;
        this.f = i;
        this.C = i;
    }

    @Override // defpackage.xb1
    public final int b() {
        return this.f - this.C;
    }

    @Override // defpackage.xb1
    public final int j(int i) {
        if (i >= 0) {
            int b = b() + i;
            if (b >= 0) {
                int i2 = this.D;
                if (b <= i2) {
                    this.D = b;
                    int i3 = this.d + this.e;
                    this.d = i3;
                    int i4 = i3 - this.C;
                    int i5 = this.D;
                    if (i4 > i5) {
                        int i6 = i4 - i5;
                        this.e = i6;
                        this.d = i3 - i6;
                    } else {
                        this.e = 0;
                    }
                    return i2;
                }
                throw p16.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw p16.d();
    }
}
