package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class y extends a implements Serializable {
    public static final y c = new y();
    private static final long serialVersionUID = 1039765215346859963L;

    private y() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.j
    public final k B(int i) {
        if (i != 0) {
            if (i == 1) {
                return b0.ROC;
            }
            j$.time.e.b("Invalid era: ", i);
            return null;
        }
        return b0.BEFORE_ROC;
    }

    @Override // j$.time.chrono.j
    public final int C(k kVar, int i) {
        if (kVar instanceof b0) {
            if (kVar == b0.ROC) {
                return i;
            }
            return 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate G(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof a0) {
            return (a0) temporalAccessor;
        }
        return new a0(LocalDate.F(temporalAccessor));
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate L() {
        return new a0(LocalDate.F(LocalDate.Y(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate O(int i, int i2, int i3) {
        return new a0(LocalDate.of(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.j
    public final ChronoLocalDate Q(Map map, j$.time.format.d0 d0Var) {
        return (a0) super.Q(map, d0Var);
    }

    @Override // j$.time.chrono.j
    public final ChronoZonedDateTime R(Instant instant, ZoneId zoneId) {
        return i.F(this, instant, zoneId);
    }

    @Override // j$.time.chrono.j
    public final boolean U(long j) {
        return q.c.U(j + 1911);
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate o(long j) {
        return new a0(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.j
    public final String p() {
        return "Minguo";
    }

    @Override // j$.time.chrono.j
    public final String s() {
        return "roc";
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate t(int i, int i2) {
        return new a0(LocalDate.Z(i + 1911, i2));
    }

    public Object writeReplace() {
        return new c0((byte) 1, this);
    }

    @Override // j$.time.chrono.j
    public final j$.time.temporal.s y(ChronoField chronoField) {
        int i = x.a[chronoField.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return chronoField.b;
                }
                j$.time.temporal.s sVar = ChronoField.YEAR.b;
                return j$.time.temporal.s.f(sVar.a - 1911, sVar.d - 1911);
            }
            j$.time.temporal.s sVar2 = ChronoField.YEAR.b;
            return j$.time.temporal.s.g(1L, sVar2.d - 1911, (-sVar2.a) + 1912);
        }
        j$.time.temporal.s sVar3 = ChronoField.PROLEPTIC_MONTH.b;
        return j$.time.temporal.s.f(sVar3.a - 22932, sVar3.d - 22932);
    }

    @Override // j$.time.chrono.j
    public final List z() {
        return j$.time.b.c(b0.values());
    }
}
