package j$.time.temporal;

import j$.time.Duration;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public enum h implements q {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");
    
    public final String a;

    static {
        Duration.A(31556952L, 0);
        Duration.A(7889238L, 0);
    }

    h(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.q
    public final l v(l lVar, long j) {
        int i = b.a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return lVar.b(j / 4, a.YEARS).b((j % 4) * 3, a.MONTHS);
            }
            throw new IllegalStateException("Unreachable");
        }
        g gVar = i.c;
        return lVar.a(Math.addExact(lVar.h(gVar), j), gVar);
    }
}
