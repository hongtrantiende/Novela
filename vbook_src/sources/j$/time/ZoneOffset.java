package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.zone.ZoneRules;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.m, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;
    public final int b;
    public final transient String c;
    public static final ConcurrentMap d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ConcurrentMap e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = ofTotalSeconds(0);
    public static final ZoneOffset f = ofTotalSeconds(-64800);
    public static final ZoneOffset g = ofTotalSeconds(64800);

    public ZoneOffset(int i) {
        String str;
        String str2;
        String str3;
        String sb;
        this.b = i;
        if (i == 0) {
            sb = "Z";
        } else {
            int abs = Math.abs(i);
            StringBuilder sb2 = new StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            if (i < 0) {
                str = "-";
            } else {
                str = "+";
            }
            sb2.append(str);
            if (i2 < 10) {
                str2 = "0";
            } else {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append(i2);
            if (i3 >= 10) {
                str3 = ":";
            } else {
                str3 = ":0";
            }
            sb2.append(str3);
            sb2.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb2.append(i4 < 10 ? ":0" : ":");
                sb2.append(i4);
            }
            sb = sb2.toString();
        }
        this.c = sb;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.ZoneOffset T(java.lang.String r8) {
        /*
            java.lang.String r0 = "offsetId"
            java.util.Objects.requireNonNull(r8, r0)
            java.util.concurrent.ConcurrentMap r0 = j$.time.ZoneOffset.e
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r8)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            if (r0 == 0) goto L12
            return r0
        L12:
            int r0 = r8.length()
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == r1) goto L64
            r1 = 3
            if (r0 == r1) goto L80
            r5 = 5
            if (r0 == r5) goto L5b
            r6 = 6
            r7 = 4
            if (r0 == r6) goto L51
            r6 = 7
            if (r0 == r6) goto L44
            r1 = 9
            if (r0 != r1) goto L3a
            int r0 = W(r8, r3, r4)
            int r1 = W(r8, r7, r3)
            int r3 = W(r8, r6, r3)
            goto L86
        L3a:
            java.lang.String r0 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r8 = r0.concat(r8)
            j$.time.e.a(r8)
            return r2
        L44:
            int r0 = W(r8, r3, r4)
            int r1 = W(r8, r1, r4)
            int r3 = W(r8, r5, r4)
            goto L86
        L51:
            int r0 = W(r8, r3, r4)
            int r1 = W(r8, r7, r3)
        L59:
            r3 = r4
            goto L86
        L5b:
            int r0 = W(r8, r3, r4)
            int r1 = W(r8, r1, r4)
            goto L59
        L64:
            char r0 = r8.charAt(r4)
            char r8 = r8.charAt(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
        L80:
            int r0 = W(r8, r3, r4)
            r1 = r4
            r3 = r1
        L86:
            char r4 = r8.charAt(r4)
            r5 = 43
            r6 = 45
            if (r4 == r5) goto L9d
            if (r4 != r6) goto L93
            goto L9d
        L93:
            java.lang.String r0 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r8 = r0.concat(r8)
            j$.time.e.a(r8)
            return r2
        L9d:
            if (r4 != r6) goto La7
            int r8 = -r0
            int r0 = -r1
            int r1 = -r3
            j$.time.ZoneOffset r8 = ofHoursMinutesSeconds(r8, r0, r1)
            return r8
        La7:
            j$.time.ZoneOffset r8 = ofHoursMinutesSeconds(r0, r1, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.T(java.lang.String):j$.time.ZoneOffset");
    }

    public static int W(CharSequence charSequence, int i, boolean z) {
        if (z) {
            String str = (String) charSequence;
            if (str.charAt(i - 1) != ':') {
                e.i("Invalid ID for ZoneOffset, colon not found when expected: ", str);
                return 0;
            }
        }
        String str2 = (String) charSequence;
        char charAt = str2.charAt(i);
        char charAt2 = str2.charAt(i + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        e.i("Invalid ID for ZoneOffset, non numeric characters found: ", str2);
        return 0;
    }

    public static ZoneOffset X(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        if (readByte == Byte.MAX_VALUE) {
            return ofTotalSeconds(dataInput.readInt());
        }
        return ofTotalSeconds(readByte * 900);
    }

    public static ZoneOffset from(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporalAccessor.d(j$.time.temporal.p.d);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        e.f("Unable to obtain ZoneOffset from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static ZoneOffset ofHoursMinutesSeconds(int i, int i2, int i3) {
        if (i >= -18 && i <= 18) {
            if (i > 0) {
                if (i2 < 0 || i3 < 0) {
                    e.a("Zone offset minutes and seconds must be positive because hours is positive");
                    return null;
                }
            } else if (i < 0) {
                if (i2 > 0 || i3 > 0) {
                    e.a("Zone offset minutes and seconds must be negative because hours is negative");
                    return null;
                }
            } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
                e.a("Zone offset minutes and seconds must have the same sign");
                return null;
            }
            if (i2 >= -59 && i2 <= 59) {
                if (i3 >= -59 && i3 <= 59) {
                    if (Math.abs(i) == 18 && (i2 | i3) != 0) {
                        e.a("Zone offset not in valid range: -18:00 to +18:00");
                        return null;
                    }
                    return ofTotalSeconds((i2 * 60) + (i * 3600) + i3);
                }
                e.c("Zone offset seconds not in valid range: value ", i3, " is not in the range -59 to 59");
                return null;
            }
            e.c("Zone offset minutes not in valid range: value ", i2, " is not in the range -59 to 59");
            return null;
        }
        e.c("Zone offset hours not in valid range: value ", i, " is not in the range -18 to 18");
        return null;
    }

    public static ZoneOffset ofTotalSeconds(int i) {
        if (i >= -64800 && i <= 64800) {
            if (i % 900 == 0) {
                Integer valueOf = Integer.valueOf(i);
                ConcurrentMap concurrentMap = d;
                ZoneOffset zoneOffset = (ZoneOffset) ((ConcurrentHashMap) concurrentMap).get(valueOf);
                if (zoneOffset == null) {
                    ((ConcurrentHashMap) concurrentMap).putIfAbsent(valueOf, new ZoneOffset(i));
                    ZoneOffset zoneOffset2 = (ZoneOffset) ((ConcurrentHashMap) concurrentMap).get(valueOf);
                    ((ConcurrentHashMap) e).putIfAbsent(zoneOffset2.c, zoneOffset2);
                    return zoneOffset2;
                }
                return zoneOffset;
            }
            return new ZoneOffset(i);
        }
        e.a("Zone offset not in valid range: -18:00 to +18:00");
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new p((byte) 8, this);
    }

    @Override // j$.time.ZoneId
    public final void N(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        Y(dataOutput);
    }

    public final void Y(DataOutput dataOutput) {
        int i;
        int i2 = this.b;
        if (i2 % 900 == 0) {
            i = i2 / 900;
        } else {
            i = 127;
        }
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(i2);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.b - this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery != j$.time.temporal.p.d && temporalQuery != j$.time.temporal.p.e) {
            return super.d(temporalQuery);
        }
        return this;
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ZoneOffset) && this.b == ((ZoneOffset) obj).b) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l f(j$.time.temporal.l lVar) {
        return lVar.a(this.b, ChronoField.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        return new ZoneRules(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.b;
        }
        if (!(temporalField instanceof ChronoField)) {
            return super.l(temporalField).a(k(temporalField), temporalField);
        }
        throw new DateTimeException(c.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.ZoneId
    public int hashCode() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
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
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.b;
        }
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.N(this);
        }
        throw new DateTimeException(c.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.ZoneId
    public final String p() {
        return this.c;
    }

    @Override // j$.time.ZoneId
    public String toString() {
        return this.c;
    }
}
