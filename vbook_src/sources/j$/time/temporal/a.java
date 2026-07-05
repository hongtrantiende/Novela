package j$.time.temporal;

import j$.time.Duration;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public enum a implements q {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");
    
    public final String a;

    static {
        Duration.F(1L);
        Duration.F(1000L);
        Duration.F(1000000L);
        Duration.A(1L, 0);
        Duration.A(60L, 0);
        Duration.A(3600L, 0);
        Duration.A(43200L, 0);
        Duration.A(86400L, 0);
        Duration.A(604800L, 0);
        Duration.A(2629746L, 0);
        Duration.A(31556952L, 0);
        Duration.A(315569520L, 0);
        Duration.A(3155695200L, 0);
        Duration.A(31556952000L, 0);
        Duration.A(31556952000000000L, 0);
        Duration.A(Math.addExact(Long.MAX_VALUE, Math.floorDiv(999999999L, 1000000000L)), (int) Math.floorMod(999999999L, 1000000000L));
    }

    a(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.q
    public final l v(l lVar, long j) {
        return lVar.b(j, this);
    }
}
