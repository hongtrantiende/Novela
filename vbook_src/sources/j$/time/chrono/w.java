package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class w implements k, Serializable {
    public static final w d;
    public static final w[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient LocalDate b;
    public final transient String c;

    static {
        w wVar = new w(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = wVar;
        w wVar2 = new w(0, LocalDate.of(1912, 7, 30), "Taisho");
        w wVar3 = new w(1, LocalDate.of(1926, 12, 25), "Showa");
        w wVar4 = new w(2, LocalDate.of(1989, 1, 8), "Heisei");
        w wVar5 = new w(3, LocalDate.of(2019, 5, 1), "Reiwa");
        e = r7;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5};
    }

    public w(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    public static w o(LocalDate localDate) {
        if (!localDate.T(v.d)) {
            for (int length = e.length - 1; length >= 0; length--) {
                w wVar = e[length];
                if (localDate.compareTo((ChronoLocalDate) wVar.b) >= 0) {
                    return wVar;
                }
            }
            return null;
        }
        j$.time.e.a("JapaneseDate before Meiji 6 are not supported");
        return null;
    }

    public static w q(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            w[] wVarArr = e;
            if (i2 < wVarArr.length) {
                return wVarArr[i2];
            }
        }
        j$.time.e.b("Invalid era: ", i);
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 5, this);
    }

    @Override // j$.time.chrono.k
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        ChronoField chronoField = ChronoField.ERA;
        if (temporalField == chronoField) {
            return t.c.y(chronoField);
        }
        return super.l(temporalField);
    }

    public final w p() {
        w[] wVarArr = e;
        if (this == wVarArr[wVarArr.length - 1]) {
            return null;
        }
        return q(this.a + 1);
    }

    public final String toString() {
        return this.c;
    }
}
