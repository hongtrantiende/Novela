package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hy8  reason: default package */
/* loaded from: classes3.dex */
public final class hy8 extends e3 {
    @Override // defpackage.tg9
    public final int f(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // defpackage.tg9
    public final long h(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // defpackage.tg9
    public final long i() {
        return ThreadLocalRandom.current().nextLong(1000L);
    }

    @Override // defpackage.e3
    public final Random j() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }
}
