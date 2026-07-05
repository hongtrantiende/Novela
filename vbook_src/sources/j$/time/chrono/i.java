package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.zone.ZoneRules;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class i implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient e a;
    public final transient ZoneOffset b;
    public final transient ZoneId c;

    public i(ZoneId zoneId, ZoneOffset zoneOffset, e eVar) {
        Objects.requireNonNull(eVar, "dateTime");
        this.a = eVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.c = zoneId;
    }

    public static i A(ZoneId zoneId, ZoneOffset zoneOffset, e eVar) {
        j$.time.zone.b bVar;
        Objects.requireNonNull(eVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new i(zoneId, (ZoneOffset) zoneId, eVar);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime A = LocalDateTime.A(eVar);
        List e = rules.e(A);
        if (e.size() == 1) {
            zoneOffset = (ZoneOffset) e.get(0);
        } else if (e.size() == 0) {
            Object d = rules.d(A);
            if (d instanceof j$.time.zone.b) {
                bVar = (j$.time.zone.b) d;
            } else {
                bVar = null;
            }
            eVar = eVar.F(eVar.a, 0L, 0L, Duration.A(bVar.d.b - bVar.c.b, 0).a, 0L);
            zoneOffset = bVar.d;
        } else {
            if (zoneOffset == null || !e.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) e.get(0);
            }
            eVar = eVar;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new i(zoneId, zoneOffset, eVar);
    }

    public static i F(j jVar, Instant instant, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        Objects.requireNonNull(offset, "offset");
        return new i(zoneId, offset, (e) jVar.H(LocalDateTime.I(instant.getEpochSecond(), instant.getNano(), offset)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static i v(j jVar, j$.time.temporal.l lVar) {
        i iVar = (i) lVar;
        if (jVar.equals(iVar.g())) {
            return iVar;
        }
        j$.time.e.e("Chronology mismatch, required: ", jVar.p(), iVar.g().p());
        return null;
    }

    private Object writeReplace() {
        return new c0((byte) 3, this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime D(ZoneId zoneId) {
        return A(zoneId, this.b, this.a);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId J() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.l
    public final ChronoZonedDateTime a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i = h.a[chronoField.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return A(this.c, this.b, this.a.a(j, temporalField));
                }
                ZoneOffset ofTotalSeconds = ZoneOffset.ofTotalSeconds(chronoField.b.a(j, chronoField));
                e eVar = this.a;
                return F(g(), Instant.ofEpochSecond(eVar.u(ofTotalSeconds), eVar.b.d), this.c);
            }
            return b(j - V(), (j$.time.temporal.q) j$.time.temporal.a.SECONDS);
        }
        return v(g(), temporalField.T(this, j));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.l
    public final ChronoZonedDateTime b(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return e(this.a.b(j, qVar));
        }
        return v(g(), qVar.v(this, j));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof ChronoZonedDateTime) && compareTo((ChronoZonedDateTime) obj) == 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c.hashCode(), 3) ^ (this.a.hashCode() ^ this.b.hashCode());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            if (temporalField == null || !temporalField.v(this)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset n() {
        return this.b;
    }

    public final String toString() {
        String str = this.a.toString() + this.b.toString();
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        if (zoneOffset != zoneId) {
            return str + "[" + zoneId.toString() + "]";
        }
        return str;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime w() {
        return this.a;
    }
}
