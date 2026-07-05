package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kd6  reason: default package */
/* loaded from: classes.dex */
public final class kd6 {
    public static final kd6 a;
    public static final kd6 b;
    public static final kd6 c;
    public static final kd6 d;
    public static final kd6 e;
    public static final /* synthetic */ kd6[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kd6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kd6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, kd6] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, kd6] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, kd6] */
    static {
        ?? r0 = new Enum("Measuring", 0);
        a = r0;
        ?? r1 = new Enum("LookaheadMeasuring", 1);
        b = r1;
        ?? r2 = new Enum("LayingOut", 2);
        c = r2;
        ?? r3 = new Enum("LookaheadLayingOut", 3);
        d = r3;
        ?? r4 = new Enum("Idle", 4);
        e = r4;
        f = new kd6[]{r0, r1, r2, r3, r4};
    }

    public static kd6 valueOf(String str) {
        return (kd6) Enum.valueOf(kd6.class, str);
    }

    public static kd6[] values() {
        return (kd6[]) f.clone();
    }
}
