package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements TemporalQuery, j$.time.temporal.m {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.m
    public j$.time.temporal.l f(j$.time.temporal.l lVar) {
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return lVar.a(lVar.l(chronoField).d, chronoField);
    }

    @Override // j$.time.temporal.TemporalQuery
    public Object queryFrom(TemporalAccessor temporalAccessor) {
        int i = this.a;
        f fVar = j$.time.temporal.p.a;
        ZonedDateTime zonedDateTime = null;
        switch (i) {
            case 0:
                return LocalDate.F(temporalAccessor);
            case 1:
                return LocalDateTime.A(temporalAccessor);
            case 2:
                return LocalTime.A(temporalAccessor);
            case 3:
                DateTimeFormatter dateTimeFormatter = YearMonth.c;
                if (temporalAccessor instanceof YearMonth) {
                    return (YearMonth) temporalAccessor;
                }
                Objects.requireNonNull(temporalAccessor, "temporal");
                try {
                    if (!j$.time.chrono.q.c.equals(j$.time.chrono.j.q(temporalAccessor))) {
                        temporalAccessor = LocalDate.F(temporalAccessor);
                    }
                    return YearMonth.of(temporalAccessor.h(ChronoField.YEAR), temporalAccessor.h(ChronoField.MONTH_OF_YEAR));
                } catch (DateTimeException e) {
                    e.g("Unable to obtain YearMonth from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
                    return null;
                }
            case 4:
                if (temporalAccessor instanceof ZonedDateTime) {
                    return (ZonedDateTime) temporalAccessor;
                }
                try {
                    ZoneId v = ZoneId.v(temporalAccessor);
                    ChronoField chronoField = ChronoField.INSTANT_SECONDS;
                    if (temporalAccessor.i(chronoField)) {
                        zonedDateTime = ZonedDateTime.v(temporalAccessor.k(chronoField), temporalAccessor.h(ChronoField.NANO_OF_SECOND), v);
                    } else {
                        zonedDateTime = ZonedDateTime.ofLocal(LocalDateTime.of(LocalDate.F(temporalAccessor), LocalTime.A(temporalAccessor)), v, null);
                    }
                    return zonedDateTime;
                } catch (DateTimeException e2) {
                    e.g("Unable to obtain ZonedDateTime from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e2);
                    return zonedDateTime;
                }
            case 5:
                f fVar2 = DateTimeFormatterBuilder.h;
                ZoneId zoneId = (ZoneId) temporalAccessor.d(fVar);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 6:
            default:
                ChronoField chronoField2 = ChronoField.NANO_OF_DAY;
                if (!temporalAccessor.i(chronoField2)) {
                    return null;
                }
                return LocalTime.I(temporalAccessor.k(chronoField2));
            case 7:
                return (ZoneId) temporalAccessor.d(fVar);
            case 8:
                return (j$.time.chrono.j) temporalAccessor.d(j$.time.temporal.p.b);
            case 9:
                return (j$.time.temporal.q) temporalAccessor.d(j$.time.temporal.p.c);
            case 10:
                ChronoField chronoField3 = ChronoField.OFFSET_SECONDS;
                if (!temporalAccessor.i(chronoField3)) {
                    return null;
                }
                return ZoneOffset.ofTotalSeconds(temporalAccessor.h(chronoField3));
            case 11:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.d(fVar);
                if (zoneId2 == null) {
                    return (ZoneId) temporalAccessor.d(j$.time.temporal.p.d);
                }
                return zoneId2;
            case 12:
                ChronoField chronoField4 = ChronoField.EPOCH_DAY;
                if (!temporalAccessor.i(chronoField4)) {
                    return null;
                }
                return LocalDate.ofEpochDay(temporalAccessor.k(chronoField4));
        }
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "ZoneId";
            case 8:
                return "Chronology";
            case 9:
                return "Precision";
            case 10:
                return "ZoneOffset";
            case 11:
                return "Zone";
            case 12:
                return "LocalDate";
            case 13:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
