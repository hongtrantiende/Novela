package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kw3  reason: default package */
/* loaded from: classes.dex */
public final class kw3 {
    public static final kw3 C;
    public static final kw3 D;
    public static final kw3 E;
    public static final kw3 F;
    public static final /* synthetic */ kw3[] G;
    public static final kw3 a;
    public static final kw3 b;
    public static final kw3 c;
    public static final kw3 d;
    public static final kw3 e;
    public static final kw3 f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kw3] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Enum, kw3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kw3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, kw3] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, kw3] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, kw3] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, kw3] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, kw3] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, kw3] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, kw3] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, kw3] */
    static {
        ?? r0 = new Enum("EMPTY_INPUT", 0);
        a = r0;
        ?? r1 = new Enum("UNSUPPORTED_FORMAT", 1);
        b = r1;
        ?? r2 = new Enum("ENCRYPTED", 2);
        c = r2;
        ?? r3 = new Enum("DRM_PROTECTED", 3);
        d = r3;
        ?? r4 = new Enum("CORRUPTED", 4);
        e = r4;
        ?? r5 = new Enum("DECOMPRESSION_BOMB", 5);
        f = r5;
        ?? r6 = new Enum("ZIP_BOMB", 6);
        C = r6;
        ?? r7 = new Enum("IMAGE_BASED_PDF", 7);
        D = r7;
        ?? r8 = new Enum("NO_SECTIONS", 8);
        E = r8;
        ?? r9 = new Enum("PARSE_ERROR", 9);
        F = r9;
        G = new kw3[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, new Enum("MISSING_DEPENDENCY", 10)};
    }

    public static kw3 valueOf(String str) {
        return (kw3) Enum.valueOf(kw3.class, str);
    }

    public static kw3[] values() {
        return (kw3[]) G.clone();
    }
}
