package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    public final Month a;
    public final byte b;
    public final DayOfWeek c;
    public final LocalTime d;
    public final boolean e;
    public final d f;
    public final ZoneOffset g;
    public final ZoneOffset h;
    public final ZoneOffset i;

    public e(Month month, int i, DayOfWeek dayOfWeek, LocalTime localTime, boolean z, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = month;
        this.b = (byte) i;
        this.c = dayOfWeek;
        this.d = localTime;
        this.e = z;
        this.f = dVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    public static e a(DataInput dataInput) {
        DayOfWeek v;
        d dVar;
        LocalTime localTime;
        int i;
        int i2;
        int i3;
        int i4;
        int readInt = dataInput.readInt();
        Month I = Month.I(readInt >>> 28);
        int i5 = ((264241152 & readInt) >>> 22) - 32;
        int i6 = (3670016 & readInt) >>> 19;
        if (i6 == 0) {
            v = null;
        } else {
            v = DayOfWeek.v(i6);
        }
        DayOfWeek dayOfWeek = v;
        int i7 = (507904 & readInt) >>> 14;
        d dVar2 = d.values()[(readInt & 12288) >>> 12];
        int i8 = (readInt & 4080) >>> 4;
        int i9 = (readInt & 12) >>> 2;
        int i10 = readInt & 3;
        boolean z = false;
        if (i7 == 31) {
            long readInt2 = dataInput.readInt();
            LocalTime localTime2 = LocalTime.MIN;
            ChronoField.SECOND_OF_DAY.W(readInt2);
            int i11 = (int) (readInt2 / 3600);
            long j = readInt2 - (i11 * 3600);
            dVar = dVar2;
            localTime = LocalTime.v(i11, (int) (j / 60), (int) (j - (i4 * 60)), 0);
        } else {
            dVar = dVar2;
            int i12 = i7 % 24;
            LocalTime localTime3 = LocalTime.MIN;
            ChronoField.HOUR_OF_DAY.W(i12);
            localTime = LocalTime.f[i12];
        }
        if (i8 == 255) {
            i = dataInput.readInt();
        } else {
            i = (i8 - 128) * 900;
        }
        ZoneOffset ofTotalSeconds = ZoneOffset.ofTotalSeconds(i);
        if (i9 == 3) {
            i2 = dataInput.readInt();
        } else {
            i2 = (i9 * 1800) + ofTotalSeconds.b;
        }
        ZoneOffset ofTotalSeconds2 = ZoneOffset.ofTotalSeconds(i2);
        if (i10 == 3) {
            i3 = dataInput.readInt();
        } else {
            i3 = (i10 * 1800) + ofTotalSeconds.b;
        }
        ZoneOffset ofTotalSeconds3 = ZoneOffset.ofTotalSeconds(i3);
        if (i7 == 24) {
            z = true;
        }
        Objects.requireNonNull(I, "month");
        Objects.requireNonNull(localTime, "time");
        d dVar3 = dVar;
        Objects.requireNonNull(dVar3, "timeDefnition");
        Objects.requireNonNull(ofTotalSeconds, "standardOffset");
        Objects.requireNonNull(ofTotalSeconds2, "offsetBefore");
        Objects.requireNonNull(ofTotalSeconds3, "offsetAfter");
        if (i5 >= -28 && i5 <= 31 && i5 != 0) {
            if (z && !localTime.equals(LocalTime.e)) {
                throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
            }
            if (localTime.d == 0) {
                return new e(I, i5, dayOfWeek, localTime, z, dVar3, ofTotalSeconds, ofTotalSeconds2, ofTotalSeconds3);
            }
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int b0;
        byte b;
        int i;
        int i2;
        int i3;
        int value;
        if (this.e) {
            b0 = 86400;
        } else {
            b0 = this.d.b0();
        }
        int i4 = this.g.b;
        int i5 = this.h.b - i4;
        int i6 = this.i.b - i4;
        if (b0 % 3600 == 0) {
            if (this.e) {
                b = 24;
            } else {
                b = this.d.a;
            }
        } else {
            b = 31;
        }
        if (i4 % 900 == 0) {
            i = (i4 / 900) + Token.CASE;
        } else {
            i = 255;
        }
        if (i5 != 0 && i5 != 1800 && i5 != 3600) {
            i2 = 3;
        } else {
            i2 = i5 / 1800;
        }
        if (i6 != 0 && i6 != 1800 && i6 != 3600) {
            i3 = 3;
        } else {
            i3 = i6 / 1800;
        }
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek == null) {
            value = 0;
        } else {
            value = dayOfWeek.getValue();
        }
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + (value << 19) + (b << 14) + (this.f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (b == 31) {
            dataOutput.writeInt(b0);
        }
        if (i == 255) {
            dataOutput.writeInt(i4);
        }
        if (i2 == 3) {
            dataOutput.writeInt(this.h.b);
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.i.b);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.f == eVar.f && this.d.equals(eVar.d) && this.e == eVar.e && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int ordinal;
        int b0 = ((this.d.b0() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek == null) {
            ordinal = 7;
        } else {
            ordinal = dayOfWeek.ordinal();
        }
        int ordinal2 = this.f.ordinal() + b0 + (ordinal << 2);
        return this.i.hashCode() ^ ((this.g.hashCode() ^ ordinal2) ^ this.h.hashCode());
    }

    public final String toString() {
        String str;
        String localTime;
        StringBuilder sb = new StringBuilder("TransitionRule[");
        if (this.i.b - this.h.b > 0) {
            str = "Gap ";
        } else {
            str = "Overlap ";
        }
        sb.append(str);
        sb.append(this.h);
        sb.append(" to ");
        sb.append(this.i);
        sb.append(", ");
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek != null) {
            byte b = this.b;
            if (b == -1) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day of ");
                sb.append(this.a.name());
            } else if (b < 0) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.b) - 1);
                sb.append(" of ");
                sb.append(this.a.name());
            } else {
                sb.append(dayOfWeek.name());
                sb.append(" on or after ");
                sb.append(this.a.name());
                sb.append(' ');
                sb.append((int) this.b);
            }
        } else {
            sb.append(this.a.name());
            sb.append(' ');
            sb.append((int) this.b);
        }
        sb.append(" at ");
        if (this.e) {
            localTime = "24:00";
        } else {
            localTime = this.d.toString();
        }
        sb.append(localTime);
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
