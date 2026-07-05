package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kf8  reason: default package */
/* loaded from: classes3.dex */
public final class kf8 {
    public static final jf8 a;
    public static final kf8 b;
    public static final kf8 c;
    public static final /* synthetic */ kf8[] d;
    /* JADX INFO: Fake field, exist only in values array */
    kf8 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kf8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kf8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, kf8] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, kf8] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, kf8] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, kf8] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, kf8] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, kf8] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, kf8] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        ?? r1 = new Enum("WASM", 1);
        ?? r2 = new Enum("LINUX", 2);
        b = r2;
        ?? r3 = new Enum("WINDOWS", 3);
        ?? r4 = new Enum("ANDROID", 4);
        c = r4;
        d = new kf8[]{r0, r1, r2, r3, r4, new Enum("MACOSX", 5), new Enum("IOS", 6), new Enum("TVOS", 7), new Enum("WATCHOS", 8)};
        a = new jf8(0);
    }

    public static kf8 valueOf(String str) {
        return (kf8) Enum.valueOf(kf8.class, str);
    }

    public static kf8[] values() {
        return (kf8[]) d.clone();
    }
}
