package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class p implements k {
    public static final p AH;
    public static final /* synthetic */ p[] a;

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.chrono.p, java.lang.Enum] */
    static {
        ?? r0 = new Enum("AH", 0);
        AH = r0;
        a = new p[]{r0};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) a.clone();
    }

    @Override // j$.time.chrono.k
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return j$.time.temporal.s.f(1L, 1L);
        }
        return super.l(temporalField);
    }
}
