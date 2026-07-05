package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class n implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final LocalTime a;
    public final ZoneOffset b;

    static {
        LocalTime localTime = LocalTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localTime.getClass();
        new n(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localTime2.getClass();
        new n(localTime2, zoneOffset2);
    }

    public n(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localTime, "time");
        this.a = localTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new p((byte) 9, this);
    }

    public final n A(LocalTime localTime, ZoneOffset zoneOffset) {
        if (this.a == localTime && this.b.equals(zoneOffset)) {
            return this;
        }
        return new n(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = ChronoField.OFFSET_SECONDS;
            LocalTime localTime = this.a;
            if (temporalField == chronoField) {
                ChronoField chronoField2 = (ChronoField) temporalField;
                return A(localTime, ZoneOffset.ofTotalSeconds(chronoField2.b.a(j, chronoField2)));
            }
            return A(localTime.a(j, temporalField), this.b);
        }
        return (n) temporalField.T(this, j);
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
    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        boolean equals = this.b.equals(nVar.b);
        LocalTime localTime = this.a;
        if (equals) {
            return localTime.compareTo(nVar.a);
        }
        int compare = Long.compare(localTime.a0() - (this.b.b * 1000000000), nVar.a.a0() - (nVar.b.b * 1000000000));
        if (compare == 0) {
            return this.a.compareTo(nVar.a);
        }
        return compare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        boolean z;
        if (temporalQuery != j$.time.temporal.p.d && temporalQuery != j$.time.temporal.p.e) {
            boolean z2 = false;
            if (temporalQuery == j$.time.temporal.p.a) {
                z = true;
            } else {
                z = false;
            }
            if (temporalQuery == j$.time.temporal.p.b) {
                z2 = true;
            }
            if (!(z | z2) && temporalQuery != j$.time.temporal.p.f) {
                if (temporalQuery == j$.time.temporal.p.g) {
                    return this.a;
                }
                if (temporalQuery == j$.time.temporal.p.c) {
                    return j$.time.temporal.a.NANOS;
                }
                return temporalQuery.queryFrom(this);
            }
            return null;
        }
        return this.b;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        return (n) localDate.f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.a.equals(nVar.a) && this.b.equals(nVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l f(j$.time.temporal.l lVar) {
        return lVar.a(this.a.a0(), ChronoField.NANO_OF_DAY).a(this.b.b, ChronoField.OFFSET_SECONDS);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).X() || temporalField == ChronoField.OFFSET_SECONDS) {
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
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                return this.b.b;
            }
            return this.a.k(temporalField);
        }
        return temporalField.N(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                return ((ChronoField) temporalField).b;
            }
            return this.a.l(temporalField);
        }
        return temporalField.A(this);
    }

    public final String toString() {
        String localTime = this.a.toString();
        String zoneOffset = this.b.toString();
        return localTime + zoneOffset;
    }

    @Override // j$.time.temporal.l
    /* renamed from: v */
    public final n b(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return A(this.a.b(j, qVar), this.b);
        }
        return (n) qVar.v(this, j);
    }
}
