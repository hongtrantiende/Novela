package j$.time;

import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class r implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    static {
        new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).toFormatter();
    }

    public r(int i) {
        this.a = i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static r v(int i) {
        ChronoField.YEAR.W(i);
        return new r(i);
    }

    private Object writeReplace() {
        return new p((byte) 11, this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: A */
    public final r b(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = q.b[((j$.time.temporal.a) qVar).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                ChronoField chronoField = ChronoField.ERA;
                                return a(Math.addExact(k(chronoField), j), chronoField);
                            }
                            e.d("Unsupported unit: ", qVar);
                            return null;
                        }
                        return F(Math.multiplyExact(j, 1000L));
                    }
                    return F(Math.multiplyExact(j, 100L));
                }
                return F(Math.multiplyExact(j, 10L));
            }
            return F(j);
        }
        return (r) qVar.v(this, j);
    }

    public final r F(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return v(chronoField.b.a(this.a + j, chronoField));
    }

    @Override // j$.time.temporal.l
    /* renamed from: I */
    public final r a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.W(j);
            int i = q.a[chronoField.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (k(ChronoField.ERA) == j) {
                            return this;
                        }
                        return v(1 - this.a);
                    }
                    throw new DateTimeException(c.a("Unsupported field: ", temporalField));
                }
                return v((int) j);
            }
            if (this.a < 1) {
                j = 1 - j;
            }
            return v((int) j);
        }
        return (r) temporalField.T(this, j);
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
        return this.a - ((r) obj).a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.b) {
            return j$.time.chrono.q.c;
        }
        if (temporalQuery == j$.time.temporal.p.c) {
            return j$.time.temporal.a.YEARS;
        }
        return super.d(temporalQuery);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        return (r) localDate.f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r) && this.a == ((r) obj).a) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l f(j$.time.temporal.l lVar) {
        if (j$.time.chrono.j.q(lVar).equals(j$.time.chrono.q.c)) {
            return lVar.a(this.a, ChronoField.YEAR);
        }
        e.a("Adjustment only supported on ISO date-time");
        return null;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        return l(temporalField).a(k(temporalField), temporalField);
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.YEAR || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA) {
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
            int i = q.a[((ChronoField) temporalField).ordinal()];
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (this.a < 1) {
                            i2 = 0;
                        }
                        return i2;
                    }
                    throw new DateTimeException(c.a("Unsupported field: ", temporalField));
                }
                return this.a;
            }
            int i3 = this.a;
            if (i3 < 1) {
                i3 = 1 - i3;
            }
            return i3;
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
        return Integer.toString(this.a);
    }
}
