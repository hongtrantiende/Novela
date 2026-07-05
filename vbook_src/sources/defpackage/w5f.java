package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w5f  reason: default package */
/* loaded from: classes.dex */
public final class w5f {
    public final a6f a;
    public int b = 1;
    public long c = a();

    public w5f(a6f a6fVar) {
        this.a = a6fVar;
    }

    public final long a() {
        a6f a6fVar = this.a;
        am8.s(a6fVar);
        long longValue = ((Long) yme.v.a(null)).longValue();
        long longValue2 = ((Long) yme.w.a(null)).longValue();
        for (int i = 1; i < this.b; i++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        a6fVar.e().getClass();
        return Math.min(longValue, longValue2) + System.currentTimeMillis();
    }
}
