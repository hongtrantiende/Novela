package defpackage;

import java.util.Random;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e3  reason: default package */
/* loaded from: classes3.dex */
public abstract class e3 extends tg9 {
    @Override // defpackage.tg9
    public final int a(int i) {
        return (j().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.tg9
    public final double b() {
        return j().nextDouble();
    }

    @Override // defpackage.tg9
    public final int d() {
        return j().nextInt();
    }

    @Override // defpackage.tg9
    public final int e(int i) {
        return j().nextInt(i);
    }

    @Override // defpackage.tg9
    public final long g() {
        return j().nextLong();
    }

    public abstract Random j();
}
