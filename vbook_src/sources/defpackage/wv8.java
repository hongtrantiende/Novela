package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wv8  reason: default package */
/* loaded from: classes3.dex */
public final class wv8 {
    public static final wv8 a;
    public static final /* synthetic */ wv8[] b;
    /* JADX INFO: Fake field, exist only in values array */
    wv8 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wv8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wv8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wv8] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, wv8] */
    static {
        ?? r0 = new Enum("TTS", 0);
        ?? r1 = new Enum("LITERAL", 1);
        a = r1;
        b = new wv8[]{r0, r1, new Enum("NO_BOUNDARY_SIL", 2), new Enum("PLAIN", 3)};
    }

    public static wv8 valueOf(String str) {
        return (wv8) Enum.valueOf(wv8.class, str);
    }

    public static wv8[] values() {
        return (wv8[]) b.clone();
    }
}
