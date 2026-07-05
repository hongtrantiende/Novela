package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class LocalTime implements j$.time.temporal.l, j$.time.temporal.m, Comparable<LocalTime>, Serializable {
    public static final LocalTime MAX;
    public static final LocalTime MIN;
    public static final LocalTime e;
    public static final LocalTime[] f = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = f;
            if (i < localTimeArr.length) {
                localTimeArr[i] = new LocalTime(i, 0, 0, 0);
                i++;
            } else {
                LocalTime localTime = localTimeArr[0];
                e = localTime;
                LocalTime localTime2 = localTimeArr[12];
                MIN = localTime;
                MAX = new LocalTime(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static LocalTime A(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.d(j$.time.temporal.p.g);
        if (localTime != null) {
            return localTime;
        }
        e.f("Unable to obtain LocalTime from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static LocalTime I(long j) {
        ChronoField.NANO_OF_DAY.W(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return v(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    public static LocalTime Z(DataInput dataInput) {
        int readInt;
        int i;
        int readByte = dataInput.readByte();
        byte b = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i = 0;
            readInt = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                ?? r5 = ~readByte2;
                readInt = 0;
                b = r5;
                i = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i = ~readByte3;
                    readInt = 0;
                    b = readByte2;
                } else {
                    readInt = dataInput.readInt();
                    b = readByte2;
                    i = readByte3;
                }
            }
        }
        return of(readByte, b, i, readInt);
    }

    public static LocalTime of(int i, int i2, int i3, int i4) {
        ChronoField.HOUR_OF_DAY.W(i);
        ChronoField.MINUTE_OF_HOUR.W(i2);
        ChronoField.SECOND_OF_MINUTE.W(i3);
        ChronoField.NANO_OF_SECOND.W(i4);
        return v(i, i2, i3, i4);
    }

    public static LocalTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalTime) dateTimeFormatter.parse(charSequence, new f(2));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static LocalTime v(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return f[i];
        }
        return new LocalTime(i, i2, i3, i4);
    }

    private Object writeReplace() {
        return new p((byte) 4, this);
    }

    public final int F(TemporalField temporalField) {
        switch (i.a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                throw new DateTimeException("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.d / 1000;
            case 4:
                throw new DateTimeException("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.d / 1000000;
            case 6:
                return (int) (a0() / 1000000);
            case 7:
                return this.c;
            case 8:
                return b0();
            case 9:
                return this.b;
            case 10:
                return (this.a * 60) + this.b;
            case 11:
                return this.a % 12;
            case 12:
                int i = this.a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.a;
            case 14:
                byte b = this.a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.a / 12;
            default:
                throw new DateTimeException(c.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.temporal.l
    /* renamed from: N */
    public final LocalTime b(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            switch (i.b[((j$.time.temporal.a) qVar).ordinal()]) {
                case 1:
                    return X(j);
                case 2:
                    return X((j % 86400000000L) * 1000);
                case 3:
                    return X((j % 86400000) * 1000000);
                case 4:
                    return Y(j);
                case 5:
                    return W(j);
                case 6:
                    return T(j);
                case 7:
                    return T((j % 2) * 12);
                default:
                    e.d("Unsupported unit: ", qVar);
                    return null;
            }
        }
        return (LocalTime) qVar.v(this, j);
    }

    public final LocalTime T(long j) {
        if (j == 0) {
            return this;
        }
        return v(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final LocalTime W(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return v(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final LocalTime X(long j) {
        if (j != 0) {
            long a0 = a0();
            long j2 = (((j % 86400000000000L) + a0) + 86400000000000L) % 86400000000000L;
            if (a0 != j2) {
                return v((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public final LocalTime Y(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return v(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final long a0() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    public final int b0() {
        return (this.b * 60) + (this.a * 3600) + this.c;
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

    @Override // j$.time.temporal.l
    /* renamed from: c0 */
    public final LocalTime a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            chronoField.W(j);
            switch (i.a[chronoField.ordinal()]) {
                case 1:
                    return d0((int) j);
                case 2:
                    return I(j);
                case 3:
                    return d0(((int) j) * 1000);
                case 4:
                    return I(j * 1000);
                case 5:
                    return d0(((int) j) * 1000000);
                case 6:
                    return I(j * 1000000);
                case 7:
                    int i = (int) j;
                    if (this.c != i) {
                        ChronoField.SECOND_OF_MINUTE.W(i);
                        return v(this.a, this.b, i, this.d);
                    }
                    break;
                case 8:
                    return Y(j - b0());
                case 9:
                    int i2 = (int) j;
                    if (this.b != i2) {
                        ChronoField.MINUTE_OF_HOUR.W(i2);
                        return v(this.a, i2, this.c, this.d);
                    }
                    break;
                case 10:
                    return W(j - ((this.a * 60) + this.b));
                case 11:
                    return T(j - (this.a % 12));
                case 12:
                    if (j == 12) {
                        j = 0;
                    }
                    return T(j - (this.a % 12));
                case 13:
                    int i3 = (int) j;
                    if (this.a != i3) {
                        ChronoField.HOUR_OF_DAY.W(i3);
                        return v(i3, this.b, this.c, this.d);
                    }
                    break;
                case 14:
                    if (j == 24) {
                        j = 0;
                    }
                    int i4 = (int) j;
                    if (this.a != i4) {
                        ChronoField.HOUR_OF_DAY.W(i4);
                        return v(i4, this.b, this.c, this.d);
                    }
                    break;
                case 15:
                    return T((j - (this.a / 12)) * 12);
                default:
                    throw new DateTimeException(c.a("Unsupported field: ", temporalField));
            }
            return this;
        }
        return (LocalTime) temporalField.T(this, j);
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalTime localTime) {
        int compare = Integer.compare(this.a, localTime.a);
        if (compare == 0 && (compare = Integer.compare(this.b, localTime.b)) == 0 && (compare = Integer.compare(this.c, localTime.c)) == 0) {
            return Integer.compare(this.d, localTime.d);
        }
        return compare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery != j$.time.temporal.p.b && temporalQuery != j$.time.temporal.p.a && temporalQuery != j$.time.temporal.p.e && temporalQuery != j$.time.temporal.p.d) {
            if (temporalQuery == j$.time.temporal.p.g) {
                return this;
            }
            if (temporalQuery != j$.time.temporal.p.f) {
                if (temporalQuery == j$.time.temporal.p.c) {
                    return j$.time.temporal.a.NANOS;
                }
                return temporalQuery.queryFrom(this);
            }
            return null;
        }
        return null;
    }

    public final LocalTime d0(int i) {
        if (this.d == i) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.W(i);
        return v(this.a, this.b, this.c, i);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l e(LocalDate localDate) {
        return (LocalTime) localDate.f(this);
    }

    public final void e0(DataOutput dataOutput) {
        if (this.d == 0) {
            if (this.c == 0) {
                byte b = this.b;
                byte b2 = this.a;
                if (b == 0) {
                    dataOutput.writeByte(~b2);
                    return;
                }
                dataOutput.writeByte(b2);
                dataOutput.writeByte(~this.b);
                return;
            }
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(~this.c);
            return;
        }
        dataOutput.writeByte(this.a);
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.c);
        dataOutput.writeInt(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l f(j$.time.temporal.l lVar) {
        return lVar.a(a0(), ChronoField.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return F(temporalField);
        }
        return super.h(temporalField);
    }

    public int hashCode() {
        long a0 = a0();
        return (int) (a0 ^ (a0 >>> 32));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).X();
        }
        if (temporalField != null && temporalField.v(this)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.NANO_OF_DAY) {
                return a0();
            }
            if (temporalField == ChronoField.MICRO_OF_DAY) {
                return a0() / 1000;
            }
            return F(temporalField);
        }
        return temporalField.N(this);
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        byte b2 = this.b;
        byte b3 = this.c;
        int i = this.d;
        if (b < 10) {
            str = "0";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append((int) b);
        String str3 = ":";
        if (b2 >= 10) {
            str2 = ":";
        } else {
            str2 = ":0";
        }
        sb.append(str2);
        sb.append((int) b2);
        if (b3 > 0 || i > 0) {
            if (b3 < 10) {
                str3 = ":0";
            }
            sb.append(str3);
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }
}
