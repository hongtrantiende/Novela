package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class g0 extends c {
    private static final long serialVersionUID = -8722293800195731463L;
    public final transient LocalDate a;

    public g0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 8, this);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate A(long j) {
        return W(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate F(long j) {
        return W(this.a.plusMonths(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate I(long j) {
        return W(this.a.c0(j));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime K(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final k M() {
        if (N() >= 1) {
            return h0.BE;
        }
        return h0.BEFORE_BE;
    }

    public final int N() {
        return this.a.getYear() + 543;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate P(j$.time.temporal.o oVar) {
        return (g0) super.P(oVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r2 != 7) goto L13;
     */
    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.chrono.g0 a(long r8, j$.time.temporal.TemporalField r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof j$.time.temporal.ChronoField
            if (r0 == 0) goto L9f
            r0 = r10
            j$.time.temporal.ChronoField r0 = (j$.time.temporal.ChronoField) r0
            long r1 = r7.k(r0)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L10
            return r7
        L10:
            int[] r1 = j$.time.chrono.f0.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L49
            r6 = 5
            if (r2 == r6) goto L25
            if (r2 == r4) goto L49
            if (r2 == r3) goto L49
            goto L5f
        L25:
            j$.time.chrono.e0 r10 = j$.time.chrono.e0.c
            j$.time.temporal.s r10 = r10.y(r0)
            r10.b(r8, r0)
            int r10 = r7.N()
            long r0 = (long) r10
            r2 = 12
            long r0 = r0 * r2
            j$.time.LocalDate r10 = r7.a
            short r2 = r10.b
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r8 = r8 - r0
            j$.time.LocalDate r8 = r10.plusMonths(r8)
            j$.time.chrono.g0 r7 = r7.W(r8)
            return r7
        L49:
            j$.time.chrono.e0 r2 = j$.time.chrono.e0.c
            j$.time.temporal.s r2 = r2.y(r0)
            int r2 = r2.a(r8, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L88
            if (r0 == r4) goto L7b
            if (r0 == r3) goto L6a
        L5f:
            j$.time.LocalDate r0 = r7.a
            j$.time.LocalDate r8 = r0.a(r8, r10)
            j$.time.chrono.g0 r7 = r7.W(r8)
            return r7
        L6a:
            j$.time.LocalDate r8 = r7.a
            int r9 = r7.N()
            int r9 = (-542) - r9
            j$.time.LocalDate r8 = r8.g0(r9)
            j$.time.chrono.g0 r7 = r7.W(r8)
            return r7
        L7b:
            j$.time.LocalDate r8 = r7.a
            int r2 = r2 + (-543)
            j$.time.LocalDate r8 = r8.g0(r2)
            j$.time.chrono.g0 r7 = r7.W(r8)
            return r7
        L88:
            j$.time.LocalDate r8 = r7.a
            int r9 = r7.N()
            r10 = 1
            if (r9 < r10) goto L92
            goto L94
        L92:
            int r2 = 1 - r2
        L94:
            int r2 = r2 + (-543)
            j$.time.LocalDate r8 = r8.g0(r2)
            j$.time.chrono.g0 r7 = r7.W(r8)
            return r7
        L9f:
            j$.time.chrono.ChronoLocalDate r7 = super.a(r8, r10)
            j$.time.chrono.g0 r7 = (j$.time.chrono.g0) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.g0.a(long, j$.time.temporal.TemporalField):j$.time.chrono.g0");
    }

    public final g0 W(LocalDate localDate) {
        if (localDate.equals(this.a)) {
            return this;
        }
        return new g0(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate b(long j, j$.time.temporal.q qVar) {
        return (g0) super.b(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate c(long j, j$.time.temporal.q qVar) {
        return (g0) super.c(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        return (g0) super.e(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            return this.a.equals(((g0) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j g() {
        return e0.c;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        e0.c.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate j(j$.time.temporal.m mVar) {
        return (g0) super.e(mVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = f0.a[((ChronoField) temporalField).ordinal()];
            int i2 = 1;
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            return this.a.k(temporalField);
                        }
                        if (N() < 1) {
                            i2 = 0;
                        }
                        return i2;
                    }
                    return N();
                }
                return ((N() * 12) + this.a.b) - 1;
            }
            int N = N();
            if (N < 1) {
                N = 1 - N;
            }
            return N;
        }
        return temporalField.N(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        long j;
        if (temporalField instanceof ChronoField) {
            if (i(temporalField)) {
                ChronoField chronoField = (ChronoField) temporalField;
                int i = f0.a[chronoField.ordinal()];
                if (i != 1 && i != 2 && i != 3) {
                    if (i != 4) {
                        return e0.c.y(chronoField);
                    }
                    j$.time.temporal.s sVar = ChronoField.YEAR.b;
                    if (N() <= 0) {
                        j = (-(sVar.a + 543)) + 1;
                    } else {
                        j = sVar.d + 543;
                    }
                    return j$.time.temporal.s.f(1L, j);
                }
                return this.a.l(temporalField);
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
        return (g0) super.b(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.q qVar) {
        return (g0) super.c(j, qVar);
    }
}
