package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    public byte a;
    public Object b;

    public a(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    public static long a(DataInput dataInput) {
        int readByte = dataInput.readByte() & 255;
        if (readByte == 255) {
            return dataInput.readLong();
        }
        return ((((readByte << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    public static ZoneOffset b(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        if (readByte == Byte.MAX_VALUE) {
            return ZoneOffset.ofTotalSeconds(dataInput.readInt());
        }
        return ZoneOffset.ofTotalSeconds(readByte * 900);
    }

    public static void c(long j, DataOutput dataOutput) {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i >>> 16) & 255);
            dataOutput.writeByte((i >>> 8) & 255);
            dataOutput.writeByte(i & 255);
            return;
        }
        dataOutput.writeByte(255);
        dataOutput.writeLong(j);
    }

    public static void d(ZoneOffset zoneOffset, DataOutput dataOutput) {
        int i;
        int i2 = zoneOffset.b;
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

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        long[] jArr;
        e[] eVarArr;
        Object zoneRules;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        if (readByte != 1) {
            if (readByte != 2) {
                if (readByte != 3) {
                    if (readByte == 100) {
                        zoneRules = new ZoneRules(TimeZone.getTimeZone(objectInput.readUTF()));
                    } else {
                        throw new StreamCorruptedException("Unknown serialized type");
                    }
                } else {
                    zoneRules = e.a(objectInput);
                }
            } else {
                int i = b.e;
                long a = a(objectInput);
                ZoneOffset b = b(objectInput);
                ZoneOffset b2 = b(objectInput);
                if (!b.equals(b2)) {
                    zoneRules = new b(a, b, b2);
                } else {
                    throw new IllegalArgumentException("Offsets must not be equal");
                }
            }
        } else {
            long[] jArr2 = ZoneRules.i;
            int readInt = objectInput.readInt();
            if (readInt == 0) {
                jArr = jArr2;
            } else {
                jArr = new long[readInt];
            }
            for (int i2 = 0; i2 < readInt; i2++) {
                jArr[i2] = a(objectInput);
            }
            int i3 = readInt + 1;
            ZoneOffset[] zoneOffsetArr = new ZoneOffset[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                zoneOffsetArr[i4] = b(objectInput);
            }
            int readInt2 = objectInput.readInt();
            if (readInt2 != 0) {
                jArr2 = new long[readInt2];
            }
            long[] jArr3 = jArr2;
            for (int i5 = 0; i5 < readInt2; i5++) {
                jArr3[i5] = a(objectInput);
            }
            int i6 = readInt2 + 1;
            ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                zoneOffsetArr2[i7] = b(objectInput);
            }
            int readByte2 = objectInput.readByte();
            if (readByte2 == 0) {
                eVarArr = ZoneRules.j;
            } else {
                eVarArr = new e[readByte2];
            }
            e[] eVarArr2 = eVarArr;
            for (int i8 = 0; i8 < readByte2; i8++) {
                eVarArr2[i8] = e.a(objectInput);
            }
            zoneRules = new ZoneRules(jArr, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr2);
        }
        this.b = zoneRules;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    if (b == 100) {
                        objectOutput.writeUTF(((ZoneRules) obj).g.getID());
                        return;
                    }
                    throw new InvalidClassException("Unknown serialized type");
                }
                ((e) obj).b(objectOutput);
                return;
            }
            b bVar = (b) obj;
            c(bVar.a, objectOutput);
            d(bVar.c, objectOutput);
            d(bVar.d, objectOutput);
            return;
        }
        ZoneRules zoneRules = (ZoneRules) obj;
        objectOutput.writeInt(zoneRules.a.length);
        for (long j : zoneRules.a) {
            c(j, objectOutput);
        }
        for (ZoneOffset zoneOffset : zoneRules.b) {
            d(zoneOffset, objectOutput);
        }
        objectOutput.writeInt(zoneRules.c.length);
        for (long j2 : zoneRules.c) {
            c(j2, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : zoneRules.e) {
            d(zoneOffset2, objectOutput);
        }
        objectOutput.writeByte(zoneRules.f.length);
        for (e eVar : zoneRules.f) {
            eVar.b(objectOutput);
        }
    }

    public a() {
    }
}
