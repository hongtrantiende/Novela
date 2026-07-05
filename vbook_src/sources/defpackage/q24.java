package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q24  reason: default package */
/* loaded from: classes3.dex */
public final class q24 {
    public static final /* synthetic */ q24[] C;
    public static final q24 a;
    public static final q24 b;
    public static final q24 c;
    public static final q24 d;
    public static final q24 e;
    public static final q24 f;

    /* JADX WARN: Type inference failed for: r0v0, types: [q24, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [q24, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [q24, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [q24, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [q24, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [q24, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Preparing", 0);
        a = r0;
        ?? r1 = new Enum("Exporting", 1);
        b = r1;
        ?? r2 = new Enum("Zipping", 2);
        c = r2;
        ?? r3 = new Enum("Uploading", 3);
        d = r3;
        ?? r4 = new Enum("Cleaning", 4);
        e = r4;
        ?? r5 = new Enum("Completed", 5);
        f = r5;
        C = new q24[]{r0, r1, r2, r3, r4, r5};
    }

    public static q24 valueOf(String str) {
        return (q24) Enum.valueOf(q24.class, str);
    }

    public static q24[] values() {
        return (q24[]) C.clone();
    }
}
