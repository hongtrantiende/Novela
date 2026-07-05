package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ts  reason: default package */
/* loaded from: classes.dex */
public final class ts {
    public static final ts C;
    public static final /* synthetic */ ts[] D;
    public static final ts a;
    public static final ts b;
    public static final ts c;
    public static final ts d;
    public static final ts e;
    public static final ts f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ts] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ts] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ts] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ts] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, ts] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, ts] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, ts] */
    static {
        ?? r0 = new Enum("Paragraph", 0);
        a = r0;
        ?? r1 = new Enum("Span", 1);
        b = r1;
        ?? r2 = new Enum("VerbatimTts", 2);
        c = r2;
        ?? r3 = new Enum("Url", 3);
        d = r3;
        ?? r4 = new Enum("Link", 4);
        e = r4;
        ?? r5 = new Enum("Clickable", 5);
        f = r5;
        ?? r6 = new Enum("String", 6);
        C = r6;
        D = new ts[]{r0, r1, r2, r3, r4, r5, r6};
    }

    public static ts valueOf(String str) {
        return (ts) Enum.valueOf(ts.class, str);
    }

    public static ts[] values() {
        return (ts[]) D.clone();
    }
}
