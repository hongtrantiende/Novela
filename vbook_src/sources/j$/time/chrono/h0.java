package j$.time.chrono;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class h0 implements k {
    public static final h0 BE;
    public static final h0 BEFORE_BE;
    public static final /* synthetic */ h0[] a;

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.chrono.h0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.chrono.h0, java.lang.Enum] */
    static {
        ?? r0 = new Enum("BEFORE_BE", 0);
        BEFORE_BE = r0;
        ?? r1 = new Enum("BE", 1);
        BE = r1;
        a = new h0[]{r0, r1};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) a.clone();
    }

    @Override // j$.time.chrono.k
    public final int getValue() {
        return ordinal();
    }
}
