package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p5b  reason: default package */
/* loaded from: classes.dex */
public final class p5b {
    public static final /* synthetic */ p5b[] C;
    public static final p5b a;
    public static final p5b b;
    public static final p5b c;
    public static final p5b d;
    public static final p5b e;
    public static final p5b f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, p5b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, p5b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, p5b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, p5b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, p5b] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, p5b] */
    static {
        ?? r0 = new Enum("Untouched", 0);
        a = r0;
        ?? r1 = new Enum("Unchanged", 1);
        b = r1;
        ?? r2 = new Enum("Changed", 2);
        c = r2;
        ?? r3 = new Enum("Inserted", 3);
        d = r3;
        ?? r4 = new Enum("Interrupted", 4);
        e = r4;
        ?? r5 = new Enum("Removing", 5);
        f = r5;
        C = new p5b[]{r0, r1, r2, r3, r4, r5};
    }

    public static p5b valueOf(String str) {
        return (p5b) Enum.valueOf(p5b.class, str);
    }

    public static p5b[] values() {
        return (p5b[]) C.clone();
    }
}
