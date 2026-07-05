package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public abstract class c implements ChronoLocalDate, j$.time.temporal.l, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static ChronoLocalDate v(j jVar, j$.time.temporal.l lVar) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) lVar;
        if (jVar.equals(chronoLocalDate.g())) {
            return chronoLocalDate;
        }
        j$.time.e.e("Chronology mismatch, expected: ", jVar.p(), chronoLocalDate.g().p());
        return null;
    }

    public abstract ChronoLocalDate A(long j);

    public abstract ChronoLocalDate F(long j);

    public abstract ChronoLocalDate I(long j);

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public /* bridge */ /* synthetic */ j$.time.temporal.l a(long j, TemporalField temporalField) {
        return a(j, temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public ChronoLocalDate b(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            switch (b.a[((j$.time.temporal.a) qVar).ordinal()]) {
                case 1:
                    return A(j);
                case 2:
                    return A(Math.multiplyExact(j, 7L));
                case 3:
                    return F(j);
                case 4:
                    return I(j);
                case 5:
                    return I(Math.multiplyExact(j, 10L));
                case 6:
                    return I(Math.multiplyExact(j, 100L));
                case 7:
                    return I(Math.multiplyExact(j, 1000L));
                case 8:
                    ChronoField chronoField = ChronoField.ERA;
                    return a(Math.addExact(k(chronoField), j), (TemporalField) chronoField);
                default:
                    j$.time.e.d("Unsupported unit: ", qVar);
                    return null;
            }
        }
        return super.b(j, qVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public /* bridge */ /* synthetic */ j$.time.temporal.l c(long j, j$.time.temporal.q qVar) {
        return c(j, qVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public /* bridge */ /* synthetic */ j$.time.temporal.l e(LocalDate localDate) {
        return e(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ChronoLocalDate) && compareTo((ChronoLocalDate) obj) == 0) {
            return true;
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return g().hashCode() ^ ((int) (epochDay ^ (epochDay >>> 32)));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final String toString() {
        String str;
        long k = k(ChronoField.YEAR_OF_ERA);
        long k2 = k(ChronoField.MONTH_OF_YEAR);
        long k3 = k(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(g().toString());
        sb.append(" ");
        sb.append(M());
        sb.append(" ");
        sb.append(k);
        String str2 = "-";
        if (k2 >= 10) {
            str = "-";
        } else {
            str = "-0";
        }
        sb.append(str);
        sb.append(k2);
        if (k3 < 10) {
            str2 = "-0";
        }
        sb.append(str2);
        sb.append(k3);
        return sb.toString();
    }
}
