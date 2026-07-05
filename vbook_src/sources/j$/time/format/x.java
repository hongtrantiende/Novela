package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class x {
    public final TemporalAccessor a;
    public final DateTimeFormatter b;
    public int c;

    public x(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.j jVar;
        ChronoField[] values;
        j$.time.chrono.j jVar2 = dateTimeFormatter.e;
        if (jVar2 != null) {
            j$.time.chrono.j jVar3 = (j$.time.chrono.j) temporalAccessor.d(j$.time.temporal.p.b);
            ZoneId zoneId = (ZoneId) temporalAccessor.d(j$.time.temporal.p.a);
            ChronoLocalDate chronoLocalDate = null;
            jVar2 = Objects.equals(jVar2, jVar3) ? null : jVar2;
            if (jVar2 != null) {
                if (jVar2 != null) {
                    jVar = jVar2;
                } else {
                    jVar = jVar3;
                }
                if (jVar2 != null) {
                    if (temporalAccessor.i(ChronoField.EPOCH_DAY)) {
                        chronoLocalDate = jVar.G(temporalAccessor);
                    } else if (jVar2 != j$.time.chrono.q.c || jVar3 != null) {
                        for (ChronoField chronoField : ChronoField.values()) {
                            if (chronoField.isDateBased() && temporalAccessor.i(chronoField)) {
                                throw new DateTimeException("Unable to apply override chronology '" + jVar2 + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new w(chronoLocalDate, temporalAccessor, jVar, zoneId);
            }
        }
        this.a = temporalAccessor;
        this.b = dateTimeFormatter;
    }

    public final Long a(TemporalField temporalField) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i > 0 && !temporalAccessor.i(temporalField)) {
            return null;
        }
        return Long.valueOf(temporalAccessor.k(temporalField));
    }

    public final Object b(TemporalQuery temporalQuery) {
        TemporalAccessor temporalAccessor = this.a;
        Object d = temporalAccessor.d(temporalQuery);
        if (d == null && this.c == 0) {
            throw new DateTimeException("Unable to extract " + temporalQuery + " from temporal " + temporalAccessor);
        }
        return d;
    }

    public final String toString() {
        return this.a.toString();
    }
}
