package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class e0 extends a implements Serializable {
    public static final e0 c = new e0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private e0() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.j
    public final k B(int i) {
        if (i != 0) {
            if (i == 1) {
                return h0.BE;
            }
            j$.time.e.b("Invalid era: ", i);
            return null;
        }
        return h0.BEFORE_BE;
    }

    @Override // j$.time.chrono.j
    public final int C(k kVar, int i) {
        if (kVar instanceof h0) {
            if (kVar == h0.BE) {
                return i;
            }
            return 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate G(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof g0) {
            return (g0) temporalAccessor;
        }
        return new g0(LocalDate.F(temporalAccessor));
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate L() {
        return new g0(LocalDate.F(LocalDate.Y(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate O(int i, int i2, int i3) {
        return new g0(LocalDate.of(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.j
    public final ChronoLocalDate Q(Map map, j$.time.format.d0 d0Var) {
        return (g0) super.Q(map, d0Var);
    }

    @Override // j$.time.chrono.j
    public final ChronoZonedDateTime R(Instant instant, ZoneId zoneId) {
        return i.F(this, instant, zoneId);
    }

    @Override // j$.time.chrono.j
    public final boolean U(long j) {
        return q.c.U(j - 543);
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate o(long j) {
        return new g0(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.j
    public final String p() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.j
    public final String s() {
        return "buddhist";
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate t(int i, int i2) {
        return new g0(LocalDate.Z(i - 543, i2));
    }

    public Object writeReplace() {
        return new c0((byte) 1, this);
    }

    @Override // j$.time.chrono.j
    public final j$.time.temporal.s y(ChronoField chronoField) {
        int i = d0.a[chronoField.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return chronoField.b;
                }
                j$.time.temporal.s sVar = ChronoField.YEAR.b;
                return j$.time.temporal.s.f(sVar.a + 543, sVar.d + 543);
            }
            j$.time.temporal.s sVar2 = ChronoField.YEAR.b;
            return j$.time.temporal.s.g(1L, (-(sVar2.a + 543)) + 1, sVar2.d + 543);
        }
        j$.time.temporal.s sVar3 = ChronoField.PROLEPTIC_MONTH.b;
        return j$.time.temporal.s.f(sVar3.a + 6516, sVar3.d + 6516);
    }

    @Override // j$.time.chrono.j
    public final List z() {
        return j$.time.b.c(h0.values());
    }
}
