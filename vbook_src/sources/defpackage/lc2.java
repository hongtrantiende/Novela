package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lc2  reason: default package */
/* loaded from: classes3.dex */
public final class lc2 {
    public static final lc2 a;
    public static final lc2 b;
    public static final lc2 c;
    public static final lc2 d;
    public static final lc2 e;
    public static final /* synthetic */ lc2[] f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lc2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, lc2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, lc2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, lc2] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, lc2] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, lc2] */
    static {
        ?? r0 = new Enum("CRONET_SOURCE_UNSPECIFIED", 0);
        a = r0;
        ?? r1 = new Enum("CRONET_SOURCE_STATICALLY_LINKED", 1);
        b = r1;
        ?? r2 = new Enum("CRONET_SOURCE_PLAY_SERVICES", 2);
        c = r2;
        ?? r3 = new Enum("CRONET_SOURCE_FALLBACK", 3);
        d = r3;
        ?? r4 = new Enum("CRONET_SOURCE_PLATFORM", 4);
        e = r4;
        f = new lc2[]{r0, r1, r2, r3, r4, new Enum("CRONET_SOURCE_FAKE", 5)};
    }

    public static lc2 valueOf(String str) {
        return (lc2) Enum.valueOf(lc2.class, str);
    }

    public static lc2[] values() {
        return (lc2[]) f.clone();
    }
}
