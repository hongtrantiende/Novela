package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class YearMonth implements j$.time.temporal.l, j$.time.temporal.m, Comparable<YearMonth>, Serializable {
    public static final DateTimeFormatter c = new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    public YearMonth(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static YearMonth of(int i, int i2) {
        ChronoField.YEAR.W(i);
        ChronoField.MONTH_OF_YEAR.W(i2);
        return new YearMonth(i, i2);
    }

    public static YearMonth parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = c;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (YearMonth) dateTimeFormatter.parse(charSequence, new f(3));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new p((byte) 12, this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: A */
    public final YearMonth b(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            switch (s.b[((j$.time.temporal.a) qVar).ordinal()]) {
                case 1:
                    return F(j);
                case 2:
                    return I(j);
                case 3:
                    return I(Math.multiplyExact(j, 10L));
                case 4:
                    return I(Math.multiplyExact(j, 100L));
                case 5:
                    return I(Math.multiplyExact(j, 1000L));
                case 6:
                    ChronoField chronoField = ChronoField.ERA;
                    return a(Math.addExact(k(chronoField), j), chronoField);
                default:
                    e.d("Unsupported unit: ", qVar);
                    return null;
            }
        }
        return (YearMonth) qVar.v(this, j);
    }

    public final YearMonth F(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        ChronoField chronoField = ChronoField.YEAR;
        return N(chronoField.b.a(Math.floorDiv(j2, 12L), chronoField), ((int) Math.floorMod(j2, 12L)) + 1);
    }

    public final YearMonth I(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return N(chronoField.b.a(this.a + j, chronoField), this.b);
    }

    public final YearMonth N(int i, int i2) {
        if (this.a == i && this.b == i2) {
            return this;
        }
        return new YearMonth(i, i2);
    }

    @Override // j$.time.temporal.l
    /* renamed from: T */
    public final YearMonth a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.W(j);
            int i = s.a[chronoField.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (k(ChronoField.ERA) == j) {
                                    return this;
                                }
                                int i2 = 1 - this.a;
                                ChronoField.YEAR.W(i2);
                                return N(i2, this.b);
                            }
                            throw new DateTimeException(c.a("Unsupported field: ", temporalField));
                        }
                        int i3 = (int) j;
                        ChronoField.YEAR.W(i3);
                        return N(i3, this.b);
                    }
                    if (this.a < 1) {
                        j = 1 - j;
                    }
                    int i4 = (int) j;
                    ChronoField.YEAR.W(i4);
                    return N(i4, this.b);
                }
                return F(j - v());
            }
            int i5 = (int) j;
            ChronoField.MONTH_OF_YEAR.W(i5);
            return N(this.a, i5);
        }
        return (YearMonth) temporalField.T(this, j);
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
    public int compareTo(YearMonth yearMonth) {
        int i = this.a - yearMonth.a;
        if (i == 0) {
            return this.b - yearMonth.b;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.b) {
            return j$.time.chrono.q.c;
        }
        if (temporalQuery == j$.time.temporal.p.c) {
            return j$.time.temporal.a.MONTHS;
        }
        return super.d(temporalQuery);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        return (YearMonth) localDate.f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YearMonth) {
            YearMonth yearMonth = (YearMonth) obj;
            if (this.a == yearMonth.a && this.b == yearMonth.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l f(j$.time.temporal.l lVar) {
        if (j$.time.chrono.j.q(lVar).equals(j$.time.chrono.q.c)) {
            return lVar.a(v(), ChronoField.PROLEPTIC_MONTH);
        }
        e.a("Adjustment only supported on ISO date-time");
        return null;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        return l(temporalField).a(k(temporalField), temporalField);
    }

    public int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA) {
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
            int i2 = s.a[((ChronoField) temporalField).ordinal()];
            int i3 = 1;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                if (this.a < 1) {
                                    i3 = 0;
                                }
                                return i3;
                            }
                            throw new DateTimeException(c.a("Unsupported field: ", temporalField));
                        }
                        i = this.a;
                    } else {
                        int i4 = this.a;
                        if (i4 < 1) {
                            i4 = 1 - i4;
                        }
                        return i4;
                    }
                } else {
                    return v();
                }
            } else {
                i = this.b;
            }
            return i;
        }
        return temporalField.N(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        long j;
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            if (this.a <= 0) {
                j = 1000000000;
            } else {
                j = 999999999;
            }
            return j$.time.temporal.s.f(1L, j);
        }
        return super.l(temporalField);
    }

    public final String toString() {
        String str;
        int abs = Math.abs(this.a);
        StringBuilder sb = new StringBuilder(9);
        int i = this.a;
        if (abs < 1000) {
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(i);
        }
        if (this.b < 10) {
            str = "-0";
        } else {
            str = "-";
        }
        sb.append(str);
        sb.append(this.b);
        return sb.toString();
    }

    public final long v() {
        return ((this.a * 12) + this.b) - 1;
    }
}
