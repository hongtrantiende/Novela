package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.l, j$.time.temporal.m, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    static {
        ofEpochSecond(-31557014167219200L, 0L);
        ofEpochSecond(31556889864403199L, 999999999L);
    }

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Instant A(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.k(ChronoField.INSTANT_SECONDS), temporalAccessor.h(ChronoField.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            e.g("Unable to obtain Instant from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
            return null;
        }
    }

    public static Instant now() {
        a.b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant ofEpochMilli(long j) {
        return v(Math.floorDiv(j, 1000L), ((int) Math.floorMod(j, 1000L)) * 1000000);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return v(Math.addExact(j, Math.floorDiv(j2, 1000000000L)), (int) Math.floorMod(j2, 1000000000L));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static Instant v(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        e.a("Instant exceeds minimum or maximum instant");
        return null;
    }

    private Object writeReplace() {
        return new p((byte) 2, this);
    }

    public final Instant F(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(Math.addExact(Math.addExact(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.l
    /* renamed from: I */
    public final Instant b(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            switch (d.b[((j$.time.temporal.a) qVar).ordinal()]) {
                case 1:
                    return F(0L, j);
                case 2:
                    return F(j / 1000000, (j % 1000000) * 1000);
                case 3:
                    return F(j / 1000, (j % 1000) * 1000000);
                case 4:
                    return F(j, 0L);
                case 5:
                    return F(Math.multiplyExact(j, 60L), 0L);
                case 6:
                    return F(Math.multiplyExact(j, 3600L), 0L);
                case 7:
                    return F(Math.multiplyExact(j, 43200L), 0L);
                case 8:
                    return F(Math.multiplyExact(j, 86400L), 0L);
                default:
                    e.d("Unsupported unit: ", qVar);
                    return null;
            }
        }
        return (Instant) qVar.v(this, j);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.W(j);
            int i = d.a[chronoField.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (j != this.a) {
                                return v(j, this.b);
                            }
                            return this;
                        }
                        throw new DateTimeException(c.a("Unsupported field: ", temporalField));
                    }
                    int i2 = ((int) j) * 1000000;
                    if (i2 != this.b) {
                        return v(this.a, i2);
                    }
                    return this;
                }
                int i3 = ((int) j) * 1000;
                if (i3 != this.b) {
                    return v(this.a, i3);
                }
                return this;
            } else if (j != this.b) {
                return v(this.a, (int) j);
            } else {
                return this;
            }
        }
        return (Instant) temporalField.T(this, j);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.v(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.v(getEpochSecond(), getNano(), zoneId);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.q qVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, qVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, qVar);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int compare = Long.compare(this.a, instant2.a);
        if (compare != 0) {
            return compare;
        }
        return this.b - instant2.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.c) {
            return j$.time.temporal.a.NANOS;
        }
        if (temporalQuery != j$.time.temporal.p.b && temporalQuery != j$.time.temporal.p.a && temporalQuery != j$.time.temporal.p.e && temporalQuery != j$.time.temporal.p.d && temporalQuery != j$.time.temporal.p.f && temporalQuery != j$.time.temporal.p.g) {
            return temporalQuery.queryFrom(this);
        }
        return null;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        return (Instant) localDate.f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l f(j$.time.temporal.l lVar) {
        return lVar.a(this.a, ChronoField.INSTANT_SECONDS).a(this.b, ChronoField.NANO_OF_SECOND);
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = d.a[((ChronoField) temporalField).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
                            chronoField.b.a(this.a, chronoField);
                        }
                        throw new DateTimeException(c.a("Unsupported field: ", temporalField));
                    }
                    return this.b / 1000000;
                }
                return this.b / 1000;
            }
            return this.b;
        }
        return super.l(temporalField).a(temporalField.N(this), temporalField);
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND) {
                return true;
            }
            return false;
        } else if (temporalField != null && temporalField.v(this)) {
            return true;
        } else {
            return false;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        int i;
        if (temporalField instanceof ChronoField) {
            int i2 = d.a[((ChronoField) temporalField).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return this.a;
                        }
                        throw new DateTimeException(c.a("Unsupported field: ", temporalField));
                    }
                    i = this.b / 1000000;
                } else {
                    i = this.b / 1000;
                }
            } else {
                i = this.b;
            }
            return i;
        }
        return temporalField.N(this);
    }

    public long toEpochMilli() {
        long j = this.a;
        if (j < 0 && this.b > 0) {
            return Math.addExact(Math.multiplyExact(j + 1, 1000L), (this.b / 1000000) - 1000);
        }
        return Math.addExact(Math.multiplyExact(j, 1000L), this.b / 1000000);
    }

    public final String toString() {
        return DateTimeFormatter.h.format(this);
    }
}
