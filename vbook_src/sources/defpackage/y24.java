package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y24  reason: default package */
/* loaded from: classes3.dex */
public final class y24 {
    public static final y24 C;
    public static final y24 D;
    public static final /* synthetic */ y24[] E;
    public static final y24 a;
    public static final y24 b;
    public static final y24 c;
    public static final y24 d;
    public static final y24 e;
    public static final y24 f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y24] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, y24] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, y24] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, y24] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, y24] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, y24] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, y24] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, y24] */
    static {
        ?? r0 = new Enum("Preparing", 0);
        a = r0;
        ?? r1 = new Enum("BuildingContent", 1);
        b = r1;
        ?? r2 = new Enum("WritingFiles", 2);
        c = r2;
        ?? r3 = new Enum("Zipping", 3);
        d = r3;
        ?? r4 = new Enum("Saving", 4);
        e = r4;
        ?? r5 = new Enum("Cleaning", 5);
        f = r5;
        ?? r6 = new Enum("Completed", 6);
        C = r6;
        ?? r7 = new Enum("Failed", 7);
        D = r7;
        E = new y24[]{r0, r1, r2, r3, r4, r5, r6, r7};
    }

    public static y24 valueOf(String str) {
        return (y24) Enum.valueOf(y24.class, str);
    }

    public static y24[] values() {
        return (y24[]) E.clone();
    }
}
