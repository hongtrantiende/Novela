package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class v extends c {
    public static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient LocalDate a;
    public final transient w b;
    public final transient int c;

    public v(LocalDate localDate) {
        if (!localDate.T(d)) {
            w o = w.o(localDate);
            this.b = o;
            this.c = (localDate.getYear() - o.b.getYear()) + 1;
            this.a = localDate;
            return;
        }
        j$.time.e.a("JapaneseDate before Meiji 6 is not supported");
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 4, this);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate A(long j) {
        return X(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate F(long j) {
        return X(this.a.plusMonths(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate I(long j) {
        return X(this.a.c0(j));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime K(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final k M() {
        return this.b;
    }

    public final v N(long j, j$.time.temporal.a aVar) {
        return (v) super.b(j, (j$.time.temporal.q) aVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate P(j$.time.temporal.o oVar) {
        return (v) super.P(oVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int S() {
        int S;
        w p = this.b.p();
        if (p != null && p.b.getYear() == this.a.getYear()) {
            S = p.b.N() - 1;
        } else {
            S = this.a.S();
        }
        if (this.c == 1) {
            return S - (this.b.b.N() - 1);
        }
        return S;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    /* renamed from: T */
    public final v a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (k(chronoField) == j) {
                return this;
            }
            int[] iArr = u.a;
            int i = iArr[chronoField.ordinal()];
            if (i == 3 || i == 8 || i == 9) {
                t tVar = t.c;
                int a = tVar.y(chronoField).a(j, chronoField);
                int i2 = iArr[chronoField.ordinal()];
                if (i2 != 3) {
                    if (i2 != 8) {
                        if (i2 == 9) {
                            return X(this.a.g0(a));
                        }
                    } else {
                        return X(this.a.g0(tVar.C(w.q(a), this.c)));
                    }
                } else {
                    return X(this.a.g0(tVar.C(this.b, a)));
                }
            }
            return X(this.a.a(j, temporalField));
        }
        return (v) super.a(j, temporalField);
    }

    public final v W(j$.time.f fVar) {
        return (v) super.e(fVar);
    }

    public final v X(LocalDate localDate) {
        if (localDate.equals(this.a)) {
            return this;
        }
        return new v(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate b(long j, j$.time.temporal.q qVar) {
        return (v) super.b(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate c(long j, j$.time.temporal.q qVar) {
        return (v) super.c(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        return (v) super.e(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.a.equals(((v) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j g() {
        return t.c;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        t.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField != ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH && temporalField != ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR && temporalField != ChronoField.ALIGNED_WEEK_OF_MONTH && temporalField != ChronoField.ALIGNED_WEEK_OF_YEAR) {
            if (temporalField instanceof ChronoField) {
                return ((ChronoField) temporalField).isDateBased();
            }
            if (temporalField != null && temporalField.v(this)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate j(j$.time.temporal.m mVar) {
        return (v) super.e(mVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            switch (u.a[((ChronoField) temporalField).ordinal()]) {
                case 2:
                    int i = this.c;
                    LocalDate localDate = this.a;
                    if (i == 1) {
                        return (localDate.N() - this.b.b.N()) + 1;
                    }
                    return localDate.N();
                case 3:
                    return this.c;
                case 4:
                case 5:
                case 6:
                case 7:
                    throw new DateTimeException(j$.time.c.a("Unsupported field: ", temporalField));
                case 8:
                    return this.b.a;
                default:
                    return this.a.k(temporalField);
            }
        }
        return temporalField.N(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (i(temporalField)) {
                ChronoField chronoField = (ChronoField) temporalField;
                int i = u.a[chronoField.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return t.c.y(chronoField);
                        }
                        int year = this.b.b.getYear();
                        w p = this.b.p();
                        if (p != null) {
                            return j$.time.temporal.s.f(1L, (p.b.getYear() - year) + 1);
                        }
                        return j$.time.temporal.s.f(1L, 999999999 - year);
                    }
                    return j$.time.temporal.s.f(1L, S());
                }
                return j$.time.temporal.s.f(1L, this.a.W());
            }
            throw new DateTimeException(j$.time.c.a("Unsupported field: ", temporalField));
        }
        return temporalField.A(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l b(long j, j$.time.temporal.q qVar) {
        return (v) super.b(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.q qVar) {
        return (v) super.c(j, qVar);
    }

    public v(w wVar, int i, LocalDate localDate) {
        if (!localDate.T(d)) {
            this.b = wVar;
            this.c = i;
            this.a = localDate;
            return;
        }
        j$.time.e.a("JapaneseDate before Meiji 6 is not supported");
        throw null;
    }
}
