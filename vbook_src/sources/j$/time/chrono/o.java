package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class o extends c {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient m a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public o(m mVar, long j) {
        int i = (int) j;
        mVar.W();
        if (i >= mVar.e && i < mVar.f) {
            int binarySearch = Arrays.binarySearch(mVar.d, i);
            binarySearch = binarySearch < 0 ? (-binarySearch) - 2 : binarySearch;
            int[] iArr = {mVar.Y(binarySearch), ((mVar.g + binarySearch) % 12) + 1, (i - mVar.d[binarySearch]) + 1};
            this.a = mVar;
            this.b = iArr[0];
            this.c = iArr[1];
            this.d = iArr[2];
            return;
        }
        j$.time.e.a("Hijrah date out of range");
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 6, this);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate I(long j) {
        if (j == 0) {
            return this;
        }
        return X(Math.addExact(this.b, (int) j), this.c, this.d);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime K(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final k M() {
        return p.AH;
    }

    public final int N() {
        return this.a.c0(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate P(j$.time.temporal.o oVar) {
        return (o) super.P(oVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int S() {
        return this.a.c0(this.b, 12);
    }

    @Override // j$.time.chrono.c
    /* renamed from: T */
    public final o A(long j) {
        return new o(this.a, toEpochDay() + j);
    }

    @Override // j$.time.chrono.c
    /* renamed from: W */
    public final o F(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        m mVar = this.a;
        long floorDiv = Math.floorDiv(j2, 12L);
        if (floorDiv >= mVar.Y(0) && floorDiv <= mVar.Y(mVar.d.length - 1) - 1) {
            return X((int) floorDiv, ((int) Math.floorMod(j2, 12L)) + 1, this.d);
        }
        throw new DateTimeException("Invalid Hijrah year: " + floorDiv);
    }

    public final o X(int i, int i2, int i3) {
        int a0 = this.a.a0(i, i2);
        if (i3 > a0) {
            i3 = a0;
        }
        return new o(this.a, i, i2, i3);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    /* renamed from: Y */
    public final o a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            this.a.y(chronoField).b(j, chronoField);
            int i = (int) j;
            switch (n.a[chronoField.ordinal()]) {
                case 1:
                    return X(this.b, this.c, i);
                case 2:
                    return A(Math.min(i, S()) - N());
                case 3:
                    return A((j - k(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
                case 4:
                    return A(j - (((int) Math.floorMod(toEpochDay() + 3, 7L)) + 1));
                case 5:
                    return A(j - k(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 6:
                    return A(j - k(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 7:
                    return new o(this.a, j);
                case 8:
                    return A((j - k(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
                case 9:
                    return X(this.b, i, this.d);
                case 10:
                    return F(j - (((this.b * 12) + this.c) - 1));
                case 11:
                    if (this.b < 1) {
                        i = 1 - i;
                    }
                    return X(i, this.c, this.d);
                case 12:
                    return X(i, this.c, this.d);
                case 13:
                    return X(1 - this.b, this.c, this.d);
                default:
                    throw new DateTimeException(j$.time.c.a("Unsupported field: ", temporalField));
            }
        }
        return (o) super.a(j, temporalField);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate b(long j, j$.time.temporal.q qVar) {
        return (o) super.b(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate c(long j, j$.time.temporal.q qVar) {
        return (o) super.c(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        return (o) super.e(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.b == oVar.b && this.c == oVar.c && this.d == oVar.d && this.a.equals(oVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j g() {
        return this.a;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        this.a.getClass();
        return ((i & (-2048)) ^ 2100100019) ^ (((i << 11) + (i2 << 6)) + i3);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate j(j$.time.temporal.m mVar) {
        return (o) super.e(mVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        int i;
        int i2;
        if (temporalField instanceof ChronoField) {
            int i3 = 1;
            switch (n.a[((ChronoField) temporalField).ordinal()]) {
                case 1:
                    i = this.d;
                    break;
                case 2:
                    i = N();
                    break;
                case 3:
                    i2 = (this.d - 1) / 7;
                    i = i2 + 1;
                    break;
                case 4:
                    i2 = (int) Math.floorMod(toEpochDay() + 3, 7L);
                    i = i2 + 1;
                    break;
                case 5:
                    i2 = (this.d - 1) % 7;
                    i = i2 + 1;
                    break;
                case 6:
                    i2 = (N() - 1) % 7;
                    i = i2 + 1;
                    break;
                case 7:
                    return toEpochDay();
                case 8:
                    i2 = (N() - 1) / 7;
                    i = i2 + 1;
                    break;
                case 9:
                    i = this.c;
                    break;
                case 10:
                    return ((this.b * 12) + this.c) - 1;
                case 11:
                    i = this.b;
                    break;
                case 12:
                    i = this.b;
                    break;
                case 13:
                    if (this.b <= 1) {
                        i3 = 0;
                    }
                    return i3;
                default:
                    throw new DateTimeException(j$.time.c.a("Unsupported field: ", temporalField));
            }
            return i;
        }
        return temporalField.N(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (i(temporalField)) {
                ChronoField chronoField = (ChronoField) temporalField;
                int i = n.a[chronoField.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return this.a.y(chronoField);
                        }
                        return j$.time.temporal.s.f(1L, 5L);
                    }
                    return j$.time.temporal.s.f(1L, S());
                }
                return j$.time.temporal.s.f(1L, this.a.a0(this.b, this.c));
            }
            throw new DateTimeException(j$.time.c.a("Unsupported field: ", temporalField));
        }
        return temporalField.A(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.Z(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean x() {
        return this.a.U(this.b);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l b(long j, j$.time.temporal.q qVar) {
        return (o) super.b(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.q qVar) {
        return (o) super.c(j, qVar);
    }

    public o(m mVar, int i, int i2, int i3) {
        mVar.Z(i, i2, i3);
        this.a = mVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
