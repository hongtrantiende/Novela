package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.format.c0;
import j$.time.format.d0;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public enum j implements TemporalField {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);
    
    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient s b;
    public final transient long c;

    static {
        a aVar = a.NANOS;
    }

    j(String str, long j) {
        this.a = str;
        this.b = s.f((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // j$.time.temporal.TemporalField
    public final s A(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.i(ChronoField.EPOCH_DAY)) {
            return this.b;
        }
        j$.time.e.i("Unsupported field: ", this);
        return null;
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor F(Map map, c0 c0Var, d0 d0Var) {
        long longValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.j q = j$.time.chrono.j.q(c0Var);
        d0 d0Var2 = d0.LENIENT;
        long j = this.c;
        if (d0Var == d0Var2) {
            return q.o(Math.subtractExact(longValue, j));
        }
        this.b.b(longValue, this);
        return q.o(longValue - j);
    }

    @Override // j$.time.temporal.TemporalField
    public final s I() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalField
    public final long N(TemporalAccessor temporalAccessor) {
        return temporalAccessor.k(ChronoField.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.TemporalField
    public final l T(l lVar, long j) {
        if (this.b.e(j)) {
            return lVar.a(Math.subtractExact(j, this.c), ChronoField.EPOCH_DAY);
        }
        throw new DateTimeException("Invalid value: " + this.a + " " + j);
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean v(TemporalAccessor temporalAccessor) {
        return temporalAccessor.i(ChronoField.EPOCH_DAY);
    }
}
