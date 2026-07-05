package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s16  reason: default package */
/* loaded from: classes.dex */
public final class s16 {
    public static final s16 a;
    public static final s16 b;
    public static final s16 c;
    public static final s16 d;
    public static final /* synthetic */ s16[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, s16] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, s16] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, s16] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, s16] */
    static {
        ?? r0 = new Enum("LookaheadMeasurement", 0);
        a = r0;
        ?? r1 = new Enum("LookaheadPlacement", 1);
        b = r1;
        ?? r2 = new Enum("Measurement", 2);
        c = r2;
        ?? r3 = new Enum("Placement", 3);
        d = r3;
        e = new s16[]{r0, r1, r2, r3};
    }

    public static s16 valueOf(String str) {
        return (s16) Enum.valueOf(s16.class, str);
    }

    public static s16[] values() {
        return (s16[]) e.clone();
    }
}
