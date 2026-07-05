package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gfd  reason: default package */
/* loaded from: classes.dex */
public final class gfd {
    public static final gfd C;
    public static final /* synthetic */ gfd[] D;
    public static final gfd a;
    public static final gfd b;
    public static final gfd c;
    public static final gfd d;
    public static final gfd e;
    public static final gfd f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gfd] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Enum, gfd] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gfd] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, gfd] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, gfd] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, gfd] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, gfd] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, gfd] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, gfd] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, gfd] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, gfd] */
    static {
        ?? r0 = new Enum("SKIPPED_IMAGE", 0);
        a = r0;
        ?? r1 = new Enum("SKIPPED_OLE", 1);
        b = r1;
        ?? r2 = new Enum("TRUNCATED_TABLE", 2);
        c = r2;
        ?? r3 = new Enum("OCR_FALLBACK", 3);
        ?? r4 = new Enum("UNSUPPORTED_ELEMENT", 4);
        d = r4;
        ?? r5 = new Enum("BROKEN_ZIP_RECOVERY", 5);
        e = r5;
        ?? r6 = new Enum("HIDDEN_TEXT_FILTERED", 6);
        f = r6;
        ?? r7 = new Enum("MALFORMED_XML", 7);
        ?? r8 = new Enum("PARTIAL_PARSE", 8);
        C = r8;
        D = new gfd[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, new Enum("LENIENT_CFB_RECOVERY", 9), new Enum("NEEDS_OCR", 10)};
    }

    public static gfd valueOf(String str) {
        return (gfd) Enum.valueOf(gfd.class, str);
    }

    public static gfd[] values() {
        return (gfd[]) D.clone();
    }
}
