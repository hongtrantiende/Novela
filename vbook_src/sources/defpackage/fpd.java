package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fpd  reason: default package */
/* loaded from: classes3.dex */
public final class fpd extends tg9 implements Serializable {
    public int C;
    public int D;
    public int c;
    public int d;
    public int e;
    public int f;

    @Override // defpackage.tg9
    public final int a(int i) {
        return (d() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.tg9
    public final int d() {
        int i = this.c;
        int i2 = i ^ (i >>> 2);
        this.c = this.d;
        this.d = this.e;
        this.e = this.f;
        int i3 = this.C;
        this.f = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.C = i4;
        int i5 = this.D + 362437;
        this.D = i5;
        return i4 + i5;
    }
}
